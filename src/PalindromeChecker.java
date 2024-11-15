import java.util.stream.IntStream;

public class PalindromeChecker {

    public static boolean isPalindrome(String s) {
        // Normalize the string: remove non-alphanumeric characters and convert to lowercase
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare characters from the beginning and end moving towards the center
        return IntStream.range(0, cleaned.length() / 2)
                .allMatch(i -> cleaned.charAt(i) == cleaned.charAt(cleaned.length() - 1 - i));
    }

    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {"A man, a plan, a canal, Panama", "racecar", "hello", "No 'x' in Nixon"};

        for (String testString : testStrings) {
            System.out.println("\"" + testString + "\" is palindrome? " + isPalindrome(testString));
        }
    }
}
