import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Parser {

    private static final String INTEGER_TYPE_REGEX = "^int[ ][\\w[,]+[ ]]+[;]$";
    private static final String DOUBLE_TYPE_REGEX = "^double[ ][\\w+,[ ]]*;$";
    private static final String FLOAT_TYPE_REGEX = "^float[ ][\\w+,[ ]]*;$";
    private static final String CHAR_TYPE_REGEX = "^char[ ][\\w+,[ ]]*;$";
    private static final String STRING_TYPE_REGEX = "^String[ ][\\w+,[ ]]*;$";
    private static final String NUMERICAL_VALUES_REGEX = "((\\d*[\\.]?\\d*));";

    private static final String FILENAME = "D:\\github\\academic\\CSE420\\StupidParser\\src\\input.txt";

    private static Set<String> MATH_OPERATORS;
    private static Set<String> KEYWORDS;
    private static Set<String> LOGICAL_OPERATOR;

    private static List<String> identifiers;
    private static List<String> mathOperators;
    private static List<String> logicalOperators;
    private static List<String> keywords;
    private static List<String> numericalValues;
    private static List<String> others;

    public static void main(String[] args) {

        MATH_OPERATORS = new HashSet<>();
        KEYWORDS = new HashSet<>();
        LOGICAL_OPERATOR = new HashSet<>();

        loadKeywordsAndOthers();

        identifiers = new ArrayList<>();
        mathOperators = new ArrayList<>();
        logicalOperators = new ArrayList<>();
        keywords = new ArrayList<>();
        numericalValues = new ArrayList<>();
        others = new ArrayList<>();


        try {

            BufferedReader br = new BufferedReader(new FileReader(FILENAME));
            String eachLine;

            while ((eachLine = br.readLine()) != null) {
                try {
                    parseIdentifiers(eachLine);
                    parseKeywords(eachLine);
                    parseMathOperators(eachLine);
                    parseLogicalOperator(eachLine);
                    parseNumericalValues(eachLine);
                } catch (Exception ex) {
                    System.err.println("Parsing error\nMessage: " + ex.getMessage());
                    System.exit(0);
                }
            }
        } catch (Exception ex) {
            System.err.println("Error\nMessage: " + ex.getMessage());
            System.exit(0);
        }

        System.out.println("Identifiers: " + listToString(identifiers));
        System.out.println("Keywords: " + listToString(keywords));
        System.out.println("Mathematical Operators: " + listToString(mathOperators));
        System.out.println("Logical Operators: " + listToString(logicalOperators));
        System.out.println("Numerical Values: " + listToString(numericalValues));
    }


    private static void loadKeywordsAndOthers() {
        MATH_OPERATORS.add("+");
        MATH_OPERATORS.add("-");
        MATH_OPERATORS.add("*");
        MATH_OPERATORS.add("/");
        MATH_OPERATORS.add("=");
        MATH_OPERATORS.add("^");

        LOGICAL_OPERATOR.add(">");
        LOGICAL_OPERATOR.add("<");
        LOGICAL_OPERATOR.add(">=");
        LOGICAL_OPERATOR.add("<=");
        LOGICAL_OPERATOR.add("==");
        LOGICAL_OPERATOR.add("!=");

        KEYWORDS.add("byte");
        KEYWORDS.add("short");
        KEYWORDS.add("int");
        KEYWORDS.add("float");
        KEYWORDS.add("double");
        KEYWORDS.add("long");
        KEYWORDS.add("char");
        KEYWORDS.add("boolean");
        KEYWORDS.add("String");
        KEYWORDS.add("if");
        KEYWORDS.add("else");
        KEYWORDS.add("else if");
    }


    private static String listToString(List list) {
        StringBuffer stringBuffer = new StringBuffer("[ ");
        for (int i = 0; i < list.size() - 1; i++) {
            stringBuffer.append(list.get(i) + ", ");
        }
        return stringBuffer.append(list.get(list.size() - 1)).append(" ]").toString();
    }

    private static void parseIdentifiers(String cmd) throws Exception {
        if (Pattern.matches(INTEGER_TYPE_REGEX, cmd) || Pattern.matches(DOUBLE_TYPE_REGEX, cmd)
                || Pattern.matches(FLOAT_TYPE_REGEX, cmd) || Pattern.matches(CHAR_TYPE_REGEX, cmd)
                || Pattern.matches(STRING_TYPE_REGEX, cmd)) {

            for (String id : removeAndReplace(cmd)) {
                identifiers.add(id);
            }
        }
    }


    private static void parseNumericalValues(String cmd) throws Exception {

        String s[] = cmd.split(" "); // a = 36.65;
        for (String str : s) {
            if (Pattern.matches(NUMERICAL_VALUES_REGEX, str)) {
                numericalValues.add(str.replaceAll(";", ""));
            }
        }
    }


    private static void parseMathOperators(String cmd) throws Exception {
        for (String op : MATH_OPERATORS) {
            if (cmd.contains(op)) {
                if (!mathOperators.contains(op)) {
                    mathOperators.add(op);
                }
            }
        }
    }


    private static void parseKeywords(String cmd) throws Exception {
        for (String op : KEYWORDS) {
            if (cmd.contains(op)) {
                if (!keywords.contains(op)) {
                    keywords.add(op);
                }
            }
        }
    }


    private static void parseLogicalOperator(String cmd) throws Exception {
        for (String op : LOGICAL_OPERATOR) {
            if (cmd.contains(op)) {
                if (!logicalOperators.contains(op)) {
                    logicalOperators.add(op);
                }
            }
        }
    }


    private static String[] removeAndReplace(String str) {
        return str.replaceAll("int ", "").replaceAll("float ", "").replaceAll("double ", "").replaceAll("char ", "")
                .replaceAll("String ", "").replaceAll(";", "").replaceAll(" ", "").split(",");
    }
}