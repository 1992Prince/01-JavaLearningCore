package org.coding.arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class P11_AlternatesInArray {

    public static ArrayList<Integer> getAlternates(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i=i+2){
            list.add(arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        System.out.println(getAlternates(arr1));
        System.out.println();

        int[] arr2 = {1,2,3,4,5};
        System.out.println(getAlternates(arr2));
        System.out.println();
    }
}
