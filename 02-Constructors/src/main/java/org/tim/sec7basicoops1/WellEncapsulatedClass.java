package org.tim.sec7basicoops1;

public class WellEncapsulatedClass {

    // ✓ All fields are private
    private String name;
    private int age;
    private double salary;
    private boolean isActive;

    // ✓ Constructor for initialization
    public WellEncapsulatedClass(String name, int age) {
        this.name = name;
        setAge(age);  // Use setter for validation
        this.salary = 0.0;
        this.isActive = true;
    }

    // ✓ Public getters for read access
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isActive() {
        return isActive;
    }

    // ✓ Public setters with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 0 and 150");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    // ✓ Private helper methods for internal logic
    private void logActivity(String action) {
        System.out.println("Activity logged: " + action);
    }
}
