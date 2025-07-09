package org.set.dilip;

import java.util.HashSet;

public class UseCase1 {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Dilip", 100);
        Student s2 = new Student(2, "Alice", 99);
        Student s3 = new Student(3, "Suresh", 88);
        Student s4 = new Student(1, "Dilip", 100);
        Student s5 = new Student(5, "Bob", 90);

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s5);

        System.out.println("Hashset size - " + hashSet.size()); // Hashset size - 5
        for(Student student: hashSet){
            System.out.println(student);
        }

        /**
         * Student{id=5, name='Bob', marks=90}
         * Student{id=1, name='Dilip', marks=100}
         * Student{id=2, name='Alice', marks=99}
         * Student{id=3, name='Suresh', marks=88}
         * Student{id=1, name='Dilip', marks=100}
         */

        /**
         * Here in memory 5 hashset objects are being created but
         * s1 and s4 have completely same data then Y HashSet is not checking Object data and
         * adding duplicates and giving size as 5
         *
         * So here it is adding duplicates in HashSet object
         * Ans s in UseCase2 java code
         */

    }
}
