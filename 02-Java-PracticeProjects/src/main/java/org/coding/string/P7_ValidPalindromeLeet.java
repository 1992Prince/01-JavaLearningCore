package org.coding.string;

import java.util.Calendar;

public class P7_ValidPalindromeLeet {

    /*
    NOTE -
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.

     🔹 Step-by-Step Approach:
     Step 1: Trim the string
     Step 2: Clean the string
     Step 3: Convert the cleaned string into a new char array
     Step 4: Compare characters from both ends - Use two-pointer approach:
     Step 5: If all characters matched → return true
     */


    public static boolean isPalindrome(String s) {

        char[] charArr = s.trim().toCharArray();
        String newstr = "";

        for (int i = 0; i < charArr.length; i++) {
           if(Character.isLetterOrDigit(charArr[i])){
               newstr += String.valueOf(charArr[i]).toLowerCase();
           }
        }

        char[] newstrArr = newstr.toCharArray();
        for (int i = 0; i < newstrArr.length/2; i++) {
            if(newstrArr[i] != newstrArr[newstrArr.length-1-i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

     String s1 = "A man, a plan, a canal: Panama";
     System.out.println(isPalindrome(s1));

     System.out.println();

     String s2 = "race a car";
     System.out.println(isPalindrome(s2));

     System.out.println();

     System.out.println(isPalindrome(" "));
    }
}
