package com.easybytes.sec26streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class P10_SkipIntermediateOperation {

    /*
    Streams skip operation -
    Streams support skip(n) method to return a stream that discards first n elements.

    If stream has fewer than n elements, an empty stream is returned.


     */

    public static void main(String[] args) {

        /*
        output from ths method will be numbers from 6,7,8,9,10

        Firstly we are creating infinte stream with initial seed value from 1
        Then we are skipping first 5 numbers by using skip(5)
        then we are accepting inputs only next 5 numbers by using limit(5)
         */
        Stream.iterate(1, n -> n+1)
                .skip(5)
                .limit(5)
                .forEach(System.out::print); // 678910

        System.out.println();

        // skip first 2 elements and multiply remaining elements with 10
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.stream()
                .skip(2)
                .map(n -> n * 10)
                .forEach(System.out::print); // 300400500
    }
}
