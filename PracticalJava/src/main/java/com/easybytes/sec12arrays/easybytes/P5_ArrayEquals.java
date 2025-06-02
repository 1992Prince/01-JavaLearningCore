package com.easybytes.sec12arrays.easybytes;

import java.util.Arrays;

public class P5_ArrayEquals {

    public static void main(String[] args) {

        /**
         * ✅ Arrays.equals()
         * 🔹 Use:
         *          Compares two arrays element by element, returns true if:
         *              Both arrays are of the same length
         *              All corresponding elements are equal (using == for primitives or equals() for objects)
         */

        // 🔹 For Primitive Arrays:
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        System.out.println(Arrays.equals(a1, a2)); // true

        // 🔹 For Object Arrays: equals() meth is present in Object class and In Strings equals() method is overidden to compare content
        String[] s1 = {"a", "b"};
        String[] s2 = {"a", "b"};
        System.out.println(Arrays.equals(s1, s2)); // true

        // 🔹 For Nested Object Arrays:
        String[][] arr1 = {{"a", "b"}, {"c", "d"}};
        String[][] arr2 = {{"a", "b"}, {"c", "d"}};

        System.out.println(Arrays.equals(arr1, arr2)); // false ❌
        // ❌ Why false? Because Arrays.equals() only checks top-level references, not deep content in nested arrays.

        System.out.println();
        System.out.println();

        /**
         * ✅ Arrays.deepEquals()
         * 🔹 Use:
         * Compares nested arrays (multidimensional arrays) deeply, meaning it checks the contents of inner arrays too.
         */
        System.out.println(Arrays.deepEquals(arr1, arr2)); // true ✅

        /**
         * 🆚 Differences Summary
         * Feature	                                Arrays.equals()	                        Arrays.deepEquals()
         * Works with primitive arrays	            ✅ Yes	                                ✅ Yes (when wrapped in Object[])
         * Works with object arrays	                ✅ Yes	                                ✅ Yes
         * Works with nested arrays	        ❌ Only compares top-level references	        ✅ Compares inner array contents deeply
         * Output	                                boolean	                                boolean
         *
         * ✅ Quick Interview Tip
         * If you're comparing multi-dimensional arrays (like int[][] or String[][]), always use Arrays.deepEquals() to avoid false negatives.
         */


    }
}
