package generator

import model.Field

interface FieldGenerator {
	def String generate(Field f)
}
