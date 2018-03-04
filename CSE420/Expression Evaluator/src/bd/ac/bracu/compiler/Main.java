package bd.ac.bracu.compiler;

import bd.ac.bracu.compiler.evaluator.Evaluator;
import bd.ac.bracu.compiler.evaluator.OperandValueException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws OperandValueException, FileNotFoundException {
        Scanner ana = new Scanner(new File("input.txt"));

        int n = ana.nextInt();
        ana.nextLine();

        List<String> keys = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String temp = ana.nextLine();
            String tempAr[] = temp.split("=");
            keys.add(tempAr[0].trim());
            values.add(Integer.parseInt(tempAr[1].trim()));
        }

        n = ana.nextInt();
        ana.nextLine();

        List<String> expressions = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            expressions.add(ana.nextLine());
        }

        for (String ex : expressions) {
            Evaluator ev = new Evaluator(keys, values, ex);
            System.out.println("Postfix for " + ex + " -> " + ev.getPostfixExpression());
            ev.evaluateExpression();
        }
    }
}
