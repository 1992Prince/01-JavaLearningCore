package com.tim.p5_collectionutility;

import java.util.*;
import java.util.Collections;

public class P1_methods1 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        String[] fruits = new String[5];

        Arrays.fill(numbers, 10);
        Arrays.fill(fruits, "banana");
        System.out.println(Arrays.toString(numbers)); // [10, 10, 10, 10, 10]
        System.out.println(Arrays.toString(fruits));  // [banana, banana, banana, banana, banana]

        System.out.println();

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        Collections.fill(list, "apple");
        System.out.println(list);  // [apple, apple, apple, apple, apple]

        System.out.println();

        // Below way of filling will not work

        List<String> list2 = new ArrayList<>(14);
        Collections.fill(list2, "apple");
        System.out.println(list2.size()+ " " + list2);  // 0 []

        System.out.println();

        /**
         * 1️⃣ Purpose of Collections.nCopies()
         * It creates a fixed-size, immutable list with n copies of a given element.
         * The list cannot be modified (adding or removing elements is not allowed).
         * Useful for initializing a list with default values.
         *
         * ✅ Creating an Immutable List with Repeated Elements
         * 📌 Key Points:
         * ✅ The list has 5 copies of "Banana".
         * ✅ Collections.nCopies() returns an immutable list, so you cannot add, remove, or modify elements.
         */

        List<String> fruits2 = Collections.nCopies(5, "Banana");

        System.out.println("fruits2 - " + fruits2); // fruits2 - [Banana, Banana, Banana, Banana, Banana]

        System.out.println();

        /**
         * Collections.addAll() Method in Java
         * Collections.addAll() is a utility method that is used to efficiently add multiple elements to a modifiable Collection or List in a single call.
         * Adds multiple elements at once to an existing collection (like ArrayList, HashSet, etc.).
         * Works with modifiable collections (not immutable ones).
         *
         * ✅ Adding Multiple Elements to a List
         */

        List<String> veggies = new ArrayList<>();
        // Add multiple elements at once
        Collections.addAll(veggies, "Tomato", "Spinach" ,"Potato");
        System.out.println("Veggies: " + veggies); // Veggies: [Tomato, Spinach, Potato]

        System.out.println();

        /**
         * Collections.copy() Method in Java
         * The Collections.copy() method is used to copy elements from one list to another list.
         *
         * 1️⃣ Purpose of Collections.copy()
         * Copies all elements from one list (source) to another (destination).
         * The destination list must be at least as big as the source list.
         * It overwrites the existing elements in the destination list.
         *
         * If the destination list is smaller than source, an IndexOutOfBoundsException occurs.
         */

        List<String> source = Arrays.asList("Apple", "Banana", "Mango");
        List<String> destination = new ArrayList<>(Arrays.asList("X", "Y", "Z"));

        // Copy elements from source to destination
        Collections.copy(destination, source);

        System.out.println(destination); // Output: [Apple, Banana, Mango]
        System.out.println();

        /**
         * List.copyOf() method introduced in jdk 10+
         */


    }
}
