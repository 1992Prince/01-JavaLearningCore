package org.com.arrays.jdk8str;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class P9_DecreasingOrderSortArrays {

    /**
     * 1. Sorting int[] in Decreasing Order
     * For primitive arrays, Arrays.sort() only supports natural order.
     * To achieve decreasing order:
     *
     *  Convert the int[] to Integer[] (wrapper type) for custom sorting.
     *  Use a custom comparator (Comparator.reverseOrder()).
     */

    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1, 3};
        // Using Streams API
        int[] sortedArray = Arrays.stream(numbers) // Create IntStream
                .boxed() // Convert to Stream<Integer>
                .sorted(Comparator.reverseOrder()) // Sort in reverse order
                .mapToInt(Integer::intValue) // Convert back to int[]
                .toArray();
        System.out.println("Sorted int[] (Using Streams): " + Arrays.toString(sortedArray));
        // Output: [8, 5, 3, 2, 1]
        System.out.println();



        // Using traditional approach
        // Step 1: Convert int[] to Integer[]
        Integer[] wrapperArray = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            wrapperArray[i] = numbers[i];
        }

        // Step 2: Sort Integer[] in decreasing order using Arrays.sort() and Comparator.reverseOrder()
        Arrays.sort(wrapperArray, Collections.reverseOrder());

        // Step 3: Convert Integer[] back to int[] if needed
        for (int i = 0; i < wrapperArray.length; i++) {
            numbers[i] = wrapperArray[i];
        }

        // Print the sorted array
        System.out.println("Sorted Array in Decreasing Order: " + Arrays.toString(numbers));
    }
}
