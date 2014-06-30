package generator.util

class LongExtension {
	def static String bitMaskForLen(long len) {
		var sb = new StringBuffer("0b");
		var count = len;
		while (count > 0) {
			sb.append('1')
			count = count - 1
		}
		return sb.toString
	}
}
