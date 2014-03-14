package generator;

import generator.NetworkProtocolParser.ProtocolContext;
import generator.NetworkProtocolParser.VariableDefContext;
import generator.util.GeneratorUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class NetworkProtocolGenerator extends NetworkProtocolBaseListener {
	File basePath;
	PrintWriter writer;

	private Map<String, VariableProps> varMap;
	private byte totalBytes;

	public static String getJavaType(String type) {
		switch (type) {
		case "int":
			return "int";
		case "byte":
			return "byte";
		case "char":
			return "char";
		case "timestamp":
			return "long";
		}
		return "byte";
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
	public void enterProtocol(ProtocolContext ctx) {
		varMap = new LinkedHashMap<>();
		totalBytes = 0;

		String fileName = ctx.name.getText() + ".java";

		File curFile = new File(basePath, fileName);
		try {
			curFile.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			writer = new PrintWriter(new FileOutputStream(curFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		writer.append("public class " + ctx.name.getText() + "{\n");
	}

	@Override
	public void exitProtocol(ProtocolContext ctx) {
		writer.append('}');
		writer.close();
	}

	@Override
	public void enterVariableDef(VariableDefContext ctx) {
		String type = getJavaType(ctx.type.getText());
		String name = ctx.name.getText();
		String len = ctx.len.getText();

		VariableProps props = new VariableProps();
		props.setType(type);
		if (len != null && !len.equals("")) {
			byte byteLen = Byte.parseByte(len);
			props.setByteLen(byteLen);
			totalBytes += byteLen;
		} else {
			totalBytes += getJavaDefaultLen(type);
		}
		varMap.put(name, props);

		writer.append("\tprivate " + type + ' ' + name + ";\n\n");
		writer.append("\tpublic " + type + " get"
				+ GeneratorUtil.capitalizeFirst(name) + "() {\n");
		writer.append("\t\treturn " + name + ";\n\t}\n\n");
		writer.append("\tpublic void " + " set"
				+ GeneratorUtil.capitalizeFirst(name) + "(" + type + ' ' + name
				+ ") {\n");
		writer.append("\t\tthis." + name + " = " + name + ";\n\t}\n\n");
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
		NetworkProtocolGenerator listener = new NetworkProtocolGenerator();
		walker.walk(listener, tree);
	}
}
