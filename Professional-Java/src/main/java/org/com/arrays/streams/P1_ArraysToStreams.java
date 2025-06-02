package org.com.arrays.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class P1_ArraysToStreams {

    /**
     * Java provides the Arrays.stream() method and the Stream.of() method to create a stream from an array.
     * Stream<T> stream = Arrays.stream(array);
     * Stream<T> stream = Stream.of(array);
     */

    public static void main(String[] args) {

        /**
         * 1. Converting an Integer Array to a Stream
         */
        Integer[] numbers = {1, 2, 3, 4, 5};
        Stream<Integer> numberStream = Arrays.stream(numbers); //  Convert array to stream
        numberStream.forEach(System.out::println);             // 1 2 3 4 5 will be printed in diff lines
        // if we don't have streams then we need to use for loop to print each element
        System.out.println();

        /**
         * 2. Filtering Elements in an Array and print them
         */
        String[] names = {"Alice", "Bob", "Charlie", "Anna", "Amanda"};

        // Filter names starting with 'A'
        Arrays.stream(names)
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
        System.out.println();

        /**
         * ====Output====
         * Alice
         * Anna
         * Amanda
         */

        /**
         * 3 . Double each element in the array and print
         */
        int[] numbers2 = {1, 2, 3, 4, 5};

        Arrays.stream(numbers2)
                .map(num -> num * 2)
                .forEach(System.out::println);
        System.out.println();
        /**
         * 2
         * 4
         * 6
         * 8
         * 10
         */

        /**
         * 4. Sorting an Array Using Streams
         */
        String[] fruits = {"Banana", "Apple", "Cherry", "Blueberry"};

        // Sort the array
        Arrays.stream(fruits)
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        /**
         * ====Output====
         * Apple
         * Banana
         * Blueberry
         * Cherry
         */

        /**
         * 5. Reducing an Array to a Single Value
         */

        int[] numbers3 = {1, 2, 3, 4, 5};

        // Find the sum of elements
        int sum = Arrays.stream(numbers3)
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum); // Sum: 15
        System.out.println();

        /**
         * 6. Converting a Stream Back to an Array
         */
        String[] names2 = {"John", "Doe", "Jane", "Smith"};

        // Convert array to stream and back to array
        String[] upperCaseNames = Arrays.stream(names2)
                .map(String::toUpperCase)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(upperCaseNames)); // [JOHN, DOE, JANE, SMITH]
        System.out.println();

    }
}
