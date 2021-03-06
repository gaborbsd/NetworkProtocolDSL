package generator

import model.DataType

import static extension generator.util.FieldExtension.*

class DataTypeGeneratorImpl implements DataTypeGenerator {
	private static var DataTypeGeneratorImpl INSTANCE = null;
	
	def DataTypeGeneratorImpl() {}
	
	def static public DataTypeGeneratorImpl getInstance() {
		if (INSTANCE == null)
			INSTANCE = new DataTypeGeneratorImpl
		return INSTANCE
	}

	override generate(DataType dt) '''
�IF dt.package != null && !dt.package.equals("")�
package �dt.package�;

�ENDIF�
import java.util.*;

import runtime.*;

public class �dt.typeName� implements Cloneable, OrderedSerializable {
	�FOR v : dt.fields�
		�v.definitionTemplate.generate(v)�
	�ENDFOR�
	
	�FOR v : dt.fields BEFORE '{' AFTER '}'�
		�v.initTemplate.generate(v)�
	�ENDFOR�
	
	�FOR v : dt.fields�
		�v.accessorTemplate.generate(v)�
	�ENDFOR�
	
	�IF dt.hasIdentityField�
		@Override
		public boolean equals(Object obj) {
			if (obj == null)
				return false;
			if (!(obj instanceof �dt.typeName�))
				return false;
			�dt.typeName� other = (�dt.typeName�)obj;
			
			�FOR v : dt.fields BEFORE 'return ' SEPARATOR ' && ' AFTER ';'�
				�v.equalsTemplate.generate(v)�
			�ENDFOR�
		}
		
		@Override
		public int hashCode() {
			int ret = 0;
			�FOR v : dt.fields�
				�v.hashcodeTemplate.generate(v)�
			�ENDFOR�
			ret *= 31;
			return ret;
		}
	�ENDIF�
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		�dt.typeName� clone = (�dt.typeName�)super.clone();
		�FOR v : dt.fields�
			�v.cloneTemplate.generate(v)�
		�ENDFOR�
		return clone;
	}

	public VariableProps[] getSerializationOrder() {
		return new VariableProps[]
			�FOR v : dt.fields BEFORE '{' SEPARATOR ', ' AFTER '};'�
					�IF !v.transientField�
						new VariableProps("�v.name�", "�v.javaType�", "�v.collectionType�", �v.byteLen�, �v.unbounded�, �v.formatterClass�, �v.
		countOf�, �v.lengthOf�)
				�ENDIF�
			�ENDFOR�
	}
	
'''
}