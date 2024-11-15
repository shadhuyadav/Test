import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a1", "a2", "a3"),
                Arrays.asList("b1", "b2"),
                Arrays.asList("c1", "c2", "c3")
        );

        // Flatten list of lists into a single list using flatMap
        List<String> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList); // Output: [a1, a2, a3, b1, b2, c1, c2, c3]
    }
}
