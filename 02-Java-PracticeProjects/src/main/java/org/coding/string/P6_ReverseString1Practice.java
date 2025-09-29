package org.coding.string;

import java.util.Arrays;

public class P6_ReverseString1Practice {

    /*
    Reverse a string given as a character array
    Input: s = ["h","e","l","l","o"] => Output: ["o","l","l","e","h"]

    Input: s = ["H","a","n","n","a","h"] => Output: ["h","a","n","n","a","H"]
     */
    public static void reverseStr(char[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }

    /*
    Solving same problem with 2 pointer approach
    and this approach will be input for next question
     */

    public static void reverseStr2(char[] arr) {

        // two pointers
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        char[] arr1 =  {'h','e','l','l','o'};
        char[] arr2 =  {'H','a','n','n','a','h'};

        reverseStr(arr1);
        reverseStr(arr2);
        System.out.println();

        char[] arr3 =  {'h','e','l','l','o'};
        char[] arr4 =  {'H','a','n','n','a','h'};

        reverseStr2(arr3);
        reverseStr2(arr4);
    }
}
