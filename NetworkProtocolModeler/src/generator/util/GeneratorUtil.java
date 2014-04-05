package generator.util;

public final class GeneratorUtil {

	public static byte[] serializeToBytes(int val, byte bytes) {
		byte[] ret = new byte[bytes];

		for (int i = 0; i < bytes; i++)
			ret[0] = (byte) ((val >> (i * 8)) & 0b11111111);

		return ret;
	}

	public static int deserializeToInt(byte[] bytes) {
		int ret = 0;

		for (int i = 0; i < bytes.length; i++)
			i += (bytes[i] << (i * 8));

		return ret;
	}
}
