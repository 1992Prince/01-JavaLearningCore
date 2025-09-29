package org.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class P16_SidAssmnt_HashMapValueSort {


    public static void main(String[] args) {

        /**
         * Sorting HashMap by Values
         * Basic Example - Ascending Order
         * Here's how to sort a HashMap by values:
         */

        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Math", 98);
        unsortedMap.put("Data Structure", 85);
        unsortedMap.put("Database", 91);
        unsortedMap.put("Java", 95);
        unsortedMap.put("Operating System", 79);

        // Sort by values using Stream API
        Map<String, Integer> sortedByValue = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        sortedByValue.forEach((key, value) ->
                System.out.println(key + " : " + value));


        /**
         * Operating System : 79
         * Data Structure : 85
         * Database : 91
         * Java : 95
         * Math : 98
         */

        System.out.println();
        System.out.println();

        Map<String, Integer> unsortedMap2 = new HashMap<>();
        unsortedMap2.put("Math", 98);
        unsortedMap2.put("Data Structure", 85);
        unsortedMap2.put("Database", 91);
        unsortedMap2.put("Java", 95);
        unsortedMap2.put("Operating System", 79);

        Map<String, Integer> sortedMap2 = unsortedMap2.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        System.out.println(sortedMap2);

        // {Math=98, Java=95, Database=91, Data Structure=85, Operating System=79}

        /**
         * Key Points to Remember
         *
         * Why LinkedHashMap?
         *      Regular HashMap doesn't maintain insertion order, so we use LinkedHashMap to preserve the sorted order.
         *
         * Method References:
         *      Map.Entry::getKey and Map.Entry::getValue are method references that extract keys and values from entries.
         *
         * Merge Function:
         *      The (e1, e2) -> e1 parameter handles duplicate keys (though HashMap keys are unique by definition).
         *
         * Stream Operations: Remember that streams are immutable - they don't modify the original HashMap.
         *
         *
         * Common Beginner Mistakes
         *
         *      Forgetting LinkedHashMap: Using HashMap in collect() will lose the sorted order
         *      Not handling null values: Ensure your HashMap doesn't contain null values when sorting
         *      Confusing comparingByKey() and comparingByValue(): Double-check which method you're using
         *      
         *
         * Practice Exercises
         * Try these exercises to reinforce your learning:
         *
         * Create a HashMap with employee names and salaries, then sort by salary (ascending)
         * Sort a HashMap of country names and populations by country name
         * Create a HashMap with product names and prices, sort by price (descending)
         */
    }
}
