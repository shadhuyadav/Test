import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

class Permutations {

    public static List<List<String>> generatePermutations(List<String> list) {
        List<List<String>> result = new ArrayList<>();
        if (list.isEmpty()) {
            result.add(new ArrayList<>());
            return result;
        }
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            List<String> remaining = new ArrayList<>(list);
            remaining.remove(i);
            for (List<String> perm : generatePermutations(remaining)) {
                List<String> newPerm = new ArrayList<>();
                newPerm.add(item);
                newPerm.addAll(perm);
                result.add(newPerm);
            }
        }
        return result;
    }
}

public class PermutationExample {



    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        // Generate permutations
        List<List<String>> permutations = Permutations.generatePermutations(list);

        // Print permutations
        permutations.forEach(perm ->
                System.out.println(perm.stream().collect(Collectors.joining(", ")))
        );
    }
}
