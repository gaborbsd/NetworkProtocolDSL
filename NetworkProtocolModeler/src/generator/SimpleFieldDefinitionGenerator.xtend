package generator

import model.ListField
import model.Field
import model.BinaryField
import model.BitField
import model.IntegerField
import model.StringField
import model.CountField
import model.LengthField
import model.DataType

class SimpleFieldDefinitionGenerator implements FieldGenerator {
	private static var SimpleFieldDefinitionGenerator INSTANCE = null;
	
	def SimpleFieldDefinitionGenerator() {}
	
	def static public SimpleFieldDefinitionGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new SimpleFieldDefinitionGenerator
		return INSTANCE
	}

	override generate(Field f) '''
		«IF f instanceof ListField»
			private «f.transient» «f.type»<«f.collectionType»> «f.name»;
		«ELSE»
			private «f.transient» «f.type» «f.name»;
		«ENDIF»
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

	def String getTransient(Field field) {
		return if(field.transientField) "transient" else "";
	}

	def String getCollectionType(Field field) {
		if (field instanceof ListField)
			return (field.elementType as DataType).typeName;
		return null;
	}
}
