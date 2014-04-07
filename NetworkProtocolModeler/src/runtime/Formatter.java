package runtime;

public interface Formatter<T> {
	Byte[] toBytes(T t);
	int parseFromBytes(Byte[] bytes, int off, T value);
}
