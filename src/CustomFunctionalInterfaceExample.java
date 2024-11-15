@FunctionalInterface
interface Converter<T, R> {
    R convert(T input);
}

public class CustomFunctionalInterfaceExample {
    public static void main(String[] args) {
        Converter<String, Integer> stringToInteger = Integer::parseInt;

        // Use the converter
        Integer number = stringToInteger.convert("123");
        System.out.println(number); // Output: 123
    }
}
