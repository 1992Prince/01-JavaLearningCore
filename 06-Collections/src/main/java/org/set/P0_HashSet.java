package org.set;

import java.util.HashSet;

public class P0_HashSet {

    public static void main(String[] args) {

        /**
         * 🔹 How HashSet Works Internally?
         *
         * - HashSet internally uses a HashMap to store elements.
         * - When you create a HashSet:
         *     HashSet set = new HashSet();
         *     // Internally:
         *     map = new HashMap<>();
         *
         * - HashSet stores values as keys in the HashMap.
         * - A dummy object is used as value (e.g., PRESENT).
         *
         * HashSet is backed by a HashMap.
         * When we call add(element), internally it does: map.put(element, DUMMY_VALUE);
         */

        /**
         * 🔹 What is Load Factor / Fill Ratio?
         *
         * - Load factor tells when HashSet should increase its internal capacity.
         * - Default capacity: 16 buckets.
         * - Default load factor: 0.75 (i.e., 75%)
         *
         * Example:
         * HashSet<Integer> set = new HashSet<>(16, 0.75f);
         * - Capacity: 16
         * - Load Factor: 0.75
         * - Resize happens after: 16 × 0.75 = 12 elements
         *
         * 🔁 When that threshold is crossed, internal array is resized (typically doubled).
         */

        /**
         * 🧠 Interview Tip:
         * “HashSet is a hashing-based data structure. It stores data in buckets via hashing concept.
         *  When 75% of the array is filled, it resizes to maintain performance.”
         */

        /**
         * 📊 Capacity vs Size:
         * - Capacity: Total number of internal buckets
         * - Size: Number of actual elements inserted
         */

        // ✅ Demonstration
        HashSet<Object> set = new HashSet<>();
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("Z");
        set.add(null);
        set.add(10);

        System.out.println(set.add("Z")); // false → "Z" already exists
        System.out.println(set);          // Output order is unpredictable

        /**
         * ⚠ Note:
         * - HashSet does NOT maintain insertion order.
         * - Output may be like: [null, B, C, D, Z, 10]
         */



        /**
         * 🔍 Set vs SortedSet
         *
         * - Set interface doesn't define specific methods like first(), last(), etc.
         * - Why? Because HashSet doesn't maintain any order.
         *
         * - SortedSet is a child interface of Set and stores elements in sorted order.
         * - Therefore, it provides methods like:
         *     - first()
         *     - last()
         *     - headSet()
         *     - tailSet()
         *     - subSet()
         */

        /**
         * 📌 Default Natural Sorting Order:
         * - Numbers → Ascending
         * - Strings → Alphabetical
         */

    }
}
