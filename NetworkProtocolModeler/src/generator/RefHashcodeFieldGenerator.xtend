package generator

import model.Field

class RefHashcodeFieldGenerator implements FieldGenerator {
	override generate(Field f) '''
		«IF f.identityField»ret += «f.name».hashCode();«ENDIF»
	'''
}