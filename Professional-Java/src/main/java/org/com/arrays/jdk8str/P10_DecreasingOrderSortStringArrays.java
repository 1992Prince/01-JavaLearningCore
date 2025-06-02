package org.com.arrays.jdk8str;

import java.util.Arrays;
import java.util.Comparator;

public class P10_DecreasingOrderSortStringArrays {

    /**
     * For String[], Arrays.sort() supports custom comparators directly.
     */

    public static void main(String[] args) {

        String[] words = {"apple", "banana", "cherry", "date"};

        // Using Arrays.sort() with Comparator.reverseOrder()
        Arrays.sort(words, Comparator.reverseOrder());
        System.out.println("Sorted String[] (Using Arrays.sort): " + Arrays.toString(words));
        // Output: [date, cherry, banana, apple]

        // Using Streams API - ignore this one and follow above one
        String[] sortedWords = Arrays.stream(words)
                .sorted(Comparator.reverseOrder()) // Sort in reverse order
                .toArray(String[]::new); // Collect back to String[]
        System.out.println("Sorted String[] (Using Streams): " + Arrays.toString(sortedWords));
        // Output: [date, cherry, banana, apple]
    }
}
