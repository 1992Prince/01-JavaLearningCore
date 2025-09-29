package org.coding.arrays.takeuforward;

import java.util.ArrayList;
import java.util.List;

public class P1_CheckIfArrayIsSorted {

    public static boolean isSorted(ArrayList<Integer> nums) {

        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i+1) >= nums.get(i) ){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int[] arr) {

        // here we need to check if next element is greater or equal to previous element
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1] >= arr[i] ){
                continue;
            }else{
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList(List.of(1,2,3,4,5));
        int[] arr1 = {1,2,3,4,5};
        System.out.println(isSorted(list1));
        System.out.println(isSorted(arr1));

        System.out.println();

        ArrayList list2 = new ArrayList(List.of(1, 2, 1, 4, 5));
        int[] arr2 = {1, 2, 1, 4, 5};
        System.out.println(isSorted(list2));
        System.out.println(isSorted(arr2));
    }
}
