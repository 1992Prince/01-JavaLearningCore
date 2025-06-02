package org.com.arrays.streams;

import java.util.Arrays;
import java.util.List;

public class P5_Arrays_asListComparison {

    public static void main(String[] args) {

        /*
         Problem Statement:
         Understand the difference between:
         1. Using Arrays.asList() with an existing array.
         2. Using Arrays.asList() with varargs.

         Key Differences:
         - Input: Array vs Varargs (individual elements).
         - Backing Array: In the array case, the List is backed by the given array. In varargs, an internal array is created.
         - Mutability: Both are fixed-size lists, but only the first case reflects changes to the backing array.
        */

        // Example 1: Using Arrays.asList() with an existing array
        Integer[] integerArray = {1, 2, 3}; // don't use int[]
        List<Integer> listFromArray = Arrays.asList(integerArray);
        System.out.println("List from existing array: " + listFromArray); // Output: [1, 2, 3]

        // Modifying the original array reflects in the List
        integerArray[1] = 99;
        System.out.println("After modifying the array: " + listFromArray); // Output: [1, 99, 3]

        // Adding or removing elements throws UnsupportedOperationException
        try {
            listFromArray.add(4); // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot add elements to a fixed-size List from array.");
        }

        /*
         Explanation:
         - The List `listFromArray` is backed by `integerArray`.
         - Any changes to `integerArray` are reflected in `listFromArray` and vice versa.
         - The size of the List is fixed and cannot be modified by adding or removing elements.
        */


        // Example 2: Using Arrays.asList() with varargs
        List<Integer> listFromVarargs = Arrays.asList(1, 2, 3);
        System.out.println("List from varargs: " + listFromVarargs); // Output: [1, 2, 3]

        // Modifying the List does not affect any external array (backing array is internal)
        listFromVarargs.set(1, 99); // Modifies the List
        System.out.println("After modifying the List: " + listFromVarargs); // Output: [1, 99, 3]

        // Adding or removing elements still throws UnsupportedOperationException
        try {
            listFromVarargs.add(4); // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot add elements to a fixed-size List from varargs.");
        }

        /*
         Explanation:
         - The List `listFromVarargs` is backed by an internal array created by Arrays.asList().
         - Changes to the List do not affect any external array.
         - The size of the List is still fixed and cannot be modified.
        */


        // Example 3: Difference in behavior for primitive arrays
        int[] primitiveArray = {1, 2, 3};
        List<int[]> listFromPrimitiveArray = Arrays.asList(primitiveArray);
        System.out.println("List from primitive array: " + listFromPrimitiveArray);
        // Output: [[I@<hashcode>] (List contains the entire array as one element)

        // Checking if the List contains a specific value (incorrect behavior)
        System.out.println("Contains 1 (primitive array case): " + listFromPrimitiveArray.contains(1));
        // Output: false


        // Correct way to handle primitive arrays
        Integer[] wrapperArray = {1, 2, 3}; // Convert int[] to Integer[]
        List<Integer> correctList = Arrays.asList(wrapperArray);
        System.out.println("List from Integer array: " + correctList); // Output: [1, 2, 3]
        System.out.println("Contains 1 (correct case): " + correctList.contains(1)); // Output: true

        /*
         Problem with Primitive Arrays:
         - When passing a primitive array (int[]), Arrays.asList() treats it as a single element.
         - Use a wrapper array (Integer[]) to ensure individual elements are added to the List.
        */
    }
}

