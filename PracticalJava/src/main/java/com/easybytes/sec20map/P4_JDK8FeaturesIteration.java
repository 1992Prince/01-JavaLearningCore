package com.easybytes.sec20map;

import java.util.HashMap;
import java.util.Map;

public class P4_JDK8FeaturesIteration {

    /**
     * map.entrySet() → Returns a Set<Map.Entry<K, V>> → Inherits stream() from Collection.
     * map.keySet() → Returns a Set<K> → Also inherits stream().
     * map.values() → Returns a Collection<V> → Can be streamed directly.
     */

    public static void main(String[] args) {

        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 5);
        fruitMap.put("Banana", 2);
        fruitMap.put("Cherry", 7);
        fruitMap.put("Date", 4);

        // 1. Stream on entrySet (Key-Value Pairs)
        System.out.println("Stream on entrySet:");
        fruitMap.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        /**
         * Stream on entrySet:
         * Apple -> 5
         * Cherry -> 7
         * Date -> 4
         * Banana -> 2
         */

        System.out.println();
        System.out.println();

        // 2. Stream on keySet (Only Keys)
        System.out.println("\nStream on keySet:");
        fruitMap.keySet().stream()
                .forEach(key -> System.out.println("Key: " + key + " value: " + fruitMap.get(key)));

        /**
         * Stream on keySet:
         * Key: Apple value: 5
         * Key: Cherry value: 7
         * Key: Date value: 4
         * Key: Banana value: 2
         */

        System.out.println();
        System.out.println();

        // 3. Stream on values (Only Values)
        System.out.println("\nStream on values:");
        fruitMap.values().stream()
                .forEach(value -> System.out.println("Value: " + value));
        /**
         * Stream on values:
         * Value: 5
         * Value: 7
         * Value: 4
         * Value: 2
         */

        System.out.println();
        System.out.println();

        // 4. Filtering Entries where value > 3
        fruitMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 3)
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        /**
         * Apple -> 5
         * Cherry -> 7
         * Date -> 4
         */

        System.out.println();
        System.out.println();

        // 5. Sum of all values using stream
        int sum = fruitMap.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("\nSum of all fruit counts: " + sum); // Sum of all fruit counts: 18

    }
}
