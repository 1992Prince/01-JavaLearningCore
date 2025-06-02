package com.easybytes.sec24functionalprogramming.functionexercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthTransformer {

    /*
    There is a transformStringLengths method which accepts List of Strings.
    Develop a lambda expression using the  Function functional interface.
    This lambda expression should accept the String as an input and return the
    length of the input String
     */

    public static List<Integer> transformStringLengths(List<String> strings) {

        // Define a lambda expression using the Function functional interface
        List<Integer> strlen = strings.stream().map(str -> str.length()).collect(Collectors.toList());

        // Apply the lambda expression to each string in the list
        return strlen;

    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Pikachu", "bimba", "a");
        System.out.println(transformStringLengths(list)); // [7, 5, 1]
    }
}
