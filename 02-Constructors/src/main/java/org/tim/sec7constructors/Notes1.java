package org.tim.sec7constructors;

public class Notes1 {

    /**
     * 🔰 What is a Constructor?
     * A constructor is a special method used to initialize objects.
     * It has the same name as the class and no return type (not even void).
     * A Java constructor cannot be abstract, static, final, and synchronized
     * But Constructor can have modifiers public, private, protected and default
     *
     * public class Student {
     *     String name;
     *     int age;
     *
     *     // default constructor
     *     public Student() {
     *         name = "Unknown";
     *         age = 0;
     *     }
     * }
     *
     * 🔍 Constructor Purpose
     *
     * ✔️ Initialize object state - Set initial values for instance variables
     * ✔️ Allocate resources - Open files, database connections, etc.
     * ✔️ Perform validation - Check if provided data is valid
     * ✔️ Setup object dependencies - Initialize other required objects
     *
     * 🔍 Object Initialization Process
     * When you write Student s = new Student();, here's what happens:
     *
     * ✔️ Memory is allocated for the object in heap
     * ✔️ Instance variables are initialized with default values
     * ✔️ Constructor is called for initialization
     *
     * 🔍 Types of Java Constructors
     * There are two types of constructors in Java:
     *  => Default Constructor (No-arg constructor)
     *  => Parameterized Constructor
     *
     * 🔄 Types of Constructors
     *
     * 🔵 1. Default Constructor
     * Provided by Java if no constructor is defined.
     * When a constructor does not have any parameter, is known as default constructor.
     *
     * 🔵 Rule: If there is no constructor in a class, compiler automatically creates a default constructor.
     *
     * class A {
     * }
     * Java will treat it like:
     *
     * class A {
     *     A() { super(); }
     * }
     *
     * 🔵 2. No-Argument Constructor
     * class A {
     *     A() {
     *         System.out.println("No-arg constructor");
     *     }
     * }
     *
     * 🔍 Q) What is the purpose of a default constructor?
     * The default constructor is used to provide the default values to the object like 0, null, etc.,
     * depending on the type.
     *
     * 🔵 3. Parameterized Constructor
     * A constructor that has a specific number of parameters is called a parameterized constructor.
     *
     * class A {
     *     int id;
     *     A(int x) {
     *         id = x;
     *         System.out.println("Parameterized: " + x);
     *     }
     * }
     *
     * 🔍 Why use the parameterized constructor?
     * The parameterized constructor is used to provide different values to distinct objects.
     * However, you can provide the same values also.
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
     *
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
