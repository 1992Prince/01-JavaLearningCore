package org.coding.p2_arrays;

import java.util.Arrays;

public class P3_ReverseString {

    public static void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(s));
    }


    public static void main(String[] args) {
        char[] arr1 = {'h', 'e', 'l', 'l', 'o' };
        reverseString(arr1);
        System.out.println();

        char[] arr2 = {'H', 'a', 'n', 'n', 'a', 'h' };
        reverseString(arr2);
    }
}
