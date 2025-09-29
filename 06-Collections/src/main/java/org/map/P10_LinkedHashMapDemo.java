package org.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class P10_LinkedHashMapDemo {

    /**
     * LinkedHashMap clss is child class of HashMap
     * All properties of HAshMap are same except one that is
     * LinkedHashMap preserves insertion order of elements and HashMap don't
     */
    public static void main(String[] args) {

        Map<Integer, String> numbers = new LinkedHashMap<>();
        numbers.put(23,"Twenty Three");
        numbers.put(12, "Twelve" );
        numbers.put(42, "Forty two" );
        numbers.put(3, "Three" );
        numbers.put(19, "Nineteen" );
        numbers.put(48, "Forty eight");
        numbers.put(76, "Seventy six");

        System.out.println(numbers);
        System.out.println();

        for(Map.Entry<Integer, String> entry: numbers.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /**
         * {23=Twenty Three, 12=Twelve, 42=Forty two, 3=Three, 19=Nineteen, 48=Forty eight, 76=Seventy six}
         *
         * 23 -> Twenty Three
         * 12 -> Twelve
         * 42 -> Forty two
         * 3 -> Three
         * 19 -> Nineteen
         * 48 -> Forty eight
         * 76 -> Seventy six
         */

    }
}
