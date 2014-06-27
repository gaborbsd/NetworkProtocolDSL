package generator

import generator.FieldGenerator
import model.Field

class DummyFieldAccessorGenerator implements FieldGenerator {
	private static var DummyFieldAccessorGenerator INSTANCE = null;
	
	def DummyFieldAccessorGenerator() {}
	
	def static public DummyFieldAccessorGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new DummyFieldAccessorGenerator
		return INSTANCE
	}

	override generate(Field f) ''''''
}
