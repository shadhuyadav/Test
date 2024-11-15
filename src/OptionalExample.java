import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.ofNullable(null);

        // Provide a default value if the Optional is empty
        String result = optionalString.orElse("Default Value");
        System.out.println(result); // Output: Default Value

        // Execute a consumer if the Optional contains a value
        optionalString.ifPresent(System.out::println); // No output
    }
}
