package org.com.p2studentmanagementsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    static List<Student> studentList;

    public static void main(String[] args) {

        Student student1 = new Student("Muthu", 21, "S-121");
        student1.enrollCourse("Java");
        student1.enrollCourse("DSA");
        student1.enrollCourse("Devops");

        System.out.println();

        Student student2 = new Student("Ashwin", 22, "S-13");
        student2.enrollCourse("java");
        student2.enrollCourse("devops");

        System.out.println();

        Student student3 = new Student("Deepthi", 23, "S-14");
        student3.enrollCourse("java");

        studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        findStudentById("S-14");
        findStudentById("S-141");

        System.out.println("Student list before sorting by name : " + studentList);
        // sort list by name alphabetically
        sortByName();
        System.out.println("Student list after sorting by name : " + studentList);

        // very similar in future do sorting element Student list names by age
        // sortByAge();
    }

    private static void sortByName() {

       /* Comparator<Student> myComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getName().compareTo(o2.getName()));
            }
        };*/
        // abvoe can be written in lambda way also like below bcoz Compartor is functional interface
        Comparator<Student> myComparator = (o1,o2) -> o1.getName().compareTo(o2.getName());
        Collections.sort(studentList, myComparator);
    }

    static Student findStudentById(String studentId) {

        Student studObjResult = null;
        try {
            studObjResult = studentList.stream().filter(obj -> obj.getStudentId().equals(studentId))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("No Data Found!!!"));

            System.out.println(studObjResult);
        } catch (RuntimeException e) {
            System.err.println("Student with id: " + studentId + " is not available.");
        }

        return studObjResult;

    }

}
