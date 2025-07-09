package org.coding.arrays.basic;

import java.util.Arrays;

public class P9_RotateArrayByOne {

    // rotate array clockwise by 1 time
    static void rotate1(int[] arr) {

        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        System.out.println(Arrays.toString(arr));

    }

    // rotate array clockwise by n times
    static void rotate(int[] arr) {

        int n=1;
        while(n <= 1){
            int temp = arr[arr.length-1];
            for(int i=arr.length-1;i>=1;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            n++;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        rotate(arr1);
        System.out.println();

        int[] arr2 = {9, 8, 7, 6, 4, 2, 1, 3};
        rotate(arr2);
        System.out.println();

    }
}
