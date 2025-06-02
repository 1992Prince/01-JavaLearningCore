package com.easybytes.sec24functionalprogramming;

import java.util.function.UnaryOperator;

public class P5_UnaryOperatorDemo {

    /*
   UnaryOperator Functional Interface extends Function Functional interface and so it is child of
   Function Functional Interface.

   It accepts one arg of any type and return output in same type.

     */

    public static void main(String[] args) {

        UnaryOperator<String> convertStr = input -> input.toLowerCase();
        String output1 = convertStr.apply("JAI SHREE RAM!!!!");
        System.out.println("output1 - " + output1); // output1 - jai shree ram!!!!

        System.out.println();

        UnaryOperator<String> sameval = UnaryOperator.identity();
        System.out.println("Same value using identity method - " + sameval.apply("Best"));
        // Same value using identity method - Best
    }
}

