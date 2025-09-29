package org.map;

import java.util.HashMap;
import java.util.Map;

public class P6_HashMapStreamsExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Arun");
        map.put(102, "Brijesh");
        map.put(103, "Chintu");
        map.put(104, "Divya");
        map.put(105, "Arun");


        // ✅ Stream on keySet() — print only keys
        System.out.println("Keys using stream:");
        map.keySet()
                .stream()
                .forEach(System.out::println);
        /**
         * Keys using stream:
         * 101
         * 102
         * 103
         * 104
         * 105
         */

        System.out.println();



        // ✅ Stream on values() — print only values
        System.out.println("\nValues using stream:");
        map.values()
                .stream()
                .forEach(System.out::println);
        /**
         * Values using stream:
         * Arun
         * Brijesh
         * Chintu
         * Divya
         * Arun
         */

        System.out.println();



        // ✅ Stream on entrySet() — print key-value pairs
        System.out.println("\nKey-Value pairs using stream:");
        map.entrySet()
                .stream()
                .forEach(entry ->
                        System.out.println(entry.getKey() + " => " + entry.getValue())
                );
        /**
         * Key-Value pairs using stream:
         * 101 => Arun
         * 102 => Brijesh
         * 103 => Chintu
         * 104 => Divya
         * 105 => Arun
         */
    }
}
