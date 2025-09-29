package org.coding.string;

public class P6_ReverseString2Leet {

    /*
    We need to convert string to charArr bcoz ,strings are immutable

    🧠 Key Concepts Required:
        Before jumping into the code, you must know:

        How to reverse a character array using Two-Pointer Approach.

        How to avoid ArrayIndexOutOfBoundsException by using:
        Math.min(i + k - 1, arr.length - 1) as the end boundary.

        🪜 Step-by-Step Approach:
        🔁 1. Convert String to Char Array:
        🔂 2. Iterate over the array in chunks of 2k:
        🎯 3. Set Start and End Pointers for Reversal: [end is the last index to reverse]
               int end = Math.min(i + k - 1, charArr.length - 1);
        🔁 4. Reverse Using Two Pointers:

        🔥 So General Rule:
            You want to reverse k elements starting from index x
            Start index = x
            End index = x + k - 1 ✅

            Isiliye -1 lagana zaroori hai — because arrays are 0-indexed, aur agar tu k elements reverse kar raha hai, to end index x + k - 1 hi hoga.


     */
    public static String reverseStr(String s, int k) {

        char[] charArr = s.toCharArray();

        int n = k;
        // write loop so that i should jump to 2k in every iteration
        for (int i = 0; i < charArr.length; i = i + (2 * k)) {

            int start = i;
            int end = Math.min(i + k - 1, charArr.length - 1);
            while(start < end){
                char temp = charArr[start];
                charArr[start] = charArr[end];
                charArr[end] = temp;
                start++;
                end--;
            }
        }

        return new String(charArr);
    }

    public static void main(String[] args) {

        reverseStr("abcdefgh", 3);
    }
}
