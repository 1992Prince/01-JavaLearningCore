package org.arrays;

import java.util.Arrays;

public class P4_ArrayFillAndSearch {

    /**
     * =====================================================================================================
     * 🎯 Searching in Arrays using Arrays.binarySearch()
     * <p>
     * 🔹 Method: Arrays.binarySearch(array, key)
     * 🔹 Returns: Index of the key if found, otherwise returns (-(insertion_point) - 1)
     * 🔹 Prerequisite: The array must be sorted in ascending order.
     * 🔹 Works for both primitive arrays and Object arrays.
     * <p>
     * Example:
     */

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};
        int index = Arrays.binarySearch(nums, 30);  // ✅ Output: 2
        int notFound = Arrays.binarySearch(nums, 25); // ❌ Output: -3 (insertion point is 2)


/*
🧠 Interview Tip:
- binarySearch uses **divide and conquer** with time complexity: O(log n)
- Always sort the array before applying binarySearch, else result is undefined.
=====================================================================================================
*/

        /*
=====================================================================================================
🎯 Filling Arrays using Arrays.fill() and Arrays.setAll() – Java 8+

🔹 1. Arrays.fill(array, value)
   → Fills entire array with specified value

🔹 2. Arrays.fill(array, fromIndex, toIndex, value)
   → Fills partial range with value

🔹 3. Arrays.setAll(array, lambda)
   → Allows filling array using index-based logic (Java 8+)

Examples:
*/

        int[] arr1 = new int[5];
        Arrays.fill(arr1, 1);  // [1, 1, 1, 1, 1]

        int[] arr2 = new int[5];
        Arrays.fill(arr2, 1, 4, 99);  // [0, 99, 99, 99, 0]

        // Using setAll to initialize elements based on index
        int[] arr3 = new int[5];
        Arrays.setAll(arr3, i -> i * i);  // [0, 1, 4, 9, 16]


        /*
🧠 Interview Tip:
- fill() is simple and used for static values.
- setAll() is powerful when you want to initialize based on logic (like i*i, Fibonacci, etc.)
=====================================================================================================
*/
    }
}
