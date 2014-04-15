package runtime;

public class VariableProps {
	private String name;
	private int byteLen;
	private String type;
	private String collectionType;
	private boolean unbounded;
	private String formatter;
	private String countOf;

	public VariableProps() {
		super();
	}

	public VariableProps(String name, String type, String collectionType,
			int byteLen, boolean unbounded, String formatter, String countOf) {
		super();
		this.name = name;
		this.type = type;
		this.collectionType = collectionType;
		this.byteLen = byteLen;
		this.unbounded = unbounded;
		this.formatter = formatter;
		this.countOf = countOf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getByteLen() {
		return byteLen;
	}

	public void setByteLen(int byteLen) {
		this.byteLen = byteLen;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCollectionType() {
		return collectionType;
	}

	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
	}

	public boolean isUnbounded() {
		return unbounded;
	}

	public void setUnbounded(boolean unbounded) {
		this.unbounded = unbounded;
	}

	public String getFormatter() {
		return formatter;
	}

	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}

	public String getCountOf() {
		return countOf;
	}

	public void setCountOf(String countOf) {
		this.countOf = countOf;
	}
}