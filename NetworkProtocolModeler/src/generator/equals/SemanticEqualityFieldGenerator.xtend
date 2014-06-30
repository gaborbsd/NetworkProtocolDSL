package generator.equals

import model.Field
import generator.FieldGenerator

class SemanticEqualityFieldGenerator implements FieldGenerator {
	private static var SemanticEqualityFieldGenerator INSTANCE = null;
	
	def SemanticEqualityFieldGenerator() {}
	
	def static public SemanticEqualityFieldGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new SemanticEqualityFieldGenerator
		return INSTANCE
	}

	override generate(Field f) '''
		«IF f.identityField»(((other.«f.name» != null) && other.«f.name».equals(this.«f.name»)) || ((other.«f.name» == null) && (this.«f.
			name» == null)))«ENDIF»
	'''
}
