package org.com.arrays.jdk8str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P3_WrapperStreamOperations {

    public static void main(String[] args) {

        // Wrapper Array
        Integer[] numbers = {1, 2, 3, 4, 5};

        // Example 1: Filter and map operation (Filter odd numbers and square them)
        Arrays.stream(numbers)
                .filter(num -> num % 2 != 0)
                .map(num -> num * num)
                .forEach(System.out::println); // Prints 1, 9, 25
        System.out.println();

        // Example 2: Sorting and reducing
        int sum = Arrays.stream(numbers)
                .sorted()
                .reduce(0, Integer::sum); // Sum of sorted numbers
        System.out.println("Sum: " + sum); // Prints Sum: 15
        System.out.println();


        /**
         * Example 1 - Convert An ArrayList<Integer> to a int[] (primitive array)
         *
         * via stream()
         * mapToInt(Integer::intValue) efficiently converts wrapper types (Integer) to primitives (int).
         * .toArray() collects the processed stream elements into an array.
         */

        // Create an ArrayList of Integers
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);

        // Convert ArrayList<Integer> to int[] using Streams API
        int[] primitiveArray = numberList.stream()
                .mapToInt(Integer::intValue) // Converts Integer to int
                .toArray();                 // Collects into int[]
        System.out.println("Using Streams: " + Arrays.toString(primitiveArray));
        // Output: [1, 2, 3, 4, 5]

        System.out.println();

        // old approach
        // Convert ArrayList<Integer> to int[] using old approach
        int[] oldPrimitiveArray = new int[numberList.size()];
        for (int i = 0; i < numberList.size(); i++) {
            oldPrimitiveArray[i] = numberList.get(i); // Manually copying elements
        }
        System.out.println("Using Old Approach: " + Arrays.toString(oldPrimitiveArray));
        // Output: [1, 2, 3, 4, 5]


        /**
         * Example 2: Converting Integer[] to int[]
         */

        // Create an Integer array
        Integer[] wrapperArray = {1, 2, 3, 4, 5};

        // Convert Integer[] to int[] using Streams API
        int[] primitiveArray2 = Arrays.stream(wrapperArray)
                .mapToInt(Integer::intValue) // Converts Integer to int
                .toArray();                 // Collects into int[]
        System.out.println("Using Streams: " + Arrays.toString(primitiveArray2));
        // Output: [1, 2, 3, 4, 5]

        // Older approach
        // Convert Integer[] to int[] using old approach
        int[] oldPrimitiveArray2 = new int[wrapperArray.length];
        for (int i = 0; i < wrapperArray.length; i++) {
            oldPrimitiveArray2[i] = wrapperArray[i]; // Manually copying elements
        }
        System.out.println("Using Old Approach: " + Arrays.toString(oldPrimitiveArray2));
        // Output: [1, 2, 3, 4, 5]

    }
}
