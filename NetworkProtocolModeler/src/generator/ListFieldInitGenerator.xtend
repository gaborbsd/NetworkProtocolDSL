package generator

import generator.FieldGenerator
import model.Field

class ListFieldInitGenerator implements FieldGenerator {
	override generate(Field f) '''
		«f.name» = new ArrayList<>();
	'''
}