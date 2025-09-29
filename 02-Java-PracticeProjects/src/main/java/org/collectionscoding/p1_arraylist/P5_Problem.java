package org.collectionscoding.p1_arraylist;

import java.util.*;

public class P5_Problem {

    /**
     * Problem: Find unique common elements in two lists without using retainAll().
     * Example:
     * List1 = [1, 2, 2, 3]
     * List2 = [2, 3, 4]
     * Output = [2, 3]
     */

    public static void main(String[] args) {

        List<Integer> intList1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        List<Integer> intList2 = new ArrayList<>(Arrays.asList(2, 3, 4));

        // below way will not work bcoz iterating list and removing element
        // will throw ConcurrentModificationException
        /*for (Integer num : intList1) {
            if (!intList2.contains(num)) {
                intList1.remove(num);
            }
        }*/

        /**
         * Here Y we are not using ArrayList and instead using LinkedHashSet obj
         * This is bcoz in output we don't want to keep duplicates
         */

        List<Integer> list1 = Arrays.asList(1, 2, 2, 3);
        List<Integer> list2 = Arrays.asList(2, 3, 4);

        Set<Integer> result = new LinkedHashSet<>();
        for (Integer n : list1) {
            if (list2.contains(n)) {
                result.add(n);
            }
        }
        System.out.println(new ArrayList<>(result));
    }
}
