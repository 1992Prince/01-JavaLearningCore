package org.coding.string;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class P4_MostFrequentVowelAndConstant {

    /*
    Character.isLetter() u can check if chars are letters
    Character.isDigit() u can check if chars are digits
    to check char is vowel, instead of checking char == 'a' || etc.
    u can use - if("aeiou".contains(String.valueOf(c))){

    Approach -
    initialize 2 variables with 0
    initialize 2 maps one for vowels and another for constants
    convert str to arr and add all vowels to vowels map with its freq and similarly
    for constants

    We need to find max value from values and don't need key, so we can use map values
    method and use Collection.max(map.values) to find max



     */
    public static int maxFreqSum(String s) {

        int vowelMax = 0;
        int constantMax = 0;

        char[] charArr = s.toCharArray();
        Map<Character, Integer> vowels = new HashMap<>();
        Map<Character, Integer> constants = new HashMap<>();

        for(char c: charArr){
            if("aeiou".contains(String.valueOf(c))){
                vowels.put(c, vowels.getOrDefault(c,0) + 1);
            }else{
                constants.put(c, constants.getOrDefault(c,0) + 1);
            }
        }

        if(!vowels.isEmpty()){
            Collection<Integer> vowelsValues = vowels.values();
            vowelMax = Collections.max(vowelsValues);
        }

        if(!constants.isEmpty()){
            Collection<Integer> constantsValues = constants.values();
            constantMax = Collections.max(constantsValues);
        }

        return vowelMax + constantMax;
    }

    public static void main(String[] args) {

        System.out.println("maxFreqSum(\"successes\") : " + maxFreqSum("successes"));
        System.out.println();

        System.out.println("maxFreqSum(\"aeiaeia\") : " + maxFreqSum("aeiaeia"));

        
    }
}
