package com.easybytes.sec12arrays.tim;

import java.util.Arrays;
import java.util.Random;

public class p2_ArraysUtility {

    public static void main(String[] args) {

        int firstArray[] = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray)); // here array elements will be not in any order

        System.out.println();

        // I want array elements in sorted order i.e. ascending order
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        System.out.println();

        /*
        Now I want to fill all array elements with same value
         */
        int secondArray[] = new int[5];
        Arrays.fill(secondArray, 25);
        System.out.println(Arrays.toString(secondArray)); // [25, 25, 25, 25, 25]

        /*
        Now I want to copy array elements from one array to another
        secondArray.length specifies till what length elements will be copied from secondArray
         */

        int thirdArray[] = Arrays.copyOf(secondArray, secondArray.length);
        System.out.println("Third Array - " + Arrays.toString(thirdArray)); // Third Array - [25, 25, 25, 25, 25]

        /*
         An array copy creates a new array,
         a new instance of an array, and copies the array elements over to the new array.

         For primitives, the values get copied. For objects, the object references get copied.

        Performing operations on the copied array, like sort and fill, don't impact the original array.
         */

    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        /*
        We can't use enhanced for loop to set values for array elements
        so we are using traditional for loop
         */
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(1000);
        }
        return newInt;
    }
}
