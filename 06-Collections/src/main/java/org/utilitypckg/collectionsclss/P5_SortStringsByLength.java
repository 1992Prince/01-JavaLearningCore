package org.utilitypckg.collectionsclss;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P5_SortStringsByLength {

    /*
    Below we are sorting String element names by length in ascending order and then
    in descending order

    and
    (a, b) -> a.length() - b.length() vs  Comparator.comparingInt(String::length)
     */

    public static void main(String[] args) {

        // 🔹 1. Sort a List of Strings by Length
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "mango");

        Collections.sort(words, (a, b) -> a.length() - b.length());

        System.out.println(words);  // [kiwi, apple, mango, banana]

        System.out.println();



        // above lambda expression can be replaced with below

        List<String> words2 = Arrays.asList("apple", "banana", "kiwi", "mango");

        Collections.sort(words2, Comparator.comparingInt(String::length));

        System.out.println(words2);  // [kiwi, apple, mango, banana]

        System.out.println();


        // sort by length of names in descending order
        List<String> words3 = Arrays.asList("apple", "banana", "kiwi", "mango");

        Collections.sort(words3, Comparator.comparingInt(String::length).reversed());

        System.out.println(words3);  // [banana, apple, mango, kiwi]

        System.out.println();

    }
}
