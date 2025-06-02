package com.easybytes.sec26streamsapi.p13_shettyex;

import java.util.ArrayList;
import java.util.List;

public class P2_StreamsExample {

    /*
    Below forEach is a terminal operation
    We can also use terminal operation directly without using intermediate operation
     */


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Alexander");
        names.add("John");
        names.add("Bob");
        names.add("Michael");
        names.add("Amanda");

        // print all names present in list
        names.stream().forEach(name -> System.out.print(name + " ")); // Adam Alexander John Bob Michael Amanda

        System.out.println();
        System.out.println();

        // print names whose lenght is greater than 4

        // names.stream().filter(name -> name.length() > 4)
        //         .forEach(name -> System.out.print(name+" ")); // Alexander Michael Amanda
        names.stream().filter(name -> name.length() > 4).forEach(System.out::println);

    }
}
