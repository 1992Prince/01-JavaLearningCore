package com.easybytes.sec19generics.tim.p4comparator;

import java.util.*;
import java.util.Arrays;

public class Student {

    private static int LAST_ID = 1000;

    private static Random random = new Random();

    private String name;

    private int id;

    public double gpa;

    public Student(String name) {
        this.name = name;
        this.id = LAST_ID++;
        this.gpa = random.nextDouble(1.0, 4.0);
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");
        Student s4 = new Student("David");


        Student[] students = {s1, s2, s3, s4};
        /*
        //sorting list of students based on gpa
        Arrays.sort(students, Comparator.comparingDouble(o -> o.gpa));

        Yes, the statement Arrays.sort(students, Comparator.comparingDouble(o -> o.gpa));
        will indeed sort an array of Student objects in ascending order based on their GPA (Grade Point Average).

        System.out.println(Arrays.toString(students)); */

        // Sort students by GPA in descending order using the getter method
        Arrays.sort(students, Comparator.comparingDouble(Student::getGpa).reversed());
        System.out.println(Arrays.toString(students));

        // in ascending order
        Arrays.sort(students, Comparator.comparingDouble(Student::getGpa));
        System.out.println(Arrays.toString(students));

        // in descending order of name
        Arrays.sort(students, Comparator.comparing(Student::getName).reversed());
        System.out.println(Arrays.toString(students));

    }
}

