package generator

import java.io.File
import java.io.FileWriter
import java.util.StringTokenizer
import model.ProtocolModel
import org.eclipse.jdt.core.ToolFactory
import org.eclipse.jdt.core.formatter.CodeFormatter
import org.eclipse.jface.text.Document

class NetworkProtocolGenerator {
	private ProtocolModel model;
	private File basePath;

	new(ProtocolModel model, File basePath) {
		this.model = model
		this.basePath = basePath
	}

	def process() {
		var dataTypeGenerator = new DataTypeGeneratorImpl

		for (protocol : model.protocols) {
			var pkgPath = new StringBuilder();

			var tokenizer = new StringTokenizer(protocol.package, ".");
			while (tokenizer.hasMoreTokens) {
				pkgPath.append(tokenizer.nextToken)
				pkgPath.append('/')
			}
			var targetDir = new File(pkgPath.toString)
			if (!targetDir.exists)
				targetDir.mkdirs

			pkgPath.append(protocol.typeName)
			pkgPath.append(".java")

			var String code = dataTypeGenerator.generate(protocol);
			var codeFormatter = ToolFactory.createCodeFormatter(null)
			var textEdit = codeFormatter.format(CodeFormatter.K_COMPILATION_UNIT, code, 0, code.length(), 0, "\n")
			var doc = new Document(code)

			//textEdit.apply(doc)
			var sourceFile = new File(basePath, pkgPath.toString)
			var writer = new FileWriter(sourceFile)
			writer.append(code)
			writer.close
		}

		var formatterGenerator = new FormatterSkeletonGenerator
		for (formatter : model.formatters) {
			var pkgPath = new StringBuilder();

			var tokenizer = new StringTokenizer(formatter.package, ".");
			while (tokenizer.hasMoreTokens) {
				pkgPath.append(tokenizer.nextToken)
				pkgPath.append('/')
			}
			var targetDir = new File(pkgPath.toString)
			if (!targetDir.exists)
				targetDir.mkdirs

			pkgPath.append(formatter.name)
			pkgPath.append(".java")

			if (!(new File(pkgPath.toString).exists)) {
				var String code = formatterGenerator.generate(formatter)
				var codeFormatter = ToolFactory.createCodeFormatter(null)
				var textEdit = codeFormatter.format(CodeFormatter.K_COMPILATION_UNIT, code, 0, code.length(), 0, "\n")
				var doc = new Document(code)

				//textEdit.apply(doc)
				var sourceFile = new File(basePath, pkgPath.toString)
				var writer = new FileWriter(sourceFile)
				writer.append(code)
				writer.close
			}
		}
	}
}
