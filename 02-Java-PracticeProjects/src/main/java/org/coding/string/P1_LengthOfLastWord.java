package org.coding.string;

import java.util.Arrays;

public class P1_LengthOfLastWord {

    /**
     * Approach1 -
     * use trim() method to remove front and end spaces
     * use split(" ") to convert statement into words array
     * now fetch the last element from array and return its length
     */
    static int findLength(String str) {
        String str1 = str.trim();
        String[] str1Arr = str1.split(" ");

        return str1Arr[str1Arr.length - 1].length();
    }

    /**
     * Approach2 -
     * in MAANG or product based companies if they asked not to use these methods then
     * we need to find length of last word
     * - so we need to traverse this statement and to get last word early we will traverse it from back
     * - remove the spaces from last
     * - once u find character from last -> start counting it till u again get space and return its length
     *
     * Below we will use 2 while loops
     * - first while loop to ignore spaces from last and get the index wch points to actual character in word
     * - then start another while loop to start counting characters and break it once u find space
     * - return the count
     * - in while loop we will use condition (i>=0) and not (i>0)
     * - bcoz if u use (i>0) then it will egnore edge case if String is only "a".
     */

    static int findLength2(String str) {

        int count = 0;
        int i = str.length() - 1;

        // remove all empty spaces from last if any and reduce i
        while(i>=0){
            if(str.charAt(i) == ' '){
                i--;
            }else{
                break;
            }
        }

        // i will point index from where your last word starts
        while(i>=0){
           if(str.charAt(i) != ' '){
               count++;
               i--;
           }else{
               break;
           }
        }

        return count;
    }


    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "   fly me   to   the moon  ";
        String str3 = "luffy is still joyboy";
        String str4 = "a";

        System.out.println(findLength(str1));
        System.out.println(findLength(str2));
        System.out.println(findLength(str3));
        System.out.println();

        System.out.println(findLength2(str1));
        System.out.println(findLength2(str2));
        System.out.println(findLength2(str3));
        System.out.println(findLength2(str4));


    }
}
