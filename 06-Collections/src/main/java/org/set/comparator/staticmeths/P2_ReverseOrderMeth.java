package org.set.comparator.staticmeths;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * ✅ 2. Comparator.reverseOrder() — Reverse of natural order
 * 🟢 Note: Works only if elements implement Comparable (like Integer, String)
 */
public class P2_ReverseOrderMeth {

    public static void main(String[] args) {

        // 🎯 Use Case: Sort a list of integers in descending order

        List<Integer> numbers = Arrays.asList(10, 5, 25, 15);
        // 🔹 Descending order using reverseOrder()
        numbers.sort(Comparator.reverseOrder());

        System.out.println("Descending order:");
        System.out.println(numbers);
        System.out.println();

        /**
         * Descending order:
         * [25, 15, 10, 5]
         */

        // 🎯 Use Case: Sort a list of integers in ascending order

        List<Integer> numbers2 = Arrays.asList(10, 5, 25, 15);
        // 🔹 Descending order using reverseOrder()
        numbers2.sort(Comparator.naturalOrder());

        System.out.println("Ascending order:");
        System.out.println(numbers2);
        System.out.println();
        /**
         * Ascending order:
         * [5, 10, 15, 25]
         */
    }
}
