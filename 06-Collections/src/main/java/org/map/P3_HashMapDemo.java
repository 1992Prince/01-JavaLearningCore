package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P3_HashMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1,"Red Apple");
        map2.put(2,"Red Apple Vinegar");


        // 🔹 9. Compute Methods (Java 8+)
        map2.compute(1, (k, v) -> v + " Juice");
        System.out.println(map2); // {1=Red Apple Juice, 2=Red Apple Vinegar}


        map2.computeIfAbsent(5, k -> "New Entry");
        map2.computeIfPresent(1, (k, v) -> v.toUpperCase());

        System.out.println(map2); // {1=RED APPLE JUICE, 2=Red Apple Vinegar, 5=New Entry}

        System.out.println();



        // 🔹 10. Replace All
        map2.replaceAll((k, v) -> v + " 🍎");
        System.out.println(map2); // {1=RED APPLE JUICE 🍎, 2=Red Apple Vinegar 🍎, 5=New Entry 🍎}

        System.out.println();


        // 🔹 11. forEach (Java 8)
        map2.forEach((k, v) -> System.out.println(k + ": " + v));

        /**
         * 1: RED APPLE JUICE 🍎
         * 2: Red Apple Vinegar 🍎
         * 5: New Entry 🍎
         */





    }
}
