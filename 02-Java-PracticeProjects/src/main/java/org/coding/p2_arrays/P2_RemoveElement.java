package org.coding.p2_arrays;

import java.util.Arrays;

public class P2_RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return i;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 2, 2, 3};
        System.out.println(removeElement(nums1, 3));
        System.out.println();

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums2, 2));
        System.out.println();

        int[] nums3 = {1};
        System.out.println(removeElement(nums3, 1));
        System.out.println();

    }
}
