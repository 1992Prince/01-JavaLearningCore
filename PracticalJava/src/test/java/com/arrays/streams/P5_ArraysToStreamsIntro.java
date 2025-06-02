package com.arrays.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class P5_ArraysToStreamsIntro {

    /**
     * Java provides the Arrays.stream() method and the Stream.of() method to create a stream from an array.
     * Stream<T> stream = Arrays.stream(array);
     * Stream<T> stream = Stream.of(array);
     */

    public static void main(String[] args) {

        // 1. Converting an Integer Array to a Stream
        Integer[] numbers = {1, 2, 3, 4, 5};
        Stream<Integer> numberStream = Arrays.stream(numbers); // Convert array to stream
        numberStream.forEach(System.out::println); // Print each element
        System.out.println();
    }
}
