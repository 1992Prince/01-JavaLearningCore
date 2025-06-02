package com.easybytes.sec26streamsapi;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P8_LimitIntermediateOperation {

    /*
    Streams limit operation
    If we have a scenario where we need to limit number of elements inside a stream,
    we can use limit(n) method inside streams.

   The limit method takes a number which indicates size of elements we want to limit,
   but this limit number should not be greater than size of elements inside stream.

   Stream class generate method accepts Supplier functional interface.
   Supplier functional interface accepts nothing but returns an object.

     */

    public static void main(String[] args) {

        /*
        here we will return random number and only 10 numbers I want to generate
        So we will use limit method with 10 input

        If we will remove limit method from below line of code then unlimited number
        or elements will be generated
         */

        Stream.generate(new Random()::nextInt)
                .limit(10)
                .forEach(System.out::print);

        /*
        1326716650
        1092844406
        5788503
        -458777030
        1540605615
        -1371186791
        -1643331520
        -587082232
        1077265185
        1030715546
         */

        System.out.println();
        System.out.println();

        /*
        fetch first 3 elements and multiply it by 10 and store it in new list
         */
        List<Integer> intlist = List.of(10, 20, 30, 40, 50, 60, 70, 80, 90);

        List<Integer> newintlist = intlist.stream()
                .limit(3)
                .map(ele -> ele * 10)
                .collect(Collectors.toList());

        System.out.println("newintlist: " + newintlist);
        // newintlist: [100, 200, 300]

        /*
        Note-
        In List , elements are stored in ordered and so limit will also fetch elements
        from list in ordered way

        But if u r using Set where  elements are not stored in ordered then limit
        will also not fetch elements in ordered way from given Set.
        IF Set obj have 10 elements and u want to fetch only 3 and u r using limit()
        then any 3 elements of Set obj will be fetched using limit().
        It is not like only first 3 of Set obj will be fetched.

        But if u r using List wch is ordered here, limit() will fetch
        in ordered way from given list object
         */



    }
}
