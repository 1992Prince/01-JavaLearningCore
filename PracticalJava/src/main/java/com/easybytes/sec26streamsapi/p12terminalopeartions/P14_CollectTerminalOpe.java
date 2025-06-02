package com.easybytes.sec26streamsapi.p12terminalopeartions;

import java.util.List;
import java.util.stream.Collectors;

public class P14_CollectTerminalOpe {

    /*
    The collect() method in Java's Stream API is a terminal operation that transforms the elements of a stream into a different form,
    such as a collection, a concatenated string, or another object based on a custom logic.

    The collect() method requires a Collector, which is an interface that defines how to accumulate the stream elements into a container.
    The Java standard library provides several useful collectors through the Collectors utility class.

    e.g.
    .collect(Collectors.toList());
    .collect(Collectors.toSet()); etc.

    Suppose I have 100 elemnets in list and then I filtered it with even numbers and then can store these even numbers into new list using collector


     */

    public static void main(String[] args) {

        /*
         departmentList with values Supply, Hr, Sales, Marketing
         */
        List<String> deptList = List.of("Supply", "HR", "Sales", "Marketing");

        List<String> newDeptList = deptList.stream()
                .filter(dept -> dept.startsWith("S"))
                .collect(Collectors.toList());

        System.out.println("Filterd Dept List - " + newDeptList); // Filterd Dept List - [Supply, Sales]



    }
}
