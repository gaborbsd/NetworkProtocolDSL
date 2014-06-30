package generator.accessor

import model.Field
import generator.FieldGenerator

import static extension generator.util.StringExtension.*

class SimpleFieldAccessorGenerator implements FieldGenerator {
	private static var SimpleFieldAccessorGenerator INSTANCE = null;
	
	def SimpleFieldAccessorGenerator() {}
	
	def static public SimpleFieldAccessorGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new SimpleFieldAccessorGenerator
		return INSTANCE
	}

	override generate(Field f) '''
public «f.javaType» get«f.name.capitalizeFirst»() {
	return this.«f.name»;
}

public void set«f.name.capitalizeFirst»(«f.javaType» «f.name») {
	«IF f.byteLen > 0»
		«IF f.javaType.equals("long")»
		if (Long.highestOneBit(«f.name») > «Math.pow(2, (f.byteLen - 1) * 8)»)
			throw new IllegalArgumentException("Specified value " + «f.name» + " is out of range.");
		«ENDIF»
		«IF f.javaType.equals("String")»
		if («f.name».getBytes().length > «f.byteLen»)
			throw new IllegalArgumentException("Specified value " + «f.name» + " does not fit in string field.");
		«ENDIF»
		«IF f.javaType.equals("Byte[]")»
		if («f.name».length > «f.byteLen»)
			throw new IllegalArgumentException("Specified value " + «f.name» + " does not fit in string field.");
		«ENDIF»
	«ENDIF»
	this.«f.name» = «f.name»;
}
	'''
}
