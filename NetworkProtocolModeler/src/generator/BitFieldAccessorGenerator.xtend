package generator

import generator.FieldGenerator
import model.Field
import model.BinaryField
import model.BitField
import model.IntegerField
import model.StringField
import model.ListField
import model.CountField
import model.LengthField
import model.DataType

class BitFieldAccessorGenerator implements FieldGenerator {
	private static var BitFieldAccessorGenerator INSTANCE = null;
	
	def BitFieldAccessorGenerator() {}
	
	def static public BitFieldAccessorGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new BitFieldAccessorGenerator
		return INSTANCE
	}
	
	override generate(Field f) '''
public «f.type» get«f.name.capitalizeFirst»() {
	return this.«f.name»;
}

public void set«f.name.capitalizeFirst»(«f.type» «f.name») {
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

	def String getType(Field field) {
		if (field instanceof BinaryField)
			return "byte[]";
		if (field instanceof BitField)
			return "byte[]";
		if (field instanceof IntegerField)
			return "long";
		if (field instanceof StringField)
			return "String";
		if (field instanceof ListField)
			return "List";
		if (field instanceof CountField)
			return "long";
		if (field instanceof LengthField)
			return "long";
		if (field instanceof DataType)
			return (field as DataType).typeName;
		throw new RuntimeException("Cannot happen.");
	}
}
