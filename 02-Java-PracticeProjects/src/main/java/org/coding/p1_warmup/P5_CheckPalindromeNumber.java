package org.coding.p1_warmup;

public class P5_CheckPalindromeNumber {

    /**
     * Given an integer x, return true if x is a palindrome, and false otherwise.
     *
     * Example 1:
     *
     * Input: x = 121
     * Output: true
     * Explanation: 121 reads as 121 from left to right and from right to left.
     *
     * Example 2:
     *
     * Input: x = -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
     * Therefore it is not a palindrome.
     *
     * Example 3:
     *
     * Input: x = 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     */

    public static boolean isPalindrome(int x) {

        if (x < 0) return false; // negatives not palindrome
        int orignial = x, reversed = 0;

        while(x != 0){
            int lastDigit = x % 10;
            reversed = (reversed * 10) + lastDigit;
            x = x / 10;
        }
        return orignial == reversed;
    }

    public static void main(String[] args) {

        System.out.println("isPalindrome(121): " + isPalindrome(121));   // true
        System.out.println("isPalindrome(-121): " + isPalindrome(-121)); // false
        System.out.println("isPalindrome(10): " + isPalindrome(10));     // false
        System.out.println("isPalindrome(1): " + isPalindrome(1));       // true
    }
}
