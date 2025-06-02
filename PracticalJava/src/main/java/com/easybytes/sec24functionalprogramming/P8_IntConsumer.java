package com.easybytes.sec24functionalprogramming;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class P8_IntConsumer {

    /*
    IntConsumer, LongConsumer, DoubleConsumer
    These are primitive versions of the Consumer interface that operate on int, long, and double values, respectively.
    They accept a single argument and return no result, typically used for performing side-effects.
     */

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        IntConsumer printConsumer = value -> System.out.print(value + " ");

        Arrays.stream(numbers).forEach(printConsumer); // 1 2 3 4 5 
    }
}
