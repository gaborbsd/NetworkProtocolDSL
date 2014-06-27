package generator

import model.DataType
import model.Field
import model.ListField

class SimpleFieldDefinitionGenerator implements FieldGenerator {
	private static var SimpleFieldDefinitionGenerator INSTANCE = null;
	
	def SimpleFieldDefinitionGenerator() {}
	
	def static public SimpleFieldDefinitionGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new SimpleFieldDefinitionGenerator
		return INSTANCE
	}

	override generate(Field f) '''
		private «f.transient» «f.javaType» «f.name»;
	'''

	def String getTransient(Field field) {
		return if(field.transientField) "transient" else "";
	}

	def String getCollectionType(Field field) {
		if (field instanceof ListField)
			return (field.elementType as DataType).typeName;
		return null;
	}
}
