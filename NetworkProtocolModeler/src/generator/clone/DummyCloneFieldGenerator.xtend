package generator.clone

import model.Field
import generator.FieldGenerator

class DummyCloneFieldGenerator implements FieldGenerator {
	private static var DummyCloneFieldGenerator INSTANCE = null;
	
	def DummyCloneFieldGenerator() {}
	
	def static public DummyCloneFieldGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new DummyCloneFieldGenerator
		return INSTANCE
	}

	override generate(Field f) ''''''
}