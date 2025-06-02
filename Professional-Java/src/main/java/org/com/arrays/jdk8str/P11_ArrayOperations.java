package org.com.arrays.jdk8str;

import java.util.Arrays;

public class P11_ArrayOperations {

    public static void main(String[] args) {

        /*
        1 - lenght of array
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Length of array: " + arr.length);       // Length of array: 10

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Length of 2D array: " + arr2.length);    // Length of 2D array: 3
        System.out.println("Length of 2D array: " + arr2[0].length); // Length of 2D array: 3

        System.out.println();

        /*
         2 - Finding an element in an array
         */
        String[] strings = new String[] { "A", "B", "C" };
        int[] ints = new int[] { 1, 2, 3, 4 };
        // Using Arrays.binarySearch (for sorted arrays only)
        int index = Arrays.binarySearch(strings, "A");
        int index2 = Arrays.binarySearch(ints, 1);
        System.out.println("Index of A: " + index);  // Index of A: 0
        System.out.println("Index of 1: " + index2); // Index of 1: 0

        System.out.println();
        //  Linear search using a loop and for primitives use == for comparison

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("A")) {
                System.out.println("Found A at index " + i); // Found A at index 0
                break;
            }
        }

        System.out.println();

        /*
         3 - Converting arrays between primitives and boxed type
         */

        // using streams
        int[] primitiveArray = {1, 2, 3, 4};
        Integer[] boxedArray =
                Arrays.stream(primitiveArray).boxed().toArray(Integer[]::new);

        // using for loop
        int[] primitiveArray2 = {1, 2, 3, 4};
        Integer[] boxedArray2 = new Integer[primitiveArray2.length];
        for (int i = 0; i < primitiveArray2.length; i++) {
            boxedArray2[i] = Integer.valueOf(primitiveArray2[i]);
        }

        // Similarly, a boxed array can be converted to an array of its primitive counterpart:
        // Version ≥ Java SE 8
        Integer[] boxedArray3 = {1, 2, 3, 4};
        int[] primitiveArray3 =
                Arrays.stream(boxedArray3).mapToInt(Integer::intValue).toArray();

        // Version < Java SE 8
        Integer[] boxedArray4 = {1, 2, 3, 4};
        int[] primitiveArray4 = new int[boxedArray4.length];
        for (int i = 0; i < boxedArray4.length; ++i) {
            primitiveArray4[i] = boxedArray4[i]; // Each element is outboxed here
        }

    }
}
