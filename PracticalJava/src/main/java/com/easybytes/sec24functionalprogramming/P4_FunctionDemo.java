package com.easybytes.sec24functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class P4_FunctionDemo {

    /*
    Function interface u can use when for each element of collection u want to perform
    some operation on it like adding 2 to all eles of ArrayList or
    multiplying 2 to all eles of ArrayList or
    getting lenght of all strings of ArrayList etc.

    Here map fun accepts Function interface lambda exp
     */

    public static void main(String[] args) {

        /*
        Below accepting input in String format and output will be in String format
         */
        Function<String, String> convertStr =
                (input) -> input.toUpperCase();
        String str1 = convertStr.apply("jai shree ram!!!");
        System.out.println(str1); // JAI SHREE RAM!!!

        System.out.println();

        /*
        Below accepting input in String format and output will be in Integer format
         */

        Function<String, Integer> getStrLength = input -> input.length();
        Integer strlen = getStrLength.apply("JAI SHREE RAM!!!");
        System.out.println("Lenght of String is - " + strlen); // Lenght of String is - 16

        System.out.println();

        /*
        static identity method -
        Returns a function that always returns its input argument.
         */
        Function<String, String> sameVal = Function.identity();
        System.out.println(sameVal.apply("Jai Hind")); // Jai Hind

        System.out.println();

        /*
        default methods in Function interface i.e. 1) andThen 2) compose
        used for chaining two Function interface abstract method behaviour
         */
        Function<Integer, Integer> doubleVal = num -> num * 2;
        Function<Integer, Integer> addThree = num -> num + 3;

        /*
        When u use andThen for chaining Function interface lambda exp then
        firstly left side i.e. doubleVal will be calulated and then addThree
        will be calculated
         */
        Function<Integer, Integer> output1 = doubleVal.andThen(addThree);
        System.out.println("Output1 - " + output1.apply(5)); // Output1 - 13

        System.out.println();

        /*
        When u use compose for chaining Function interface lambda exp then
        firstly right side i.e. addThree will be calulated and then doubleVal
        will be calculated
         */
        Function<Integer, Integer> output2 = doubleVal.compose(addThree);
        System.out.println("Output2 - " + output2.apply(2)); // Output2 - 10

        System.out.println();

        /**
         * map fun accepts Function interface lambda exp to trasform elements
         */
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        /*
        'collect(toList())' can be replaced with 'toList()'
        List<Integer> list2 = list.stream().map(num -> num * 5).collect(Collectors.toList());
         */
        List<Integer> list2 = list.stream().map(num -> num * 5).toList();
        System.out.println("List2 - " + list2); // List2 - [5, 10, 15, 20, 25]






    }
}

