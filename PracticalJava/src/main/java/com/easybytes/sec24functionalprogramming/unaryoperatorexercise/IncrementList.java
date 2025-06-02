package com.easybytes.sec24functionalprogramming.unaryoperatorexercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class IncrementList {

    /*
    There is a incrementList method which accepts List of integers and incrementValue.
    Develop a lambda expression using the  UnaryOperator functional interface.
    This lambda expression should accept the Integer as an input and increment the
    given input by the incrementValue provided.

    UnaryOperator is child of Function and map fun accepts Function lambda exp and so
    map fun can also accepts UnaryOperator lambda exp
     */

    public static List<Integer> incrementList(List<Integer> numbers, int incrementValue) {

        // Define a lambda expression using the UnaryOperator functional interface
        UnaryOperator<Integer> unaryOperator = num -> num + incrementValue;

        // Apply the lambda expression to each integer in the list
        List<Integer> list = numbers.stream().map(unaryOperator).collect(Collectors.toList());

        return list;

    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(incrementList(list, 10));
        // [20, 30, 40, 50, 60]
    }

}
