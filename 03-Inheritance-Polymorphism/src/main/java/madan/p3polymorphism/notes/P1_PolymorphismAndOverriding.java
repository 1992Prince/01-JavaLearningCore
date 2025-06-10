package madan.p3polymorphism.notes;

public class P1_PolymorphismAndOverriding {

    /**
     * 📘 Polymorphism in Java – Notes + Examples
     *
     * 🔶 What is Polymorphism?
     * "Poly" = many, "morph" = forms
     * ➡ Polymorphism means same function/behavior but in different forms.
     *
     * In Java, polymorphism refers to the ability to perform a single action in multiple ways.
     * In Java, Polymorphism allows us to perform a single action in different ways.
     *
     * e.g. in real life woman play a role of mother, sister, employee etc.So same person possesses diff behaviour in diff situations.
     * Polymorphism is considered as imp features of OOPS in Java.
     *
     * Based on type of Binding, there are two types of polymorphism in Java -
     * 1) compile time or static polymorphism
     * 2) runtime or dynamic polymorphism
     *
     * We can perform polymorphism in java by method overriding (dynamic) and method overloading (static)
     *
     * ✅ Types of Polymorphism in Java
     * | Type | Name                      | Achieved By        | Binding         |
     * | ---- | ------------------------- | ------------------ | --------------- |
     * | 1️⃣  | Compile-time Polymorphism | Method Overloading | Static Binding  |
     * | 2️⃣  | Runtime Polymorphism      | Method Overriding  | Dynamic Binding |
     *
     * 🔷 1. What is Method Overriding?
     * ➡ Method overriding occurs when a subclass provides its own version of a method already defined in its parent class.
     *
     * ✅ Same method name, return type, and parameters
     * ✅ Enables runtime polymorphism (dynamic binding)
     *
     * 🔶 2. Why is Overriding Useful?
     * To provide specific behavior in child class without changing the superclass code.
     *
     * E.g. Animal class has sound(). Dog should bark(), Cat should meow() — same method, different behavior.
     *
     * 🔷 3. Dynamic Binding / Method Dispatch
     * ➡ Dynamic Method Dispatch means:
     *
     * Which method will be executed is decided at runtime, based on the object type (not reference type).
     *
     * ✅ Example: Method Overriding with Dynamic Dispatch
     * class Animal {
     *     void sound() {
     *         System.out.println("Animal makes sound");
     *     }
     * }
     *
     * class Dog extends Animal {
     *     @Override
     *     void sound() {
     *         System.out.println("Dog barks");
     *     }
     * }
     *
     * public class Test {
     *     public static void main(String[] args) {
     *         Animal a = new Dog();  // Reference type is Animal, object is Dog
     *         a.sound();             // Dog barks (runtime decision)
     *     }
     * }
     *
     * ➡ Even though a is of type Animal, the actual object is Dog, so Dog’s method runs.
     *
     * 🧠 This is called: Runtime Polymorphism / Dynamic Binding
     *
     * 📌 4. Rules of Method Overriding in Java
     * | Rule                  | Explanation                                                                          |
     * | --------------------- | ------------------------------------------------------------------------------------ |
     * | ✅ 1. Method Signature | Must be **exact same** (name + parameters)                                           |
     * | ✅ 2. Access Modifier  | Cannot reduce visibility (e.g., `public` → `private` ❌)                              |
     * | ✅ 3. Return Type      | Must be same or **covariant** (subclass of original return type)                     |
     * | ✅ 4. Final Methods    | Cannot override `final` methods                                                      |
     * | ✅ 5. Static Methods   | Cannot override static — they get **hidden**, not overridden                         |
     * | ✅ 6. Constructors     | Cannot be overridden                                                                 |
     * | ✅ 7. Private Methods  | Not inherited → can't be overridden                                                  |
     * | ✅ 8. Exception Rules  | Overridden method cannot throw **broader checked exceptions** than superclass method |
     *
     *
     * 🔁 5. Accessing Superclass Method from Subclass
     * Use super.methodName() inside subclass to call parent version.
     *
     * ✅ Example: Overridden method + super
     * class Animal {
     *     void sound() {
     *         System.out.println("Animal makes sound");
     *     }
     * }
     *
     * class Dog extends Animal {
     *     @Override
     *     void sound() {
     *         System.out.println("Dog barks");
     *     }
     *
     *     void show() {
     *         super.sound(); // call parent method
     *         this.sound();  // call current class method
     *     }
     * }
     *
     * public class Main {
     *     public static void main(String[] args) {
     *         Dog d = new Dog();
     *         d.show();
     *     }
     * }
     *
     * 🟢 Output:
     * Animal makes sound
     * Dog barks
     */
}
