package org.coding.twosum$slidingwindow;

import java.util.Arrays;
import java.util.HashMap;

public class P3_TwoSum {

    /*
    Here in problem it is specified that each input have only one solution
    so we don't need to think about any edge cases like if no two elements have sum target etc.

    https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/


    This problem is classic example of 2 pointer algorithm
     */


    //❌ APPROACH1 - BRUTE FORCE
    public static int[] twoSum(int[] nums, int target) {

        int[] arr = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                }
            }
        }
        return arr;
    }

    /*
    ✅ Better Approach - 🔥 Better Strategy (Standard Two-Pointer Logic):

    ✅ Approach: Two-Pointer Technique
        🔍 Problem Understanding:
        You are given a sorted array (in non-decreasing order).
        You need to find two numbers that add up to a given target.
        Return their 1-based indices.
        You must use constant extra space (no hashmap or extra array).
        There is exactly one solution, and you can’t use the same element twice.

    🔑 Key Insight:
    Since the array is sorted, we can efficiently find the target pair using the
    two-pointer technique — one pointer starting from the left, and one from the right.

    Approach -
    Initialize left and right from starting and ending of array
    find sum of both and if it is equlivatent to target then return both.
    else sum > target and since array is sorted we need to reduce right by one
    and
    if sum < target and since array is sorted we need to increase left by one
    we can use while loop with condition (left < right)

🧠 Why This Works:
        Because the array is sorted, increasing left moves to larger values.
        Decreasing right moves to smaller values.
        This way, we efficiently zero in on the correct pair in O(n) time and O(1) space.



     */
    public static int[] twoSum2(int[] numbers, int target) {
        int[] arr = {-1, -1};
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                break;
            } else if (sum > target) {
                right--;
            } else {  // checks if sum < target
                left++;
            }

        }

        arr[0] = left + 1;
        arr[1] = right + 1;
        return arr;
    }


    public static void main(String[] args) {

        int[] arr1 = {2, 7, 11, 15};
        int[] arr2 = {2, 3, 4};
        int[] arr3 = {-1, 0};

        System.out.println(Arrays.toString(twoSum2(arr1, 9)));
        System.out.println(Arrays.toString(twoSum2(arr2, 6)));
        System.out.println(Arrays.toString(twoSum2(arr3, -1)));


    }
}
