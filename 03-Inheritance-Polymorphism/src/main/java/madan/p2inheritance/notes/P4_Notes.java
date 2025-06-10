package madan.p2inheritance.notes;

public class P4_Notes {

    /**
     * ==========================================
     * 📘 Inheritance — Is-A, Has-A, Casting Notes
     * ==========================================
     *
     * 🔹 Q1: What is an Is-A relationship in Java?
     * ➤ Is-A represents **inheritance**. It defines that one class **is a type of** another.
     *    This relationship is established using the `extends` or `implements` keyword.
     *
     * ✅ Example:
     *   class Animal {
     *       void eat() { System.out.println("eating..."); }
     *   }
     *   class Dog extends Animal {
     *       void bark() { System.out.println("barking..."); }
     *   }
     *   // Dog IS-A Animal
     *   Dog d = new Dog();
     *   d.eat();  // inherited
     *
     * ------------------------------------------------------------
     *
     * 🔹 Q2: What is a Has-A relationship in Java?
     * ➤ Has-A represents **composition or aggregation**. One class contains an instance of another.
     *    It's used to **reuse functionality** instead of inheritance.
     *
     * ✅ Example:
     *   class Engine {
     *       void start() { System.out.println("Engine starting..."); }
     *   }
     *   class Car {
     *       Engine engine;
     *       Car(Engine e) { this.engine = e; } // constructor injection
     *   }
     *   // Car HAS-A Engine
     *
     * ------------------------------------------------------------
     *
     * 🔹 Q3: What are differences between Is-A and Has-A relationships?
     *
     * | Feature          | Is-A (Inheritance)         | Has-A (Composition)            |
     * |------------------|-----------------------------|--------------------------------|
     * | Keyword          | extends / implements        | object inside another class    |
     * | Relationship     | "is a"                      | "has a"                        |
     * | Type             | Strong coupling             | Loose coupling                 |
     * | Flexibility      | Less flexible               | More flexible (favors design)  |
     * | Use case         | Common base behavior        | Reuse without inheritance      |
     *
     * ✅ Is-A Example:
     *   class Student extends Person { }
     *
     * ✅ Has-A Example:
     *   class Department {
     *       Professor prof;  // Has-A relationship
     *   }
     *
     * ------------------------------------------------------------
     *
     * 🔹 Q4: What does a subclass inherit from its superclass?
     * ➤ Subclasses inherit:
     *   ✔ public members
     *   ✔ protected members
     *   ✔ default (package-private) members (if in same package)
     *   ❌ private members are NOT inherited.
     *
     * ➤ Important Notes:
     * - Constructors and initializer blocks (static/instance) are **not inherited**.
     * - Static members are inherited, but accessed via class name.
     *
     * ✅ Example:
     *   class Parent {
     *       protected int age = 40;
     *       private String name = "John";
     *   }
     *   class Child extends Parent {
     *       void show() {
     *           System.out.println(age);  // ✅ Accessible
     *           // System.out.println(name); ❌ Not accessible
     *       }
     *   }

     * 🔹 Q1: Are static members and static methods inherited in Java?
     *
     * ➤ Static members (variables and methods) are inherited by subclasses.
     *    BUT — they are **not polymorphic**.
     *    This means overriding static methods doesn't work the same as instance methods.
     *
     * ✅ Example:
     *   class A {
     *       static void display() { System.out.println("A"); }
     *   }
     *   class B extends A {
     *       static void display() { System.out.println("B"); } // hides, not overrides
     *   }
     *   A obj = new B();
     *   obj.display();  // Output: A (not B)
     *
     * ⚠️ Note:
     * - Static methods belong to class, not instance.
     * - Use `ClassName.method()` syntax ideally.
     * ------------------------------------------------------------
     * ------------------------------------------------------------
     *
     * 🔹 Q7: Best practices with inheritance and casting:
     * ✅ Prefer composition (Has-A) over inheritance when:
     *   - You don’t need polymorphism
     *   - You want flexibility and loose coupling
     *
     * ✅ Use inheritance when:
     *   - Classes share a general contract
     *   - You want to enable polymorphism
     *
     * ✅ Use `instanceof` check before downcasting
     *
     * ✅ Don’t overuse inheritance — can lead to tight coupling and fragile base class problems
     *
     */

}
