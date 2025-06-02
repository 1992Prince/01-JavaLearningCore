package com.easybytes.sec19generics.tim.p3comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }

    public static void main(String[] args) {

        /*
        I want to sort people objects based on their age in natural sorting order
         */

        Person p1 = new Person("John", 20);
        Person p2 = new Person("Mary", 30);
        Person p3 = new Person("Bob", 40);
        Person p4 = new Person("Alice", 25);

        Person[] people = {p1, p2, p3, p4};

        // now sorting array of people objects
        Arrays.sort(people);
        System.out.println(Arrays.toString(people)); // [John (20), Alice (25), Mary (30), Bob (40)]

        System.out.println();

        // suppose u have list of people and we want to sort them based on their age
        List<Person> peopleList = Arrays.asList(p1, p2, p3, p4);
        Collections.sort(peopleList);
        System.out.println(Arrays.toString(people)); // [John (20), Alice (25), Mary (30), Bob (40)]
    }
}
