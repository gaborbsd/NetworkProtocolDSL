package generator.accessor

import generator.FieldGenerator
import model.Field
import model.LengthField

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

	def private String capitalizeFirst(String str) {
		var first = Character.toUpperCase(str.charAt(0));
		return first + str.substring(1);
	}

}
