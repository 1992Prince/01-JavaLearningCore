package org.coding.twosum$slidingwindow;

public class P4_IsSubsequence {

    /**
     * ✅ Approach to Check if s is a Subsequence of t (Two Pointer Technique)
     * - Handle Edge Case:
     *  If s is an empty string, return true
     *
     * - Check Length Constraint:
     *  If s is longer than t, return false
     *
     * - Initialize Two Pointers:
     *   Start with two pointers: one for s and one for t, both pointing to the
     *   beginning of their respective strings.
     *
     * - Character Matching - check if both string pointers are matching then increment both pointer
     *   else increment t string pointer
     *
     * - after loop return if s pointer is equivalent to s.length()
     *
     * Time Complexity = O(n) since we are iterating only once
     * Extra Space Complexity = O(1) [We only use a few integer pointers — no extra data structures.]
     */
    public static boolean isSubsequence(String s, String t) {

        if(s.length() == 0) return true; // 's.length() == 0' can be replaced with 's.isEmpty()'
        if(s.length() > t.length()) return false;

        int left = 0;
        int right = 0;

        while(left < s.length() && right < t.length()){
            if(s.charAt(left) == t.charAt(right)){
                left++;
                right++;
            } else { // covers - s.charAt(left) != t.charAt(right)
                right++;
            }
        }

       return left == s.length();

    }

    public static void main(String[] args) {

        System.out.println(isSubsequence("abc", "ahbgdc")); // true
        System.out.println(isSubsequence("axc", "ahbgdc")); // false
        System.out.println(isSubsequence("", "ahbgdc"));    // true
        System.out.println(isSubsequence("ahbgdc", ""));    // false
        System.out.println(isSubsequence(" ", "ahbgdc"));   // false
        System.out.println(isSubsequence("", ""));          // true
        System.out.println(isSubsequence(" ", " "));        // true
        System.out.println(isSubsequence("abc", "abc"));    // true
        System.out.println(isSubsequence("abc", "acb"));    // false
        System.out.println(isSubsequence("aaa", "aa"));     // false


    }
}
