package org.coding.arrays.basic;

import java.util.ArrayList;
import java.util.List;

public class P17_SwapKthElement {

    public static void swapKth(List<Integer> arr, int k) {
        int temp = arr.get(k-1);
        int valFromEnd = arr.get(arr.size()-k);
        arr.set(k-1,valFromEnd);
        arr.set((arr.size()-k),temp);
        System.out.println(arr);
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=8;i++){
            arr.add(i);
        }
        //System.out.println("Arr - " + arr);
        swapKth(arr,3);
        System.out.println();

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(5);
        arr2.add(3);
        arr2.add(6);
        arr2.add(1);
        arr2.add(2);
        swapKth(arr2,2);
    }
}
