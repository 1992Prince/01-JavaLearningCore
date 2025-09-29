package org.coding.string;

import java.util.HashMap;
import java.util.Map;

public class P10_CompareTwoHashMapsPractice {

    /*
    This will be input for next question

    How to compare two hashmap objects-

    To compare two HashMaps in Java, you typically want to check whether:
        Both maps have the same keys and values.
        The order doesn't matter (since HashMap is unordered).

     ✅ Option 1: Simple .equals() Method
     🔍 Option 2: Manual Comparison (e.g., for custom logic)
        If you need to compare only keys, ignore case, or compare values loosely, use:

        boolean areEqual = map1.size() == map2.size();

        for (String key : map1.keySet()) {
            if (!map2.containsKey(key) || !map1.get(key).equals(map2.get(key))) {
                areEqual = false;
                break;
            }
        }
     */
    public static void main(String[] args) {

        // ✅ Option 1: Simple .equals() Method
        //Java’s HashMap class overrides equals(), so you can directly use:

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        map1.put("a", 1);
        map1.put("b", 2);

        map2.put("b", 2);
        map2.put("a", 1);

        System.out.println(map1.equals(map2)); // ✅ true
        // .equals() compares both keys and values. Order doesn't matter.
        // ❗ Important Notes:
        //It compares:
        //      Size
        //      Each key and its corresponding value in both maps.
        //It returns false if:
        //      Keys are missing or mismatched.
        //      Values differ for any key.


    }
}
