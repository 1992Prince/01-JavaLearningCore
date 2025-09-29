package org.collectionscoding.p1_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4_Problem {

    /**
     * Problem: Find elements in list1 not in list2 and divisible by 3.
     * <p>
     * Example:
     * List1 = [3, 6, 9, 12, 15]
     * List2 = [6, 12]
     * Output = [3, 9, 15]
     */

    public static void main(String[] args) {

        List<Integer> intList1 = new ArrayList<>(Arrays.asList(3, 6, 9, 12, 15));
        List<Integer> intList2 = new ArrayList<>(Arrays.asList(6, 12));
        List<Integer> resultList = new ArrayList<>();

        //APPROACH1 - Old way
        // iterate list1 -> find ele that are div are by 3 -> then check they should
        // not present in list2 -> then print it

        for(Integer num: intList1){
            if(num % 3 == 0 && !intList2.contains(num)){
                resultList.add(num);
            }
        }

        System.out.println("resultList - " + resultList);

        System.out.println();

        // APPROACH2 - VIA STREAMS
        // create stream on list1 -> filter it to search elements div by 3 ->
        // then filter it to check they should not present in list2 ->
        // and store result in List

        List<Integer> resultList2 = intList1.stream()
                .filter(num -> num % 3 == 0)
                .filter(num -> !intList2.contains(num))
                .toList();

        System.out.println("resultList2 - " + resultList2);


        System.out.println();

        // APPROACH3 -
        // remove elements of list2 from list1 and then so list1 will not have list2 elements
        // then remove elements from list1 wch are not divisible by 3
        // Here we used 2 List methods - removeAll() and removeIf()
        // Here we modified same list instead of creating new list
        intList1.removeAll(intList2);
        intList1.removeIf(num -> num % 3 != 0);
        System.out.println("intList1 - " + intList1);


    }
}
