package runtime;

import java.nio.ByteBuffer;

public interface Formatter<T> {
	byte[] toBytes(T t);

	T parseFromBytes(ByteBuffer buffer);
}
