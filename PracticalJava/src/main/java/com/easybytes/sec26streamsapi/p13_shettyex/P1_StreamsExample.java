package com.easybytes.sec26streamsapi.p13_shettyex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P1_StreamsExample {

    /*
    count number of names starting with Alphabet A in list
    Here intermediate operation is filter() and terminal operation is count and collect
     */

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Alexander");
        names.add("John");
        names.add("Bob");
        names.add("Michael");
        names.add("Amanda");

        // stream returning list of names starting with "A"
        List<String> newList = names.stream().filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(newList);  // [Adam, Alexander, Amanda]

        System.out.println();

        // stream returning count of names starting with "A"
        long count = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(count);   // 3
    }
}
