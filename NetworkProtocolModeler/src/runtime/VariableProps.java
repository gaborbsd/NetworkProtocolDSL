package runtime;

public class VariableProps {
	private String name;
	private byte byteLen;
	String type;
	private boolean unbounded;

	public VariableProps() {
		super();
	}

	public VariableProps(String name, String type, byte byteLen,
			boolean unbounded) {
		super();
		this.name = name;
		this.type = type;
		this.byteLen = byteLen;
		this.unbounded = unbounded;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getByteLen() {
		return byteLen;
	}

	public void setByteLen(byte byteLen) {
		this.byteLen = byteLen;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isUnbounded() {
		return unbounded;
	}

	public void setUnbounded(boolean unbounded) {
		this.unbounded = unbounded;
	}
}
