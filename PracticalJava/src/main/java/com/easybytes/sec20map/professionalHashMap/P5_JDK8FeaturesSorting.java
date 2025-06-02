package com.easybytes.sec20map.professionalHashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P5_JDK8FeaturesSorting {

    public static void main(String[] args) {

        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 5);
        fruitMap.put("Banana", 2);
        fruitMap.put("Cherry", 7);
        fruitMap.put("Date", 4);

       // Sorting by Key Using Streams:
        fruitMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));

        /**
         * Apple = 5
         * Banana = 2
         * Cherry = 7
         * Date = 4
         */

        System.out.println();
        System.out.println();

        // Sorting by Value Using Streams:
        fruitMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));

        /**
         * Banana = 2
         * Date = 4
         * Apple = 5
         * Cherry = 7
         */

        System.out.println();
        System.out.println();

        /**
         * ✅ 3. Filtering Entries
         * Get Entries with Value Greater Than 2:
         */

        fruitMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 2)
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));

        /**
         * Apple = 5
         * Cherry = 7
         * Date = 4
         */

        System.out.println();
        System.out.println();

        /**
         * ✅ 4. Transform Values
         * Update All Values (e.g., Multiply by 2):
         * replaceAll - Replaces each entry's value with the result of invoking the given function on that entry
         */

        fruitMap.replaceAll((key, value) -> value * 2);

        System.out.println();
        System.out.println();

        /**
         * ✅ 6. Get Default Value for Missing Keys
         * Using getOrDefault:
         */

        int mangoVal = fruitMap.getOrDefault("Mango", 0);
        int appleVal = fruitMap.getOrDefault("Apple", 0);
        System.out.println("Mango Count: " + mangoVal + " and Apple count: " + appleVal); // Mango Count: 0 and Apple count: 10

        System.out.println();
        System.out.println();

        /**
         * ✅ 7. Remove Entries Conditionally
         * Remove Entry if Key Equals "Apple" and Value Equals 8:
         */
        fruitMap.remove("Apple", 10);

        System.out.println();
        System.out.println();

        /**
         * ✅ 8. Convert HashMap to List of Keys/Values
         * Convert Keys to List:
         */

        // List<String> keys = map.keySet().stream().collect(Collectors.toList());
        List<String> keys = fruitMap.keySet().stream().toList();

        // Convert Values to List:
        // List<Integer> values = fruitMap.values().stream().collect(Collectors.toList());
        List<Integer> values = fruitMap.values().stream().toList();

        System.out.println("Keys: " + keys);     // Keys: [Cherry, Date, Banana]
        System.out.println("Values: " + values); // Values: [14, 8, 4]



    }
}
