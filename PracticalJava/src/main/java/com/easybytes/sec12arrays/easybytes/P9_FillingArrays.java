package com.easybytes.sec12arrays.easybytes;

import java.util.Arrays;

public class P9_FillingArrays {

    public static void main(String[] args) {

        /**
         * 🧩 Arrays.fill() — For Filling Array Values
         * This method fills all or a range of array elements with a specific value.
         */

        // ✅ Fill Entire Array:
        int[] arr = new int[5];
        Arrays.fill(arr, 10); // Fill all with 10

        System.out.println(Arrays.toString(arr)); // [10, 10, 10, 10, 10]

        // 🔹 Fill a Range in Array: - 🔸 Works for any type: int[], char[], String[], etc.
        int[] arr2 = new int[5];
        Arrays.fill(arr2, 1, 4, 99); // Fill index 1 to 3 (4 is exclusive)

        System.out.println(Arrays.toString(arr2)); // [0, 99, 99, 99, 0]

    }
}
