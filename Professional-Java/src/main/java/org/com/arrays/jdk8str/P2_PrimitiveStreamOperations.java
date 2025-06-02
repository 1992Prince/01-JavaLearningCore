package org.com.arrays.jdk8str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P2_PrimitiveStreamOperations {

    public static void main(String[] args) {

        // Primitive array
        int[] numbers = {1, 2, 3, 4, 5};


        // Example 1: Map operation (Double each element)
        Arrays.stream(numbers)
                .map(num -> num * 2)
                .forEach(System.out::println); // Prints 2, 4, 6, 8, 10
        System.out.println();


        // Example 2: Filter operation (Filter even numbers)
        Arrays.stream(numbers)
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println); // Prints 2, 4
        System.out.println();


        // Example 3: Converting int[] to ArrayList<Integer> using Stream's boxed() method
        List<Integer> numberList = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(numberList); // Prints [1, 2, 3, 4, 5]


        // Example 4: Converting int[] to ArrayList<Integer> using old approach
        List<Integer> oldApproachList = new ArrayList<>();
        for (int num : numbers) {
            oldApproachList.add(num);
        }
        System.out.println(oldApproachList); // Prints [1, 2, 3, 4, 5]


        /**
         * 1. Perform map or filter on int[] and store the result in a new int[]
         */

        int[] array = {1, 2, 3, 4, 5};

        // Map: Double each element and collect into a new array
        int[] mappedArray = Arrays.stream(array)
                .map(num -> num * 2) // Map operation (doubling each element)
                .toArray();          // Collect to int[]
        System.out.println("Mapped Array: " + Arrays.toString(mappedArray));
        // Output: Mapped Array: [2, 4, 6, 8, 10]

        // Filter: Retain only even numbers and collect into a new array
        int[] filteredArray = Arrays.stream(array)
                .filter(num -> num % 2 == 0) // Filter operation (only even numbers)
                .toArray();                  // Collect to int[]
        System.out.println("Filtered Array: " + Arrays.toString(filteredArray));
        // Output: Filtered Array: [2, 4]


        /**
         * 2. Perform map or filter on int[] and store the result in a new ArrayList<Integer>
         *
         *     The boxed() method in Java's Streams API is used to convert a primitive stream (e.g., IntStream, LongStream, or DoubleStream)
         *     into a stream of wrapper objects (e.g., Stream<Integer>, Stream<Long>, or Stream<Double>)
         */

        // Map: Double each element and collect into a new ArrayList<Integer>
        List<Integer> mappedList = Arrays.stream(array)
                .map(num -> num * 2) // Map operation (doubling each element)
                .boxed()             // Convert to Stream<Integer>
                .collect(Collectors.toList()); // Collect to ArrayList<Integer>
        System.out.println("Mapped List: " + mappedList);
        // Output: Mapped List: [2, 4, 6, 8, 10]

        // Filter: Retain only even numbers and collect into a new ArrayList<Integer>
        List<Integer> filteredList = Arrays.stream(array)
                .filter(num -> num % 2 == 0) // Filter operation (only even numbers)
                .boxed()                     // Convert to Stream<Integer>
                .collect(Collectors.toList()); // Collect to ArrayList<Integer>
        System.out.println("Filtered List: " + filteredList);
        // Output: Filtered List: [2, 4]


        // Old Approach (without streams):
        List<Integer> oldMappedList = new ArrayList<>();
        for (int num : array) {
            oldMappedList.add(num * 2); // Double each element
        }
        System.out.println("Mapped List (Old Approach): " + oldMappedList);
        // Output: Mapped List (Old Approach): [2, 4, 6, 8, 10]
    }
}

