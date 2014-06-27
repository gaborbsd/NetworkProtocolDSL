package generator

import model.Field

class NumeralHashcodeFieldGenerator implements FieldGenerator {
	private static var NumeralHashcodeFieldGenerator INSTANCE = null;
	
	def NumeralHashcodeFieldGenerator() {}
	
	def static public NumeralHashcodeFieldGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new NumeralHashcodeFieldGenerator
		return INSTANCE
	}

	override generate(Field f) '''
		«IF f.identityField»ret += «f.name»;«ENDIF»
	'''
}
