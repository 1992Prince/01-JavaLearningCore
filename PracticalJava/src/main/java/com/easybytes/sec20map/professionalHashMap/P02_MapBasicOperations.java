package com.easybytes.sec20map.professionalHashMap;

import java.util.HashMap;
import java.util.Map;

public class P02_MapBasicOperations {

    public static void main(String[] args) {

        // 1. Declaring a HashMap
        Map<String, Integer> myMap = new HashMap<>();

        // 2. Putting values in HashMap
        myMap.put("key1", 1);
        myMap.put("key2", 2);
        myMap.put("key3", 3);
        System.out.println("Initial HashMap: " + myMap);  // Initial HashMap: {key1=1, key2=2, key3=3}

        // Updating an existing key
        int oldValue = myMap.put("key2", 20);
        System.out.println("Updated HashMap: " + myMap + " (Old value for 'key2': " + oldValue + ")"); // Updated HashMap: {key1=1, key2=20, key3=3} (Old value for 'key2': 2)

        // 3. Getting values from HashMap
        System.out.println("Value for 'key1': " + myMap.get("key1"));  // Value for 'key1': 1
        System.out.println("Value for 'nonexistentKey': " + myMap.get("nonexistentKey")); // Value for 'nonexistentKey': null

        // 4. Check whether the Key is in the Map
        System.out.println("Contains key 'key1': " + myMap.containsKey("key1"));  // Contains key 'key1': true

        // 5. Check whether the Value is in the Map
        System.out.println("Contains value 3: " + myMap.containsValue(3));       // Contains value 3: true

        // 6. Using Default Methods of Map from Java 8

        // Using getOrDefault
        System.out.println("Value for 'key4' (using getOrDefault): " + myMap.getOrDefault("key4", 100)); // Value for 'key4' (using getOrDefault): 100

        // Using forEach
        System.out.println("Printing all key-value pairs using forEach:");
        myMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // Using replaceAll
        myMap.replaceAll((key, value) -> value + 10);
        System.out.println("HashMap after replaceAll: " + myMap);  // HashMap after replaceAll: {key1=11, key2=30, key3=13}

        // Using putIfAbsent
        myMap.putIfAbsent("key4", 40);
        System.out.println("HashMap after putIfAbsent: " + myMap); // HashMap after putIfAbsent: {key1=11, key2=30, key3=13, key4=40}

        // Using remove
        myMap.remove("key4", 40); // Remove only if the key-value pair matches
        System.out.println("HashMap after remove: " + myMap);  // HashMap after remove: {key1=11, key2=30, key3=13}

        // Using replace
        myMap.replace("key3", 33);
        System.out.println("HashMap after replace: " + myMap); // HashMap after replace: {key1=11, key2=30, key3=33}

        // merging two map objs
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Three", 3);

        Map<String, Integer> otherNumbers = new HashMap<>();
        otherNumbers.put("Two", 2);
        otherNumbers.put("Three", 4);

        // Using putAll to merge maps
        numbers.putAll(otherNumbers);
        System.out.println("After putAll: " + numbers); // {One=1, Two=2, Three=4}

        // clear the map
        otherNumbers.clear();
        System.out.println("After clear: " + otherNumbers);  // After clear: {}

        /**
         * Below ones - go through it later
         */

        // Using computeIfAbsent
        myMap.computeIfAbsent("key5", k -> 50);
        System.out.println("HashMap after computeIfAbsent: " + myMap);

        // Using computeIfPresent
        myMap.computeIfPresent("key3", (k, v) -> v + 5);
        System.out.println("HashMap after computeIfPresent: " + myMap);

        // Using compute
        myMap.compute("key2", (k, v) -> v * 2);
        System.out.println("HashMap after compute: " + myMap);

        // Using merge
        myMap.merge("key6", 60, (k, v) -> v + 10); // Adds if key not present
        System.out.println("HashMap after merge (adding): " + myMap);
        myMap.merge("key3", 100, (k, v) -> null); // Removes if new value is null
        System.out.println("HashMap after merge (removing): " + myMap);

    }
}
