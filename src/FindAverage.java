import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverage {
    public static void main(String[] args) {
        // Step 1: Create a list of numbers
        List<Integer> numbers = Arrays.asList(10, 10, 10);

        // Step 2: Process the list using Java Streams
        OptionalDouble average = numbers.stream().map(s->s*s).filter(s->s>=100).mapToDouble(s->s).average();

        

        // Step 3: Print the average
        if (average.isPresent()) {
            System.out.println("Average of numbers greater than 100: " + average.getAsDouble());
        } else {
            System.out.println("No numbers greater than 100.");
        }
    }
}
