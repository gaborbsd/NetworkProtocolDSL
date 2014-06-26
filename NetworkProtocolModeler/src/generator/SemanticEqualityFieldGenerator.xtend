package generator

import model.Field

class SemanticEqualityFieldGenerator implements FieldGenerator {
	override generate(Field f) '''
		«IF f.identityField»(((other.«f.name» != null) && other.«f.name».equals(this.«f.name»)) || ((other.«f.name» == null) && (this.«f.
			name» == null)))«ENDIF»
	'''
}
