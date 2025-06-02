package com.easybytes.sec26streamsapi.p13_shettyex;

import java.util.ArrayList;
import java.util.List;

public class P3_StreamsExample {

    /*
    Below forEach is a terminal operation
    We can also use terminal operation directly without using intermediate operation

    filter and map and sorted are intermediate operations
     */


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Alexander");
        names.add("John");
        names.add("Bob");
        names.add("Michael");
        names.add("Amanda");

        // print names whose length is greater than 4 with Uppercase
        names.stream().filter(s -> s.length() > 4)
                .forEach(name -> System.out.print(name.toUpperCase()+" ")); // ALEXANDER MICHAEL AMANDA

        System.out.println();
        System.out.println();

        // print names which last letter as 'a' with Uppercase
        names.stream().filter(s -> s.endsWith("a"))
                        .map(s -> s.toUpperCase())
                                .forEach(s -> System.out.println(s)); // AMANDA

        System.out.println();
        System.out.println();

        // print names starting with "A" in sorted order with UpperCase
        List<String> names2 = List.of("Abhijeet", "Don", "Alen", "Adam", "Rama", "Aa");
        names2.stream().filter(s -> s.startsWith("A"))
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        /*
        AA
        ABHIJEET
        ADAM
        ALEN
         */


    }
}
