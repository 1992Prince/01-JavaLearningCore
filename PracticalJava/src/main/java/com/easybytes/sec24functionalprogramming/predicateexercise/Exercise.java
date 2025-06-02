package com.easybytes.sec24functionalprogramming.predicateexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise {

    public static List<Person> filterByAge(int age) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 28, "New York"));
        persons.add(new Person("Jane", 22, "Los Angeles"));
        persons.add(new Person("Jack", 30, "New York"));
        persons.add(new Person("Jill", 24, "Chicago"));

        // Write your code below
        // Predicate lambda expression to test if a person's age is greater than the specified age
        Predicate<Person> ageGreaterThan = person -> person.getAge() > age;


        //List<Person> filteredPersons = persons.stream().filter(ageGreaterThan).collect(Collectors.toList());
        List<Person> filteredPersons = persons.stream().filter(person -> person.getAge() > age).collect(Collectors.toList());

        return filteredPersons;
    }

    public static List<Person> filterByCity(String city) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 28, "New York"));
        persons.add(new Person("Jane", 22, "Los Angeles"));
        persons.add(new Person("Jack", 30, "New York"));
        persons.add(new Person("Jill", 24, "Chicago"));

        // Write your code below
        Predicate<Person> filterBycity = person -> person.getCity().equals(city);
        List<Person> filterBycityPersons = persons.stream().filter(filterBycity).collect(Collectors.toList());

        return filterBycityPersons;

    }

    public static void main(String[] args) {

        List<Person> filterBycity = filterByCity("New York");
        List<Person> filteredPersons = filterByAge(25);

        System.out.println("Person live in New York - " + filterBycity);
        System.out.println("Person above age 25 - " + filteredPersons);

    }

    public static List<Person> filter(List<Person> persons, Predicate<Person> predicate) {
        List<Person> filteredPersons = new ArrayList<>();
        for (Person person : persons) {
            if (predicate.test(person)) {
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }

}