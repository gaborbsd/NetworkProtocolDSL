package generator.accessor

import generator.FieldGenerator
import model.Field
import model.CountField

class CountFieldAccessorGenerator implements FieldGenerator {
	private static var CountFieldAccessorGenerator INSTANCE = null;
	
	def CountFieldAccessorGenerator() {}
	
	def static public CountFieldAccessorGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new CountFieldAccessorGenerator
		return INSTANCE
	}

	override generate(Field f) '''
	«var CountField cf = f as CountField»
public long get«cf.name.capitalizeFirst»() {
	return «cf.ref.name».size();
}
	'''

	def private String capitalizeFirst(String str) {
		var first = Character.toUpperCase(str.charAt(0));
		return first + str.substring(1);
	}
}
