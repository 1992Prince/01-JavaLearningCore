package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P2_HashMapDemo {

    public static void main(String[] args) {

        // 🔹 6. Bulk Operations

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Red Apple");


        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map); // copy all from map to map2
        System.out.println("map2 - " + map2); // map2 - {1=Red Apple}


        map.clear(); // removes everything
        System.out.println(map); // {}

        System.out.println();

        // 🔹 7. Size, isEmpty
        System.out.println(map2.size());     // 1
        System.out.println(map2.isEmpty());  // false
        System.out.println(map.isEmpty());   // true

        System.out.println();



        // 🔹 8. Key, Value, Entry Iteration
        // we can't use iterator() method directly on map object

        map2.put(2, "Banana");



        // retrieving only all keys of map
        Set<Integer> map2Keys = map2.keySet();

        // retrieving only all values of map
        Collection<String> map2Values = map2.values();

        // retrieving key and values both - here we need to use entrySet
        Set<Map.Entry<Integer, String>> entrySetObj = map2.entrySet();

        for (Integer key : map2Keys) {
            System.out.print("Key: " + key + " , "); // Key: 1 , Key: 2 ,
        }

        System.out.println();
        System.out.println();

        for (String val : map2Values) {
            System.out.print("Value: " + val + " , "); // Value: Red Apple , Value: Banana ,
        }

        System.out.println();
        System.out.println();

        for (Map.Entry<Integer, String> entry : entrySetObj) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /**
         * 1 -> Red Apple
         * 2 -> Banana
         */

        /**
         * Since u fetched via getKeys(), getValues() and entrySet()
         * Now u can call iterator() object on all 3
         */




    }
}
