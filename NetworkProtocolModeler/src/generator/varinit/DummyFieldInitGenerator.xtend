package generator.varinit

import generator.FieldGenerator
import model.Field

class DummyFieldInitGenerator implements FieldGenerator {
	private static var DummyFieldInitGenerator INSTANCE = null;
	
	def DummyFieldInitGenerator() {}
	
	def static public DummyFieldInitGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new DummyFieldInitGenerator
		return INSTANCE
	}

	override generate(Field f) ''''''
}