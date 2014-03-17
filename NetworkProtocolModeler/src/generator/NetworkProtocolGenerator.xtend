package generator

import generator.util.GeneratorUtil
import java.io.File
import java.io.FileWriter
import java.util.List
import model.ProtocolProps
import model.VariableProps
import org.eclipse.jdt.core.ToolFactory
import org.eclipse.jdt.core.formatter.CodeFormatter
import org.eclipse.jface.text.Document
import java.util.StringTokenizer

class NetworkProtocolGenerator {
	private List<ProtocolProps> model;
	private File basePath;

	new(List<ProtocolProps> model, File basePath) {
		this.model = model
		this.basePath = basePath
	}

	def process() {
		for (protocol : model) {
			var pkgPath = new StringBuilder();

			var tokenizer = new StringTokenizer(protocol.pkg, ".");
			while (tokenizer.hasMoreTokens) {
				pkgPath.append(tokenizer.nextToken)
				pkgPath.append('/')
			}
			var targetDir = new File(pkgPath.toString)
			if (!targetDir.exists)
				targetDir.mkdirs

			pkgPath.append(protocol.name)
			pkgPath.append(".java")

			var code = generateProtocol(protocol).toString
			var formatter = ToolFactory.createCodeFormatter(null)
			var textEdit = formatter.format(CodeFormatter.K_COMPILATION_UNIT, code, 0, code.length(), 0, "\n")
			var doc = new Document(code)
			textEdit.apply(doc)

			var sourceFile = new File(basePath, pkgPath.toString)
			var writer = new FileWriter(sourceFile)
			writer.append(doc.get)
			writer.close
		}
	}

	def private generateProtocol(ProtocolProps protocol) '''
«IF protocol.pkg != null && !protocol.pkg.equals("")»
package «protocol.pkg»;

«ENDIF»
import model.*;
import runtime.*;

public class «protocol.name» extends OrderedSerializable {
	
	«FOR v : protocol.variableProps»
		«generateVariableDef(v)»
	«ENDFOR»
	
	«FOR v : protocol.variableProps»
		«generateVariableGetter(v)»
		«generateVariableSetter(v)»
	«ENDFOR»

	public VariableProps[] getSerializationOrder() {
		return new VariableProps[]
			«FOR v : protocol.variableProps BEFORE '{' SEPARATOR ', ' AFTER '};'»
				new VariableProps(«v.name», «v.type.simpleName».class, «v.byteLen»)
			«ENDFOR»
	}
}
	'''

	def private generateVariableDef(VariableProps variable) '''
private «variable.type.simpleName» «variable.name»;
	'''

	def private generateVariableGetter(VariableProps variable) '''
public «variable.type.simpleName» get«GeneratorUtil.capitalizeFirst(variable.name)»() {
	return this.«variable.name»;
}

	'''

	def private generateVariableSetter(VariableProps variable) '''
public void set«GeneratorUtil.capitalizeFirst(variable.name)»(«variable.type.simpleName» «variable.name») {
	this.«variable.name» = «variable.name»;
}

	'''
}
