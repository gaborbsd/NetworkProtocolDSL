package generator.util

class StringExtension {
	def static String singularize(String str) {
		if (str.substring(str.length - 3, str.length).equals("ies"))
			return str.substring(0, str.length - 3) + "y";
		if (str.substring(str.length - 1, str.length).equals("s"))
			return str.substring(0, str.length - 1)
		return str;
	}

	def static String capitalizeFirst(String str) {
		var first = Character.toUpperCase(str.charAt(0));
		return first + str.substring(1);
	}
}
