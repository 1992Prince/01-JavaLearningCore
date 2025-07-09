package org.list.p11_customObjectSorting;

public class Student {

    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    // For printing nicely
    public String toString() {
        return name + " - " + marks;
    }
}
