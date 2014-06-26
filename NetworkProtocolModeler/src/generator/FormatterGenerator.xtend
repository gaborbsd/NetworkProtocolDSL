package generator

import model.Formatter

interface FormatterGenerator {
	def String generate(Formatter f)
}