package generator

import model.DataType

interface DataTypeGenerator {
	def String generate(DataType dt)
}