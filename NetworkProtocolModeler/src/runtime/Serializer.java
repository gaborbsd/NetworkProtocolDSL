package runtime;

import java.lang.reflect.Field;

public class Serializer {

	public static void serializeToBytes(Number val, byte bytes, byte[] dest,
			byte off) {
		for (int i = 0; i < bytes; i++)
			dest[off + i] = (byte) ((val.longValue() >> (i * 8)) & 0b11111111);
	}

	public static void serializeToBytes(String val, byte bytes, byte[] dest,
			byte off) {
		byte[] src = val.getBytes();
		if (bytes == 0)
			bytes = (byte) src.length;
		for (int i = 0; i < bytes; i++)
			dest[off + i] = src[i];
	}

	public static void serializeToBytes(byte[] val, byte bytes, byte[] dest,
			byte off) {
		if (bytes == 0)
			bytes = (byte) val.length;
		for (int i = 0; i < bytes; i++)
			dest[off + i] = val[i];
	}

	public static byte[] serialize(OrderedSerializable serializable) {
		byte totalBytes = 0;

		for (VariableProps props : serializable.getSerializationOrder())
			totalBytes += props.getByteLen();

		try {
			byte[] ret = new byte[totalBytes];
			byte off = 0;
			for (VariableProps props : serializable.getSerializationOrder()) {
				Field field = serializable.getClass().getDeclaredField(props.getName());
				field.setAccessible(true);
				if (props.getType().equals("Long")) {
					serializeToBytes((Long)field.get(serializable),
							props.getByteLen(), ret, off);
				} else if (props.getType().equals("String")) {
					serializeToBytes((String) field.get(serializable),
							props.getByteLen(), ret, off);
				} else if (props.getType().equals("byte[]")) {
					serializeToBytes((byte[]) field.get(serializable),
							props.getByteLen(), ret, off);
				} else if (props.getType().equals("List")) {
					// TODO
				} else {
					// TODO
				}
				off += props.getByteLen();
			}
			return ret;
		} catch (NoSuchFieldException | SecurityException
				| IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
