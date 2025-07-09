package org.set.comparator;

import java.util.TreeSet;

/**
 * Requirement: Write a program to insert StringBuffer objects into the TreeSet where the
 * sorting order is alphabetical order.
 */
public class P4_Example {

    public static void main(String[] args) {

        /**
         * From jdk 11, StringBuffer and StringBuilder implements Comparable interface and so
         * TreeSet will print them in ascending alphabeticlly order
         */

        TreeSet<StringBuffer> t = new TreeSet();
        t.add(new StringBuffer("Al"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));

        System.out.println(t); // [A, K, L, Z]


    }
}
