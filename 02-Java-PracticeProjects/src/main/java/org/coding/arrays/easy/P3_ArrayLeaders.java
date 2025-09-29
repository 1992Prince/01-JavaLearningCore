package org.coding.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P3_ArrayLeaders {

    // brute force solution
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    break;
                }
                count++;
            }
            if(count == (arr.length - (i+1))){
                list.add(arr[i]);
            }
        }

        list.add(arr[arr.length - 1]);
        return list;
    }

    // optimal solution - traverse from Right to Left
    static ArrayList<Integer> leaders1(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();

        int maxFromRight = arr[arr.length-1];
        list.add(maxFromRight); // last element is always a leader

        for(int i = arr.length-2;i>=0;i--){
            if(arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                list.add(arr[i]);
            }
        }

        Collections.reverse(list);
        return list;

    }

    public static void main(String[] args) {

        int[] arr1 = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr1));
        System.out.println(leaders1(arr1));

        System.out.println();

        int[] arr2 = {10, 4, 2, 4, 1};
        System.out.println(leaders(arr2));
        System.out.println(leaders1(arr2));

        System.out.println();

        int[] arr3 = {5,10,20,40};
        System.out.println(leaders(arr3));
        System.out.println(leaders1(arr3));

        System.out.println();

        int[] arr4 = {30, 10, 10, 5};
        System.out.println(leaders(arr4));
        System.out.println(leaders1(arr4));



    }
}
