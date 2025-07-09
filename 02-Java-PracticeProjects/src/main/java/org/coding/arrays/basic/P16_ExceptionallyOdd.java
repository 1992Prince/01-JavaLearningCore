package org.coding.arrays.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P16_ExceptionallyOdd {

    static int getOddOccurrence(int[] arr, int n) {

        int exceptionalNum = -1;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            if(entry.getValue() % 2 != 0){
                exceptionalNum =  entry.getKey();
            }
        }

        return exceptionalNum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 3, 1, 3};
        System.out.println(getOddOccurrence(arr1, 7));
        System.out.println();

        int[] arr2 = {5, 7, 2, 7, 5, 2, 5};
        System.out.println(getOddOccurrence(arr2, 7));
    }
}
