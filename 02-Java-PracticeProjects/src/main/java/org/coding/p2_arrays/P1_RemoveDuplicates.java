package org.coding.p2_arrays;

import java.util.Arrays;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class P1_RemoveDuplicates {

    // [1,1,1,2,2,2,3,3,4]
    public static int removeDuplicates(int[] nums) {

        int i=0;
        int j=i+1;
        while(i<nums.length && j < nums.length){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }

            j++;
        }

        System.out.println(Arrays.toString(nums));
        return i+1;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));

        System.out.println();

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums2));

        System.out.println();

        int[] nums3 = {1,1,1,2,2,2,2,3,3,3,4,4};
        System.out.println(removeDuplicates(nums3));

        System.out.println();
    }
}
