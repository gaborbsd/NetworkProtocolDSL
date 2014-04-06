package parser;

import java.util.HashMap;
import java.util.Map;

import model.BitField;
import model.BitFieldComponent;
import model.CountField;
import model.DataType;
import model.Field;
import model.Formatter;
import model.ListField;
import model.ProtocolFactory;
import model.ProtocolModel;
import model.StringField;
import parser.NetworkProtocolParser.BinaryTypeContext;
import parser.NetworkProtocolParser.BitfieldDefinitionContext;
import parser.NetworkProtocolParser.BitfieldTypeContext;
import parser.NetworkProtocolParser.CountTypeContext;
import parser.NetworkProtocolParser.EmbeddedTypeContext;
import parser.NetworkProtocolParser.FormatterDefinitionContext;
import parser.NetworkProtocolParser.IntTypeContext;
import parser.NetworkProtocolParser.ListTypeContext;
import parser.NetworkProtocolParser.ProtocolDefinitionContext;
import parser.NetworkProtocolParser.StringTypeContext;
import parser.NetworkProtocolParser.VariableDefinitionContext;

public class NetworkProtocolTreeParser extends NetworkProtocolBaseListener {

	private ProtocolFactory factory = ProtocolFactory.eINSTANCE;
	private ProtocolModel model = factory.createProtocolModel();

	private DataType currentProtocol;
	private Field currentField;
	private String currentFieldName = "";

	private Long bitFieldTotalLen;

	private Map<String, String> listReferences;

	private Map<String, String> countReferences;

	private Map<String, Formatter> formatterCache = new HashMap<String, Formatter>();

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
				.packageDefinition().name.getText() : "");
		// TODO: addProtocols()
		model.getProtocols().add(currentProtocol);
		listReferences = new HashMap<String, String>();
		countReferences = new HashMap<String, String>();
	}

	@Override
	public void exitProtocolDefinition(ProtocolDefinitionContext ctx) {
		for (Field f : currentProtocol.getFields()) {
			if (f instanceof ListField) {
				for (DataType dt : model.getProtocols()) {
					if (dt.getTypeName()
							.equals(listReferences.get(f.getName()))) {
						((ListField) f).setElementType(dt);
					}
				}
			}
			if (f instanceof CountField) {
				for (Field other : currentProtocol.getFields()) {
					if (other instanceof ListField) {
						if (((ListField) other).getName().equals(
								countReferences.get(f.getName()))) {
							((CountField) f).setRef((ListField) other);
						}
					}
				}
			}
		}
		for (Formatter formatter : formatterCache.values()) {
			// XXX: addFormatter()
			model.getFormatters().add(formatter);
		}
	}

	private void processVariable(String type, String len) {
		boolean isUnbounded = false;
		byte byteLen = 0;
		if (len != null) {
			if (len.equals("*")) {
				isUnbounded = true;
			} else
				byteLen = Byte.parseByte(len);
		} else {
			byteLen = getJavaDefaultLen(type);
		}

		currentField.setByteLen(new Long(byteLen));
		if (isUnbounded)
			currentField.setUnbounded(true);
	}

	@Override
	public void enterVariableDefinition(VariableDefinitionContext ctx) {
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

	@Override
	public void enterBitfieldType(BitfieldTypeContext ctx) {
		currentField = factory.createBitField();
		currentField.setName(currentFieldName);
		currentField.setUnbounded(false);
		// TODO: addField()
		currentProtocol.getFields().add(currentField);
		bitFieldTotalLen = 0l;
	}

	@Override
	public void exitBitfieldType(BitfieldTypeContext ctx) {
		currentField.setByteLen((long) Math.ceil(bitFieldTotalLen / 8.0));
	}

	@Override
	public void enterListType(ListTypeContext ctx) {
		currentField = factory.createListField();
		currentField.setName(currentFieldName);
		currentField.setUnbounded(true);
		currentField.setByteLen(0l);
		// TODO: addField()
		currentProtocol.getFields().add(currentField);
		listReferences.put(currentFieldName, ctx.listElement.getText());
	}

	@Override
	public void enterCountType(CountTypeContext ctx) {
		currentField = factory.createCountField();
		currentField.setName(currentFieldName);
		processVariable("Long", ctx.len.getText());
		// TODO: addField()
		currentProtocol.getFields().add(currentField);
		countReferences.put(currentFieldName, ctx.countedList.getText());
	}

	@Override
	public void enterBitfieldDefinition(BitfieldDefinitionContext ctx) {
		BitFieldComponent bitFieldComponent = factory.createBitFieldComponent();
		bitFieldComponent.setName(ctx.name.getText());
		Long bitLength = Long.parseLong(ctx.bitLength.getText());
		bitFieldComponent.setBitLength(bitLength);
		bitFieldTotalLen += bitLength;
		// TODO: addComponent()
		((BitField) currentField).getComponents().add(bitFieldComponent);
	}

	@Override
	public void enterFormatterDefinition(FormatterDefinitionContext ctx) {
		String name = ctx.name.getText();
		if (formatterCache.containsKey(name)) {
			currentField.setFormatter(formatterCache.get(name));
		} else {
			Formatter formatter = factory.createFormatter();
			formatter.setName(name);
			formatterCache.put(name, formatter);
			currentField.setFormatter(formatter);
		}
	}

	ProtocolModel getModel() {
		return model;
	}
}
