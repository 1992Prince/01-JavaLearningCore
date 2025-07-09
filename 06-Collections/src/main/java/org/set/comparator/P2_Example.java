package org.set.comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Requirement: Write a program to insert integer objects into the TreeSet where the
 * sorting order is descending order.
 *
 * 🔸 Approach:
 * Create a TreeSet and pass a custom Comparator which sorts integers in descending order.
 *
 * Agar tu TreeSet mein integers insert karna chahta hai descending order mein, toh humein Comparator ka use karna padega,
 * kyunki by default TreeSet ascending (natural) order mein sort karta hai.
 */
class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1); // descending
    }
}
public class P2_Example {

    public static void main(String[] args) {

        /**
         * Below we are using TreeSet and adding integers objects to it.
         * TreeSet by default sort integers in natural sorting order in ascending order.
         * And so we are getting output in ascending order
         */
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(101);
        set1.add(50);
        set1.add(78);
        set1.add(1010);
        set1.add(34);

        System.out.println(set1); // [34, 50, 78, 101, 1010]
        System.out.println();

        /**
         * To sort integers objects in descending order, we need to pass comparator obj to TreeSet constructor
         * and then set2 output will be in descending order.
         */

        TreeSet<Integer> set2 = new TreeSet<>(new MyComparator());
        set2.add(101);
        set2.add(50);
        set2.add(78);
        set2.add(1010);
        set2.add(34);

        System.out.println(set2); // [1010, 101, 78, 50, 34]
        System.out.println();

        /**
         * In above case we are passing comparator obj in TreeSet constructor.
         * But we can also pass Comparator imp via Anonymous class [BUT THIS IS NOT PREFERRED WAY]
         */

        TreeSet<Integer> set3 = new TreeSet<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1); // descending
            }
        });
        set3.add(101);
        set3.add(50);
        set3.add(78);
        set3.add(1010);
        set3.add(34);

        System.out.println(set3); // [1010, 101, 78, 50, 34]
        System.out.println();

        /**
         * we can also pass Comparator imp to TreeSet constuctor via Lambda expression
         * [THIS IS PREFERRED WAY , but still we can improve it via Java 8+ Method Reference]
         */

        TreeSet<Integer> set4 = new TreeSet<>((o1,o2) -> o2.compareTo(o1));
        set4.add(101);
        set4.add(50);
        set4.add(78);
        set4.add(1010);
        set4.add(34);

        System.out.println(set4); // [1010, 101, 78, 50, 34]
        System.out.println();


    }


}
