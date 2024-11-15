import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenListExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        // Flatten the list of lists
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList); // Output: [1, 2, 3, 4, 5, 6, 7, 8]
    }
}
