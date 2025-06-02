package com.easybytes.sec24functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class P6_ConsumerDemo {

    /*
    Consumer Functional Interface lambda exp, accepts one arg of any type and
    don't return anything

    forEach() method accepts Consumer interface
     */

    public static void main(String[] args) {

        Consumer<String> convertAndDisplay = input -> System.out.println(input.toUpperCase());
        convertAndDisplay.accept("jai hind!!!"); // JAI HIND!!!

        Consumer<Integer> squareOf = input -> System.out.print(input * input + " ");
        squareOf.accept(100); // 10000

        System.out.println();

        /*
        print square of each element of Array

        forEach() accepts Consumer interface lambda expression
         */
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream().forEach(squareOf); // 1 4 9 16 25
        System.out.println();
        System.out.println();
        list.stream().forEach(input -> System.out.print(input * input + " ")); // 1 4 9 16 25

        /*
        we can also use list.forEach() instead of list.stream().forEach()
         */

    }
}

