package org.tim.sec7constructors2;

public class Notes1 {

    /**
     * 🔰 What is a Constructor?
     * A constructor is a special method used to initialize objects.
     * It has the same name as the class and no return type (not even void).
     *
     * public class Student {
     *     String name;
     *     int age;
     *
     *     // Constructor
     *     public Student() {
     *         name = "Unknown";
     *         age = 0;
     *     }
     * }
     *
     * Constructor Purpose
     *
     * Initialize object state - Set initial values for instance variables
     * Allocate resources - Open files, database connections, etc.
     * Perform validation - Check if provided data is valid
     * Setup object dependencies - Initialize other required objects
     *
     * Object Initialization Process
     * When you write Student s = new Student();, here's what happens:
     *
     * Memory is allocated for the object in heap
     * Instance variables are initialized with default values
     * Constructor is called for initialization
     *
     *
     * 🔄 Types of Constructors
     *
     * 1. Default Constructor
     * Provided by Java if no constructor is defined.
     *
     * class A {
     * }
     * Java will treat it like:
     *
     * class A {
     *     A() { super(); }
     * }
     *
     * 2. No-Argument Constructor
     * class A {
     *     A() {
     *         System.out.println("No-arg constructor");
     *     }
     * }
     *
     * 3. Parameterized Constructor
     * class A {
     *     A(int x) {
     *         System.out.println("Parameterized: " + x);
     *     }
     * }
     *
     * 🔁 Constructor Overloading
     * Same class, multiple constructors with different parameter lists.
     *
     * class A {
     *     A() {
     *         System.out.println("Default");
     *     }
     *     A(int x) {
     *         System.out.println("int");
     *     }
     *     A(String s) {
     *         System.out.println("String");
     *     }
     * }
     *
     * 🔗 Constructor Chaining
     * Calling one constructor from another within the same class using this() or from the superclass using super().
     *
     * 🔸 Using this()
     * class A {
     *     A() {
     *         this(10);  // Calls parameterized constructor
     *         System.out.println("Default constructor");
     *     }
     *     A(int x) {
     *         System.out.println("Parameterized: " + x);
     *     }
     * }
     *
     * 🔸 Using super()
     * Used to call the parent class constructor (MUST be first line).
     *
     * class Parent {
     *     Parent() {
     *         System.out.println("Parent constructor");
     *     }
     * }
     * class Child extends Parent {
     *     Child() {
     *         super(); // calls Parent()
     *         System.out.println("Child constructor");
     *     }
     * }
     *
     * 📜 Constructor Rules
     * Constructor name = Class name.
     * No return type (not even void).
     * Can be overloaded.
     * this() or super() must be first statement if used.
     * If no constructor is defined, Java provides a default one.
     *
     * ❓ What If No Constructor?
     * Java provides a default constructor if no constructor is written.
     * If any constructor is written (even parameterized), Java won’t create the default one anymore.
     *
     * 🎯 Purpose of Constructor
     * Initialize instance variables.
     * Perform setup logic when object is created.
     * Reduce boilerplate via overloading and chaining.
     */
}
