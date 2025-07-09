package org.coding.arrays.basic;

import java.util.Arrays;

public class P15_Replaceall0swith5 {

    static int convertfive(int num) {
        String str = String.valueOf(num);
        char[] arr = str.toCharArray();
        String str2 = "";
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '0'){
                arr[i] = '5';
            }

            str2 = str2 + arr[i];

        }
        return Integer.valueOf(str2);
    }

    public static void main(String[] args) {
        System.out.println(convertfive(1009));
        System.out.println(convertfive(121));
    }
}
