package org.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class P14_SidAssmnt_HashMapKeySort {

    /**
     * Advanced Concepts
     *      Sorting a Map
     *              Using TreeMap for naturally sorted keys.
     *              Sorting a HashMap by keys or values using Stream API.
     *
     *      Custom Key Objects
     *              Implementing equals() and hashCode() for custom key objects.
     *              Examples with custom classes as keys.
     *
     *      Handling Collisions
     *              Understanding hash collisions and their impact on performance.
     *              Strategies to minimize and handle collisions.
     *
     *      Map Performance
     *              Big-O analysis of HashMap operations.
     *              Choosing the right Map implementation based on performance needs.
     */
    public static void main(String[] args) {

        // Sorting a HashMap by keys or values using Stream API.

        /**
         * HashMap in Java doesn't maintain any order by default, but often we need to sort data for better
         * readability or analysis.
         * With Java 8's Stream API, sorting HashMap by keys or values has become much simpler and more readable.
         * Let me break this down step by step.
         *
         * Why Use Stream API for Sorting?
         * Before Java 8, sorting a HashMap required writing complex code with loops and custom comparators.
         * The Stream API provides a clean, functional approach that's easier to understand and maintain.
         *
         * Basic Concepts You Need to Know:
         * 1) HashMap Entries: Each element in a HashMap is called an Entry containing a key-value pair.
         * 2) Stream Pipeline: The sorting process follows this pattern:
         * 3) Convert HashMap to Stream
         * 4) Apply sorting logic
         * 5) Collect results back to a Map
         */

        // Sorting HashMap by Keys
        // Basic Example - Ascending Order
        // Here's how to sort a HashMap by keys in ascending order:

        // Create and populate HashMap
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Banana", 3);
        unsortedMap.put("Apple", 5);
        unsortedMap.put("Orange", 2);
        unsortedMap.put("Mango", 8);

        Map<String, Integer> sortedMap = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal, LinkedHashMap::new));

        // Display results
        sortedMap.forEach((key, value) ->
                System.out.println(key + " : " + value));

        /**
         * Apple : 5
         * Banana : 3
         * Mango : 8
         * Orange : 2
         */

        /**
         * Logic Explanation:
         * entrySet(): Converts HashMap to a Set of Map.Entry objects
         * stream(): Creates a stream from the entry set
         * sorted(Map.Entry.comparingByKey()): Sorts entries by key in natural order
         * collect(Collectors.toMap(...)): Collects sorted entries back to a LinkedHashMap
         * LinkedHashMap::new: Preserves the sorted order (HashMap doesn't maintain order)
         * We're using Collectors.toMap(...) to collect the sorted stream back into a LinkedHashMap (so that insertion order is preserved after sorting
         *
         * ✅ Full Syntax:
         * Collectors.toMap(
         *     Map.Entry::getKey,                // Key mapper
         *     Map.Entry::getValue,              // Value mapper
         *     (oldVal, newVal) -> oldVal,       // Merge function (for duplicate keys)
         *     LinkedHashMap::new                // Map Supplier (type of map to return)
         * )
         *
         * 🔍 Breakdown of Each Part:
         *
         * 1️⃣ Map.Entry::getKey
         * This tells toMap how to extract the key from each entry in the stream.
         * Basically: entry -> entry.getKey()
         *
         * 2️⃣ Map.Entry::getValue
         * This tells toMap how to extract the value from each entry.
         * Equivalent to: entry -> entry.getValue()
         *
         * 3️⃣ (oldVal, newVal) -> oldVal
         * This is called the merge function. It's needed only if duplicate keys are found.
         * Since we are sorting entries that already have unique keys, this is just a safe fallback.
         * You can also write: (v1, v2) -> v1
         * ✅ Why needed?
         * Because Collectors.toMap() without this third argument throws IllegalStateException
         * if there are duplicate keys.
         *
         * 4️⃣ LinkedHashMap::new
         * This tells Java which Map implementation to use while collecting.
         * LinkedHashMap maintains the insertion order — this is what we want after sorting.
         * 🧠 If you used HashMap::new instead, it wouldn't preserve sort order.
         */

        /**
         *                  +--------------------+
         *                  |   Original HashMap |
         *                  |--------------------|
         *                  |  "Zebra" → 3       |
         *                  |  "Apple" → 5       |
         *                  |  "Lemon" → 1       |
         *                  +--------------------+
         *                            |
         *                            v
         *        +----------------------------------------+
         *        | Convert to EntrySet and Stream         |
         *        | map.entrySet().stream()                |
         *        +----------------------------------------+
         *                            |
         *                            v
         *        +----------------------------------------+
         *        | Sort using Comparator                  |
         *        | .sorted(Map.Entry.comparingByKey())    |
         *        | // or comparingByValue()               |
         *        +----------------------------------------+
         *                            |
         *                            v
         * +----------------------------------------------------------+
         * | Collect into a LinkedHashMap to preserve sorted order    |
         * |                                                          |
         * | .collect(Collectors.toMap(                               |
         * |     Map.Entry::getKey,                                   |
         * |     Map.Entry::getValue,                                 |
         * |     (oldVal, newVal) -> oldVal,                          |
         * |     LinkedHashMap::new                                   |
         * | ))                                                       |
         * +----------------------------------------------------------+
         *                            |
         *                            v
         *           +------------------------------------+
         *           |  Final Sorted LinkedHashMap        |
         *           |------------------------------------|
         *           |  "Apple" → 5                       |
         *           |  "Lemon" → 1                       |
         *           |  "Zebra" → 3                       |
         *           +------------------------------------+
         *
         *🧠 Reminder:
         * If you use HashMap::new instead of LinkedHashMap::new, you'll lose the sorted order.
         */

    }
}
