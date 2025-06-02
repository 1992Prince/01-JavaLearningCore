package com.easybytes.sec12arrays.easybytes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P7_ReversingArrays {

    public static void main(String[] args) {

        // 🔹 1. Reverse Primitive Array Manually

        int[] nums = {1, 2, 3, 4};

        // Manually reverse the array (in-place)
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(nums)); // [4, 3, 2, 1]


        //🔹 2. Reverse Object Array using List
        String[] arr = {"one", "two", "three"};

        // Convert array to list and reverse it
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list); // Also affects original array

        System.out.println(Arrays.toString(arr)); // [three, two, one]

        /**
         * 🔁 Reversing Primitive Arrays (like int[]) using Streams or Collections
         * 🔴 Problem:
         * You cannot reverse int[] directly using Collections.reverse() because:
         * Collections.reverse() only works with List<T>, and primitive arrays like int[] are not objects.
           Streams of primitives (IntStream) don’t have a direct .reverse() method.

         * ✅ Solution:
         * You can convert primitive int[] to Integer[], use Collections.reverse(), and if needed, convert back.
         */

        int[] nums3 = {1, 2, 3, 4, 5};

        // Step 1: Convert int[] to Integer[]
        Integer[] boxed = Arrays.stream(nums3).boxed().toArray(Integer[]::new);

        // Step 2: Reverse using Collections
        List<Integer> list2 = Arrays.asList(boxed);
        Collections.reverse(list2); // modifies boxed[] directly

        // Step 3: If you want back as int[], unbox it
        int[] reversed = list2.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(reversed)); // [5, 4, 3, 2, 1]
    }
}
