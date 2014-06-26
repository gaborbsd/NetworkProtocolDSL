package generator

import generator.DataTypeGenerator
import model.DataType
import model.Field
import model.BinaryField
import model.BitField
import model.IntegerField
import model.StringField
import model.ListField
import model.CountField
import model.LengthField
import java.lang.reflect.Constructor

class DataTypeGeneratorImpl implements DataTypeGenerator {

	override generate(DataType dt) '''
«IF dt.package != null && !dt.package.equals("")»
package «dt.package»;

«ENDIF»
import java.util.*;

import runtime.*;

public class «dt.typeName» implements Cloneable, OrderedSerializable {
	«FOR v : dt.fields»
		«callFieldTemplate(v.definitionTemplate, v)»
	«ENDFOR»
	
	«FOR v : dt.fields BEFORE '{' AFTER '}'»
		«callFieldTemplate(v.initTemplate, v)»
	«ENDFOR»
	
	«FOR v : dt.fields»
		«callFieldTemplate(v.accessorTemplate, v)»
	«ENDFOR»
	
	«IF dt.hasIdentityField»
		@Override
		public boolean equals(Object obj) {
			if (obj == null)
				return false;
			if (!(obj instanceof «dt.typeName»))
				return false;
			«dt.typeName» other = («dt.typeName»)obj;
			
			«FOR v : dt.fields BEFORE 'return ' SEPARATOR ' && ' AFTER ';'»
				«callFieldTemplate(v.equalsTemplate, v)»
			«ENDFOR»
		}
		
		@Override
		public int hashCode() {
			int ret = 0;
			«FOR v : dt.fields»
				«callFieldTemplate(v.hashcodeTemplate, v)»
			«ENDFOR»
			ret *= 31;
			return ret;
		}
	«ENDIF»
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		«dt.typeName» clone = («dt.typeName»)super.clone();
		«FOR v : dt.fields»
			«callFieldTemplate(v.cloneTemplate, v)»
		«ENDFOR»
		return clone;
	}

	public VariableProps[] getSerializationOrder() {
		return new VariableProps[]
			«FOR v : dt.fields BEFORE '{' SEPARATOR ', ' AFTER '};'»
					«IF !v.transientField»
						new VariableProps("«v.name»", "«v.type»", "«v.collectionType»", «v.byteLen», «v.unbounded», «v.formatterClass», «v.
		countOf», «v.lengthOf»)
				«ENDIF»
			«ENDFOR»
	}
	
'''

	def String getType(Field field) {
		if (field instanceof BinaryField)
			return "byte[]";
		if (field instanceof BitField)
			return "byte[]";
		if (field instanceof IntegerField)
			return "long";
		if (field instanceof StringField)
			return "String";
		if (field instanceof ListField)
			return "List";
		if (field instanceof CountField)
			return "long";
		if (field instanceof LengthField)
			return "long";
		if (field instanceof DataType)
			return (field as DataType).typeName;
		throw new RuntimeException("Cannot happen.");
	}

	def String countOf(Field field) {
		return if(field instanceof CountField) "\"" + (field as CountField).ref.name + "\"" else "null";
	}

	def String lengthOf(Field field) {
		return if(field instanceof LengthField) "\"" + (field as LengthField).ref.name + "\"" else "null";
	}

	def String formatterClass(Field field) {
		return if(field.formatter != null) "\"" + field.formatter.name + "\"" else "null";
	}

	def String getCollectionType(Field field) {
		if (field instanceof ListField)
			return (field.elementType as DataType).typeName;
		return null;
	}

	def String callFieldTemplate(String templateName, Field argument) {
		var String templateFullName = "generator." + templateName;
		var Class<?> templateClass = Class.forName(templateFullName);
		var Constructor<?> templateConstructor = templateClass.getConstructor();
		var FieldGenerator template = templateConstructor.newInstance() as FieldGenerator;
		return template.generate(argument);
	}
}
