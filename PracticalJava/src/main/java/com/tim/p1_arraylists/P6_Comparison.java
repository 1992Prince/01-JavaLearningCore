package com.tim.p1_arraylists;

import java.util.Arrays;
import java.util.List;

public class P6_Comparison {

    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println("Factory Method list - " + list); // Factory Method list - [apples, bananas, milk, eggs]

        System.out.println();

        List<String> list2 = Arrays.asList(items);
        System.out.println("list2 - " + list2);  // list2 - [apples, bananas, milk, eggs]

        System.out.println();
        System.out.println("list get - " + list.get(0));
        System.out.println("list2 get - " + list2.get(0));

        System.out.println();
        System.out.println("list size - " + list.size());   // list size - 4
        System.out.println("list2 size - " + list2.size()); // list2 size - 4
    }
}
