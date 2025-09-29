package org.utilitypckg.collectionsclss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P1_Sort {

    /**
     * Using Collections.sort() and Collections.reverseOrder we sorted below
     * 1) Integers
     * 2) Characters
     * 3) Strings
     * all in ascending and descending order
     */
    public static void main(String[] args) {

        // sorting Integers in ascending order
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 1, 3, 9));
        Collections.sort(list1);
        System.out.println("list1 - " + list1); // list1 - [1, 3, 5, 9]

        System.out.println();



        // sorting Integers in descending order
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 1, 3, 9));
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println("list2 - " + list2); // list2 - [9, 5, 3, 1]

        System.out.println();



        // sorting Character alphabetically / lexicographically
        List<Character> list3 = new ArrayList<>(Arrays.asList('B','V','A','M','C'));
        Collections.sort(list3);
        System.out.println("list3 - " + list3); // list3 - [A, B, C, M, V]

        System.out.println();



        // sorting Character alphabetically / lexicographically in rev order
        List<Character> list4 = new ArrayList<>(Arrays.asList('B','V','A','M','C'));
        Collections.sort(list4, Collections.reverseOrder());
        System.out.println("list4 - " + list4); // list4 - [V, M, C, B, A]

        System.out.println();



        // very similar we can sort Strings
        List<String> list5 = new ArrayList<>(Arrays.asList("Zebra","Union","Apple","Banana"));
        Collections.sort(list5);
        System.out.println("list5 - " + list5); // list5 - [Apple, Banana, Union, Zebra]

        System.out.println();



        // very similar we can sort Strings in rev order
        List<String> list6 = new ArrayList<>(Arrays.asList("Zebra","Union","Apple","Banana"));
        Collections.sort(list6, Collections.reverseOrder());
        System.out.println("list6 - " + list6); // list6 - [Zebra, Union, Banana, Apple]

        System.out.println();





    }
}
