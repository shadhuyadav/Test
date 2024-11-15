import java.util.Spliterator;
import java.util.StringTokenizer;

public class Test {

    public static void main(String args[]){
        String sentence = "A man a plana canal Panama"; // Example sentence
        if (isPalindrome(sentence)) {
            System.out.println("\"" + sentence + "\" is a palindrome.");
        } else {
            System.out.println("\"" + sentence + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String sentence) {
        // Normalize the sentence
     // String cleaned = sentence.toLowerCase().replaceAll("[^a-z0-9]", "");
        String cleaned = sentence.toLowerCase().trim();
        System.out.println(cleaned);

        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);

       /*
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;*/
    }
}

