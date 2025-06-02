package com.easybytes.sec26streamsapi.tim.p1streamsintro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P2_StreamsSources {

    public static void main(String[] args) {

        /**
         * Sources of Streams
         * 1. Collections (List, Set, etc.)
         * The Collection interface has stream() and parallelStream() methods.
         * So, any class implementing Collection (like ArrayList, HashSet, etc.) can produce a stream directly.
         */

        List<String> names = List.of("Alice", "Bob");
        Stream<String> nameStream = names.stream();

        /**
         * Sources of Streams
         * 2. Arrays
         * Use Arrays.stream() or Stream.of() to convert arrays into streams.
         * Similar to collections, arrays also have helper methods to generate streams.
         */
        int[] numbers = {1, 2, 3};
        IntStream numStream = Arrays.stream(numbers);

        /**
         * Sources of Streams
         * 3. Stream.of() method
         * Allows you to create a stream from a group of values or objects directly.
         */
        Stream<String> langStream = Stream.of("Java", "Python", "Go");

        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");

        String[] strings = {"One", "Two", "Three"};
        // to generate stream of elements from array we can use java.util.Arrays.stream() method
        Stream<String> stream = Arrays.stream(strings);
        stream.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        /**
         * ----------------------------------------------------
         * Two
         * Three
         * One
         */


        System.out.println();
        System.out.println("----------------------------------------------------");
        // creating stream of elements using of method
        Stream.of("alpha", "beta", "gamma")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        /**
         * ----------------------------------------------------
         * ALPHA
         * BETA
         * GAMMA
         */

        System.out.println();
        System.out.println("----------------------------------------------------");

        /**
         * Map interface doesn't have a stream method, but you can use any of Map's collection views,
         * keySet, entrySet or values to generate a Stream to process parts of map.
         * entrySet()
         * keySet()
         * values()
         */

        Map<String, Integer> scores = Map.of(
                "Alice", 90,
                "Bob", 85,
                "Charlie", 95
        );


        System.out.println("-----------------Using entry-set-----------------------");
        scores.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

        /**
         * -----------------Using entry-set-----------------------
         * Charlie - 95
         * Alice - 90
         * Bob - 85
         */


        System.out.println();
        System.out.println("-----------------Using key-set-----------------------");
        scores.keySet()
                .stream()
                        .forEach(System.out::println);

        /**
         * -----------------Using key-set-----------------------
         * Charlie
         * Alice
         * Bob
         */
        System.out.println();
        System.out.println("-----------------Using values-----------------------");
        scores.values()
                .stream()
                .forEach(System.out::println);

        /**
         * -----------------Using values-----------------------
         * 95
         * 90
         * 85
         */





    }
}
