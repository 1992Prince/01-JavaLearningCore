package org.set.comparator.staticmeths;

/**
 * comparing() is an static method present in Comparator interface
 * ✅ 1. Comparator.comparing() — Custom object field ke basis pe sort karna
 */
public class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " - " + age;
    }
}
