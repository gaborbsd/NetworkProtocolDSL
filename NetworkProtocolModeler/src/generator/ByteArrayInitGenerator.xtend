package generator

import generator.FieldGenerator
import model.Field

class ByteArrayInitGenerator implements FieldGenerator {
	private static var ByteArrayInitGenerator INSTANCE = null;
	
	def ByteArrayInitGenerator() {}
	
	def static public ByteArrayInitGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new ByteArrayInitGenerator
		return INSTANCE
	}

	override generate(Field f) '''
		«f.name» = new byte[«f.byteLen»];
	'''
}