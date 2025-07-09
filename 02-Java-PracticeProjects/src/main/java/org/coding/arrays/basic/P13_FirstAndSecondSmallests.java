package org.coding.arrays.basic;

import java.util.ArrayList;

public class P13_FirstAndSecondSmallests {

    public static ArrayList<Integer> minAnd2ndMin(int[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > first && arr[i] < second && arr[i] != first)
                second = arr[i];
        }

        ArrayList<Integer> list = new ArrayList<>();
        if (first != Integer.MAX_VALUE && second != Integer.MAX_VALUE) {
            list.add(first);
            list.add(second);
        }else{
            list.add(-1);
        }

        return list;
    }

    public static void main(String[] args) {

        int[] arr1 = {2,4,3,5,6};
        System.out.println(minAnd2ndMin(arr1));
        System.out.println();

        int[] arr2 = {1,1,1};
        System.out.println(minAnd2ndMin(arr2));
    }
}
