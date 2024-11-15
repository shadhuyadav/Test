public class StringIntern {
    public static void main(String[] args) {
        // Creating strings using literals
        String str1 = "Hello";
        String str2 = "Hello"; // str2 refers to the same object as str1

        // Creating a string using the 'new' keyword
        String str3 = new String("Hello"); // str3 refers to a different object in memory

        // Interning str3
        String str4 = str3.intern(); // str4 now refers to the same object as str1 and str2

        // Checking reference equality
        System.out.println(str1 == str2); // true (same reference)
        System.out.println(str1 == str3); // false (different reference)
        System.out.println(str1 == str4); // true (same reference after interning)
    }
}
