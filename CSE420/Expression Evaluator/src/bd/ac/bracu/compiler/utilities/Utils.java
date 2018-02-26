package bd.ac.bracu.compiler.utilities;

import java.util.HashMap;
import java.util.Map;

public class Utils {

    private static Map<String, Integer> precedence;

    public Utils() {
        precedence = new HashMap<>();
        loadPrecedence();
    }

    private void loadPrecedence() {
        precedence.put("+", 1);
        precedence.put("-", 1);
        precedence.put("*", 2);
        precedence.put("/", 3);
    }

    public static boolean checkPrecedence(String firstOperator, String secondOperator) {
        if (!precedence.containsKey(firstOperator) || !precedence.containsKey(secondOperator))
            return false;
        return precedence.get(firstOperator) > precedence.get(secondOperator);
    }
}
