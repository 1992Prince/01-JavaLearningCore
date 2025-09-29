package org.map;

import java.util.HashMap;
import java.util.Map;

public class P12_MapComparison {

    public static void main(String[] args) {

        /**
         * ✅ 1. Using map1.equals(map2)
         * 🔍 This checks:
         * Same size
         * Same keys
         * Same values for each key
         * Order doesn’t matter (for HashMap)
         */

        Map<String, String> map1 = new HashMap<>();
        map1.put("name", "John");
        map1.put("city", "Mumbai");

        Map<String, String> map2 = new HashMap<>();
        map2.put("city", "Mumbai");
        map2.put("name", "John");

        System.out.println(map1.equals(map2));  // ✅ true

        System.out.println();

        // ❌ Not Equal Example:

        map2.put("name", "Jane");
        System.out.println(map1.equals(map2));  // ❌ false


    }
}
