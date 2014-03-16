package runtime;

import model.VariableProps;

public interface OrderedSerializable {
	VariableProps[] getSerializationOrder();
}
