package com.tim.arraylistpractice;

import java.util.*;
import java.util.stream.Collectors;

public class P1_Practice {

    public static void main(String[] args) {

        /**
         * 1️⃣ Sorting Elements
         * Problem: Sort an ArrayList of integers in ascending and descending order.
         */
        // using list methods
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        numbers.sort(Comparator.naturalOrder());
        System.out.println("Ascending order: " + numbers);  // Ascending order: [1, 2, 3, 5, 8]
        numbers.sort(Comparator.reverseOrder());
        System.out.println("Descending order: " + numbers); // Descending order: [8, 5, 3, 2, 1]

        System.out.println();

        // using streams
        List<Integer> numbers2 = Arrays.asList(5, 2, 8, 1, 3);
        List<Integer> ascending = numbers2.stream().sorted().toList();
        List<Integer> descending = numbers2.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Ascending order: " + ascending);   // Ascending order: [1, 2, 3, 5, 8]
        System.out.println("Descending order: " + descending); // Descending order: [8, 5, 3, 2, 1]

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println();

        /**
         * 2️⃣ Filtering Elements
         * Problem: Filter elements that are greater than 3 from an ArrayList.
         */
        System.out.println("numbers - " + numbers);
        List<Integer> filteredList = numbers.stream().filter(ele -> ele > 3).toList();
        System.out.println("filteredList - " + filteredList); // filteredList - [8, 5]

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println();

        /**
         * 3️⃣ Mapping Elements
         * Problem: Convert all elements of an ArrayList to their squares.
         */
        System.out.println("numbers - " + numbers);      // numbers - [8, 5, 3, 2, 1]
        List<Integer> squarelist = numbers.stream().map(ele -> ele * ele).toList();
        System.out.println("squarelist - " + squarelist); // squarelist - [64, 25, 9, 4, 1]

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println();

        /**
         * 5️⃣ Find Duplicate Elements
         * Problem: Find duplicate elements in an ArrayList.
         */

        List<String> names = Arrays.asList("Alice", "Bob", "John", "Alice", "Bob");
        Set<String> duplicates = names.stream()
                .filter(name -> Collections.frequency(names, name) > 1)
                .collect(Collectors.toSet());
        System.out.println("duplicates - " + duplicates); // duplicates - [Bob, Alice]

        /**
         * Pending
         * 6️⃣ Find First Non-Repeated Element
         * Problem: Find the first non-repeated element in an ArrayList.
         *   List<String> elements = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
         *   First Non-Repeated Element: orange
         *
         *   7️⃣ Remove Nulls from an ArrayList
         *     List<String> names = Arrays.asList("Alice", null, "Bob", null, "John");
         *
         *     8️⃣ Reverse an ArrayList
         *     9️⃣ Iterate and Print Elements
         */
    }
}
