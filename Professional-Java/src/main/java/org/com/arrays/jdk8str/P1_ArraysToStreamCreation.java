package org.com.arrays.jdk8str;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Java provides the Arrays.stream() method and the Stream.of() method to create a stream from an array.
 * Stream<T> stream = Arrays.stream(array);
 * Stream<T> stream = Stream.of(array);
 */

public class P1_ArraysToStreamCreation {

    public static void main(String[] args) {

        // Using Arrays.stream() for Wrapper Types
        System.out.println("=== Arrays.stream() for Wrapper Types ===");
        Integer[] wrapperArray = {1, 2, 3, 4, 5};
        Stream<Integer> wrapperStream = Arrays.stream(wrapperArray); // Returns Stream<Integer>
        wrapperStream.forEach(System.out::println); // Output: 1 2 3 4 5 (one per line)
        System.out.println();

        // Using Arrays.stream() for Primitive Types
        System.out.println("=== Arrays.stream() for Primitive Types ===");
        int[] primitiveArray = {1, 2, 3, 4, 5};
        IntStream primitiveStream = Arrays.stream(primitiveArray); // Returns IntStream
        primitiveStream.forEach(System.out::println); // Output: 1 2 3 4 5 (one per line)
        System.out.println();


        // Difference:
        // 1. For primitive types (int[], long[], double[]), Arrays.stream() returns specialized streams:
        //    - int[] -> IntStream
        //    - long[] -> LongStream
        //    - double[] -> DoubleStream
        // 2. For wrapper types (Integer[], Long[], Double[], etc.), Arrays.stream() returns a generic Stream<T>.


        // Using Stream.of() for Wrapper Types
        System.out.println("=== Stream.of() for Wrapper Types ===");
        Stream<Integer> wrapperStreamOf = Stream.of(wrapperArray); // Returns Stream<Integer>
        wrapperStreamOf.forEach(System.out::println); // Output: 1 2 3 4 5 (one per line)
        System.out.println();

        // Using Stream.of() for Primitive Types
        System.out.println("=== Stream.of() for Primitive Types ===");
        Stream<int[]> primitiveStreamOf = Stream.of(primitiveArray); // Returns Stream<int[]> (single element)
        primitiveStreamOf.forEach(array -> System.out.println(Arrays.toString(array))); // Output: [1, 2, 3, 4, 5]
        System.out.println();



        // Difference:
        // 1. `Stream.of()` treats a primitive array as a single element and creates a Stream<int[]>.
        // 2. For wrapper arrays, `Stream.of()` creates a Stream<T> with individual elements as stream elements.
        // 3. Example:
        //    - Stream.of(1, 2, 3) -> Creates Stream with 1, 2, 3 as separate elements.
        //    - Stream.of(primitiveArray) -> Creates Stream with primitiveArray as a single element.
        //    - Stream.of(wrapperArray) -> Creates Stream with wrapperArray's elements (1, 2, 3, ...) as separate elements.



        // Using Stream.of() with individual wrapper elements
        System.out.println("=== Stream.of() with Individual Wrapper Elements ===");
        Stream<Integer> individualWrapperStream = Stream.of(1, 2, 3);
        individualWrapperStream.forEach(System.out::println); // Output: 1 2 3 (one per line)
        System.out.println();
    }
}