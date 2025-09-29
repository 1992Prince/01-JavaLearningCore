package org.coding.arrays.takeuforward;

import java.util.Arrays;

public class P3_LeftRotateAnArrayByOne {

    static void leftRotateByOne(int[] arr) {

        int x = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = x;

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        leftRotateByOne(arr1);


    }
}
