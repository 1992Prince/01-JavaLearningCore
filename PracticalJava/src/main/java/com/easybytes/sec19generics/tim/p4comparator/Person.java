package com.easybytes.sec19generics.tim.p4comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {

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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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

        /*
        // now sorting array of people objects
        Arrays.sort(people); will throw ClassCastException bcoz Person class is not implementing Comparable interface
        and we can't compare its objects to each other.

        So suppose we don't want to edit Person class and still we want to compare its objects then we should use
        Comparator interface
         */

        // sort by name using Comparator in natural order
        Arrays.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Arrays asc order of name - " + Arrays.toString(people));
        // Arrays asc order of name - [Alice (25), Bob (40), John (20), Mary (30)]

        System.out.println();
        // sort by name using Comparator in desc order
        Arrays.sort(people, Comparator.comparing(Person::getName).reversed());
        System.out.println("Arrays desc order of name - " + Arrays.toString(people));
        // Arrays desc order of name - [Mary (30), John (20), Bob (40), Alice (25)]

        System.out.println();

        // sort by age using Comparator in natural order
        Arrays.sort(people, Comparator.comparing(Person::getAge));
        System.out.println("Arrays asc order of age - " + Arrays.toString(people));
        // Arrays asc order of age - [John (20), Alice (25), Mary (30), Bob (40)]

        System.out.println();

        // sort by age using Comparator in desc order
        Arrays.sort(people, Comparator.comparing(Person::getAge).reversed());
        System.out.println("Arrays desc order of age - " + Arrays.toString(people));
        // Arrays desc order of age - [Bob (40), Mary (30), Alice (25), John (20)]


        System.out.println();
        System.out.println("---------------------------Sorting List of Person objs------------------------------------");
        System.out.println();

        // suppose u have list of people and we want to sort them based on their age in asc order
        List<Person> peopleList = Arrays.asList(p1, p2, p3, p4);
        Collections.sort(peopleList, Comparator.comparing(Person::getAge));
        System.out.println("Asc order by age - " + peopleList);
        // Asc order by age - [John (20), Alice (25), Mary (30), Bob (40)]

        System.out.println();

        // sorting in desc order of age
        Collections.sort(peopleList, Comparator.comparing(Person::getAge).reversed());
        System.out.println("Desc order by age - " + peopleList);
        // Desc order by age - [Bob (40), Mary (30), Alice (25), John (20)]

        System.out.println();

        // sorting in desc order of name
        Collections.sort(peopleList, Comparator.comparing(Person::getName).reversed());
        System.out.println("Desc order by name - " + peopleList);
        // Desc order by name - [Mary (30), John (20), Bob (40), Alice (25)]


    }
}
