package generator

import model.Formatter

class FormatterSkeletonGenerator implements FormatterGenerator {

	override generate(Formatter f) '''
package «f.package»;

import runtime.*;

public class «f.name» implements Formatter<String> {
	@Override
	public byte[] toBytes(String t) {
		// TODO: implement formatter logic here
		return null;
	}
	
	@Override
	public String parseFromBytes(ByteBuffer buffer) {
		// TODO: implement formatter logic here
		// buffer: ByteBuffer to parse from
		// return value: parsed data as String
		
		return null;
	}
}
	'''

}
