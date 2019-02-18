package bd.ac.bracu.cse420.validator.parser;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Local {

    private Set<String> VALID_CHARACTERS;
    private Set<String> SPECIAL_CHARACTERS;

    public Local() {
        this.VALID_CHARACTERS = new HashSet<>();
        this.SPECIAL_CHARACTERS = new HashSet<>();
        addValidCharacters();
    }

    private void addValidCharacters() {
        String lowerAlphabets = "abcdefghijklmnopqrstuvwxyz";
        String upperAlphabets = lowerAlphabets.toUpperCase();
        String numbers = "0123456789";
        String specialCharacters = ".-_\"";
        String specialCharacters2 = "\"(),:;<>@[\\]";

        Arrays.stream(lowerAlphabets.split("")).forEach(VALID_CHARACTERS::add);
        Arrays.stream(upperAlphabets.split("")).forEach(VALID_CHARACTERS::add);
        Arrays.stream(numbers.split("")).forEach(VALID_CHARACTERS::add);
        Arrays.stream(specialCharacters.split("")).forEach(VALID_CHARACTERS::add);

        Arrays.stream(specialCharacters2.split("")).forEach(SPECIAL_CHARACTERS::add);
    }

    public boolean validateLocalPart(String localPart) {
        boolean prevCharDot = false;
        boolean doubleQuoteStart = false;
        boolean doubleQuoteEnd = false;
        int wordLength = localPart.length();

        // " diye start hole, " diyei sesh hote hobe. Eita confirm korar jonno ei bebostha
        if (localPart.startsWith("\"")) doubleQuoteStart = true;
        if (localPart.endsWith("\"")) doubleQuoteEnd = true;
        if (doubleQuoteStart != doubleQuoteEnd)
            return false;

        // .[DOT] diye start howa jabe na
        if (localPart.startsWith("."))
            return false;

        for (int i = 0; i < wordLength; i++) {
            String currentCharacter = String.valueOf(localPart.charAt(i));

            if (!VALID_CHARACTERS.contains(currentCharacter))
                return false;

            if (SPECIAL_CHARACTERS.contains(currentCharacter)) {
                if (!doubleQuoteStart)
                    return false;
            }

            if (currentCharacter.equals(".")) {
                if (i == wordLength - 1) {
                    // last character .[DOT] hote paarbe na
                    return false;
                }
                if (prevCharDot) {
                    // por por duita .[DOT] thakle, must start with "
                    if (!doubleQuoteStart) {
                        return false;
                    }
                }
                prevCharDot = true;
            } else {
                prevCharDot = false;
            }
        }
        return true;
    }
}
