package org.coding.arrays.basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P4_ArraySubset {

    /**
     * below solution is not an optimized solution
     */
    public static boolean isSubset(int a[], int b[]) {

        for (int i = 0; i < b.length; i++) {
            int countB = 0;
            int countA = 0;
            for (int j = 0; j < b.length; j++) {
                if (b[i] == b[j]) {
                    countB++;
                }
            }

            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    countA++;
                }
            }

            if (countA < countB) {
                return false;
            }

        }
        return true;

    }

    // optimized solution
    public static boolean isSubsetOptimized(int a[], int b[]) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }


        for (int i = 0; i < b.length; i++) {
            if (!map.containsKey(b[i]) || map.get(b[i]) == 0) {
                return false;
            } else {
                map.put(b[i], map.get(b[i]) - 1);
            }
        }

        return true;

    }

    public static void main(String[] args) {

        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a, b));

        int[] c = {1, 2, 3, 4, 4, 5, 6};
        int[] d = {1, 2, 4};
        System.out.println(isSubset(c, d));

        int[] e = {10, 5, 2, 23, 19};
        int[] f = {19, 5, 3};
        System.out.println(isSubset(e, f));

        System.out.println("");
        System.out.println("Using optimized solution");
        System.out.println();
        System.out.println(isSubsetOptimized(a, b));
        System.out.println(isSubsetOptimized(c, d));
        System.out.println(isSubsetOptimized(e, f));

        int[] g = {1, 2, 2};
        int[] h = {2,2,2};
        System.out.println(isSubsetOptimized(g,h));


    }
}
