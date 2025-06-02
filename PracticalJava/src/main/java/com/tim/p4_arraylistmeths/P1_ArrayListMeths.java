package com.tim.p4_arraylistmeths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class P1_ArrayListMeths {

    public static void main(String[] args) {

        // List<String> list = new ArrayList<>();
        Collection<String> list = new ArrayList<>();

        String[] names = {"Anna", "Bob", "Carol", "David", "Edna"};
        list.addAll(Arrays.asList(names));
        System.out.println(list); // [Anna, Bob, Carol, David, Edna]

        list.add("Fred");
        list.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list); // [Anna, Bob, Carol, David, Edna, Fred, George, Gary, Grace]
        System.out.println("Gary is in list? : " + list.contains("Gary")); // Gary is in list? : true

        /**
         * Lets remove element from list that starts with G
         * removeIf accepts Predicate
         */

        // list.removeIf(s -> s.startsWith("G"));
        list.removeIf(s -> s.charAt(0) == 'G');

        System.out.println();
        System.out.println("List after removing Gary - " + list); // List after removing Gary - [Anna, Bob, Carol, David, Edna, Fred]
        System.out.println("Gary is in list? : " + list.contains("Gary")); // Gary is in list? : false

        /**
         * Above List<String> list = new ArrayList<>();, here List can be replaced with Collection also
         * Since List interface extends Collection interface and Collection interface extends Iterable interface
         * So, List can be used in place of Collection and Collection can be used in place of Iterable
         * And root interface is Collection
         *
         * all code will work with Collection interface also since all methods are present in Collection interface
         * And this is how Interface works
         *
         */


    }
}
