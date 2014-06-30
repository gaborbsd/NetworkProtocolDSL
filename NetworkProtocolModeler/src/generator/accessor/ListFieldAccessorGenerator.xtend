package generator.accessor

import model.Field
import model.ListField
import generator.FieldGenerator

class ListFieldAccessorGenerator implements FieldGenerator {
	private static var ListFieldAccessorGenerator INSTANCE = null;
	
	def ListFieldAccessorGenerator() {}
	
	def static public ListFieldAccessorGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new ListFieldAccessorGenerator
		return INSTANCE
	}

	override generate(Field f) '''
	«var ListField lf = f as ListField»
	
public void add«f.name.singularize.capitalizeFirst»(«lf.elementType.javaType» e) {
	«f.name».add(e);
}

public «lf.elementType.javaType» get«f.name.singularize.capitalizeFirst»(int no) {
	return «f.name».get(no);
}

public void clear«f.name.capitalizeFirst»() {
	«f.name».clear();
}

public void remove«f.name.singularize.capitalizeFirst»(int no) {
	«f.name».remove(no);
}

public List<«lf.elementType.javaType»> get«f.name.capitalizeFirst»() {
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
}
