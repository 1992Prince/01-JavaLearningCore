package com.easybytes.sec26streamsapi;

import java.util.ArrayList;
import java.util.List;

public class P7_FilterIntermediateOperation {

    /*
    Streams filter operation
     */

    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("hr");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        // filter elements starting with S
        departmentList.stream()
                .filter(dept -> dept.startsWith("S"))
                .forEach(System.out::println);

        /*
        Sales
        Supply
         */

        System.out.println();

        // print words starting with S in capital letters
        departmentList.stream()
                .filter(dept -> dept.startsWith("S"))
                .map(dept -> dept.toUpperCase())
                .forEach(System.out::println);

        /*
        SALES
        SUPPLY
         */


    }
}
