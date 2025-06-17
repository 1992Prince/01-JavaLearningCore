package org.com.p2studentmanagementsystem;

public class Main {

    public static void main(String[] args) {

        // Student student1 = new Student("Abhinav", 1,"101");
        // Student student1 = new Student("Abhinav1221", 21,"101"); // name should not have alphabets
        // Student student1 = new Student("Abhinav", 21, "101");
        Student student1 = new Student("Abhinav", 21, "S-121");
        student1.enrollCourse("Java");
        student1.enrollCourse("DSA");
        student1.enrollCourse("Devops");
        student1.enrollCourse("Devops");
        student1.enrollCourse("geography");
        student1.printStudentInfo();
        System.out.println(student1);

        System.out.println();

        Student student2 = new Student("Ashwin", 22, "S-13");
        student2.enrollCourse("java");
        student2.enrollCourse("devops");
        student2.printStudentInfo();
        System.out.println(student2);

        System.out.println();

        Student student3 = new Student("Azar", 23, "S-14");
        student3.enrollCourse("java");
        student3.printStudentInfo();
        System.out.println(student3);
    }
}
