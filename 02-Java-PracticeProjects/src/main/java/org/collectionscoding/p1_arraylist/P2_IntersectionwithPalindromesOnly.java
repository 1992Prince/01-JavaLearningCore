package org.collectionscoding.p1_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2_IntersectionwithPalindromesOnly {

    /**
     * Intersection with Palindromes Only
     * Problem: Find common strings between two lists that are palindromes.
     * Example:
     * List1 = ["madam", "apple", "level", "tomato"]
     * List2 = ["level", "banana", "madam", "noon", "tomato"]
     * Output = ["madam", "level"]
     */

    static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) == str.charAt(str.length()-1-i)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        List<String> namesList1 =
                new ArrayList<>(Arrays.asList("madam", "apple", "level", "tomato"));
        List<String> namesList2 =
                new ArrayList<>(Arrays.asList("level", "banana", "madam", "noon", "tomato"));

        //APPROACH1 - First find common elements and keep it in list1 and
        //            then remove elements wch are not palindrome
        // retainAll for finding common elements and then removeIf for non palindrome

        namesList1.retainAll(namesList2);
        System.out.println(namesList1); // [madam, level, tomato]

        // removing non palindrome elements
        // so removeIf removes elements that returns true
        // isPalindrome return true and !true will become false and
        // string that are not palindrome , for them isPalindrome will return false
        // and !false will become true
        namesList1.removeIf(str -> !isPalindrome(str));
        System.out.println("namesList1 - " + namesList1); // namesList1 - [madam, level]

        System.out.println();

        /**
         * APPROACH2 -
         * instead of using retainAll, u can iterate list1 and check if each element of list1
         * is present in list2 and then add it to 3rd list.
         * Then 3rd list have only common elements
         * Then from 3rd list remove elements that are not palindrome
         */

        System.out.println();

        /**
         * APPROACH3 - VIA STREAMS
         */


        List<String> namesList3 =
                new ArrayList<>(Arrays.asList("madam", "apple", "level", "tomato"));
        List<String> namesList4 =
                new ArrayList<>(Arrays.asList("level", "banana", "madam", "noon", "tomato"));

        List<String> resultList = namesList3.stream()
                .filter(ele -> namesList4.contains(ele))
                .filter(ele -> isPalindrome(ele))
                .toList();
        System.out.println("resultList - " + resultList); // resultList - [madam, level]


    }
}
