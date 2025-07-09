package org.coding.arrays.basic;

import java.util.Arrays;

public class P5_ReverseArrayInGroups {

    public static void reverseInGroups(int[] arr, int k) {
        int n = arr.length;
        // if k >= n - then rev complete array
        if (k >= n) {
            int start = 0;
            int end = n - 1;
            reverseArrInPlace(arr, start, end);
            return;
        }

        // else we need to rev sub groups or array each one by one
        for (int i = 0; i < n; i += k) {
            int start = i;
            int end = Math.min(i+k-1,n-1);
            reverseArrInPlace(arr,start,end);
        }

    }

    private static void reverseArrInPlace(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {

        // Testing if reverse the array logic in place is working or not
        int[] arr1 = {1, 2, 3, 4, 5};
        reverseArrInPlace(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1)); // [5, 4, 3, 2, 1]
        System.out.println();

        int[] arr2 = {1, 2, 3, 4, 5};
        int k = 3;
        reverseInGroups(arr2,3);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {5, 6, 8, 9};
        k = 5;
        reverseInGroups(arr3,5);
        System.out.println(Arrays.toString(arr3));
    }
}
