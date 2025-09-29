package org.coding.arrays.takeuforward;

import java.util.ArrayList;
import java.util.List;

public class P8_IntersectionOfTwoSortedArrays {

    static List<Integer> findIntersection(int[] arr1, int[] arr2) {

        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[arr2.length]; // to avoid duplicate use of arr2 elements

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !visited[j]) {
                    result.add(arr1[i]);
                    visited[j] = true; // mark arr2[j] as used
                    break;
                }
            }
        }
        return result;
    }

    static List<Integer> findIntersectionOptimal(int[] arr1, int[] arr2) {

        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 5};
        int[] arr2 = {2, 3, 4, 5, 6};

        List<Integer> intersectionArr = findIntersection(arr1, arr2);
        System.out.println("Intersection of Arrays: " + intersectionArr);

        System.out.println();

        List<Integer> intersectionArr2 = findIntersectionOptimal(arr1, arr2);
        System.out.println("Intersection of Arrays Optimal Approach: " + intersectionArr2);
    }
}
