package org.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 🧠 What is HashMap?
 * ✅ HashMap<K, V> is a part of java.util, used to store key-value pairs.
 * ✅ Keys are unique, but values can be duplicated.
 * ✅ Not ordered, and allows null as key/value (one null key).
 */
public class P0_HashMapDemo {

    public static void main(String[] args) {

        // 🔹 1. Create and Add Entries
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(2, "Blueberry"); // 👈 Updates key 2's value

        System.out.println(map); // {1=Apple, 2=Blueberry, 3=Cherry}
        // 📝 put(K, V) adds key-value. If key exists → replaces value.
        System.out.println();

        // 🔹 2. Retrieve Values
        System.out.println(map.get(1));       // Apple
        System.out.println(map.getOrDefault(5, "Default")); // Default
        // 📝 get(key) → returns value or null.
        // 📝 getOrDefault(key, defaultVal) → avoids null checks.
        System.out.println();

        // 🔹 3. Check Presence
        System.out.println(map.containsKey(2));   // true
        System.out.println(map.containsValue("Apple")); // true
        // 📝 Use to avoid NullPointerException. ✅

        System.out.println();
        System.out.println("HashMap obj : " + map); // HashMap obj : {1=Apple, 2=Blueberry, 3=Cherry}
        System.out.println();

        // 🔹 4. Remove Entries
        map.remove(3);
        System.out.println(map); // {1=Apple, 2=Blueberry}

        map.remove(2, "WrongValue"); // won't remove
        map.remove(2, "Blueberry");  // removes only if value matches
        System.out.println("Map after deletion operation : " + map); // Map after deletion operation : {1=Apple}

        // 📝 remove(key) or remove(key, value) (conditional delete)
        System.out.println();

        // 🔹 5. Replace Values
        map.replace(1, "Green Apple");             // replaces if key exists
        map.replace(5, "Not Exist");               // does nothing
        System.out.println("map.replace(1,Green Apple) : " + map);
        // map.replace(1,Green Apple) : {1=Green Apple}
        map.replace(1, "Green Apple", "Red Apple"); // replaces only if old value matches

        System.out.println("map.replace : " + map); // map.replace : {1=Red Apple}
        // 📝 Safe replacement with or without old value check
        System.out.println();


    }
}
