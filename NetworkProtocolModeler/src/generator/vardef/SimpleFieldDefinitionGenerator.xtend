package generator.vardef

import generator.FieldGenerator
import model.Field

import static extension generator.util.FieldExtension.*

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
}
