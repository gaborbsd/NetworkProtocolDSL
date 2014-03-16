package model;

import java.util.List;

public class ProtocolProps {
	private String pkg;
	private String name;
	private List<VariableProps> variableProps;
	
	public String getPkg() {
		return pkg;
	}
	public void setPkg(String pkg) {
		this.pkg = pkg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<VariableProps> getVariableProps() {
		return variableProps;
	}
	public void setVariableProps(List<VariableProps> variableProps) {
		this.variableProps = variableProps;
	}
}
