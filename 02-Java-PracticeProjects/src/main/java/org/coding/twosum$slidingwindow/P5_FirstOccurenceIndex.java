package org.coding.twosum$slidingwindow;

public class P5_FirstOccurenceIndex {

    /*
    Approach1 -
    EDGE CASES -
        if haystack length is < needle length return -1
        if needle length is 0 or it is empty return -1

    Itearte till haystack length and for each index get its substring
    and check if that substring is startingwith needle.
    If yes return index
    Time Complexity = O(n)
    Extra Space Complexity = O(1)
     */
    public static int strStr(String haystack, String needle) {

        // edge case - if haystack length is < needle length return -1
        if (haystack.length() < needle.length()) return -1;

        // edge case - if needle length is 0 then return -1
        if (needle.length() == 0) return -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.substring(i).startsWith(needle)) {
                return i;
            }
        }

        return -1;
    }



    public static void main(String[] args) {

//        System.out.println(strStr("sadbutsad", "sad"));  // 0
//        System.out.println(strStr("leetcode", "leeto")); // -1
//        System.out.println(strStr("hello", "ll"));       // 2
//        System.out.println(strStr("abc", "bcde"));       // -1
//        System.out.println(strStr("abc", ""));           // -1
//        System.out.println(strStr("abc", "bc"));         // 1

        System.out.println();


    }
}
