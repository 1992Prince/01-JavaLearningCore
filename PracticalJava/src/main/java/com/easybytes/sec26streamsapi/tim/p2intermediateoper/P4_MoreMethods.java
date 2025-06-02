package com.easybytes.sec26streamsapi.tim.p2intermediateoper;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P4_MoreMethods {

    public static void main(String[] args) {

        /**
         * ✅ 1. peek() – Kya karta hai?
         * 🔥 Purpose:
         * peek() is just used for debugging / watching elements in the stream without changing them.
         *
         * ⚠️ It’s like a CCTV camera — dekh raha hai, kuch nahi kar raha.
         * 🧠 Use peek() when you want to debug pipeline without affecting the flow.
         */

        List<String> names = List.of("Ravi", "Sita", "Amit");

        List<String> result = names.stream()
                .peek(n -> System.out.println("Before UpperCase: " + n)) // just dekh raha hai
                .map(String::toUpperCase)
                .peek(n -> System.out.println("After UpperCase: " + n))
                .collect(Collectors.toList());

        /**
         * Before UpperCase: Ravi
         * After UpperCase: RAVI
         * Before UpperCase: Sita
         * After UpperCase: SITA
         * Before UpperCase: Amit
         * After UpperCase: AMIT
         */

        System.out.println();
        System.out.println();

        /**
         * 🔹 sorted() vs sorted(Comparator)
         * Method	              Kaam	                                                      Kis pe kaam karta hai?
         * sorted()	            Natural order mein sort karta hai (A-Z, 1-9)	  Works only if elements/objects implement Comparable
         * sorted(Comparator)	Custom order define karte ho (Z-A, reverse, length-wise etc.)	Works on any data type with custom logic
         */

        /**
         * ✅ 1. sorted() → Natural Ordering
         *
         * Java mein natural order ka matlab hota hai:
         *          Strings → A to Z
         *          Numbers → Ascending (1, 2, 3...)
         *
         * Comparable implement hona chahiye (jaise Integer, String already karte hain)
         */

        // 🔸 Example 1: Sorting Numbers
        List<Integer> nums = List.of(5, 3, 1, 4, 2);

        List<Integer> sortedList = nums.stream()
                .sorted() // natural order: ascending
                .collect(Collectors.toList());

        System.out.println(sortedList); // Output: [1, 2, 3, 4, 5]

        // 🔸 Example 2: Sorting Strings
        List<String> names2 = List.of("Ravi", "Amit", "Sita");

        List<String> sortedNames = names2.stream()
                .sorted() // A-Z
                .collect(Collectors.toList());

        System.out.println(sortedNames); // Output: [Amit, Ravi, Sita]

        System.out.println();

        /**
         * ✅ 2. sorted(Comparator) → Custom Order (Reverse, Length-wise, etc.)
         * 🔸 Example 1: Reverse Order (Z to A)
         */

        List<String> names3 = List.of("Ravi", "Amit", "Sita");

        List<String> reversed = names3.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(reversed); // Output: [Sita, Ravi, Amit]

        // 🔸 Example 2: Descending Numbers
        List<Integer> nums4 = List.of(5, 3, 1, 4, 2);

        List<Integer> reversedNums = nums4.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(reversedNums); // Output: [5, 4, 3, 2, 1]

        // 🔸 Example 3: Sort Strings by Length
        List<String> names5 = List.of("Ram", "Amitabh", "Sita");

        List<String> byLength = names5.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        System.out.println(byLength); // Output: [Ram, Sita, Amitabh]

        // 🔸 Example 4: Sort Strings by Length (Reverse)
        List<String> names6 = List.of("Ram", "Amitabh", "Sita");

        List<String> byLengthDesc = names6.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());

        System.out.println(byLengthDesc); // Output: [Amitabh, Sita, Ram]

        /**
         * 🔁 Summary Table
         * Use Case	                        Method
         * Ascending sort of numbers	    sorted()
         * A-Z strings	                    sorted()
         * Z-A or descending	            sorted(Comparator.reverseOrder())
         * Sort by length	                sorted(Comparator.comparing(String::length))
         * Custom object sort	            Use Comparator.comparing(obj::getField)
         */













    }
}
