package runtime;

import java.nio.ByteBuffer;

public interface Formatter<T> {
	byte[] toBytes(T t);

	int parseFromBytes(ByteBuffer bytes, int off, T value);
}
