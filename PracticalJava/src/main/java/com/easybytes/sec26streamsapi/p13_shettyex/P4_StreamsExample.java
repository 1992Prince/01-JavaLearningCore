package com.easybytes.sec26streamsapi.p13_shettyex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P4_StreamsExample {

    /*
    anyMatch is terminal operation
     */



    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Alexander");
        names.add("John");
        names.add("Bob");
        names.add("Michael");
        names.add("Amanda");


        List<String> names2 = List.of("Abhijeet", "Don", "Alen", "Adam", "Rama", "Aa");

        // merger both diff list and sort it and keep it in another list
        Stream<String> mergerdStream = Stream.concat(names.stream(), names2.stream());
        List<String> mergedList = (List<String>) mergerdStream.sorted().collect(Collectors.toList());
        System.out.println(mergedList);

        // [Aa, Abhijeet, Adam, Adam, Alen, Alexander, Amanda, Bob, Don, John, Michael, Rama]

        System.out.println();

        // check Adam is present in mergerList
        boolean bool = mergedList.stream().anyMatch(s -> s.equalsIgnoreCase("Adam"));
        System.out.println(bool); // true

        System.out.println();
        System.out.println();
        // print unique numbers from below list
        List<Integer> nums = Arrays.asList(3,2,2,7,5,1,9,7);
        List<Integer> uniqueList = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList); // [3, 2, 7, 5, 1, 9]

        // keep unique nums then sort it then get the 3rd index
        int rdnum = nums.stream().distinct().sorted().collect(Collectors.toList()).get(3);
        System.out.println("rdnum - " + rdnum); // rdnum - 5

        // keep unique nums then sort it then print the first 3 elements
        nums.stream().distinct().sorted().limit(3).forEach(s-> System.out.print(s+" ")); // 1 2 3

    }
}
