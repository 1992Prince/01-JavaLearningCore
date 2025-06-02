package com.tim.p3_boxing;

import java.util.Arrays;

public class P2_BoxingWithLists {

    public static void main(String[] args) {

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray)); // [50, null, null, null, null]
        System.out.println(wrapperArray[0].getClass().getName()); // java.lang.Integer
        /**
         * Above array is of Wrapper class Integer type and so null is default value and not 0
         */


    }

    private static int returnAnInt(Integer i){

        return i;
    }

    private static Integer returnAnInteger(int i){

        return i;
    }


}
