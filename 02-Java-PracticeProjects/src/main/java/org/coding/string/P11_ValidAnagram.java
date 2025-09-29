package org.coding.string;

import java.util.Collection;
import java.util.HashMap;

public class P11_ValidAnagram {

    /*
    Aprroach 1 - Brute Force
    - Create 2 hashmap objects
    - add each character of s and its frequency in map1 and similarly for t in map2
    - then compare map1 with map2 objects using .equals() method
    - in HashMap .equals() method is overridden to compare 2 hashmap objects
    - see previous example for HashMap comparison
     */
    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }


        return map1.equals(map2);
    }

    /*
    Approach 2 - ✅ Optimized One Map Approach
    🧠 Key Idea:
    Use one map to store character frequencies from the first string
    While traversing the second string, decrease the count for each character.
    In the end, all values in the map should be zero if the strings are anagrams.
     */

    public static boolean isAnagram2(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }

        // decrease each value of char in map1 and if not found return false
        for (int i = 0; i < t.length(); i++) {
            if(map1.containsKey(t.charAt(i))){
                map1.put(t.charAt(i), map1.get(t.charAt(i)) - 1);
            }else{
                return false;
            }
        }

        // fetch all values of map1 and check if any value is != 0 then return false
        Collection<Integer> values = map1.values();
        /*for(Integer num: values){
            if(num != 0){
                return false;
            }
        }*/
        // lets use streams
        // 🧠 Explanation:
        //map1.values() → gets all the values from the map.
        //.stream() → converts them into a stream.
        //.allMatch(val -> val == 0) → returns true only if every value is 0.

        return map1.values().stream().allMatch(val -> val == 0);
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));

        System.out.println();

        System.out.println(isAnagram2("anagram", "nagaram"));
        System.out.println(isAnagram2("rat", "car"));
    }
}
