import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class findVowels {

    public static void main(String args[]){

        List<String> strings = Arrays.asList(
                "apple", "fig", "banana", "kiwi",
                "orange", "pear", "xxx", "yyyy",
                "ccc", "ttttt", "rrr"
        );

        Map<Integer, List<String>> groupedStrings = strings.stream()
                .filter(s -> !s.matches(".*[aeiou].*")) // Filter out strings with vowels
                .collect(Collectors.groupingBy(String::length)); // Group by length

        System.out.println(groupedStrings);
    }




}
