package org.map;

import java.util.HashMap;
import java.util.Map;

public class P4_DoubtsExamples {

    public static void main(String[] args) {

        // ✅ Q1. If key is not present then what does get(key) return?
        // 👉 It returns null.
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");

        System.out.println(map.get(2)); // Output: null

        System.out.println();

        /**
         * ✅ Q2. What is the purpose of getOrDefault()?
         * 👉 getOrDefault(key, defaultValue) returns:
         *          - value if key exists
         *          - defaultValue if key does not exist
         */
        System.out.println(map.getOrDefault(2, "Not Found")); // Output: Not Found
        // 💡 Safer than get() because it avoids null checks.

        System.out.println();

        // ✅ Q3. Can we only iterate via keySet(), values(), and entrySet()?
        // ✅ Yes — these are the only direct ways to iterate over a HashMap:
        // Iterate keys
        for (Integer key : map.keySet()) { }

        // Iterate values
        for (String val : map.values()) { }

        // Iterate key-value pairs
        for (Map.Entry<Integer, String> entry : map.entrySet()) { }

        // ❌ There's no method like map.get(i) — HashMap is unordered and indexless.

        /**
         * ✅ Q4. Why is return type of keySet() → Set and values() → Collection?
         * keySet() returns a Set because keys are unique in a HashMap.
         * So it fits Set<K> (no duplicates).
         *
         * values() returns a Collection, not a Set, because:
         * Values can be duplicated, and Collection allows that.
         *
         * ✅ Q5. Can we use iterator() on keySet() and values()?
         * ✅ Yes — both keySet() and values() return collections that support iterators
         *
         * Iterator<Integer> keyIterator = map.keySet().iterator();
         * while (keyIterator.hasNext()) {
         *     System.out.println("Key: " + keyIterator.next());
         * }
         *
         * Iterator<String> valIterator = map.values().iterator();
         * while (valIterator.hasNext()) {
         *     System.out.println("Value: " + valIterator.next());
         * }
         *
         * You can even remove items using iterator.remove() safely during iteration.
         *
         * ✅ BONUS: Can we use iterator() on entrySet() too?
         * ✅ Yes! Most common for iterating key + value both:
         *
         * Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
         * while (itr.hasNext()) {
         *     Map.Entry<Integer, String> entry = itr.next();
         *     System.out.println(entry.getKey() + " => " + entry.getValue());
         * }
         */


    }
}
