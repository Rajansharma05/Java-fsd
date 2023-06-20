package AssistedPractice;

import java.util.regex.*;

public class RegularExpression {

    public static void main(String[] args) {
        String text = "Hello, World! This is a test string.";

        // Verify if the text contains the word "World"
        boolean containsWorld = Pattern.compile("World").matcher(text).find();
        System.out.println("Contains 'World': " + containsWorld);

        // Verify if the text starts with "Hello"
        boolean startsWithHello = Pattern.matches("^Hello.*", text);
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // Verify if the text ends with "string."
        boolean endsWithString = text.matches(".*string\\.$");
        System.out.println("Ends with 'string.': " + endsWithString);

        // Verify if the text matches the pattern "a.*s"
        boolean matchesPattern = Pattern.matches("a.*s", text);
        System.out.println("Matches pattern 'a.*s': " + matchesPattern);
    }
}
