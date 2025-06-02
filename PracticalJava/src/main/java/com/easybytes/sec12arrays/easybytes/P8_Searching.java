package com.easybytes.sec12arrays.easybytes;

import java.util.Arrays;

public class P8_Searching {

    public static void main(String[] args) {

        /**
         * 🔍 Arrays.binarySearch() — For Searching
         * This method searches sorted arrays only and returns the index of the element if found, otherwise returns a negative value.
         *
         * syntax => int index = Arrays.binarySearch(array, key);
         */

        int[] nums = {1, 3, 5, 7, 9};

        int index = Arrays.binarySearch(nums, 5); // Must be sorted
        System.out.println(index); // Output: 2

        // 🔸 If Element Not Found:
        int index2 = Arrays.binarySearch(nums, 4);

        System.out.println(index2); // Output: -3


        // 🔹 Binary Search for Object Arrays
        String[] names = {"Alice", "Bob", "Charlie"};
        Arrays.sort(names); // Must sort before searching

        int index3 = Arrays.binarySearch(names, "Charlie");
        System.out.println(index3); // Output: 2

        /**
         * ⚠️ Must Know:
         * Array must be sorted in the same order as the search — otherwise, result is undefined.
         *
         * Works for primitive and object arrays.
         */

    }
}
