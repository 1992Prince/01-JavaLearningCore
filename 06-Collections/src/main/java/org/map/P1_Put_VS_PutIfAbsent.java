package org.map;

import java.util.HashMap;
import java.util.Map;

public class P1_Put_VS_PutIfAbsent {

    public static void main(String[] args) {

        /**
         * ✅ What is putIfAbsent() in Java?
         *
         * ➤ putIfAbsent(K key, V value)
         *      Adds key-value only if the key is not already present.
         *      If key is already present, does nothing — keeps the old value.
         *
         * Returns:
         *      Existing value if key was already present
         *      null if key was absent and added
         */

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.putIfAbsent(1, "B"); // Won't change, since 1 is already present

        map.putIfAbsent(2, "C"); // Adds 2 => "C"

        System.out.println(map); // Output: {1=A, 2=C}

        /**
         * ⚔️ put() vs putIfAbsent()
         * | Feature                     | `put(key, value)`    | `putIfAbsent(key, value)`       |
         * | --------------------------- | -------------------- | ------------------------------- |
         * | Adds new key                | ✅ Yes                | ✅ Yes                           |
         * | Overwrites if key exists    | ✅ Yes (force update) | ❌ No (preserves existing value) |
         * | Return value                | Old value or null    | Existing value or null          |
         * | Safe for conditional insert | ❌ No                 | ✅ Yes                           |
         */

    }
}
