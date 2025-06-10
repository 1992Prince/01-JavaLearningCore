package org.inheritance.part1basics;

public class P1_Basics {

    /**
     * ✅ Topic 1: Basics of Inheritance in Java
     * 🔍 What is Inheritance?
     * Definition:
     * Inheritance in Java is a mechanism where one class (child/subclass) acquires the properties and behaviors (fields and methods) of another class
     * (parent/superclass).
     *
     * 🔗 Real-life Analogy:
     * Suppose Car is a parent class.
     * Tesla and BMW are subclasses — they inherit features like engine, wheels, etc., but add their own functionality like Autopilot, Sport mode.
     *
     * 📘 Java Syntax
     *
     * // Parent class
     * public class Animal {
     *     void sound() {
     *         System.out.println("Animal makes sound");
     *     }
     * }
     *
     * // Child class
     * public class Dog extends Animal {
     *     void bark() {
     *         System.out.println("Dog barks");
     *     }
     * }
     *
     * // Main
     * public class Test {
     *     public static void main(String[] args) {
     *         Dog d = new Dog();
     *         d.sound();  // Inherited method
     *         d.bark();   // Child’s own method
     *     }
     * }
     *
     * 🔧 Use Case in SDET Automation: Base Test Class
     * We often create a BaseTest class that contains common setup/teardown logic. All test classes then extend this base.
     *
     * // BaseTest.java
     * public class BaseTest {
     *     WebDriver driver;
     *
     *     @BeforeMethod
     *     public void setUp() {
     *         System.out.println("Launching Browser...");
     *         driver = new ChromeDriver();
     *     }
     *
     *     @AfterMethod
     *     public void tearDown() {
     *         System.out.println("Closing Browser...");
     *         driver.quit();
     *     }
     * }
     *
     * // LoginTest.java
     * public class LoginTest extends BaseTest {
     *
     *     @Test
     *     public void loginTest() {
     *         driver.get("https://example.com/login");
     *         System.out.println("Performing login...");
     *         // Actual login logic
     *     }
     * }
     *
     * 🎯 Key Points to Remember
     * | Concept                | Notes                                          |
     * | ---------------------- | ---------------------------------------------- |
     * | `extends` keyword      | Used to create inheritance                     |
     * | Child class            | Can use all public/protected members of parent |
     * | Constructors           | Not inherited                                  |
     * | Private members        | Not accessible in subclass                     |
     * | Helps with Reusability | Especially useful in test framework design     |
     *
     * ❓ Interview Perspective (Beginner Level)
     * Q: Why do we use inheritance in test automation frameworks?
     * A: To reuse setup, teardown, and common utility methods across test classes. It helps reduce code duplication.
     *
     * Q: What is inherited when a class extends another class?
     * A: All public and protected fields and methods (except constructors and private members).
     *
     * Q: Can constructors be inherited?
     * A: No, but child classes can call parent constructors using super().
     *
     * ⚡ Real-Time Benefit
     * In frameworks like:
     * Page Object Model (POM) → Common page methods in BasePage, inherited in LoginPage, HomePage.
     * BaseTest → Test Classes
     * DriverFactory → Utility Classes
     */
}
