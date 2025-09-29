package org.collectionscoding.p1_arraylist;

import java.util.*;

public class P3_MergeTwoListsRemoveDuplicates {

    /**
     * Problem: Merge two integer lists without duplicates, preserving order.
     * <p>
     * Example:
     * <p>
     * List1 = [1, 2, 3, 4]
     * List2 = [3, 4, 5, 6]
     * Output = [1, 2, 3, 4, 5, 6]
     * <p>
     * another example:
     * list1 = [1, 2, 4, 3]
     * list2 = [3, 4, 5, 6]
     * output - [1, 2, 4, 3, 5, 6]
     */

    public static void main(String[] args) {

        List<Integer> integerList1 = new ArrayList<>(Arrays.asList(1, 2, 4, 3));
        List<Integer> integerList2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

        /**
         * APPROACH1 - Suppose u want to use HashSet to remove duplicates
         *             but set will not let u save preserve order
         *
         *             so we can use LinkedHashSet
         *
         * HashSet: Bas unique elements rakhta hai, lekin order ka koi guarantee nahi deta.
         * LinkedHashSet: Unique elements rakhta hai aur order preserve karta hai (insertion order).
         */

        Set<Integer> set1 = new HashSet<>(integerList1);
        Set<Integer> set2 = new HashSet<>(integerList2);

        set1.addAll(set2);
        System.out.println(set1); // [1, 2, 3, 4, 5, 6]

        System.out.println();


        Set<Integer> set3 = new LinkedHashSet<>(integerList1);
        Set<Integer> set4 = new LinkedHashSet<>(integerList2);

        set3.addAll(set4);
        System.out.println(set3); // [1, 2, 4, 3, 5, 6]


        System.out.println();

        /**
         * But suppose your interviewer asked you not to use LinkedHashSet then?
         * what will be approach?
         *
         * list1 = [1, 1, 4, 3, 5]
         * list2 = [0, 2, 7]
         * output - [1, 4, 3, 5, 0, 2, 7]
         *
         * for this I will create another list and will iterate both lists
         * and add elements wch are not present to avoid duplicates and
         * ths will preserve order
         */

        List<Integer> integerList3 = new ArrayList<>(Arrays.asList(1, 1, 4, 3, 5));
        List<Integer> integerList4 = new ArrayList<>(Arrays.asList(0, 2, 7));

        List<Integer> resultList = new ArrayList<>();

        for(Integer num: integerList3){
            if(!resultList.contains(num)){
                resultList.add(num);
            }
        }

        for(Integer num: integerList4){
            if(!resultList.contains(num)){
                resultList.add(num);
            }
        }

        System.out.println("ResultList - " + resultList); // ResultList - [1, 4, 3, 5, 0, 2, 7]



    }
}
