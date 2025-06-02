package org.com.arrays.jdk8str;

import java.util.Arrays;

public class P6_PrimitiveArraysIteration {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Traditional Approach: Using for loop
        System.out.println("Traditional For Loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Traditional Approach: Using for-each loop
        System.out.println("Traditional For-Each Loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Streams-Based Approach
        System.out.println("Streams-Based Approach:");
        Arrays.stream(numbers) // Create IntStream
                .forEach(System.out::println); // Process each element


        // Accessing Arrays in reverse order
        int[] array = {0, 1, 1, 2, 3, 5, 8, 13};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println("Arrays to String");
        System.out.println();

        /**
         * you can get a String representation of the contents of the specified array without iterating over its
         * every element.
         * Just use Arrays.toString(Object[]) or Arrays.deepToString(Object[]) for multidimentional arrays:
         */
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));      // [1, 2, 3, 4, 5]

        System.out.println();


        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(arr2));  // [[1, 2, 3], [4, 5, 6], [7, 8, 9]
    }
}
