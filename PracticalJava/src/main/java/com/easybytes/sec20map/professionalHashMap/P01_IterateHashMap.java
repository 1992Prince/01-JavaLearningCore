// Java program to demonstrate various ways of iterating a HashMap
package com.easybytes.sec20map.professionalHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P01_IterateHashMap {

    /**
     * Demonstrates different ways to iterate over a Map<Integer, Integer> and calculate the sum of the keys and values.
     * 1) Enhanced For Loop with Map.Entry
     * 2) Iterator with Map.Entry
     * 3) Enhanced For Loop with keySet
     * 4) Java 8 Map.forEach
     * 5) Java 8 Streams with forEach
     */

    public static void main(String[] args) {

        // Initialize a sample HashMap
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);

        System.out.println("Initial Map: " + map);
        System.out.println("=".repeat(50));

        // 1. Enhanced For Loop with Map.Entry
        System.out.println("1. Enhanced For Loop with Map.Entry");
        int sum1 = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            sum1 += entry.getKey() + entry.getValue();
        }
        System.out.println("Sum using Enhanced For Loop: " + sum1);
        System.out.println("-".repeat(50));


        // 2. Iterator with Map.Entry
        System.out.println("2. Iterator with Map.Entry");
        int sum2 = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
            sum2 += entry.getKey() + entry.getValue();
        }
        System.out.println("Sum using Iterator: " + sum2);
        System.out.println("-".repeat(50));


        // 3. Enhanced For Loop with keySet
        System.out.println("3. Enhanced For Loop with keySet");
        int sum3 = 0;
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
            sum3 += key + map.get(key);
        }
        System.out.println("Sum using keySet: " + sum3);
        System.out.println("-".repeat(50));


        // 4. Map.forEach (Java 8+)
        System.out.println("4. Map.forEach (Java 8+)");
        int[] sum4 = {0};

        // map.forEach((key, val) -> System.out.println(key + " : " + val));
        // map.forEach((key,value) -> sum4[0] += key + value);


        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
            sum4[0] += key + value;
        });
        System.out.println("Sum using Map.forEach: " + sum4[0]);
        System.out.println("-".repeat(50));


        // 5. Stream.forEach (Java 8+)
        System.out.println("5. Stream.forEach (Java 8+)");
        int[] sum5 = {0};
        map.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            sum5[0] += entry.getKey() + entry.getValue();
        });
        System.out.println("Sum using Stream.forEach: " + sum5[0]);
        System.out.println("=".repeat(50));
    }
}
