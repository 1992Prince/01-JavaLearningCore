package org.coding.arrays.basic;

public class P2_LargestElementInArray {
    public static int largest(int[] arr) {
        int largestEle = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largestEle < arr[i]) {
                largestEle = arr[i];
            }
        }

        return largestEle;

    }

    public static void main(String[] args) {

        int[] arr = {1, 8, 7, 56, 90};
        System.out.println(largest(arr));

        int[] arr2 = {5, 5, 5, 5};
        System.out.println(largest(arr2));

        int[] arr3 = {10};
        System.out.println(largest(arr3));
    }
}
