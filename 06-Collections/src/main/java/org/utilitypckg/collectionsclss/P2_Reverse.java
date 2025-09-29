package org.utilitypckg.collectionsclss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P2_Reverse {

    /*
    Below we are reversing list of
    Integers, Characters and Strings
     */
    public static void main(String[] args) {

        // reverse below Integer list
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 1, 3, 9));
        Collections.reverse(list1);
        System.out.println("list1 - " + list1); // list1 - [9, 3, 1, 5]

        System.out.println();


        // reverse Character List
        List<Character> list2 = new ArrayList<>(Arrays.asList('B','V','A','M','C'));
        Collections.reverse(list2);
        System.out.println("list2 - " + list2); // list2 - [C, M, A, V, B]

        System.out.println();


        // reverse Strings list
        List<String> list3 = new ArrayList<>(Arrays.asList("Zebra","Union","Apple","Banana"));
        Collections.reverse(list3);
        System.out.println("list3 - " + list3); // list3 - [Banana, Apple, Union, Zebra]

        System.out.println();
    }
}
