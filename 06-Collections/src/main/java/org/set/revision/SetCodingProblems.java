package org.set.revision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetCodingProblems {

    /**

     */

    public static void main(String[] args) {

        // Coding problems
        //  1. Remove duplicates from array
        int[] arr = {1, 2, 2, 3, 4, 4};
        Set<Integer> set = new HashSet<>();
        for(int num : arr) set.add(num);
        System.out.println(set); // Output: [1, 2, 3, 4]
        System.out.println();


        // Find Duplicate characters in String
        // also u can add duplicates into some array or print all duplicates
        String s = "abcdefa";
        Set<Character> set2 = new HashSet<>();
        for(char c : s.toCharArray()) {
            if(!set2.add(c)) {
                System.out.println("Duplicate found: " + c);
                break;
            }
        }

        // Duplicate found: a
        System.out.println();

        // Count distinct elements in a list
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4);
        Set<Integer> set3 = new HashSet<>(list);
        System.out.println("Distinct count: " + set3.size()); // Distinct count: 4
        System.out.println();




    }
}
