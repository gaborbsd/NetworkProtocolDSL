package generator.equals

import model.Field
import generator.FieldGenerator

class RefEqualityFieldGenerator implements FieldGenerator {
	private static var RefEqualityFieldGenerator INSTANCE = null;
	
	def RefEqualityFieldGenerator() {}
	
	def static public RefEqualityFieldGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new RefEqualityFieldGenerator
		return INSTANCE
	}

	override generate(Field f) '''
		«IF f.identityField»(other.«f.name» == this.«f.name»)«ENDIF»
	'''
}