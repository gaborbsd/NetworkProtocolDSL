package runtime;

public interface Formatter<T> {
	byte[] toBytes(T t);
	int parseFromBytes(byte[] bytes, int off, T value);
}
