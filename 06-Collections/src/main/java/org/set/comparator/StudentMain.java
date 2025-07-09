package org.set.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class StudentMain {

    public static void main(String[] args) {

        /**
         * All Students objects in TreeSet are added in natural sorting order wch we defined via Comparable imp
         */
        TreeSet<P5_Student> students = new TreeSet<>();
        students.add(new P5_Student(3, "Amit", 21));
        students.add(new P5_Student(1, "Bhavesh", 19));
        students.add(new P5_Student(4, "Chirag", 22));
        students.add(new P5_Student(2, "Deepak", 20));

        System.out.println(students);
        // [1 - Bhavesh - 19, 2 - Deepak - 20, 3 - Amit - 21, 4 - Chirag - 22]

        System.out.println();

        /**
         * Below we want to sort elements of Student in TreeSet in descending order of rollno
         * and so we are passing comparator obj via lambda exp
         */
        TreeSet<P5_Student> students2 = new TreeSet<>((o1,o2) -> o2.rollNo - o1.rollNo);
        students2.add(new P5_Student(3, "Amit", 21));
        students2.add(new P5_Student(1, "Bhavesh", 19));
        students2.add(new P5_Student(4, "Chirag", 22));
        students2.add(new P5_Student(2, "Deepak", 20));
        System.out.println(students2);
        // [4 - Chirag - 22, 3 - Amit - 21, 2 - Deepak - 20, 1 - Bhavesh - 19]
        System.out.println();

        /**
         * Below we want to sort elements of Student in TreeSet with students name in descending order
         * and so we are passing comparator obj via lambda exp
         * objects will be added in alphabetically descending order
         */
        TreeSet<P5_Student> students3 = new TreeSet<>((o1,o2) -> o2.name.compareTo(o1.name));
        students3.add(new P5_Student(3, "Amit", 21));
        students3.add(new P5_Student(1, "Bhavesh", 19));
        students3.add(new P5_Student(4, "Chirag", 22));
        students3.add(new P5_Student(2, "Deepak", 20));
        System.out.println(students3);
        // [2 - Deepak - 20, 4 - Chirag - 22, 1 - Bhavesh - 19, 3 - Amit - 21]
        System.out.println();



    }
}
