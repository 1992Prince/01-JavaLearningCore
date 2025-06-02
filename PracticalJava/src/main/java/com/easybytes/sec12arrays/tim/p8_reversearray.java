package com.easybytes.sec12arrays.tim;

import java.util.Arrays;

public class p8_reversearray {


    public static void main(String[] args) {

        int[] myIntegers = {1,2,3,4,5};
        reverseArray(myIntegers);
        System.out.println("Reversed Array is - " + Arrays.toString(myIntegers));
        // Reversed Array is - [5, 4, 3, 2, 1]

    }

    private static void reverseArray(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
