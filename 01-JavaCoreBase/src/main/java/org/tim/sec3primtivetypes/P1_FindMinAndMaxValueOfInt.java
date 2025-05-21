package org.tim.sec3primtivetypes;

public class P1_FindMinAndMaxValueOfInt {

    public static void main(String[] args) {

        // Below to get min and max value of int primitive data type we will be using Wrapper class Integer
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("myMinIntValue : " + myMinIntValue + " myMaxIntValue : " + myMaxIntValue);
        // myMinIntValue : -2147483648 myMaxIntValue : 2147483647
    }
}
