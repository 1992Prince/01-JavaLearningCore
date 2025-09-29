package org.coding.string;

import java.util.*;

public class P13_GroupAnagrams {

    /*
    Approach1 -
    sort all the words and all words will come in same order
    Strings are immutable and so we can't sort them inplace
    so to sort it
    - Convert the string to a char array.
    - Sort that array using Arrays.sort().
    - Convert it back to a string if needed.
     */
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            // here add actual word into list
            map.get(key).add(strs[i]);
        }

        // how map key is actually arraylist objects
        // lets add all these sublist into one big list

        List<List<String>> list = new ArrayList<>();

        Collection<ArrayList<String>> sublist = map.values();
        sublist.stream().forEach(sublst -> list.add(sublst));

        System.out.println(list);

        return list;
    }

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs);
    }
}
