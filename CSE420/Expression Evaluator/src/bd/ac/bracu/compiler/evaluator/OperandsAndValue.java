package bd.ac.bracu.compiler.evaluator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperandsAndValue {

    private Map<String, Integer> operandValue;

    public OperandsAndValue(List<String> operands, List<Integer> values) throws OperandValueException {
        operandValue = new HashMap<>();
        if (operands.size() != values.size())
            throw new OperandValueException("Invalid combination");

        for (int i = 0; i < operands.size(); i++) {
            operandValue.put(operands.get(i), values.get(i));
        }
    }

    public Map<String, Integer> getOperandValue() {
        return operandValue;
    }
}
