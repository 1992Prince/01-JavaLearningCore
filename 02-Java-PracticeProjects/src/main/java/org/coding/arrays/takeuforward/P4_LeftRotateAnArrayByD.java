package org.coding.arrays.takeuforward;

import java.util.Arrays;

public class P4_LeftRotateAnArrayByD {

    static void leftRotateByD(int[] arr, int d) {

        int effD = d % arr.length;

        int[] temparr = new int[effD];

        for(int i=0;i<temparr.length;i++){
            temparr[i] = arr[i];
        }

        for(int i=d;i<arr.length;i++){
            arr[i-d] = arr[i];
        }

        int j=0;
        for(int i=arr.length-d;i < arr.length;i++){
            arr[i] = temparr[j];
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7};
        leftRotateByD(arr1, 3);


    }
}
