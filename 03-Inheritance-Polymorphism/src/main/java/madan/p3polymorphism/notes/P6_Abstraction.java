package madan.p3polymorphism.notes;

public class P6_Abstraction {

    /**
     * 🔷 What is Abstraction in Java?
     * Abstraction means hiding internal details and showing only essential features to the user.
     *
     * 🔸 Like:
     * You drive a car — you don’t need to know how the engine works, only how to use steering, brake, etc.
     *
     * 🔹 Java me Abstraction kaise achieve hoti hai?
     * ✅ 1. Abstract Classes
     * ✅ 2. Interfaces (pure abstraction – we’ll cover separately)
     *
     * 🔷 1. Abstract Class
     * 📌 Definition:
     * A class declared with the abstract keyword
     * It can have abstract methods (without body)
     * Can also have concrete methods (with body)
     * Cannot be instantiated (no new object)
     * it have constructors
     *
     * ✅ Syntax:
     * abstract class Vehicle {
     *     abstract void start();  // abstract method (no body)
     *
     *     void fuel() {           // concrete method
     *         System.out.println("Petrol or Diesel");
     *     }
     * }
     *
     * 🔷 2. Abstract Method
     * 📌 Definition:
     * A method declared without body using abstract keyword
     *
     * Must be implemented in the subclass
     *
     * abstract class Animal {
     *     abstract void sound(); // only declaration
     * }
     *
     * 🔷 3. Rules of Abstract Classes
     * | Rule | Description                                                              |
     * | ---- | ------------------------------------------------------------------------ |
     * | ✅    | Can have constructors (for initialization)                               |
     * | ✅    | Can have static methods                                                  |
     * | ✅    | Can have final methods                                                   |
     * | ❌    | Cannot be instantiated                                                   |
     * | ✅    | Can have **non-abstract** methods                                        |
     * | ✅    | A subclass must **override** all abstract methods unless itself abstract |
     *
     * 🔷 4. Abstract Variables?
     * ❌ NO SUCH THING as abstract variables in Java.
     * ⚠️ Why?
     * Variables don’t have a body — they can't be “abstract”.
     *
     * You can declare variables normally in abstract class:
     * Only methods can be abstract. Not variables.
     *
     * ✅ Real Example:
     *
     * abstract class Shape {
     *     abstract void draw();  // abstract method
     *
     *     void color() {
     *         System.out.println("Color is Red");
     *     }
     * }
     *
     * class Circle extends Shape {
     *     void draw() {
     *         System.out.println("Drawing Circle");
     *     }
     * }
     *
     * public class Main {
     *     public static void main(String[] args) {
     *         Shape s = new Circle(); // Allowed via reference
     *         s.draw();     // Drawing Circle
     *         s.color();    // Color is Red
     *     }
     * }
     *
     * 🔥 Tricky Points (Interview Style) — Updated for Full Clarity
     * | ✅ / ❌ | **Case**                                             | **Explanation**                                                                                                                                          |
     * | ----- | ---------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
     * | ❌     | `abstract` + `final` method                          | ❌ Invalid: `final` method can't be overridden, but `abstract` must be overridden. Contradiction.                                                         |
     * | ❌     | `abstract` + `private` method                        | ❌ Invalid: `private` can't be accessed in subclass, so can't be overridden.                                                                              |
     * | ✅     | `abstract` + `static` method                         | ✅ Technically allowed **in abstract class**, but `static` method **can’t be overridden**, so it can’t be abstract. So this combination is ❌ for methods. |
     * | ✅     | Abstract class with **no abstract method**           | ✅ Allowed. Purpose is to prevent instantiation (like partial blueprint or base template).                                                                |
     * | ✅     | Abstract class can have **concrete methods**         | ✅ Yes! That’s the whole point of **partial abstraction** — reuse common logic in base class.                                                             |
     * | ✅     | Abstract class can have **constructors**             | ✅ Yes! Constructor runs when subclass object is created — useful to initialize common state.                                                             |
     * | ✅     | Abstract class can have **variables**                | ✅ Yes! Normal, static, final — all allowed. No concept of “abstract variable”.                                                                           |
     * | ✅     | Abstract class can **implement** an interface        | ✅ Yes! Must implement all methods, or remain abstract.                                                                                                   |
     * | ✅     | Subclass must override **all abstract methods**      | ✅ Yes, unless the subclass is also declared `abstract`.                                                                                                  |
     * | ✅     | Abstract class can **extend another abstract class** | ✅ Yes, and it can inherit + override abstract methods partially or fully.                                                                                |
     *
     *
     * 🎯 What is the Actual Purpose of Abstract Class?
     * Abstract class is used to:
     *
     *1)  Provide partial abstraction
     * i.e., define some behavior (concrete methods)
     * leave some behavior to be defined by child class (abstract methods)
     *
     * 2) Avoid object creation of incomplete or generic classes
     * e.g., Shape, Vehicle, Animal — don’t create objects of these
     *
     * 3) Promote code reuse
     * Common methods can go in abstract class and reused by all subclasses
     *
     * 4) Act as base template
     * Like a guideline: all child classes must implement these features
     *
     * 🎯 Example Summary
     * abstract class Animal {
     *     String type = "Animal";  // variable (allowed)
     *
     *     Animal() {
     *         System.out.println("Animal constructor");
     *     }
     *
     *     static void info() {         // static method (allowed)
     *         System.out.println("Animal static method");
     *     }
     *
     *     final void eat() {           // final method (allowed)
     *         System.out.println("Animal eats");
     *     }
     *
     *     void sleep() {               // concrete method
     *         System.out.println("Animal sleeps");
     *     }
     *
     *     abstract void sound();       // abstract method
     * }
     *
     * class Dog extends Animal {
     *     void sound() {
     *         System.out.println("Dog barks");
     *     }
     * }
     *
     * 🔷 What is an Abstract Method?
     * An abstract method is a method declared without implementation (no body), using the abstract keyword.
     * abstract void sound(); // declaration only
     *
     * 🔥 Purpose of Abstract Method
     * ✅ 1. Force subclasses to implement behavior
     * It acts as a contract — saying:
     * “If you're extending me, you MUST define this behavior!”
     * For example:
     *
     * abstract class Animal {
     *     abstract void sound(); // subclass MUST implement this
     * }
     *
     * class Dog extends Animal {
     *     void sound() {
     *         System.out.println("Dog barks");
     *     }
     * }
     *
     * If subclass doesn’t override, you'll get compile-time error, unless subclass is also declared abstract.
     *
     * ✅ 2. Enable abstraction (hide implementation)
     * It lets you write code where the what is defined, but not the how.
     * e.g. “Every Shape must implement draw(), but how they draw is up to them
     *
     * abstract class Shape {
     *     abstract void draw(); // circle, rectangle, etc. will implement differently
     * }
     */
}
