package org.list;

import java.util.ArrayList;
import java.util.List;

public class P3_ArrayListDemoJDK21Methods {

    public static void main(String[] args) {

        /**
         * ✅ New in JDK 21
         * with jdk 21 - some more methods are introduced
         * removeFirst(), removeLast()
         * addFirst(), addLast()
         * getFirst(), getLast()
         * reversed()
         */

        System.out.println();
        ArrayList<Integer> numsList = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println("numsList - " + numsList); // numsList - [1, 2, 3, 4, 5]

        numsList.addFirst(0);
        numsList.addLast(6);
        System.out.println("After addFirst() and addLast operation - " + numsList);
        // After addFirst() and addLast operation - [0, 1, 2, 3, 4, 5, 6]

        numsList.removeFirst();
        numsList.removeLast();
        System.out.println("After removeFirst() and removeLast operation - " + numsList);
        // After removeFirst() and removeLast operation - [1, 2, 3, 4, 5]
        System.out.println();

        System.out.println("getFirst : " +numsList.getFirst() + " getLast() : " + numsList.getLast());
        // getFirst : 1 getLast() : 5
        System.out.println();

        // Returns a reverse-ordered view of this collection
        List<Integer> nums = numsList.reversed();
        System.out.println("Reveresed NumsList - " + nums); // Reveresed NumsList - [5, 4, 3, 2, 1]
        nums.add(0);
        System.out.println(nums); // [5, 4, 3, 2, 1, 0]


    }
}
