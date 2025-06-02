package com.easybytes.sec12arrays.easybytes;

import java.util.Arrays;
import java.util.Collections;

public class P6_SortingArrays {

    public static void main(String[] args) {

        //✅ Sorting Arrays in Java
        //🔹 1. Sort Primitive Arrays (Ascending Only - Default)

        int[] nums = {5, 2, 8, 1};
        Arrays.sort(nums);
        System.out.println("nums : " + Arrays.toString(nums)); // nums : [1, 2, 5, 8]



        // 🔹 2. Sort Object Array (Ascending Order – Default)
        String[] names = {"Zara", "Bob", "Anna"};
        // Sorts strings in ascending alphabetical order
        Arrays.sort(names);
        System.out.println("names : " + Arrays.toString(names)); // names : [Anna, Bob, Zara]

        // Sorting Strings in descending order
        String[] girls = {"Zara", "Bob", "Anna"};
        Arrays.sort(girls, Collections.reverseOrder());
        System.out.println("names2 : " + Arrays.toString(girls)); // girls : [Zara, Bob, Anna]



        //🔹 3. Sort Object Array in Descending Order
        Integer[] nums2 = {5, 2, 8, 1};

        // Sorts in descending order using reverseOrder()
        Arrays.sort(nums2, Collections.reverseOrder());
        System.out.println("nums2 - " + Arrays.toString(nums)); // nums2 - [1, 2, 5, 8]


        //🔹 4. Sort Primitive Array in Descending Order (via stream)
        // converting primitive to Wrapper class and then sorting
        int[] nums3 = {5, 2, 8, 1};

        // Convert to Integer[] and sort in descending order
        Integer[] boxed = Arrays.stream(nums3).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, Collections.reverseOrder());

        System.out.println("nums3 : " + Arrays.toString(boxed)); // nums3 : [8, 5, 2, 1]
        // then converting back to array
        int[] nums4 = Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
        System.out.println("nums4 : " + Arrays.toString(nums4)); // nums4 : [8, 5, 2, 1]
    }
}
