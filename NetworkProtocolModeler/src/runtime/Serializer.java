package runtime;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

public class Serializer {

	public static String getter(String fieldName) {
		return "get" + fieldName.substring(0, 1).toUpperCase()
				+ fieldName.substring(1);
	}

	public static void putBytesFromLong(ByteBuffer buffer, long val, int bytes) {
		for (int i = 0; i < bytes; i++)
			buffer.put((byte) ((val >> (i * 8)) & 0b11111111));
	}

	public static void putBytesFromString(ByteBuffer buffer, String val,
			int bytes) {
		byte[] src = val.getBytes();
		if (bytes == 0)
			bytes = (byte) src.length;
		for (int i = 0; i < bytes; i++)
			buffer.put(src[i]);
	}

	public static ByteBuffer serialize(OrderedSerializable serializable) {
		ByteBuffer buffer = ByteBuffer.allocate(2048);

		try {
			for (VariableProps props : serializable.getSerializationOrder()) {
				Class<?> srcClass = serializable.getClass();
				Method method = srcClass.getDeclaredMethod(getter(props
						.getName()));
				System.out.println(method.getName());
				if (props.getType().equals("long")) {
					putBytesFromLong(buffer,
							(long) method.invoke(serializable),
							props.getByteLen());
				} else if (props.getType().equals("String")) {
					putBytesFromString(buffer,
							(String) method.invoke(serializable),
							props.getByteLen());
				} else if (props.getType().equals("byte[]")) {
					buffer.put((byte[]) method.invoke(serializable));
				} else if (props.getType().equals("List")) {
					List<?> list = (List<?>) method.invoke(serializable);
					for (Object o : list) {
						ByteBuffer data = serialize((OrderedSerializable) o);
						buffer.put(data);
					}
				} else {
					Object o = (Object) method.invoke(serializable);
					ByteBuffer data = serialize((OrderedSerializable) o);
					buffer.put(data);
				}
			}
			return buffer;
		} catch (SecurityException | IllegalArgumentException
				| IllegalAccessException | NoSuchMethodException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}
