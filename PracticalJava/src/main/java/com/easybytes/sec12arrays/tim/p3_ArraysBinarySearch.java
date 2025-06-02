package com.easybytes.sec12arrays.tim;

import java.util.Arrays;

public class p3_ArraysBinarySearch {

    public static void main(String[] args) {

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        // sorting array , for binary search it is must that arrays should be sorted
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray)); // [Able, David, Jane, Mark, Ralph]

        if  (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in array");
        }

        /*
        what if I want to compare if two arrays are equal? Two arrays are considered equal if both

        arrays contain the same number of elements and all elements in the same

        position in both arrays are equal
         */

        int[] iArray1 = {1, 2, 3, 4, 5};
        int[] iArray2 = {1, 2, 3, 4, 5};
        if (Arrays.equals(iArray1, iArray2)) {
            System.out.println("Arrays are equal");     // Arrays are equal
        } else {
            System.out.println("Arrays are not equal");
        }

        // Arrays are equal

        int[] iArray3 = {1, 2, 3, 4, 5};
        int[] iArray4 = {1, 2, 3, 4, 6};
        if (Arrays.equals(iArray3, iArray4)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");  // Arrays are not equal
        }

        // Arrays are not equal
        int[] iArray5 = {1, 2, 3, 4, 5};
        int[] iArray6 = {1, 2, 3, 4, 5, 6};
        if (Arrays.equals(iArray5, iArray6)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");  // Arrays are not equal
        }
    }
}
