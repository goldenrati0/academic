package bd.ac.bracu.cse420.validator.parser;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Domain {
    private Set<String> VALID_CHARACTERS;

    public Domain() {
        this.VALID_CHARACTERS = new HashSet<>();
        addValidCharacters();
    }

    private void addValidCharacters() {
        String lowerAlphabets = "abcdefghijklmnopqrstuvwxyz";
        String upperAlphabets = lowerAlphabets.toUpperCase();
        String numbers = "0123456789";
        String specialCharacters = ".-";

        Arrays.stream(lowerAlphabets.split("")).forEach(VALID_CHARACTERS::add);
        Arrays.stream(upperAlphabets.split("")).forEach(VALID_CHARACTERS::add);
        Arrays.stream(numbers.split("")).forEach(VALID_CHARACTERS::add);
        Arrays.stream(specialCharacters.split("")).forEach(VALID_CHARACTERS::add);
    }

    public boolean validateDomainPart(String domainPart) {
        int wordLength = domainPart.length();
        if (wordLength == 0) return false;

        boolean dotFound = false;

        // - or . diye domain name start howa jabe na
        if (
                domainPart.startsWith("-") ||
                        domainPart.startsWith(".") ||
                        domainPart.endsWith("-") ||
                        domainPart.endsWith(".")) {
            return false;
        }

        for (int i = 0; i < wordLength; i++) {
            String currentChar = String.valueOf(domainPart.charAt(i));
            if (!this.VALID_CHARACTERS.contains(currentChar))
                return false;

            if (currentChar.equals(".")) {
                // . er age - thaka jaabe na
                dotFound = true;
                if (domainPart.charAt(i - 1) == '-')
                    return false;
            }
        }
        return dotFound == true;
    }
}
