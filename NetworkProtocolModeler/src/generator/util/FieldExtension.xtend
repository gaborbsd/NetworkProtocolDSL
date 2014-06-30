package generator.util

import model.Field
import model.CountField
import model.LengthField
import model.ListField
import model.DataType

class FieldExtension {
	def static String countOf(Field field) {
		return if(field instanceof CountField) "\"" + (field as CountField).ref.name + "\"" else "null";
	}

	def static String lengthOf(Field field) {
		return if(field instanceof LengthField) "\"" + (field as LengthField).ref.name + "\"" else "null";
	}

	def static String formatterClass(Field field) {
		return if(field.formatter != null) "\"" + field.formatter.name + "\"" else "null";
	}

	def static String getCollectionType(Field field) {
		if (field instanceof ListField)
			return (field.elementType as DataType).typeName;
		return null;
	}
	
	def static String getTransient(Field field) {
		return if(field.transientField) "transient" else "";
	}
}