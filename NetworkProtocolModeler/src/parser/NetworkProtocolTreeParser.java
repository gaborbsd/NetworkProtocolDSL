package parser;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import model.ProtocolProps;
import model.VariableProps;
import parser.NetworkProtocolParser.PkgContext;
import parser.NetworkProtocolParser.ProtocolContext;
import parser.NetworkProtocolParser.VariableDefContext;

public class NetworkProtocolTreeParser extends NetworkProtocolBaseListener {
	private List<ProtocolProps> protocolProps = new ArrayList<>();
	private ProtocolProps props;
	private List<VariableProps> varList;
	private String pkg = "";

	private boolean seenUnbounded;

	public static Class<?> getJavaType(String type) {
		switch (type) {
		case "int":
		case "uint":
		case "timestamp":
			return Long.class;
		case "binary":
			return Byte[].class;
		case "string":
			return String.class;
		}
		return null;
	}

	public static byte getJavaDefaultLen(Class<?> type) {
		try {
			Field f = type.getField("SIZE");
			f.setAccessible(true);
			return (byte) (f.getByte(null) / 8);
		} catch (NoSuchFieldException | SecurityException
				| IllegalArgumentException | IllegalAccessException e) {
			switch (type.getSimpleName()) {
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

	@Override
	public void enterVariableDef(VariableDefContext ctx) {
		Class<?> type = getJavaType(ctx.type.getText());

		if (seenUnbounded)
			throw new IllegalArgumentException(
					"Unbounded fields must be the last.");

		boolean isUnbounded = false;
		byte len = 0;
		if (ctx.len != null) {
			if (ctx.len.getText().equals("*")) {
				isUnbounded = true;
				seenUnbounded = true;
			} else
				len = Byte.parseByte(ctx.len.getText());
		} else {
			len = getJavaDefaultLen(type);
		}

		if ((type.getSimpleName().equals("String") || type.getSimpleName()
				.equals("Byte[]")) && !isUnbounded && (len == 0))
			throw new IllegalArgumentException(
					"Strings and byte arrays must be unbounded or "
							+ "must have an explicitly specified length.");

		if (type.getSimpleName().equals("Long") && len > (Long.SIZE / 8))
			throw new IllegalArgumentException(
					"Integers do not support length higher than 8 bytes.");

		if (type.getSimpleName().equals("Long") && isUnbounded)
			throw new IllegalArgumentException("Integers cannot be unbounded.");

		VariableProps props = new VariableProps(ctx.name.getText(), type, len,
				isUnbounded);
		varList.add(props);
	}

	List<ProtocolProps> getModel() {
		return protocolProps;
	}
}
