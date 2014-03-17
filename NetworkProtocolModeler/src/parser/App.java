package parser;

import generator.NetworkProtocolGenerator;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class App {
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
				listener.getModel(), new File("."));
		generator.process();
	}
}
