package org.tim.sec7basicoops1;

// ============================================
// JAVA OOP CONCEPTS - INTERVIEW EXAMPLES
// ============================================

// 1. CLASS AND OBJECT BASICS
public class P1_Student {

    // Fields (Instance Variables) - Default values demo
    private String name;        // default: null
    private int age;           // default: 0
    private double gpa;        // default: 0.0
    private boolean isActive;  // default: false
    private char grade;        // default: '\u0000' (null character)

    // Constructor
    public P1_Student(String name, int age) {
        this.name = name;
        this.age = age;
        // gpa, isActive, grade will have default values
    }

    // GETTERS - Used to ACCESS private fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isActive() {  // Note: boolean getter often starts with 'is'
        return isActive;
    }

    public char getGrade() {
        return grade;
    }

    // SETTERS - Used to MODIFY private fields
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {  // Validation in setter
            this.age = age;
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    public void setGrade(char grade) {
        if (grade >= 'A' && grade <= 'F') {
            this.grade = grade;
        }
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Active: " + isActive);
        System.out.println("Grade: " + grade);
    }
}
