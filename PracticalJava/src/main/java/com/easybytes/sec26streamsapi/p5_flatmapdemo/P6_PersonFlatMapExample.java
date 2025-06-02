package com.easybytes.sec26streamsapi.p5_flatmapdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P6_PersonFlatMapExample {

    public static void main(String[] args) {

        List<P6_PersonPojo> persons =
                Arrays.asList(
                        new P6_PersonPojo("Alice", Arrays.asList("123", "456")),
                        new P6_PersonPojo("Bob", Arrays.asList("789", "101", "112"))
                );


        /*
        persons is list of P6_PersonPojo class objects
        .map(P6_PersonPojo::getPhoneNumbers) is equivalent to
        .map(person -> person.getPhoneNumbers())

        below P6_PersonPojo is behaving like object of P6_PersonPojo class
         */
        List<List<String>> mapResult = persons.stream()
                .map(P6_PersonPojo::getPhoneNumbers)
                .collect(Collectors.toList());

        System.out.println("Using map: " + mapResult);
        // Using map: [[123, 456], [789, 101, 112]]

        System.out.println();

        // Using flatMap to flatten stream of phone numbers
        List<String> flatMapResult = persons.stream()
                .flatMap(person -> person.getPhoneNumbers().stream())
                .collect(Collectors.toList());

        System.out.println("Using flatMapResult: " + flatMapResult);
        // Using flatMapResult: [123, 456, 789, 101, 112]

        System.out.println();

    }
}
