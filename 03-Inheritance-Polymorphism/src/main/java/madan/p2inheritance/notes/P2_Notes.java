package madan.p2inheritance.notes;

public class P2_Notes {

    /**
     * =============================================
     * 📘 Inheritance in Java — Q&A Style Notes
     * =============================================
     *
     * 🔹 1. Which keyword is used to achieve inheritance in Java?
     * - Java uses the `extends` keyword to allow one class to inherit from another.
     *
     * ✅ Example:
     *   class Animal {
     *       void eat() { System.out.println("eating..."); }
     *   }
     *
     *   class Dog extends Animal {
     *       void bark() { System.out.println("barking..."); }
     *   }
     *
     *   Dog d = new Dog();
     *   d.eat(); // inherited from Animal
     *   d.bark(); // own method
     *
     * ------------------------------------------------------------
     *
     * 🔹 2. If the parent class has no default constructor, do we need to call `super()` in child?
     * - Yes. If the parent only has a parameterized constructor, child must explicitly call `super(arguments)`.
     *
     * ✅ Example:
     *   class Parent {
     *       Parent(String name) {
     *           System.out.println("Parent: " + name);
     *       }
     *   }
     *
     *   class Child extends Parent {
     *       Child(String name) {
     *           super(name); // mandatory
     *           System.out.println("Child: " + name);
     *       }
     *   }
     *
     * ------------------------------------------------------------
     *
     * 🔹 3. How are parent and child objects initialized in Java?
     * - Initialization order:
     *   1. Parent class static blocks
     *   2. Child class static blocks
     *   3. Parent instance blocks + constructor
     *   4. Child instance blocks + constructor
     *
     * ✅ Example:
     *   class A {
     *       A() { System.out.println("A constructor"); }
     *   }
     *   class B extends A {
     *       B() { System.out.println("B constructor"); }
     *   }
     *   new B();
     *   // Output:
     *   // A constructor
     *   // B constructor
     *
     * ------------------------------------------------------------
     *
     * 🔹 4. If I want only my subclasses to access a parent class field, should I use `public` or `protected`?
     * - Use `protected` → accessible in:
     *   ✔ Same package
     *   ✔ Subclasses even in different package
     * - `public` → accessible to all
     *
     * ✅ Example:
     *   class Parent {
     *       protected int value = 42;
     *   }
     *
     *   class Child extends Parent {
     *       void show() {
     *           System.out.println(value); // accessible
     *       }
     *   }
     *
     * ------------------------------------------------------------
     *
     * 🔹 5. Where should we keep common attributes in inheritance?
     * - Common attributes go in the **superclass** to promote reusability and avoid duplication.
     *
     * ✅ Example:
     *   class Person {
     *       String name;
     *   }
     *   class Student extends Person {
     *       int rollNo;
     *   }
     *   class Teacher extends Person {
     *       String subject;
     *   }
     *
     * ------------------------------------------------------------
     *
     * 🔹 6. Can subclasses be in the same package or a different one?
     * - ✅ Both are allowed.
     *   - If in same package: can access default, protected, and public members.
     *   - If in different package: can access **protected** and **public** members only.
     *
     * ------------------------------------------------------------
     *
     * 🔹 7. Can we override parent class methods or fields in child class?
     * - ✅ Non-final, non-static methods can be **overridden**.
     * - ❌ Final methods → cannot be overridden.
     * - ❌ Static methods → cannot be overridden, only hidden (method hiding).
     * - Fields can be **redeclared** in subclass, but they’re hidden — not overridden.
     *
     * ✅ Example:
     *   class A {
     *       void show() { System.out.println("Parent"); }
     *   }
     *   class B extends A {
     *       @Override
     *       void show() { System.out.println("Child"); }
     *   }
     *   new B().show(); // Output: Child
     *
     * ------------------------------------------------------------
     *
     * 🔹 8. Can we inherit from multiple classes in Java?
     * - ❌ No — Java does **not support multiple inheritance with classes** to avoid ambiguity (Diamond Problem).
     * - ✅ Java allows multiple inheritance via **interfaces**.
     *
     * ✅ Example using interfaces:
     *   interface A { void methodA(); }
     *   interface B { void methodB(); }
     *   class MyClass implements A, B {
     *       public void methodA() { ... }
     *       public void methodB() { ... }
     *   }
     *
     */

}
