import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrencesExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        // Count occurrences
     Map<String, Long> oc=words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     oc.forEach((a,b)->System.out.println(a+":"+b));




    }
}
