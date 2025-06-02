package com.easybytes.sec26streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class P11_StreamsAreTraversableOnlyOnce {

    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        // creating stream obj
        Stream<String> firstStreamObj = departmentList.stream();
        firstStreamObj.forEach(System.out::print);

        /*
        trying to traverse same stream obj again

        below line will throw java.lang.IllegalStateException: stream has already been operated upon or closed

         but if u r traversing new stream object then this exp will not be thrown
         */
        firstStreamObj.forEach(System.out::print);

    }
}
