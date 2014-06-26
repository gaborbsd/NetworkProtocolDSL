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

class SimpleFieldAccessorGenerator implements FieldGenerator {

	override generate(Field f) '''
public «f.type» get«f.name.capitalizeFirst»() {
	return this.«f.name»;
}

public void set«f.name.capitalizeFirst»(«f.type» «f.name») {
	«IF f.byteLen > 0»
		«IF f.type.equals("long")»
		if (Long.highestOneBit(«f.name») > «Math.pow(2, (f.byteLen - 1) * 8)»)
			throw new IllegalArgumentException("Specified value " + «f.name» + " is out of range.");
		«ENDIF»
		«IF f.type.equals("String")»
		if («f.name».getBytes().length > «f.byteLen»)
			throw new IllegalArgumentException("Specified value " + «f.name» + " does not fit in string field.");
		«ENDIF»
		«IF f.type.equals("Byte[]")»
		if («f.name».length > «f.byteLen»)
			throw new IllegalArgumentException("Specified value " + «f.name» + " does not fit in string field.");
		«ENDIF»
	«ENDIF»
	this.«f.name» = «f.name»;
}
	'''

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
