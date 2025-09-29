package org.coding.arrays.takeuforward;

import java.util.Arrays;

public class P5_MoveZeroesToEnd {

    static void pushZerosToEnd(int[] arr) {

        int write = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[write];
                arr[write] = arr[i];
                arr[i] = temp;
                write++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr1);

    }
}
