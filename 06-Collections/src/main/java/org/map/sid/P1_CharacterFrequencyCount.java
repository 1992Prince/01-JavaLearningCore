package org.map.sid;

import java.util.HashMap;
import java.util.Map;

public class P1_CharacterFrequencyCount {

    public static void main(String[] args) {

        // Write a program to count the frequency of characters in a string using HashMap.

        String str = "automation";
        Map<Character, Integer> frequencyMap = new HashMap<>();
        char[] charArr = str.toCharArray();

        for (char c : charArr) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(frequencyMap);
        // {a=2, t=2, u=1, i=1, m=1, n=1, o=2}



    }
}
