import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountMap {
    public static void main(String[] args) {
        String input = "Count the occurrences of each word and count the occurrences of words";

        Map<String, Long> wordCountMap = Arrays.stream(input.split("\\s+")) // Split by whitespace
                .filter(word -> !word.isEmpty()) // Filter out empty words
                .map(String::toLowerCase) // Convert to lowercase to count words case-insensitively
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Collect into a map

        System.out.println("Word Count Map: " + wordCountMap);
    }
}
