package IMPORTANT;

import java.util.*;

import java.util.*;

public class Permutations {

    // Function to print all permutations of a given string
    public static void permute(String str) {
        char[] arr = str.toCharArray();  // Convert string to a char array
        List<String> result = new ArrayList<>();
        permuteHelper(arr, 0, result);

        // Print the results
        for (String s : result) {
            System.out.println(s);
        }
    }

    // Helper function for backtracking
    private static void permuteHelper(char[] arr, int index, List<String> result) {
        // Base case: if we have reached the end of the string, add it to the result
        if (index == arr.length) {
            result.add(new String(arr));
            return;
        }

        // Recursively generate permutations by swapping each character in the string
        for (int i = index; i < arr.length; i++) {
            // Swap the current index with the index 'i'
            swap(arr, index, i);
            // Recurse to permute the remaining characters
            permuteHelper(arr, index + 1, result);
            // Backtrack: undo the swap
            swap(arr, index, i);
        }
    }

    // Utility function to swap two characters in the array
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("All Permutations of " + str + " are:");
        permute(str);
    }

    /*
    Explanation:
Base Case: The base case occurs when the index equals the length of the string (index == arr.length). At this point, we have created a valid permutation of the string, so we add it to the result list.

Recursive Case:

We iterate through each index starting from the given index.
We swap the character at index with the character at each subsequent position.
After the swap, we recursively call the function for the next index (index + 1), generating all permutations of the remaining characters.
After the recursive call, we backtrack by swapping the characters back to their original positions. This ensures that we don't permanently modify the string for other recursive calls.
Swap Function: The swap function simply swaps two characters in the character array.
     */
}
