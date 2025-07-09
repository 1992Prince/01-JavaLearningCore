package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P1_StreamInitialization {

    public static void main(String[] args) {

        /**
         * Stream object creation
         */

        //1. Stream creation from Collection object
        List<String> list = List.of("One", "Two", "Three");
        Stream<String> listStreamObj = list.stream();

        //2. Stream creation from String arrays
        String[] names = {"One", "Two", "Three"};
        Stream<String> namesStrObj = Arrays.stream(names);

        // Stream creation from Integer arrays
        Integer[] nums = {1,2,3,4,5};
        Stream<Integer> numsStrObj = Arrays.stream(nums);

        // Stream creation from primitive int arrays
        int[] prim_nums = {1,2,3,4,5};
        IntStream primStrmObj = Arrays.stream(prim_nums);

        //3. Creating Stream using Stream method i.e. Stream.of()
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);

        //4. Creating empty stream using empty() way of String type
        Stream<String> stream3 = Stream.empty();


        //5. Creating Stream using generate method : Stream.generate() or Stream.iterate()
        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(100));

        randomNumbers.limit(20).forEach(System.out::println);
    }
}
