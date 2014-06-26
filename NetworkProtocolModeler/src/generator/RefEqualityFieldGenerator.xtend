package generator

import model.Field

class RefEqualityFieldGenerator implements FieldGenerator {
	override generate(Field f) '''
		«IF f.identityField»(other.«f.name» == this.«f.name»)«ENDIF»
	'''
}