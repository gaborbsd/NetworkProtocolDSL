package parser;

import model.DataType;
import model.Field;
import model.ProtocolFactory;
import model.ProtocolModel;
import parser.NetworkProtocolParser.BinaryTypeContext;
import parser.NetworkProtocolParser.EmbeddedTypeContext;
import parser.NetworkProtocolParser.IntTypeContext;
import parser.NetworkProtocolParser.ProtocolDefinitionContext;
import parser.NetworkProtocolParser.StringTypeContext;
import parser.NetworkProtocolParser.VariableDefinitionContext;

public class NetworkProtocolTreeParser extends NetworkProtocolBaseListener {

	private ProtocolFactory factory = ProtocolFactory.eINSTANCE;
	private ProtocolModel model = factory.createProtocolModel();

	private DataType currentProtocol;
	private Field currentField;
	private String currentFieldName = "";

	private boolean seenUnbounded;

	public static String getJavaType(String type) {
		switch (type) {
		case "int":
		case "uint":
		case "timestamp":
			return "Long";
		case "binary":
			return "Byte[]";
		case "string":
			return "String";
		}
		return type;
	}

	public static byte getJavaDefaultLen(String type) {
		try {
			Class<?> c = Class.forName(type);
			java.lang.reflect.Field f = c.getField("SIZE");
			f.setAccessible(true);
			return (byte) (f.getByte(null) / 8);
		} catch (NoSuchFieldException | SecurityException
				| IllegalArgumentException | IllegalAccessException
				| ClassNotFoundException e) {
			switch (type) {
			case "String":
			case "Byte[]":
				return 0;
			default:
				return Long.SIZE / 8;
			}

		}
	}

	@Override
	public void enterProtocolDefinition(ProtocolDefinitionContext ctx) {
		currentProtocol = factory.createDataType();
		currentProtocol.setTypeName(ctx.name.getText());
		currentProtocol.setPackage((ctx.packageDefinition() != null) ? ctx
				.packageDefinition().getText() : "");
		// TODO: addProtocols()
		model.getProtocols().add(currentProtocol);
		seenUnbounded = false;
	}

	private void processVariable(String type, String len) {
		boolean isUnbounded = false;
		byte byteLen = 0;
		if (len != null) {
			if (len.equals("*")) {
				isUnbounded = true;
				seenUnbounded = true;
			} else
				byteLen = Byte.parseByte(len);
		} else {
			byteLen = getJavaDefaultLen(type);
		}

		if ((type.equals("String") || type.equals("Byte[]")) && !isUnbounded
				&& (byteLen == 0))
			throw new IllegalArgumentException(
					"Strings and byte arrays must be unbounded or "
							+ "must have an explicitly specified length.");

		if (type.equals("Long") && byteLen > (Long.SIZE / 8))
			throw new IllegalArgumentException(
					"Integers do not support length higher than 8 bytes.");

		if (type.equals("Long") && isUnbounded)
			throw new IllegalArgumentException("Integers cannot be unbounded.");

		currentField.setByteLen(new Long(byteLen));
		if (isUnbounded)
			currentField.setUnbounded(true);
	}

	@Override
	public void enterVariableDefinition(VariableDefinitionContext ctx) {
		if (seenUnbounded)
			throw new IllegalArgumentException(
					"Unbounded fields must be the last.");
		currentFieldName = ctx.name.getText();
	}

	@Override
	public void enterBinaryType(BinaryTypeContext ctx) {
		currentField = factory.createBinaryField();
		currentField.setName(currentFieldName);
		processVariable(getJavaType(ctx.type.getText()), ctx.len.getText());
		// TODO: addField()
		currentProtocol.getFields().add(currentField);
	}

	@Override
	public void enterStringType(StringTypeContext ctx) {
		currentField = factory.createStringField();
		currentField.setName(currentFieldName);
		processVariable(getJavaType(ctx.type.getText()), ctx.len.getText());
		// TODO: addField()
		currentProtocol.getFields().add(currentField);
	}

	@Override
	public void enterIntType(IntTypeContext ctx) {
		currentField = factory.createIntegerField();
		currentField.setName(currentFieldName);
		processVariable(getJavaType(ctx.type.getText()), ctx.len.getText());
		// TODO: addField()
		currentProtocol.getFields().add(currentField);
	}

	@Override
	public void exitEmbeddedType(EmbeddedTypeContext ctx) {
		currentField = factory.createDataType();
		currentField.setName(currentFieldName);
		currentField.setByteLen(0l);
		currentField.setUnbounded(false);
		((DataType) currentField).setTypeName(ctx.type.getText());
		// TODO: addField()
		currentProtocol.getFields().add(currentField);
	}

	ProtocolModel getModel() {
		return model;
	}
}
