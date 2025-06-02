package com.easybytes.sec27optionaljava8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class P3_StreamsAPINullCheckWithOpt {

    public static void main(String[] args) {

        List<String> countryList = Arrays.asList("USA", "India", null, "Canada", null, "UK", "France", null, null, "Germany");

        /*
        String::toUpperCase is equivalent to the lambda expression s -> s.toUpperCase()
        In Java, String::toUpperCase is a method reference that refers to the instance method toUpperCase of the String class.
        It is a shorthand notation for a lambda expression that converts a string to uppercase.

        Below line of code throws null pointer exception if any element is null in the list

         List<String> capitalNames = countryList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

         It can be avoided by using filter intermediate method with Predicate Objects::nonNull

         and if u want to check for null then use Objects::isNull

          .filter(Objects::nonNull) is equivalent to .filter(x -> x != null)
         */
        List<String> capitalNames = countryList.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("capitalNames - " + capitalNames);



    }
}
