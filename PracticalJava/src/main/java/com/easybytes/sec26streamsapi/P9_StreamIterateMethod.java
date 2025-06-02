package com.easybytes.sec26streamsapi;

import java.util.stream.Stream;

public class P9_StreamIterateMethod {

    /*
    The Stream.iterate method in Java is a static method used to generate an infinite sequential stream of elements.
    It creates a stream by starting with an initial value and iteratively applying a function to generate subsequent elements.

    There are two variants of Stream.iterate:

    Infinite Stream:
    This variant takes two parameters: an initial seed value and a unary operator function.
    The stream is infinite and will keep generating elements until the stream is terminated by an intermediate operation (like limit).

    Finite Stream:
    This variant takes three parameters: an initial seed value, a predicate to determine when to terminate,
    and a unary operator function to generate the next element.
    The stream will generate elements until the predicate returns false.


     */

    public static void main(String[] args) {

        /*

        Example of Infinite Stream

        Generate an  stream of 10 even numbers starting from 0

        so here 0 is seed value and n -> n+2 is unary functional interface lambda exp and it returns value in same
        input type

        If u want infinite stream of even numbers strating from 0 then remove .limit(10)
         */
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::print);  // 024681012141618

        System.out.println();
        System.out.println();

        /*
        Finite Stream example

        Generate a finite stream of numbers starting from 1, stopping when greater than 20
        Below we are giving seed value i.e. initial value as 1
        condition we are giving n<=20
        Number should be like 1, 4, 7...
         */

        Stream.iterate(1, n -> n <= 20, n -> n + 3)
                .forEach(System.out::print);  // 14710131619

        /*
        Key Points:
        
        Infinite Stream: Stream.iterate(seed, unaryOperator) - Generates an infinite stream.

        Finite Stream: Stream.iterate(seed, predicate, unaryOperator) -
                        Generates a stream until the predicate is false.

        Intermediate Operations: Methods like limit can be used to make the infinite stream
                        finite by limiting the number of elements.

        Termination: A stream needs a terminal operation (like forEach, collect, etc.)
                        to actually produce results.
         */
    }
}
