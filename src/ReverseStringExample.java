public class ReverseStringExample {
    public static void main(String[] args) {
        String original = "Hello, World!";

        // Using recursion
        String reversed = reverse(original);

        System.out.println(reversed);
    }

    private static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
