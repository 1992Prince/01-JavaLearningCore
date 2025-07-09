package org.coding.arrays.basic;

import java.util.Arrays;

public class P12_ImmediateSmallerElement {

    public static void immediateSmaller(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = -1;
            }
        }
        arr[arr.length - 1] = -1;

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr1 = {4, 2, 1, 5, 3};
        immediateSmaller(arr1);
        System.out.println();

        int[] arr2 = {5, 6, 2, 3, 1, 7};
        immediateSmaller(arr2);

    }
}
