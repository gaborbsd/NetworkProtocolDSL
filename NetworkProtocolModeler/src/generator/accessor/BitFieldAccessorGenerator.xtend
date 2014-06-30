package generator.accessor

import model.BitField
import model.Field
import generator.FieldGenerator

class BitFieldAccessorGenerator implements FieldGenerator {
	private static var BitFieldAccessorGenerator INSTANCE = null;
	
	def BitFieldAccessorGenerator() {}
	
	def static public BitFieldAccessorGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new BitFieldAccessorGenerator
		return INSTANCE
	}
	
	override generate(Field f) '''
public «f.javaType» get«f.name.capitalizeFirst»() {
	return this.«f.name»;
}

public void set«f.name.capitalizeFirst»(«f.javaType» «f.name») {
	this.«f.name» = «f.name»;
}

«var long offset = 0»
«FOR comp : (f as BitField).components»
	«generateBitFieldGetter(f.name, comp.name, offset, comp.bitLength)»
	«generateBitFieldSetter(f.name, comp.name, offset, comp.bitLength)»
	«{
		offset = offset + comp.bitLength
		''
	}»
«ENDFOR»
	'''

	def private generateBitFieldGetter(String bitField, String component, long offset, long len) '''
public long get«component.capitalizeFirst»() {
	return «bitField»[«offset / 8»] | («len.bitMaskForLen» << «8 - len - (offset % 8)»);
}
		'''

	def private generateBitFieldSetter(String bitField, String component, Long offset, Long len) '''
public void set«component.capitalizeFirst»(long value) {
	if (Long.highestOneBit(value) > «Math.pow(2, len - 1)»)
		throw new IllegalArgumentException("Specified value " + value + " is out of range.");
			
	«bitField»[«offset / 8»] = (byte)(«bitField»[«offset / 8»] & ~(«len.bitMaskForLen» << «8 - len - (offset % 8)»));
	«bitField»[«offset / 8»] = (byte)(«bitField»[«offset / 8»] | (value << «8 - len - (offset % 8)»));
}
		'''

	def private String bitMaskForLen(long len) {
		var sb = new StringBuffer("0b");
		var count = len;
		while (count > 0) {
			sb.append('1')
			count = count - 1
		}
		return sb.toString
	}

	def private String capitalizeFirst(String str) {
		var first = Character.toUpperCase(str.charAt(0));
		return first + str.substring(1);
	}
}
