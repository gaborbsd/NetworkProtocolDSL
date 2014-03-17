package parser;

import generator.NetworkProtocolGenerator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.ProtocolProps;
import model.VariableProps;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import parser.NetworkProtocolParser.PkgContext;
import parser.NetworkProtocolParser.ProtocolContext;
import parser.NetworkProtocolParser.VariableDefContext;

public class NetworkProtocolTreeParser extends NetworkProtocolBaseListener {
	private List<ProtocolProps> protocolProps = new ArrayList<>();
	private ProtocolProps props;
	private List<VariableProps> varList;
	private String pkg = "";

	public static Class<?> getJavaType(String type) {
		switch (type) {
		case "int":
			return Integer.class;
		case "byte":
			return Byte.class;
		case "char":
			return Character.class;
		case "timestamp":
			return Long.class;
		}
		return null;
	}

	public static byte getJavaDefaultLen(String type) {
		switch (type) {
		case "int":
			return Integer.SIZE;
		case "byte":
			return Byte.SIZE;
		case "char":
			return Character.SIZE;
		case "timestamp":
			return Long.SIZE;
		}
		return 0;
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
	}

	@Override
	public void enterVariableDef(VariableDefContext ctx) {
		Class<?> type = getJavaType(ctx.type.getText());
		String len = ""; // XXX

		VariableProps props = new VariableProps();
		props.setName(ctx.name.getText());
		props.setType(type);
		if (len != null && !len.equals("")) {
			byte byteLen = Byte.parseByte(len);
			props.setByteLen(byteLen);
		}
		varList.add(props);
	}

	public static void err(String errMsg) {
		System.err.println(errMsg);
		System.exit(-1);
	}

	public static void main(String[] args) {
		if (args.length != 1)
			err("Usage: java NetworkProtocolGenerator <input-file>");
		File file = new File(args[0]);

		if (!file.exists())
			err("Specific input file does not exists.");

		CharStream charStream = null;
		try {
			charStream = new ANTLRFileStream(args[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}

		NetworkProtocolLexer lexer = new NetworkProtocolLexer(charStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		NetworkProtocolParser parser = new NetworkProtocolParser(tokens);

		ParserRuleContext tree = parser.start();
		ParseTreeWalker walker = new ParseTreeWalker();
		NetworkProtocolTreeParser listener = new NetworkProtocolTreeParser();
		walker.walk(listener, tree);
		NetworkProtocolGenerator generator = new NetworkProtocolGenerator(
				listener.protocolProps, new File("."));
		generator.process();
	}
}
