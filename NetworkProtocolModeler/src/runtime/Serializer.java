package runtime;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	public static long getLongFromBytes(ByteBuffer buffer, int bytes) {
		long ret = 0;
		byte[] data = new byte[bytes];
		buffer.get(data);
		for (int i = data.length - 1; i >= 0; i--) {
			ret |= data[i] << (data.length - i - 1);
		}
		return ret;
	}

	public static byte[] getByteArrayFromBytes(ByteBuffer buffer, int bytes) {
		byte[] data = new byte[bytes == 0 ? buffer.remaining() : bytes];
		buffer.get(data);
		return data;
	}

	public static String getBoundedStringFromBytes(ByteBuffer buffer, int bytes) {
		byte[] data = new byte[bytes];
		buffer.get(data);
		return new String(data);
	}

	public static String getTrailingStringFromBytes(ByteBuffer buffer) {
		byte[] data = new byte[buffer.remaining()];
		buffer.get(data);
		return new String(data);
	}

	public static void deserialize(OrderedSerializable serializable,
			ByteBuffer buffer) {

		Map<String, Long> counters = new HashMap<>();

		try {
			for (VariableProps props : serializable.getSerializationOrder()) {
				if (props.getType().equals("long")) {
					long ret = getLongFromBytes(buffer, props.getByteLen());
					if (props.getCountOf() != null) {
						counters.put(props.getCountOf(), ret);
					} else {
						Class<?> srcClass = serializable.getClass();
						Field field = srcClass
								.getDeclaredField(props.getName());
						field.setAccessible(true);
						field.setLong(serializable, ret);
					}
					continue;
				}

				Class<?> srcClass = serializable.getClass();
				Field field = srcClass.getDeclaredField(props.getName());
				field.setAccessible(true);
				if (props.getType().equals("String")) {
					String str = null;
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
						str = formatter.parseFromBytes(buffer);
					} else if (props.getByteLen() != 0) {
						str = getBoundedStringFromBytes(buffer,
								props.getByteLen());
					} else {
						str = getTrailingStringFromBytes(buffer);
					}
					field.set(serializable, str);
				} else if (props.getType().equals("byte[]")) {
					field.set(serializable,
							getByteArrayFromBytes(buffer, props.getByteLen()));
				} else if (props.getType().equals("List")) {
					long count = counters.get(props.getName());
					Package pkg = serializable.getClass().getPackage();
					Class<?> listElementClass = Class.forName(pkg.getName()
							+ "." + props.getCollectionType());
					Constructor<?> listElementConstructor = listElementClass
							.getConstructor();
					List<OrderedSerializable> list = new ArrayList<>();
					for (int i = 0; i < count; i++) {
						OrderedSerializable o = (OrderedSerializable) listElementConstructor
								.newInstance();
						deserialize(o, buffer);
						list.add(o);
					}
					field.set(serializable, list);
				} else {
					Class<?> objectClass = Class.forName(props.getType());
					Constructor<?> objectConstructor = objectClass
							.getConstructor();
					OrderedSerializable o = (OrderedSerializable) objectConstructor
							.newInstance();
					deserialize(o, buffer);
				}
			}
		} catch (SecurityException | IllegalArgumentException
				| IllegalAccessException | NoSuchMethodException
				| InvocationTargetException | ClassNotFoundException
				| InstantiationException | NoSuchFieldException e) {
			e.printStackTrace();
		}
	}
}
