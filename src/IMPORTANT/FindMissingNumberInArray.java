package IMPORTANT;

public class FindMissingNumberInArray {

    //Given an array of size n, containing numbers from 1 to n+1, find the missing number.
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println(findMissingNumber(arr)); // Output: 3
    }
}
