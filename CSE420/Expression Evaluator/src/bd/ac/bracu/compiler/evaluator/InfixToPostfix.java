package bd.ac.bracu.compiler.evaluator;

import bd.ac.bracu.compiler.utilities.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InfixToPostfix {

    private OperandsAndValue operandsAndValue;
    private Utils utilities;
    private Stack<String> stack;
    private StringBuilder postfixString;
    private String expression;

    public InfixToPostfix(List<String> operands, List<Integer> values, String expression) throws OperandValueException {
        operandsAndValue = new OperandsAndValue(operands, values);
        utilities = new Utils();
        stack = new Stack<>();
        postfixString = new StringBuilder("");
        this.expression = expression;
    }

    public String toPostfix() {
        String expressionParts[] = createChunkFromExpression();
//        System.out.println("DEBUG: expressionParts " + Arrays.toString(expressionParts));

        for (int i = 0; i < expressionParts.length; i++) {
//            System.out.println("STACK: " + stack.toString());
//            System.out.println("DEBUG: Now evaluating " + expressionParts[i]);
            if (isOperand(expressionParts[i])) {
//                System.out.println("DEBUG: isOperand");
                postfixString.append(expressionParts[i]);
            } else if (isOperator(expressionParts[i])) {
//                System.out.println("DEBUG: isOperator");
                if (stack.isEmpty() || isOpeningBracket(stack.peek())) {
//                    System.out.println("\tDEBUG: stack.isEmpty() || isOpeningBracket(stack.peek()");
                    stack.push(expressionParts[i]);
                    continue;
                }

                if (isOperator(stack.peek())) {
//                    System.out.println("\tDEBUG: isOperator(stack.peek())");
                    if (utilities.checkPrecedence(expressionParts[i], stack.peek())) {
//                        System.out.println("\t\tDEBUG: utilities.checkPrecedence(expressionParts[i], stack.peek())");
                        stack.push(expressionParts[i]);
                    } else {
//                        System.out.println("\t\tDEBUG: utilities.checkPrecedence(expressionParts[i], stack.peek()) ELSE");
                        postfixString.append(stack.pop());
                        i--;
                        continue;
                    }
                } else {
//                    System.out.println("\tDEBUG: ELSE");
                    postfixString.append(stack.pop());
                    i--;
                    continue;
                }
            } else if (isOpeningBracket(expressionParts[i])) {
//                System.out.println("DEBUG: isOpeningBracket(expressionParts[i])");
                stack.push(expressionParts[i]);
            } else if (isClosingBracket(expressionParts[i])) {
//                System.out.println("DEBUG: isClosingBracket(expressionParts[i])");
                while (true) {
//                    System.out.println("\tDEBUG: while");
                    if (!stack.peek().equals("(")) {
                        try {
                            if (isOperator(stack.peek())) {
                                postfixString.append(stack.pop());
                            }
                        } catch (Exception ex) {
                            System.out.println("Expression error.\n\t - Could not match bracket");
                        }
                    } else {
                        stack.pop();
                        break;
                    }
                }
            }
        }

        while (!stack.isEmpty()) {
//            System.out.println("DEBUG: while #2");
            if (isOperator(stack.peek()))
                postfixString.append(stack.pop());
            else
                stack.pop();
        }
        return postfixString.toString();
    }

    public boolean isOperand(String str) {
        return operandsAndValue.getOperandValue().containsKey(str);
    }

    public boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("^");
    }

    public boolean isOpeningBracket(String str) {
        return str.equals("(") || str.equals("{") || str.equals("[");
    }

    public boolean isClosingBracket(String str) {
        return str.equals(")") || str.equals("}") || str.equals("]");
    }

    private String[] objectToStringArray(Object[] ar) {
        String temp[] = new String[ar.length];
        for (int i = 0; i < ar.length; i++) {
            temp[i] = (String) ar[i];
        }
        return temp;
    }

    private String[] createChunkFromExpression() {
        String temp[] = expression.split("");
        List<String> parts = new ArrayList<>();

        for (int i = 0; i < temp.length; i++) {
            if (!temp[i].equals(" "))
                parts.add(temp[i].trim());
        }
        return objectToStringArray(parts.toArray());
    }

    public OperandsAndValue getOperandsAndValue() {
        return operandsAndValue;
    }
}
