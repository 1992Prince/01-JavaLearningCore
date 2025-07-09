package org.set.comparator.staticmeths;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Zara", 20),
                new Student("Amit", 22),
                new Student("Kunal", 21)
        );

        // 🔹 Sort by name using Comparator.comparing()
        List<Student> sorted = new ArrayList<>(students);
        sorted.sort(Comparator.comparing(s -> s.name));

        System.out.println("Sorted by name:");
        sorted.forEach(System.out::println);
        System.out.println();

        /**
         * Sorted by name:
         * Amit - 22
         * Kunal - 21
         * Zara - 20
         */

        // 🔹 Sort by age using Comparator.comparing()
        List<Student> sorted2 = new ArrayList<>(students);
        sorted2.sort(Comparator.comparing(s -> s.age));

        System.out.println("Sorted by age:");
        sorted2.forEach(System.out::println);
        System.out.println();

        /**
         * Sorted by age:
         * Zara - 20
         * Kunal - 21
         * Amit - 22
         */

        // 🔹 Sort by age descending order using Comparator.comparing()
        //  Use comparing() + reversed()
        List<Student> sorted3 = new ArrayList<>(students);
        sorted3.sort(Comparator.comparing((Student s) -> s.age).reversed());

        System.out.println("Sorted by age descending:");
        sorted3.forEach(System.out::println);
        System.out.println();

        /**
         * Sorted by age descending:
         * Amit - 22
         * Kunal - 21
         * Zara - 20
         */

        // 🔹 Sort by name using Comparator.comparing()
        List<Student> sorted4 = new ArrayList<>(students);
        sorted4.sort(Comparator.comparing((Student s) -> s.name).reversed());

        System.out.println("Sorted by name Descending:");
        sorted4.forEach(System.out::println);
        System.out.println();

        /**
         * Sorted by name Descending:
         * Zara - 20
         * Kunal - 21
         * Amit - 22
         */
    }
}
