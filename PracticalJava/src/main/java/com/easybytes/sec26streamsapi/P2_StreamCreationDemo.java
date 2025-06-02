package com.easybytes.sec26streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class P2_StreamCreationDemo {

    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        // creating stream for collection obj i.e. departmentList obj
        // depStream is stream object
        Stream<String> depStream = departmentList.stream();

        /*
        Sometimes we want to convert normal stream to as a parallel stream
        above depStream is Stream obj wch is created using normal stream

        now we need to convert it into parallel Stream object
        below depParallelStreamObj is parallel Stream object and we converted
        normal stream object depStream to parallel stream obj using parallel() method
         */

        Stream<String> depParallelStreamObj = depStream.parallel();


        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println();

        /*
        Creating Stream object from Array using static method stream present
        in Arrays class
         */
        String[] arrayOfWords = {"Eazy", "Bytes"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println();

        /*
        Creating empty Stream using Stream class using static method empty()
        wch is present inside Stream class
         */
        Stream<String> emptyStream = Stream.empty();

        /*
        Couple of imp methods present inside Stream class

        Stream.generate()
        Stream.iterate()
         */



    }
}
