import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacterFinder {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";

        // Normalize the sentence by removing spaces and converting to lowercase
        sentence = sentence.replaceAll("\\s+", "").toLowerCase();

        // Find the first non-repeated character
        Optional<Character> nonRepeatedChar = sentence.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        // Print the result
        if (nonRepeatedChar.isPresent()) {
            System.out.println("The first non-repeated character is: " + nonRepeatedChar.get());
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}