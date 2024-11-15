import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 6, 8, 10);

        // Filter numbers greater than 5 and map to their square roots
        List<Double> squareRoots = numbers.stream()
                .filter(n -> n > 5)
                .map(Math::sqrt)
                .collect(Collectors.toList());

        System.out.println(squareRoots); // Output: [2.449489742783178, 2.8284271247461903, 3.1622776601683795]
    }
}
