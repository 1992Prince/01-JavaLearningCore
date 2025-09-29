package org.coding.string;

import java.util.HashMap;
import java.util.Map;

public class P12_IsomorphicStrings {

    /*
    Approach1 - BruteForce
    -> checked edge cases first and if not matching then returning false
    -> then created a map object to keep mapping of characters of both string
    -> before putting any new key value pair in map when key is not already present in map
       check is new value should also not be present in map with diff key.
       Bcoz we can't have 2 keys mapped to same char

    -> if key is already present in map then fetch key value from map and check if it is
       equal to another string char and if not then return false bcoz
       2 chars in a string can't have multiple diff chars mapping

    -> TimeComplexity -
    This is not optimized solution bcoz -
    outer loop - O(n) and and mapObj.containsValue(t.charAt(i) is also O(n)
     containsValue() is O(n) because it iterates through all values in the map
     so overall in worst case - O(n) * O(n) = O(n²) [(due to nested effect of using containsValue() inside the loop)]
     */
    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Character> mapObj = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }
        if(s.isEmpty() && t.isEmpty()){
            return true;
        }
        if(s.length() == 1 && t.length() == 1){
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            if(mapObj.containsKey(s.charAt(i))){
                if(mapObj.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                if(mapObj.containsValue(t.charAt(i))){
                    return false;
                }
                mapObj.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

    /*
    ✅ Improved Solution (Optimized to O(n))

    🧠 Approach: Use Two HashMaps
        Map<Character, Character> sToT: Maps characters from s to t
        Map<Character, Character> tToS: Maps characters from t to s

    While traversing both strings:

        If mapping exists, verify it's consistent.
        If not, create new mappings in both directions.

        This prevents:
            One s char mapping to multiple t chars.
            One t char being mapped by multiple s chars.


    Understand below implementation later properly
     */

    public static boolean isIsomorphic2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (sToT.containsKey(cs)) {
                if (sToT.get(cs) != ct) return false;
            } else {
                if (tToS.containsKey(ct)) return false;

                sToT.put(cs, ct);
                tToS.put(ct, cs);
            }
        }

        return true;
    }


    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("badc", "baba"));
        System.out.println();

        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("ab", "aa"));
        System.out.println(isIsomorphic("abc", "abc"));
        System.out.println(isIsomorphic(" ", " "));
        System.out.println(isIsomorphic("", ""));
        System.out.println(isIsomorphic("a", "b"));
        System.out.println(isIsomorphic("abc", "de"));
        //
        //
    }
}
