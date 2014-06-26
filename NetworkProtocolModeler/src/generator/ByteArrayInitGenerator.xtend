package generator

import generator.FieldGenerator
import model.Field

class ByteArrayInitGenerator implements FieldGenerator {
	override generate(Field f) '''
		«f.name» = new byte[«f.byteLen»];
	'''
}