package IMPORTANT;

import java.util.*;

public class Combinations {

    // Function to generate combinations of size 'k' from the array
    public static void combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();

        // Start backtracking from the first number
        backtrack(n, k, 1, currentCombination, result);

        // Print all combinations
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    // Helper function to perform backtracking
    private static void backtrack(int n, int k, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        // If the current combination has size 'k', add it to the result
        if (currentCombination.size() == k) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        // Try adding elements starting from 'start' to n
        for (int i = start; i <= n; i++) {
            currentCombination.add(i);  // Add current number to combination
            backtrack(n, k, i + 1, currentCombination, result);  // Recurse for the next number
            currentCombination.remove(currentCombination.size() - 1);  // Backtrack
        }
    }

    public static void main(String[] args) {
        int n = 4, k = 2;
        System.out.println("Combinations of " + n + " taken " + k + " at a time are:");
        combine(n, k);
    }
    /*
    Explanation:
combine(n, k): This is the main function that sets up the initial parameters and starts the backtracking process.

n: The total number of elements (from 1 to n).
k: The size of each combination.
result: A list of lists where each inner list represents a combination.
backtrack(n, k, start, currentCombination, result): This is the recursive backtracking function.

We start from the start number and try adding each number to the current combination.
If the current combination reaches the desired size k, we add it to the result.
After each recursive call, we backtrack by removing the last element from the combination.
Base Case: When the currentCombination reaches the desired size k, we add it to the result list.

Recursive Step: For each number from start to n, we add the number to currentCombination, recurse to generate further combinations, and then backtrack by removing the last added number.
     */
}
