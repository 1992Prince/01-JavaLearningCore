package org.collectionscoding.p1_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1_IntersectionExamplewithEvenNumbersOnly {

    /*
    Problem: Given two lists of integers, find their intersection but keep only even numbers.
    List1 = [1, 2, 3, 4, 6]
    List2 = [2, 4, 5, 6, 8]
    Output = [2, 4, 6]


    [CONCEPT]
    retainAll() kya karta hai?
    Ye list ke elements ko filter karta hai taki sirf wo elements bache jo dusre collection
    me bhi present ho.

    Basically:

    list1.retainAll(list2)
    ka matlab hai: list1 = intersection(list1, list2)

    Important points:
    1) Original list modify hoti hai — ye method new list return nahi karta.

    2) Ye boolean return karta hai:

            true → agar list me koi change hua
            false → agar list same rahi

    3)  Ye equals() method ka use karta hai elements compare karne ke liye
        (reference nahi, value equality).

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        boolean changed = list1.retainAll(list2);

        System.out.println("Changed? " + changed);   // true
        System.out.println("list1 after retainAll: " + list1); // [3, 4, 5]

     */

    public static void main(String[] args) {

        List<Integer> integerList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 9));
        List<Integer> integerList2 = new ArrayList<>(Arrays.asList(2, 4, 5, 9, 6, 8));

        integerList1.retainAll(integerList2);
        System.out.println(integerList1);  // [2, 4, 6, 9]

        integerList1.removeIf(ele -> ele % 2 != 0);
        System.out.println(integerList1); // [2, 4, 6]

        /**
         * [APPROACH1] -  retainAll() + removeIf()
         * 1) first use retailAll method to find common elements
         * present in both list and keep it inside integerList1 and then
         * 2) we used removeIf method to remove elements wch are odd and skip even elements
         */

        System.out.println();

        /**
         * [APPROACH2] - manual way without using retainAll
         * suppose interviewer asked not to use retainAll method, then in this case
         * we will create one third list where we will store our resultant elements
         * we will iterate first list and check if each element of list1 is present in list2
         * and at same time also check if that element is also even.
         * Once both condition satisfies then we will add that element into third list
         */

        List<Integer> integerList3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 9));
        List<Integer> integerList4 = new ArrayList<>(Arrays.asList(2, 4, 5, 9, 6, 8));
        List<Integer> resultList = new ArrayList<>();

        for(Integer ele: integerList3){
            if(integerList4.contains(ele) && ele % 2 == 0){
                resultList.add(ele);
            }
        }

        System.out.println("resultList - " + resultList); // resultList - [2, 4, 6]

        System.out.println();

        /**
         * [APPROACH3] - Java Streams Way (Modern Java 8+)
         * Above we iterated list using for loop and did filter via if condition
         * Here in streams way to filter elements from list1 we will use filter method
         * and we will store result in new list
         */

        List<Integer> integerList5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 9));
        List<Integer> integerList6 = new ArrayList<>(Arrays.asList(2, 4, 5, 9, 6, 8));

        List<Integer> resultEvenList = integerList5.stream()
                .filter(ele -> integerList6.contains(ele)) // intersection check // .filter(set2::contains)
                .filter(ele -> ele % 2 == 0)               // even number check
                .toList();

        System.out.println("resultEvenList - " + resultEvenList); // resultEvenList - [2, 4, 6]

    }
}
