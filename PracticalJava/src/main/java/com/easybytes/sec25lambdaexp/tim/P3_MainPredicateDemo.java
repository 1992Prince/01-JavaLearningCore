package com.easybytes.sec25lambdaexp.tim;

import java.util.ArrayList;
import java.util.List;

public class P3_MainPredicateDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"
        ));

        // List method removeIf  accepts Predicate functional interface
        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        list.forEach(s -> System.out.println(s));
        /*
        alpha
        charlie
        delta
         */

        list.addAll(List.of("echo", "easy", "earnest"));

        // lets remove string starting with e or a

        System.out.println(list); // [alpha, charlie, delta, echo, easy, earnest]

        list.removeIf(s -> s.startsWith("e") || s.startsWith("a"));

        System.out.println(list); // [charlie, delta]


    }
}
