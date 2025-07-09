package org.list.p11_customObjectSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomArrayListDemo {

    public static void main(String[] args) {

        // ✅ Step 2: Create list
        List<Student> students = new ArrayList<>();

        // ✅ Step 3: Add students
        students.add(new Student("Aman", 85));
        students.add(new Student("Priya", 95));
        students.add(new Student("Rahul", 75));
        students.add(new Student("Neha", 85));
        students.add(new Student("Zoya", 60));

        // ✅ Original List
        System.out.println("Original List:");
        students.forEach(System.out::println);

        /**
         * Original List:
         * Aman - 85
         * Priya - 95
         * Rahul - 75
         * Neha - 85
         * Zoya - 60
         */

        System.out.println();

        // ✅ Sort by marks descending
        students.sort(Comparator.comparingInt((Student s) -> s.marks).reversed());
        System.out.println("\nSorted by marks (descending):");
        students.forEach(System.out::println);

        /**
         * Sorted by marks (descending):
         * Priya - 95
         * Aman - 85
         * Neha - 85
         * Rahul - 75
         * Zoya - 60
         */

        System.out.println();

        // ✅ Sort by marks ascending
        students.sort(Comparator.comparingInt(s -> s.marks));
        System.out.println("\nSorted by marks (ascending):");
        students.forEach(System.out::println);
        /**
         * Sorted by marks (ascending):
         * Zoya - 60
         * Rahul - 75
         * Aman - 85
         * Neha - 85
         * Priya - 95
         */

        System.out.println();

        /**
         * Why we are doing casting in reversed method above?
         * students.sort(Comparator.comparingInt(s -> s.marks));           // ✅ No casting
         * students.sort(Comparator.comparingInt((Student s) -> s.marks)); // ✅ With explicit type
         *
         * Why are both valid? Aur kab hume type (Student s) likhna padta hai?
         *
         * ✅ Java Type Inference — The Real Reason
         * Comparator.comparingInt(s -> s.marks)
         * Java infers the type of s from the context — it knows students is a List<Student>, so s must be a Student.
         * That's called type inference.
         *
         * 🔹 But in this:
         *
         * Comparator.comparingInt((Student s) -> s.marks).reversed()
         * Tu ne explicitly type diya — (Student s) — but it's not required.
         * You can totally do:
         * students.sort(Comparator.comparingInt(s -> s.marks).reversed());
         */

        System.out.println();
        // ✅ Sort by name alphabetically
        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("\nSorted by name:");
        students.forEach(System.out::println);
        /**
         * Sorted by name:
         * Aman - 85
         * Neha - 85
         * Priya - 95
         * Rahul - 75
         * Zoya - 60
         */

        System.out.println();
        //  // ✅ Sort by name alphabetically reversed
        //students.sort(Comparator.comparing(Student::getName).reversed());
        // or
        students.sort(Comparator.comparing((Student s) -> s.name).reversed());
        System.out.println("\nSorted by name:");
        students.forEach(System.out::println);
        /***
         * Sorted by name:
         * Zoya - 60
         * Rahul - 75
         * Priya - 95
         * Neha - 85
         * Aman - 85
         */


    }
}
