package bd.ac.bracu.compiler.evaluator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Evaluator {

    private InfixToPostfix infixToPostfix;
    private String postfixExpression;
    private String expression;
    private OperandsAndValue operandsAndValue;
    private Stack<String> stack;

    public Evaluator(List<String> operands, List<Integer> values, String expression) throws OperandValueException {
        this.infixToPostfix = new InfixToPostfix(operands, values, expression);
        this.postfixExpression = this.infixToPostfix.toPostfix();
        this.expression = expression;
        this.operandsAndValue = this.infixToPostfix.getOperandsAndValue();
        stack = new Stack<>();
    }

    public void evaluateExpression() {
//        System.out.println("DEBUG: " + operandsAndValue.getOperandValue().toString());
        String parts[] = createChunkFromExpression();

        for (int i = 0; i < parts.length; i++) {
            String temp = parts[i];
//            System.out.println("DEBUG: Stack " + stack.toString());

            if (isOperand(temp)) {
                stack.push(temp);
            } else if (isOperator(temp)) {
                String a = stack.pop().trim();
                String b = stack.pop().trim();

                int ai = -20;
                int bi = -20;

                try {
                    ai = Integer.parseInt(a);
                } catch (Exception ex) {
                    ai = operandsAndValue.getOperandValue().get(a);
                }

                try {
                    bi = Integer.parseInt(b);
                } catch (Exception ex) {
                    bi = operandsAndValue.getOperandValue().get(b);
                }

                int res = 0;

                if (temp.equals("+")) {
                    res = ai + bi;
                } else if (temp.equals("-")) {
                    res = ai - bi;
                } else if (temp.equals("*")) {
                    res = ai * bi;
                } else if (temp.equals("/")) {
                    res = ai / bi;
                }

                stack.push(String.valueOf(res));
            }
        }
        System.out.println(stack.pop());
    }

    public String getExpression() {
        return expression;
    }

    public String getPostfixExpression() {
        return postfixExpression;
    }

    public boolean isOperand(String str) {
        return operandsAndValue.getOperandValue().containsKey(str);
    }

    public boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("^");
    }

    private String[] objectToStringArray(Object[] ar) {
        String temp[] = new String[ar.length];
        for (int i = 0; i < ar.length; i++) {
            temp[i] = (String) ar[i];
        }
        return temp;
    }

    private String[] createChunkFromExpression() {
        String temp[] = postfixExpression.split("");
        List<String> parts = new ArrayList<>();

        for (int i = 0; i < temp.length; i++) {
            if (!temp[i].equals(" "))
                parts.add(temp[i].trim());
        }
        return objectToStringArray(parts.toArray());
    }
}
