package com.easybytes.sec12arrays.tim;

import java.util.Arrays;

public class p9_2DArray {

    public static void main(String[] args) {

        int[][] arr=new int[3][4]; // 2D array initialized with 3 rows and each row will have 4 cols
        // each row is an array

        System.out.println(Arrays.toString(arr)); // [[I@6f496d9f, [I@723279cf, [I@10f87f48]
        System.out.println(arr.length);           // 3

        // length of first row element
        System.out.println(arr[0].length);       // 4

        // print all rows of 2D array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        /*
        [0, 0, 0, 0]
        [0, 0, 0, 0]
        [0, 0, 0, 0]
         */

        // initialising first row elements
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;

        System.out.println("First row elements - " + Arrays.toString(arr[0])); // First row elements - [10, 20, 30, 0]

        // Accessing first row first element
        System.out.println("First row first element - " + arr[0][0]); // First row first element - 10

        System.out.println();
        // method to print 2D array
        System.out.println(Arrays.deepToString(arr)); // [[10, 20, 30, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
    }
}
