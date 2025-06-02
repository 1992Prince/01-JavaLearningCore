package com.easybytes.sec21setinterface;

import java.util.HashSet;
import java.util.Set;

public class P1_HashSetDemo {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate, won't be added

        // Display the set
        System.out.println("Fruits: " + fruits); // Fruits: [Apple, Mango, Banana]

        // Check for an element
        System.out.println("Contains Mango? " + fruits.contains("Mango")); // Contains Mango? true

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits); // After removing Banana: [Apple, Mango]

        // Size of the set
        System.out.println("Set size: " + fruits.size()); // Set size: 2
    }
}
