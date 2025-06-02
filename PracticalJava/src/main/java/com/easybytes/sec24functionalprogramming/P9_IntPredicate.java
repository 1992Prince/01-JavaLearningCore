package com.easybytes.sec24functionalprogramming;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class P9_IntPredicate {

    /*
    IntPredicate, LongPredicate, DoublePredicate
        These are primitive versions of the Predicate interface that operate on int, long, and double values.
        They accept a single argument and return a boolean result, typically used for filtering elements.
     */

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        IntPredicate isEven = value -> value % 2 == 0;

        int[] evenNumbers = Arrays.stream(numbers)
                .filter(isEven)
                .toArray();

        System.out.println("Even Numbers: " + Arrays.toString(evenNumbers)); // Even Numbers: [2, 4]
    }
}
