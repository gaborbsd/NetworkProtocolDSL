package runtime;

import java.lang.reflect.Field;
import model.VariableProps;

public class Serializer {

	public static void serializeToBytes(Number val, byte bytes, byte[] dest,
			byte off) {
		for (int i = 0; i < bytes; i++)
			dest[off + i] = (byte) ((val.longValue() >> (i * 8)) & 0b11111111);
	}

	public static void serializeToBytes(Character val, byte bytes, byte[] dest,
			byte off) {
		for (int i = 0; i < bytes; i++)
			dest[off + i] = (byte) ((val.charValue() >> (i * 8)) & 0b11111111);

	}

	public static byte[] serialize(OrderedSerializable serializable) {
		byte totalBytes = 0;

		for (VariableProps props : serializable.getSerializationOrder())
			totalBytes += props.getByteLen();

		try {
			byte[] ret = new byte[totalBytes];
			byte off = 0;
			for (VariableProps props : serializable.getSerializationOrder()) {
				Field field = serializable.getClass().getField(props.getName());
				if (props.getType().getClass().getSimpleName()
						.equals("Character")) {
					serializeToBytes(field.getChar(serializable),
							props.getByteLen(), ret, off);
					off += props.getByteLen();
				} else {
					serializeToBytes(field.getLong(serializable),
							props.getByteLen(), ret, off);
					off += props.getByteLen();
				}
			}
			return ret;
		} catch (NoSuchFieldException | SecurityException
				| IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
