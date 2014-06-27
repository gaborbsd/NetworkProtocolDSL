package generator

import model.Field

class RefHashcodeFieldGenerator implements FieldGenerator {
	private static var RefHashcodeFieldGenerator INSTANCE = null;
	
	def RefHashcodeFieldGenerator() {}
	
	def static public RefHashcodeFieldGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new RefHashcodeFieldGenerator
		return INSTANCE
	}

	override generate(Field f) '''
		«IF f.identityField»ret += «f.name».hashCode();«ENDIF»
	'''
}