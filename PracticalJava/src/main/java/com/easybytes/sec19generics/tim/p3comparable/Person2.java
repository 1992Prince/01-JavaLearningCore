package com.easybytes.sec19generics.tim.p3comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Person2 implements Comparable<Person2>{

    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    @Override
    public int compareTo(Person2 o) {
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {

        /*
        I want to sort people objects based on their name in natural sorting order
         */

        Person2 p1 = new Person2("John", 20);
        Person2 p2 = new Person2("Mary", 30);
        Person2 p3 = new Person2("Bob", 40);
        Person2 p4 = new Person2("Alice", 25);

        Person2[] people = {p1, p2, p3, p4};

        // now sorting array of people objects
        Arrays.sort(people);
        System.out.println(Arrays.toString(people)); // [Alice (25), Bob (40), John (20), Mary (30)]

        System.out.println();

        // suppose u have list of people and we want to sort them based on their age
        List<Person2> peopleList = Arrays.asList(p1, p2, p3, p4);
        Collections.sort(peopleList);
        System.out.println(Arrays.toString(people)); // [Alice (25), Bob (40), John (20), Mary (30)]
    }
}
