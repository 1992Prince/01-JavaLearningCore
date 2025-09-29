package org.map.sid;

public class P4_FindMissingNumInArray {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 8, 4};
        int size = 9;
        findMissingNumbers(arr, size);

    }

    public static void findMissingNumbers(int[] arr, int size) {
        boolean[] present = new boolean[size + 1]; // to track numbers from 1 to 9

        // Mark the numbers present in the array
        for (int i = 0; i < arr.length; i++) {
            present[arr[i]] = true;
        }

        // Identify missing numbers
        System.out.print("Missing numbers: ");
        for (int i = 1; i <= size; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }

    }
}
