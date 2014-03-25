package parser;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import model.ProtocolProps;
import model.VariableProps;
import parser.NetworkProtocolParser.BinarytypeContext;
import parser.NetworkProtocolParser.InttypeContext;
import parser.NetworkProtocolParser.PkgContext;
import parser.NetworkProtocolParser.ProtocolContext;
import parser.NetworkProtocolParser.StringtypeContext;
import parser.NetworkProtocolParser.VariableDefContext;

public class NetworkProtocolTreeParser extends NetworkProtocolBaseListener {
	private List<ProtocolProps> protocolProps = new ArrayList<>();

	private ProtocolProps props;
	private List<VariableProps> varList;
	private String pkg = "";
	private String var = "";

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
			Field f = c.getField("SIZE");
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
	public void enterPkg(PkgContext ctx) {
		pkg = ctx.name.getText();
	}

	@Override
	public void enterProtocol(ProtocolContext ctx) {
		varList = new ArrayList<>();

		props = new ProtocolProps();
		props.setName(ctx.name.getText());
		props.setPkg(pkg);
		props.setVariableProps(varList);
		protocolProps.add(props);

		seenUnbounded = false;
	}

	private void processVariable(String type, String len, String name) {
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

		VariableProps props = new VariableProps(name, type, byteLen,
				isUnbounded);
		varList.add(props);
	}

	@Override
	public void enterVariableDef(VariableDefContext ctx) {
		if (seenUnbounded)
			throw new IllegalArgumentException(
					"Unbounded fields must be the last.");

		var = ctx.name.getText();
	}

	@Override
	public void enterBinarytype(BinarytypeContext ctx) {
		processVariable(getJavaType(ctx.type.getText()), ctx.len.getText(), var);
	}

	@Override
	public void enterStringtype(StringtypeContext ctx) {
		processVariable(getJavaType(ctx.type.getText()), ctx.len.getText(), var);
	}

	@Override
	public void enterInttype(InttypeContext ctx) {
		processVariable(getJavaType(ctx.type.getText()), ctx.len.getText(), var);
	}

	List<ProtocolProps> getModel() {
		return protocolProps;
	}
}
