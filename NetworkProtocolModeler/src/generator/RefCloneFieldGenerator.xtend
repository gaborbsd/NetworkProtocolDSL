package generator

import model.Field
import model.BinaryField
import model.BitField
import model.IntegerField
import model.StringField
import model.ListField
import model.CountField
import model.LengthField
import model.DataType

class RefCloneFieldGenerator implements FieldGenerator {
	override generate(Field f) '''clone.«f.name» = («f.type»)«f.name».clone();'''

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
