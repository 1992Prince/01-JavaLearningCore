package com.easybytes.sec20map.professionalHashMap;

import java.util.HashMap;
import java.util.Map;

public class P03_MapIterationDemo {

    public static void main(String[] args) {

        // Creating the map
        Map<String, Integer> repMap = new HashMap<>();
        repMap.put("Jon Skeet", 927_654);
        repMap.put("BalusC", 708_826);
        repMap.put("Darin Dimitrov", 715_567);

        // Iterating through map keys
        System.out.println("Iterating through map keys:");
        for (String key : repMap.keySet()) {
            System.out.println(key);
        }
        System.out.println();

        // Iterating through map values
        System.out.println("Iterating through map values:");
        for (Integer value : repMap.values()) {
            System.out.println(value);
        }
        System.out.println();

        // Iterating through keys and values together
        System.out.println("Iterating through keys and values together:");
        for (Map.Entry<String, Integer> entry : repMap.entrySet()) {
            System.out.printf("%s = %d\n", entry.getKey(), entry.getValue());
        }
    }
}
