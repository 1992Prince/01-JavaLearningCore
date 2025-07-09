package org.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class P7_HashMapStreamsExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Arun");
        map.put(102, "Brijesh");
        map.put(103, "Chintu");
        map.put(104, "Divya");
        map.put(105, "Arun");

        // ✅ Filter example: Get keys whose value starts with "A"
        System.out.println("\nKeys where value starts with A:");
        List<Integer> list1 = map.entrySet()
                .stream()
                .filter(e -> e.getValue().startsWith("A"))
                .map(e -> e.getKey()) // can be replaced with Method Ref - Map.Entry::getKey
                .toList(); // or .forEach(System.out::println);
        System.out.println("list1 - " + list1);

        /**
         * Keys where value starts with A:
         * list1 - [101, 105]
         */

        System.out.println();

        // ✅ Iterator example on entrySet
        System.out.println("\nUsing iterator on entrySet:");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        /**
         * Using iterator on entrySet:
         * 101 => Arun
         * 102 => Brijesh
         * 103 => Chintu
         * 104 => Divya
         * 105 => Arun
         */

    }
}
