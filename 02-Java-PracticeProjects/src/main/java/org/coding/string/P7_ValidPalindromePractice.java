package org.coding.string;

public class P7_ValidPalindromePractice {

    /*
    ✅ Palindrome Strings are those that read the same forward and backward.
    e.g. madam, level, noon, deep
     */
    public static boolean checkPalindrome(String s) {

        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length/2; i++) {
            if(charArr[i] != charArr[charArr.length-1-i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("noon - " + checkPalindrome("noon"));
        System.out.println("level - " + checkPalindrome("level"));
        System.out.println("pikachu - " + checkPalindrome("pikachu"));
    }
}
