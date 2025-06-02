package com.easybytes.sec25lambdaexp.tim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P1_Main {

    record Person(String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {

        // creating list of Person record
        List<Person> people = new ArrayList<>(Arrays.asList(
                new P1_Main.Person("Lucy", "Van Pelt"),
                new Person("Sally", "Brown"),
                new Person("Alice", "Smith"),
                new Person("Bob", "Johnson")
        ));

        // using anonymous class
        var comparatorLastName = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };

        // sort people list by last name
        people.sort(comparatorLastName);
        System.out.println(people); // [Sally Brown, Bob Johnson, Alice Smith, Lucy Van Pelt]

        System.out.println();
        System.out.println("=".repeat(50));
        System.out.println();

        // also instead of creating anonymous class imp reference and passing it as param,
        // we can directly pass anonymous class imp as parameter
        people.sort(new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        });

        System.out.println(people); // [Sally Brown, Bob Johnson, Alice Smith, Lucy Van Pelt]

        System.out.println();
        System.out.println("=".repeat(50));
        System.out.println();

        // using lambda expression - I can also replace anonymous class imp with lambda expression
        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
        System.out.println(people); // [Sally Brown, Bob Johnson, Alice Smith, Lucy Van Pelt]


    }
}

