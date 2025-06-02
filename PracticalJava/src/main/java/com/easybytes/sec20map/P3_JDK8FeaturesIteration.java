package com.easybytes.sec20map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P3_JDK8FeaturesIteration {

    /**
     * map.entrySet() → Returns a Set<Map.Entry<K, V>> → Inherits stream() from Collection.
     * map.keySet() → Returns a Set<K> → Also inherits stream().
     * map.values() → Returns a Collection<V> → Can be streamed directly.
     */

    public static void main(String[] args) {

        /**
         * ✅ 1. Iteration Over HashMap
         * Traditional Way
         */

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Cherry", 5);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " = " + entry.getValue() + " , ");  // Apple = 3 , Cherry = 5 , Banana = 2 ,
        }

        System.out.println();
        System.out.println();

        /**
         * Improved with JDK 8+: Using forEach and Lambda
         *
         * forEach()	defined in Iterable interface	Available to iterate over collections like Set, List, and Map.entrySet()
         */
        map.forEach((key, val) -> System.out.print(key + " = " + val + " , ")); // Apple = 3 , Cherry = 5 , Banana = 2 ,

        System.out.println();
        System.out.println();

        Set<String> keySet = map.keySet();
        keySet.forEach(key -> System.out.print(key + " = " + map.get(key) + " , ")); // Apple = 3 , Cherry = 5 , Banana = 2 ,

    }
}
