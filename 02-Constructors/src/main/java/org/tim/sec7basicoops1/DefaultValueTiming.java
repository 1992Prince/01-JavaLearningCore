package org.tim.sec7basicoops1;

// QUESTION 1: WHEN JVM ASSIGNS DEFAULT VALUES TO INSTANCE VARIABLES?
public class DefaultValueTiming {

    private int value;        // Default value assigned when object is created
    private String name;      // Default value assigned when object is created

    public DefaultValueTiming() {
        // At this point, JVM has ALREADY assigned default values
        System.out.println("In constructor - value: " + value); // prints 0
        System.out.println("In constructor - name: " + name);   // prints null
    }

    // BEST PRACTICES for initializing instance variables:

    // Method 1: Direct initialization (happens before constructor)
    private int score = 100;
    private String status = "ACTIVE";

    // Method 2: Initialization block (runs before constructor)
    private double percentage;
    {
        percentage = 85.5;  // Instance initialization block
        System.out.println("Instance block executed");
    }

    // Method 3: Constructor initialization
    private String grade;
    public DefaultValueTiming(String grade) {
        this.grade = grade;  // Initialize in constructor
    }
}
