package org.set.comparator;

/**
 * Showing both Comparable for natural sorting order of custom class and
 * Comparator for diff sorting strategies
 */
public class P5_Student implements Comparable<P5_Student>{

    int rollNo;
    String name;
    int age;

    P5_Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    // Natural ordering: sort by rollNo
    @Override
    public int compareTo(P5_Student other) {
        return this.rollNo - other.rollNo;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name + " - " + age;
    }

}
