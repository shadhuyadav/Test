package IMPORTANT;

import java.util.*;

public class FindUnionAndIntersectionOfTwoArray {
    public static Set<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> union = new HashSet<>();
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }
        return union;
    }

    public static Set<Integer> findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> intersection = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        System.out.println("Union: " + findUnion(arr1, arr2)); // Output: [1, 2, 3, 4, 5, 6]
        System.out.println("Intersection: " + findIntersection(arr1, arr2)); // Output: [3, 4]
    }
}
