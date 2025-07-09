package org.map;

import java.util.HashMap;
import java.util.Map;

public class P5_DoubtsExamples {

    public static void main(String[] args) {

        /**
         * What are compute methods in HashMap?
         *
         * ✅ Purpose of compute methods in HashMap
         * They help you:
         *      - Add a value if absent
         *      - Update a value if present
         *      - Add/update in one go — without manual key checks
         *
         * 🔧 Available compute methods:
         * | Method               | Purpose                                     |
         * | -------------------- | ------------------------------------------- |
         * | `compute()`          | Recompute value for a key (present or not)  |
         * | `computeIfAbsent()`  | Compute and add value only if key is absent |
         * | `computeIfPresent()` | Update value only if key exists             |
         */

        // ✅ 1. compute(key, remappingFunction)
        // Updates (or adds) value regardless of key’s presence.

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");

        map.compute(1, (k, v) -> v + "X"); // 1 => AX
        map.compute(2, (k, v) -> "New");   // 2 => New (v is null)

        System.out.println("compute() - " + map); // compute() - {1=AX, 2=New}

        System.out.println();


        map.put(3,null);
        System.out.println("map with null : " + map); // map with null : {1=AX, 2=New, 3=null}

        // ✅ 2. computeIfAbsent(key, mappingFunction)
        // Only adds value if key is NOT present or its value is null.

        map.computeIfAbsent(4, k -> "Added"); // 4 => Added
        map.computeIfAbsent(1, k -> "Ignored"); // ignored, because 1 is present
        map.computeIfAbsent(3, k -> "Removed null"); // will update key 3 value with Removed null

        System.out.println("computeIfAbsent : " + map);
        // computeIfAbsent : {1=AX, 2=New, 3=Removed null, 4=Added}

        System.out.println();

        // ✅ 3. computeIfPresent(key, remappingFunction)
        // Only updates value if key is already present.

        map.computeIfPresent(1, (k, v) -> v + "-Updated"); // 1 => AX-Updated
        map.computeIfPresent(5, (k, v) -> "Ignored");      // ignored (key 4 not present)

        System.out.println("computeIfPresent : " + map);
        // computeIfPresent : {1=AX-Updated, 2=New, 3=Removed null, 4=Added}

        // 💡 Avoids null problems, clean update when key is known.

        /**
         * ⚠️ Why use computeX methods?
         *
         * Without compute:
         * if (map.containsKey(key)) {
         *     map.put(key, map.get(key) + "x");
         * } else {
         *     map.put(key, "NewVal");
         * }
         *
         * With compute:
         * map.compute(key, (k, v) -> (v == null) ? "NewVal" : v + "x");
         * ✅ Shorter
         * ✅ Null-safe
         * ✅ Thread-friendly (for ConcurrentHashMap)
         */




    }
}
