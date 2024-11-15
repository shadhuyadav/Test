package IMPORTANT;

import java.util.Arrays;

public class MergeTwoSortedArray {

    // Function to merge two sorted arrays into a single sorted array
    public static int[] merge(int[] arr1, int[] arr2) {
        // Create a result array of size m + n (length of both arrays)
        int m = arr1.length;
        int n = arr2.length;
        int[] result = new int[m + n];

        // Initialize pointers for both arrays and the result array
        int i = 0, j = 0, k = 0;

        // Merge the two arrays until one of them is exhausted
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];  // Take element from arr1
            } else {
                result[k++] = arr2[j++];  // Take element from arr2
            }
        }

        // If there are any remaining elements in arr1, add them to result
        while (i < m) {
            result[k++] = arr1[i++];
        }

        // If there are any remaining elements in arr2, add them to result
        while (j < n) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        // Example input arrays
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        // Merging the two sorted arrays
        int[] mergedArray = merge(arr1, arr2);

        // Printing the merged sorted array
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }
    /*
    Explanation:
Input Arrays:
We have two sorted arrays arr1 and arr2.
arr1 = {1, 3, 5, 7} and arr2 = {2, 4, 6, 8} in the example.
Merge Process:
We initialize three pointers:
i for arr1 (starting at the first element).
j for arr2 (starting at the first element).
k for the result array.
We compare the elements of arr1[i] and arr2[j]. The smaller one is added to the result array, and the corresponding pointer (i or j) is incremented.
Appending Remaining Elements:
Once one array is fully traversed, the remaining elements from the other array (which is already sorted) are directly copied into the result array.
Final Output:
The merged array is stored in result and is printed using Arrays.toString() for easy viewing.
     */
}
