package org.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class P15_SidAssmnt_HashMapKeySort {


    public static void main(String[] args) {



        // Create and populate HashMap and sort it via key in descending order
        // Descending Order by Keys
        // To sort keys in descending order, modify the comparator:
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Banana", 3);
        unsortedMap.put("Apple", 5);
        unsortedMap.put("Orange", 2);
        unsortedMap.put("Mango", 8);

        Map<String, Integer> sortedMap = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal, LinkedHashMap::new));

        // Display results
        sortedMap.forEach((key, value) ->
                System.out.println(key + " : " + value));

        /**
         * Orange : 2
         * Mango : 8
         * Banana : 3
         * Apple : 5
         */

        System.out.println();
        System.out.println();

        // sort hashmap keys in ascending order for integers
        Map<Integer, Integer> unsortedMap2 = new HashMap<>();
        unsortedMap2.put(10,11);
        unsortedMap2.put(100,11);
        unsortedMap2.put(19,11);
        unsortedMap2.put(1,11);


        Map<Integer, Integer> sortedMap2 = unsortedMap2.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                        .sorted(Map.Entry.comparingByKey())
                                .collect(Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (oldVal, newVal) -> oldVal,
                                        LinkedHashMap::new));
        // Display results
        sortedMap2.forEach((key, value) ->
                System.out.println(key + " : " + value));

        /**
         * 1 : 11
         * 10 : 11
         * 19 : 11
         * 100 : 11
         */

        System.out.println();
        System.out.println();

        // sort hashmap keys in descending order for integers

        Map<Integer, Integer> unsortedMap3 = new HashMap<>();
        unsortedMap3.put(10,11);
        unsortedMap3.put(100,11);
        unsortedMap3.put(19,11);
        unsortedMap3.put(1,11);

        Map<Integer, Integer> sortedMap3 = unsortedMap3.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByKey().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal, LinkedHashMap::new));

        // Display results
        sortedMap3.forEach((key, value) ->
                System.out.println(key + " : " + value));

        /**
         * 100 : 11
         * 19 : 11
         * 10 : 11
         * 1 : 11
         */


    }
}
