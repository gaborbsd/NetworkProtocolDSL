package generator

import model.Field

class RefCloneFieldGenerator implements FieldGenerator {
	private static var RefCloneFieldGenerator INSTANCE = null;
	
	def RefCloneFieldGenerator() {}
	
	def static public RefCloneFieldGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new RefCloneFieldGenerator
		return INSTANCE
	}

	override generate(Field f) '''clone.«f.name» = («f.javaType»)«f.name».clone();'''
}
