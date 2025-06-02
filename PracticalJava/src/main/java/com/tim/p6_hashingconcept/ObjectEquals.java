package com.tim.p6_hashingconcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ObjectEquals {

    public static void main(String[] args) {

        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l", "He", "lo");
        String dText = "He".concat("llo");
        String eText = "hello";

        List<String> hellos = Arrays.asList(aText, bText, cText, dText, eText);

        hellos.forEach(s -> System.out.println(s + " : " + s.hashCode()));

        /**
         * Hello : 69609650
         * Hello : 69609650
         * Hello : 69609650
         * Hello : 69609650
         * hello : 99162322
         *
         * aText, bText, cText, dText are all the same objects and so they are printing same hascode values
         * eText is a different object and so it is printing a different hashcode value
         */

        System.out.println();

        /**
         * Lets create HashSet class
         * HashSet class implements Set interface and tracks duplicates by their hashcode.
         * HashSet will only add new references to its collection if it doesn't find a match in its collection, first
         * using the hashcode and then the Objects equals method.
         * It uses the hashcode to create a bucket identifier to store a new reference
         * How HashSet works internally we will learn later but understand  how equality and hashcode go hand in hand when using hashed collections.
         *
         * hellos list have 5 objects references wch we passed to mySet HashSet class
         * mySet HashSet class will only add 2 objects references to its collection
         * 1. aText, bText, cText, dText are all the same objects and so they are printing same hascode values
         * 2. eText is a different object and so it is printing a different hashcode value
         */

        HashSet<String> mySet = new HashSet<>(hellos);

        System.out.println("mySet = " + mySet);                  // mySet = [Hello, hello]
        System.out.println("mySet.size() = " + mySet.size());    // mySet.size() = 2
    }
}
