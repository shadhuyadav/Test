import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapExample {

    public static void main(String[] args) {
        List<Integer> value=Arrays.asList(2,4,6,8,7,9);
        value.stream().filter(s->s%2!=0).forEach(System.out::println);

        // Example with map
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Using map to convert each word to its length
        List<Integer> lengths = words.stream()
                .map(String::length) // Apply the map function
                .collect(Collectors.toList());

        System.out.println("Lengths of words: " + lengths);

        // Example with flatMap
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("cherry", "date"),
                Arrays.asList("fig", "grape")
        );

        // Using flatMap to flatten the list of lists into a single list
        List<String> allWords = listOfLists.stream()
                .flatMap(List::stream) // Apply the flatMap function
                .collect(Collectors.toList());

        System.out.println("All words: " + allWords);
    }
}
