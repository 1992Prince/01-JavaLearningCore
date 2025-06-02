package com.easybytes.sec26streamsapi;

import java.util.ArrayList;
import java.util.List;

public class P4_MapIntermediateOperation {

    /*
   If we have a scenario where we need to apply a business logic or transform each element
   inside a collection, we use map() method inside streams to process them.

   Stream map function takes lambda function as argument which is an implementation
   of a functional interface.

   map accepts Function lambda Functional interface
   
   map is an intermediate operation
   forEach is a terminal operation
     */

    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("hr");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        // only one intermediate operation - convert each element into uppercase and print
        /*departmentList.stream().map(dept -> dept.toUpperCase())
                .forEach(System.out::println);*/
        departmentList.stream().map(String::toUpperCase)
                .forEach(System.out::println);

        /*
        SUPPLY
        HR
        SALES
        MARKETING
         */

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println();

        /*
        2 intermediate operation -
         convert each element to uppercase
         then add prefix Hello
         then print it using terminal operation

         .map(dept -> dept.toUpperCase()) returns new stream
         .map(dept -> "Hello " + dept) works on new stream and return 3rd new stream
         now terminal operation operates on 3rd new stream
         */

        departmentList.stream()
                .map(dept -> dept.toUpperCase())
                .map(dept -> "Hello " + dept)
                .forEach(System.out::println);

        /*
        Hello SUPPLY
        Hello HR
        Hello SALES
        Hello MARKETING
         */
    }
}
