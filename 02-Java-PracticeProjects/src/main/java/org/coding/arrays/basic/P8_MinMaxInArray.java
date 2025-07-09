package org.coding.arrays.basic;

public class P8_MinMaxInArray {

    static void getMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Min is : " + min + " Max is : " + max);

    }
    public static void main(String[] args) {

        int[] arr1 = {3, 2, 1, 56, 10000, 167};
        getMinMax(arr1);
        System.out.println();

        int[] arr2 = {1, 345, 234, 21, 56789};
        getMinMax(arr2);
        System.out.println();

        int[] arr3 = {56789};
        getMinMax(arr3);
    }
}
