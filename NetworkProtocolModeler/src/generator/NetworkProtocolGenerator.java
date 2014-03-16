package generator;

import generator.NetworkProtocolParser.ProtocolContext;
import generator.NetworkProtocolParser.VariableDefContext;
import generator.util.GeneratorUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;

import runtime.VariableProps;

public class NetworkProtocolGenerator extends NetworkProtocolBaseListener {
	private File basePath;
	private File curFile;
	private PrintWriter writer;
	private StringWriter stringWriter;

	private List<VariableProps> varList;

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

	public void generateGetSerializationOrder() {
		writer.append("public VariableProps[] getSerializationOrder() {");
		writer.append("return new VariableProps[] { ");

		VariableProps props = null;
		for (Iterator<VariableProps> it = varList.iterator(); it.hasNext(); props = it
				.next()) {
			writer.append("new " + props.toString());
			writer.append(it.hasNext() ? ", " : "};");
		}
	}

	@Override
	public void enterProtocol(ProtocolContext ctx) {
		varList = new ArrayList<>();

		String fileName = ctx.name.getText() + ".java";

		curFile = new File(basePath, fileName);
		try {
			curFile.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		stringWriter = new StringWriter();
		writer = new PrintWriter(stringWriter);
		writer.append("import runtime.*;");
		writer.append("public class " + ctx.name.getText()
				+ " extends OrderedSerializable {");
	}

	@Override
	public void exitProtocol(ProtocolContext ctx) {
		writer.append('}');
		writer.close();

		String code = stringWriter.toString();
		CodeFormatter formatter = ToolFactory.createCodeFormatter(null);
		TextEdit textEdit = formatter.format(CodeFormatter.K_COMPILATION_UNIT,
				code, 0, code.length(), 0, "\n");
		IDocument doc = new Document(code);

		try (FileWriter fileWriter = new FileWriter(curFile);) {
			textEdit.apply(doc);
			fileWriter.write(doc.get());
		} catch (MalformedTreeException e) {
			e.printStackTrace();
		} catch (BadLocationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void enterVariableDef(VariableDefContext ctx) {
		Class<?> type = getJavaType(ctx.type.getText());
		String name = ctx.name.getText();
		String len = ""; // XXX

		VariableProps props = new VariableProps();
		props.setType(type);
		if (len != null && !len.equals("")) {
			byte byteLen = Byte.parseByte(len);
			props.setByteLen(byteLen);
		}
		varList.add(props);

		writer.append("private " + type.getSimpleName() + ' ' + name + ";");
		writer.append("public " + type.getSimpleName() + " get"
				+ GeneratorUtil.capitalizeFirst(name) + "() {");
		writer.append("return " + name + ";}");
		writer.append("public void " + " set"
				+ GeneratorUtil.capitalizeFirst(name) + "("
				+ type.getSimpleName() + ' ' + name + ") {");
		writer.append("this." + name + " = " + name + ";}");
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
