package generator.accessor

import generator.FieldGenerator
import model.Field
import model.CountField

import static extension generator.util.StringExtension.*

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
}
