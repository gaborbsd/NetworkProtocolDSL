package generator;

import generator.NetworkProtocolParser.ProtocolContext;
import generator.NetworkProtocolParser.VariableDefContext;
import generator.util.GeneratorUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import runtime.VariableProps;

public class NetworkProtocolGenerator extends NetworkProtocolBaseListener {
	File basePath;
	PrintWriter writer;

	private List<VariableProps> varList;

	public static Type getJavaType(String type) {
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

	public void generateGetSerializationOrder() {
		writer.append("\tpublic VariableProps[] getSerializationOrder() {\n");
		writer.append("\t\treturn new VariableProps[] { ");

		VariableProps props = null;
		for (Iterator<VariableProps> it = varList.iterator(); it.hasNext(); props = it
				.next()) {
			writer.append("new " + props.toString());
			writer.append(it.hasNext() ? ", " : "};");
		}
		writer.append("\t\n}");
	}

	@Override
	public void enterProtocol(ProtocolContext ctx) {
		varList = new ArrayList<>();

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
		writer.append("import generator.*;\n\n");
		writer.append("public class " + ctx.name.getText()
				+ "extends OrderedSerializable {\n");
	}

	@Override
	public void exitProtocol(ProtocolContext ctx) {
		writer.append('}');
		writer.close();
	}

	@Override
	public void enterVariableDef(VariableDefContext ctx) {
		Type type = getJavaType(ctx.type.getText());
		String name = ctx.name.getText();
		String len = ctx.len.getText();

		VariableProps props = new VariableProps();
		props.setType(type);
		if (len != null && !len.equals("")) {
			byte byteLen = Byte.parseByte(len);
			props.setByteLen(byteLen);
		}
		varList.add(props);

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
