package runtime;

public interface Formatter<T> {
	Byte[] toBytes(T t);
	T fromBytes(Byte[] bytes);
}
