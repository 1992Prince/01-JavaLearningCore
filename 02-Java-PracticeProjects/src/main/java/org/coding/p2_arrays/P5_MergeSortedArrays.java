package org.coding.p2_arrays;

import java.util.Arrays;

public class P5_MergeSortedArrays {

    public static void mergeBruteForceApproach(int[] nums1, int m, int[] nums2, int n) {

        // nums1 have actual elements till m-1 , so we can copy all nums2 elements from m to nums1.length-1
        for (int i = m,j=0; i < nums1.length && j<nums2.length; i++,j++) {
            nums1[i] = nums2[j];
        }


        Arrays.sort(nums1);

        System.out.println("Merged Arr - " + Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0, k = 0;
        int[] merged = new int[nums1.length];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
                k++;
            } else {
                merged[k] = nums2[j];
                j++;
                k++;
            }
        }

        //System.out.println("Merged Arr - " + Arrays.toString(merged));

        // till here either nums1 is iterated completely or nums2 is iterated completely
        // now we need to copy remaining elements to merged

        // if nums1 element are pending
        while (i < m) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        // if nums2 elements are pending
        while (j < n) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        //System.out.println("Merged Arr - " + Arrays.toString(merged));

        // copy back to nums1
        for (i = 0; i < merged.length; i++) {
            nums1[i] = merged[i];
        }

        System.out.println("Merged Arr - " + Arrays.toString(nums1));

    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        mergeBruteForceApproach(nums1, 3, nums2, 3);
        System.out.println();
        //merge(nums1, 3, nums2, 3);

    }
}
