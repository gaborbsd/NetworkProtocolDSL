package generator.varinit

import generator.FieldGenerator
import model.Field

class ListFieldInitGenerator implements FieldGenerator {
	private static var ListFieldInitGenerator INSTANCE = null;
	
	def ListFieldInitGenerator() {}
	
	def static public ListFieldInitGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new ListFieldInitGenerator
		return INSTANCE
	}

	override generate(Field f) '''
		«f.name» = new ArrayList<>();
	'''
}