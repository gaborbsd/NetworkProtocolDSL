package runtime;

import java.lang.reflect.Constructor;
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
		for (int i = bytes - 1; i >= 0; i--)
			buffer.put((byte) ((val >> (i * 8)) & 0b11111111));
	}

	public static void putBytesFromString(ByteBuffer buffer, String val,
			int bytes) {
		byte[] src = val.getBytes();
		if (bytes == 0)
			bytes = (byte) src.length;
		for (int i = bytes - 1; i >= 0; i--)
			buffer.put(src[i]);
	}

	public static void putBytesFromByteArray(ByteBuffer buffer, byte[] src) {
		for (int i = 0; i < src.length; i++)
			buffer.put(src[i]);
	}

	public static ByteBuffer serialize(OrderedSerializable serializable) {
		ByteBuffer buffer = ByteBuffer.allocate(2048);

		try {
			for (VariableProps props : serializable.getSerializationOrder()) {
				Class<?> srcClass = serializable.getClass();
				Method method = srcClass.getDeclaredMethod(getter(props
						.getName()));
				if (props.getType().equals("long")) {
					putBytesFromLong(buffer,
							(long) method.invoke(serializable),
							props.getByteLen());
				} else if (props.getType().equals("String")) {
					byte[] data = null;
					String str = (String) method.invoke(serializable);
					String formatterName = props.getFormatter();
					if (formatterName != null) {
						Package pkg = serializable.getClass().getPackage();
						Class<?> formatterClass = Class.forName(pkg.getName()
								+ "." + formatterName);
						Constructor<?> formatterConstructor = formatterClass
								.getConstructor();
						@SuppressWarnings("unchecked")
						Formatter<String> formatter = (Formatter<String>) formatterConstructor
								.newInstance();
						data = formatter.toBytes(str);
						buffer.put(data);
					} else {
						putBytesFromString(buffer, str, props.getByteLen());
					}
				} else if (props.getType().equals("byte[]")) {
					putBytesFromByteArray(buffer,
							(byte[]) method.invoke(serializable));
				} else if (props.getType().equals("List")) {
					List<?> list = (List<?>) method.invoke(serializable);
					for (Object o : list) {
						ByteBuffer data = serialize((OrderedSerializable) o);
						data.flip();
						buffer.put(data);
					}
				} else {
					Object o = (Object) method.invoke(serializable);
					ByteBuffer data = serialize((OrderedSerializable) o);
					data.flip();
					buffer.put(data);
				}
			}
			return buffer;
		} catch (SecurityException | IllegalArgumentException
				| IllegalAccessException | NoSuchMethodException
				| InvocationTargetException | ClassNotFoundException
				| InstantiationException e) {
			e.printStackTrace();
		}
		return null;
	}
}
