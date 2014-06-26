package generator

import model.Field
import model.ListField
import model.BinaryField
import model.BitField
import model.IntegerField
import model.StringField
import model.CountField
import model.LengthField
import model.DataType

class ListFieldAccessorGenerator implements FieldGenerator {

	override generate(Field f) '''
	«var ListField lf = f as ListField»
	
public void add«f.name.singularize.capitalizeFirst»(«lf.elementType.type» e) {
	«f.name».add(e);
}

public «lf.elementType.type» get«f.name.singularize.capitalizeFirst»(int no) {
	return «f.name».get(no);
}

public void clear«f.name.capitalizeFirst»() {
	«f.name».clear();
}

public void remove«f.name.singularize.capitalizeFirst»(int no) {
	«f.name».remove(no);
}

public List<«lf.elementType.type»> get«f.name.capitalizeFirst»() {
	return Collections.unmodifiableList(«f.name»);
}
	'''

	def private String singularize(String str) {
		if (str.substring(str.length - 3, str.length).equals("ies"))
			return str.substring(0, str.length - 3) + "y";
		if (str.substring(str.length - 1, str.length).equals("s"))
			return str.substring(0, str.length - 1)
		return str;
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
