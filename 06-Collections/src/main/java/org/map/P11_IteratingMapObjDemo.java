package org.map;

import java.util.*;

public class P11_IteratingMapObjDemo {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("name", "John");
        map.put("city", "Mumbai");
        map.put("role", "Tester");

        // ✅ 1. Iterate using keySet() – Only Keys

        Set<String> keySet = map.keySet();

        Iterator<String> keyIterator = keySet.iterator();

        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            System.out.println("Key: " + key);
        }

        System.out.println();
        System.out.println();

        /**
         * Key: role
         * Key: city
         * Key: name
         */



        // ✅ 2. Iterate using values() – Only Values

        Collection<String> valuesCollection = map.values();

        Iterator<String> valueIterator = valuesCollection.iterator();

        while (valueIterator.hasNext()) {
            String value = valueIterator.next();
            System.out.println("Value: " + value);
        }

        System.out.println();
        System.out.println();

        /**
         * Value: Tester
         * Value: Mumbai
         * Value: John
         */


        // ✅ 3. Iterate using entrySet() – Keys and Values
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /**
         * Key: role, Value: Tester
         * Key: city, Value: Mumbai
         * Key: name, Value: John
         */




    }
}
