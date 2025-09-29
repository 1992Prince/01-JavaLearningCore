package org.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P9_TreeMapDemo {

    /**
     * Java TreeMap class is a red-black tree based implementation &
     * stores key-value pairs in a sorted order based on the keys.
     *
     * This means that when we add key-value pairs to a TreeMap,
     * they are automatically sorted by their keys.
     *
     * TreeMap cannot contain any null key & maintains the ascending order based on key.
     * HashMap does not maintain any order.
     * So, if you need to access the keys in a sorted order, TreeMap is a better choice.
     *
     */
    public static void main(String[] args) {

        Map<Integer, String> numbers = new TreeMap<>();
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
         * {3=Three, 12=Twelve, 19=Nineteen, 23=Twenty Three, 42=Forty two, 48=Forty eight, 76=Seventy six}
         *
         * 3 -> Three
         * 12 -> Twelve
         * 19 -> Nineteen
         * 23 -> Twenty Three
         * 42 -> Forty two
         * 48 -> Forty eight
         * 76 -> Seventy six
         */

        System.out.println();
        System.out.println();

        /**
         * Strings will be stored in alphabetically order i.e.
         * lexicographically
         */
        Map<String,Integer> strings = new TreeMap<>();
        strings.put("One", 1);
        strings.put("Two",2);
        strings.put("Four",4);
        strings.put("Six",6);
        strings.put("Apple", 12);
        strings.put("Banana",20);

        System.out.println(strings);

        // {Apple=12, Banana=20, Four=4, One=1, Six=6, Two=2}



    }
}
