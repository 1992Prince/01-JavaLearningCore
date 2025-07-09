package org.set.comparator;

import java.util.TreeSet;

/**
 * Requirement: Write a program to insert String objects into the TreeSet where the sorting
 * order is reverse of alphabetical order
 */
public class P3_Example {

    public static void main(String[] args) {

        /**
         * Below we are adding String objects into TreeSet and TreeSet will keep them in
         * natural sorting order i.e. alphabetically ordered
         */
        TreeSet<String> t = new TreeSet<>();
        t.add("Roja");
        t.add("ShobaRani");
        t.add("MajaKumari");
        t.add("GangaBhavani");
        t.add("Vamulamma");
        System.out.println(t); // [GangaBhavani, MajaKumari, Roja, ShobaRani, Vamulamma]
        System.out.println();

        // Lets keep String objects in reverse order of alphabetically in TreeSet

        TreeSet<String> t2 = new TreeSet<>((o1,o2) -> o2.compareTo(o1));
        t2.add("Roja");
        t2.add("ShobaRani");
        t2.add("MajaKumari");
        t2.add("GangaBhavani");
        t2.add("Vamulamma");
        System.out.println(t2); // [Vamulamma, ShobaRani, Roja, MajaKumari, GangaBhavani]
        System.out.println();
    }
}
