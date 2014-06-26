package generator

import generator.FieldGenerator
import model.Field
import model.CountField

class CountFieldAccessorGenerator implements FieldGenerator {

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
