import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum of all numbers using reduce
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);

        Integer sum1 = numbers.stream().reduce(0, Integer::sum);



        sum.ifPresent(System.out::println); // Output: 15

        // Using reduce with an identity value
        int sumWithIdentity = numbers.stream()
                .reduce(10, (a, b) -> a + b);

        System.out.println(sumWithIdentity); // Output: 15
    }
}
