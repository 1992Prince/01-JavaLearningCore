package com.tim.p1_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P5_MoreListsMethods {

    public static void main(String[] args) {

        ArrayList<String> groceries = new ArrayList<>();

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println("groceries - " + groceries); // groceries - [apples, milk, mustard, cheese, eggs, pickles, mustard, ham]
        System.out.println("groceries size - " + groceries.size()); // groceries size - 8

        /**
         * Lets sort above list
         * ArrayList have sort method that accepts param as Comparator
         *  to be able to use the sort method,a Comparator is needed, and Java provides the one I need with a static factory method on the
         * comparator type, called naturalOrder.
         * Strings will be ordered alphabetically from A to Z and numbers will be ordered from smallest to largest.
         */

        groceries.sort(Comparator.naturalOrder());
        System.out.println("sroted groceries - " + groceries);
        // sroted groceries - [apples, cheese, eggs, ham, milk, mustard, mustard, pickles]

        System.out.println();

        /**
         * You can also call the reverseOrder static
         * method on the comparator type to sort in reverse.
         */
        groceries.sort(Comparator.reverseOrder());
        System.out.println("reversed groceries - " + groceries);
        // reversed groceries - [pickles, mustard, mustard, milk, ham, eggs, cheese, apples]

        System.out.println();

        /**
         * Converting ArrayList to array
         * ArrayList have toArray method that accepts param as array type
         */
        Object[] listToArr1 = groceries.toArray();

        // but I want array of particular type and size as my list
        String[] listToArr = groceries.toArray(new String[groceries.size()]);
        System.out.println("listToArr - " + Arrays.toString(listToArr));
        // listToArr - [pickles, mustard, mustard, milk, ham, eggs, cheese, apples]

        /**
         * Summary of methods learned:
         * 1. addAll() - adds all elements from a collection to ArrayList
         * 2. size() - returns the number of elements in ArrayList
         * 3. sort() with Comparator.naturalOrder() - sorts elements in natural order
         * 4. sort() with Comparator.reverseOrder() - sorts elements in reverse order
         * 5. toArray() - converts ArrayList to array
         * 6. toArray(T[] array) - converts ArrayList to array of specific type
         */


    }
}
