package com.easybytes.sec12arrays.easybytes;

import java.util.Arrays;

public class P4_CompareArrays {

    public static void main(String[] args) {

        // ✅ Arrays.compare() – Compare Two Arrays Lexicographically
        //This method compares two arrays element by element in lexicographical order.


        /**
         * int result = Arrays.compare(array1, array2);
         * Returns 0 if both arrays are equal.
         * Returns a negative number if array1 is "less than" array2.
         * Returns a positive number if array1 is "greater than" array2.
         */

        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 4};

        int result = Arrays.compare(a1, a2);
        System.out.println("result : " + result); // result : -1

        //🔍 Explanation: a1[2] = 3 is less than a2[2] = 4, so result is -1.

        System.out.println();

        int[] a3 = {1, 2, 3};
        int[] a4 = {1, 2, 3};
        int[] a5 = {1, 2, 3, 4};

        int result2 = Arrays.compare(a3, a4);
        System.out.println("result2 : " + result2); // result2 : 0

        int result3 = Arrays.compare(a4, a5);
        System.out.println("result3 : " + result3); // result3 : -1

        System.out.println();
        System.out.println();

        // Comparing Strings
        String[] s1 = {"apple", "banana"};
        String[] s2 = {"apple", "banana"};
        String[] s3 = {"apple", "cherry"};

        System.out.println(Arrays.compare(s1, s2)); // 0
        System.out.println(Arrays.compare(s1, s3)); // -1
        System.out.println(Arrays.compare(s3, s1)); // 1

        System.out.println();
        System.out.println();

        // 🔸 What if arrays have different lengths?
        int[] a6 = {1, 2, 3};
        int[] a7 = {1, 2};

        System.out.println(Arrays.compare(a6, a7)); // Output: 1
        // 🔍 Explanation: The first two elements are same, but a1 is longer, so it’s considered "greater".

        /**
         * ✅ Summary
         * Use Case	                        Method	                                Returns
         * Compare primitive        arrays	Arrays.compare(arr1, arr2)	        int (lexicographical order)
         * Compare object arrays	Arrays.compare(arr1, arr2)	                int (uses compareTo of elements)
         */
    }
}
