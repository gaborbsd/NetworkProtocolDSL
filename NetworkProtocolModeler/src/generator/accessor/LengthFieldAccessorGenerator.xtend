package generator.accessor

import generator.FieldGenerator
import model.Field
import model.LengthField

import static extension generator.util.StringExtension.*

class LengthFieldAccessorGenerator implements FieldGenerator {
	private static var LengthFieldAccessorGenerator INSTANCE = null;
	
	def LengthFieldAccessorGenerator() {}
	
	def static public LengthFieldAccessorGenerator getInstance() {
		if (INSTANCE == null)
			INSTANCE = new LengthFieldAccessorGenerator
		return INSTANCE
	}

	override generate(Field f) '''
	«var LengthField cf = f as LengthField»
public long get«cf.name.capitalizeFirst»() {
	return «cf.ref.name».length;
}
	'''
}
