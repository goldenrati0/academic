package bd.ac.bracu.cse420;

import bd.ac.bracu.cse420.validator.EmailValidator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/tahmid/workspace/java/CSE420-Lab02/src/bd/ac/bracu/cse420/input.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));

        EmailValidator emailValidator = new EmailValidator();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (emailValidator.validateEmail(line)) {
                System.out.printf("%s is valid\n", line);
            } else {
                System.out.printf("%s is invalid\n", line);
            }
        }
    }
}
