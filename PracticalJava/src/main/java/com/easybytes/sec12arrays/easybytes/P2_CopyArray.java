package com.easybytes.sec12arrays.easybytes;

import java.util.Arrays;

public class P2_CopyArray {

    public static void main(String[] args) {

        int[] originalArray = {10, 20, 30, 40, 50};

        // --------------------------------------------
        // ✅ Method 1: Copy using for loop

        // ✅ Create a new array of same length
        int[] copiedArray = new int[originalArray.length];

        // ✅ Copy using for loop
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.println("Copied Array: " + Arrays.toString(copiedArray)); // Copied Array: [10, 20, 30, 40, 50]

        // --------------------------------------------
        // ✅ Method 2: Using Arrays.copyOf()

        /**
         * Arrays.copyOf(originalArray, newLength)
         * originalArray	The source array from which you want to copy elements
         * newLength	The size of the new array you want after copying
         *
         * ✅ 1. If newLength < originalArray.length
         * Only first newLength elements are copied.
         *
         * ✅ 2. If newLength == originalArray.length
         * All elements are copied, basically a full clone.
         *
         * ✅ 3. If newLength > originalArray.length
         * All elements are copied and remaining slots are filled with default values (e.g., 0 for int).
         */

        // 🔹 Case 1: Copy fewer elements
        int[] fewerElements = Arrays.copyOf(originalArray, 3);  // Only 3 elements copied

        // 🔹 Case 2: Copy into array of same length
        int[] sameLengthCopy = Arrays.copyOf(originalArray, originalArray.length);

        // 🔹 Case 3: Copy into longer array
        int[] biggerArray = Arrays.copyOf(originalArray, 7);  // Extra space filled with 0

        System.out.println("\nCopied fewer elements     : " + Arrays.toString(fewerElements)); // Copied fewer elements     : [10, 20, 30]
        System.out.println("Copied same length        : " + Arrays.toString(sameLengthCopy)); // Copied same length        : [10, 20, 30, 40, 50]
        System.out.println("Copied into bigger array  : " + Arrays.toString(biggerArray)); // Copied into bigger array  : [10, 20, 30, 40, 50, 0, 0]

        System.out.println();
        System.out.println();
        // --------------------------------------------
        // ✅ Method 2: Using Arrays.copyOfRange()


        // ✅ Example 1: Copy a portion of an array
        int[] original = {10, 20, 30, 40, 50, 60};

        // Copy elements from index 2 to 5 (30, 40, 50)
        int[] partialCopy = Arrays.copyOfRange(original, 2, 5);

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy     : " + Arrays.toString(partialCopy));

        //✅ Example 2: to > original.length
        // // Extra elements filled with default values (0)
        int[] newArr = Arrays.copyOfRange(original, 4, 8);
        System.out.println("New Array: " + Arrays.toString(newArr));  // New Array: [50, 60, 0, 0]

        /**
         * 🔥 Comparison with copyOf:
         * Method	                What It Does
         * Arrays.copyOf()	        Always copies from index 0
         * Arrays.copyOfRange()	    Copies from any custom range
         */

    }
}
