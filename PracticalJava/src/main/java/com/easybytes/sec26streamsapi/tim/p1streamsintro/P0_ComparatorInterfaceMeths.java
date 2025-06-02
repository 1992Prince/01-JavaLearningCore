package com.easybytes.sec26streamsapi.tim.p1streamsintro;

import java.util.Comparator;
import java.util.List;

public class P0_ComparatorInterfaceMeths {

    public static void main(String[] args) {

        /**
         * ✅ Comparator.naturalOrder() and Comparator.reverseOrder() in Java
         * 🔹 1. What are they?
         * Comparator.naturalOrder()
         * Returns a comparator that sorts elements in their natural order (e.g., ascending for numbers, alphabetical for strings).
         *
         * Comparator.reverseOrder()
         * Returns a comparator that sorts elements in reverse of their natural order (e.g., descending for numbers, reverse-alphabetical for strings).
         *
         * Both are static methods in the Comparator interface
         */

        /**
         * 🔹 2. Usage with Streams + sorted()
         * The sorted() method in Stream API can:
         *
         * Be used without arguments for natural sorting (if elements are Comparable)
         *
         * Or take a custom comparator for custom sorting
         */

        // 👉 Example: Natural Order
        // see below we have take Integers and not primitives
        List<Integer> nums = List.of(3, 1, 4, 2);
        List<Integer> sorted = nums.stream()
                .sorted(Comparator.naturalOrder())
                .toList();

        System.out.println(sorted);  // [1, 2, 3, 4]

        // 👉 Example: Reverse Order
        List<String> names = List.of("Charlie", "Alice", "Bob");
        List<String> sortedDesc = names.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(sortedDesc);  // [Charlie, Bob, Alice]

        System.out.println();

        /**
         * 🔹 3. Where else in Collections can you use them?
         * ✅ Collections.sort(List, Comparator)
         * You can pass these comparators directly:
         * List<String> cities = new ArrayList<>(List.of("London", "Tokyo", "Delhi"));
         * Collections.sort(cities, Comparator.naturalOrder());
         * // Or
         * Collections.sort(cities, Comparator.reverseOrder());
         */

        /**
         * ✅ TreeSet and TreeMap (Custom Ordering)
         * You can pass the comparator to sort keys in desired order:
         * Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
         * set.addAll(List.of(5, 3, 1, 4));
         * System.out.println(set);  // [5, 4, 3, 1]
         *
         * Map<String, Integer> map = new TreeMap<>(Comparator.naturalOrder());
         */


    }
}
