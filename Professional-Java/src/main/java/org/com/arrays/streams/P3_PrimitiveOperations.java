package org.com.arrays.streams;

import java.util.Arrays;

public class P3_PrimitiveOperations {

    public static void main(String[] args) {

        /**
         * 1. Sorting a Primitive Array
         */

        int[] numbers = {5, 1, 3, 2, 4};

        // Sort the array
        int[] sortedArray = Arrays.stream(numbers)
                .sorted()
                .toArray();

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray)); // Sorted Array: [1, 2, 3, 4, 5]
        System.out.println();

        /**
         * 2. Finding the Maximum Element
         */

        // Find the maximum value
        int max = Arrays.stream(numbers)
                .max()
                .orElseThrow(() -> new RuntimeException("Array is empty"));

        System.out.println("Max Element: " + max); // Max Element: 5
        System.out.println();

        /**
         * 3. Finding the Minimum Element
         */
        int min = Arrays.stream(numbers)
                .min()
                .orElseThrow(() -> new RuntimeException("Array is empty"));

        System.out.println("Min Element: " + min); // Min Element: 1
        System.out.println();
        
    }
}
