package org.coding.arrays.basic;

public class P1_PeakElement {

    public static int peakElement(int[] arr) {
        int n = arr.length;

        // 🔹 Edge case: if only one element, it's a peak by default
        if (n == 1) return 0;

        // 🔹 Check if first element is a peak
        if (arr[0] > arr[1]) {
            return 0;
        }

        // 🔹 Check if last element is a peak
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        // 🔹 Check for peak in middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }

        // 🔸 If no peak found (shouldn't happen as per constraints)
        return -1;
    }


    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5, 7, 8, 3};
        System.out.println(peakElement(arr1));
        System.out.println();

        int[] arr2 = {10, 20, 15, 2, 23, 90, 80};
        System.out.println(peakElement(arr2));
        System.out.println();

        int[] arr3 = {1, 2, 3};
        System.out.println(peakElement(arr3));
    }
}
