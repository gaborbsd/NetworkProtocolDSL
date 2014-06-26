package generator

import model.Field

class NumeralHashcodeFieldGenerator implements FieldGenerator {
	override generate(Field f) '''
		«IF f.identityField»ret += «f.name»;«ENDIF»
	'''
}
