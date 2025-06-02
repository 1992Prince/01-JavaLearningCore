package com.tim.p4_arraylistmeths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2_ListRemoveMethod {

    public static void main(String[] args) {

        /**
         * The List interface in Java provides two methods for removing elements:
         *
         * remove(Object o) and remove(int index)
         * removeIf(Predicate<? super E> filter)
         *
         * 1️⃣ remove(Object o) and remove(int index)
         * These methods are used to remove specific elements from a List based on either the element's value or its index.
         *
         * Usage:
         * remove(Object o): Removes the first occurrence of the specified element (if found).
         * remove(int index): Removes the element at the specified index.
         *
         * 2️⃣ removeIf(Predicate<? super E> filter)
         * Introduced in Java 8, this method allows removing elements conditionally using a predicate (lambda expression or method reference).
         * Usage:
         * Removes all elements that match a given condition.
         * Works efficiently in a single pass.
         *
         * 🔥 Important Notes:
         * Avoid using remove(int index) in a loop while modifying the list, as it can shift indices and cause IndexOutOfBoundsException.
         * Use removeIf() for bulk removal instead of iterating and calling remove().
         */

        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Bob"));

        // Remove by value
        names.remove("Bob"); // Removes the first "Bob"
        System.out.println(names); // Output: [Alice, Charlie, Bob]

        // Remove by index
        names.remove(1); // Removes "Charlie" at index 1
        System.out.println(names); // Output: [Alice, Bob]

        System.out.println("---------------");

        // Remove by condition
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30));

        // Remove all numbers greater than 20
        numbers.removeIf(n -> n > 20);
        System.out.println(numbers); // Output: [10, 15, 20]
    }
}
