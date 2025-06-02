package com.easybytes.sec26streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class P1_StreamCreationDemo {

    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        // creating stream for collection obj i.e. departmentList obj
        // depStream is stream object
        Stream<String> depStream = departmentList.stream();
        //depStream.forEach(dept -> System.out.println(dept));

        // using Class instance method reference
        depStream.forEach(System.out::println);

        /*
        Supply
        HR
        Sales
        Marketing
         */

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println();

        /*
        Another way of creating Stream object using Stream.of()
         */

        Stream<String> inStream = Stream.of("Eazy", "Bytes", "Java");
        inStream.forEach(val -> System.out.print(val + " ")); // Eazy Bytes Java

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println();

        /*
        When u r going to run your programme with normal streams, all your collection
        elements are going to be processed in sequence one by one with one of processor.

        Our lates laptop have multiple processors like Octacore etc.
        And with normal stream, remaining processors will sit ideal and only one processor
        will be used.

        So we have business req to process your elements parallely with help of
        all processors present in your laptop or inside in any server.
        With help of parallelStream method it can be achived
         */

        Stream<String> parallelStreamobj = departmentList.parallelStream();
        parallelStreamobj.forEach(System.out::println);

        /*
        Sales
        Marketing
        Supply
        HR

        Above u can see that oder of printed order is diff and not in sequence.
        This is bcoz here execution happened via parallel streams

        Normal Streams is going to process elements sequenuially
        In parallel stream output is getting displayed randomly bcoz all collection
        elements are going to be processed parallely and with this we are going to get
        lot of efficiencies.

         */




    }
}
