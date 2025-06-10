package madan.p2inheritance.notes;

public class P9_DynamicBinding {

    /**
     * 💥 What is Dynamic Binding in Java?
     * 🔹 Definition:
     * Dynamic binding (a.k.a. late binding) occurs when the method call is resolved at runtime, not at compile time.
     *
     * 🔹 When does it happen?
     * When:
     * You have a non-static, non-final, non-private method
     * The method is overridden
     * You are calling the method using a parent class reference pointing to a child class object
     *
     * ✅ Dynamic Binding Example
     *
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
     * class Test {
     *     public static void main(String[] args) {
     *         Animal a = new Dog(); // 👈 Parent reference, Child object
     *         a.sound(); // ✅ Dynamic Binding: JVM decides at runtime -> Dog's sound()
     *     }
     * }
     *
     * 🧠 What happens here?
     * At compile-time, Java only knows a is of type Animal.
     * At runtime, JVM sees that a actually points to a Dog object, so it calls Dog's sound().
     *
     * ❌ Dynamic Binding Does NOT Apply To:
     * | Method Type    | Reason                                            |
     * | -------------- | ------------------------------------------------- |
     * | `static`       | Not overridden; belongs to class                  |
     * | `final`        | Can't be overridden                               |
     * | `private`      | Not visible outside class                         |
     * | `constructors` | Constructors are not inherited, so not overridden |
     *
     * 🔄 Dynamic Binding in Real Life:
     * Example: Payment System
     *
     * class Payment {
     *     void pay() {
     *         System.out.println("Generic payment");
     *     }
     * }
     *
     * class CreditCard extends Payment {
     *     void pay() {
     *         System.out.println("Paid with Credit Card");
     *     }
     * }
     *
     * class UPI extends Payment {
     *     void pay() {
     *         System.out.println("Paid with UPI");
     *     }
     * }
     *
     * class App {
     *     public static void main(String[] args) {
     *         Payment p;
     *
     *         p = new CreditCard();
     *         p.pay(); // runtime -> CreditCard
     *
     *         p = new UPI();
     *         p.pay(); // runtime -> UPI
     *     }
     * }
     *
     * This shows polymorphism using dynamic binding — behavior changes at runtime.
     *
     * 🔁 Difference: Static vs Dynamic Binding
     * | Feature               | Static Binding                     | Dynamic Binding                 |
     * | --------------------- | ---------------------------------- | ------------------------------- |
     * | Also called           | Early Binding                      | Late Binding                    |
     * | Time of resolution    | Compile time                       | Runtime                         |
     * | Applicable to         | static, final, private, overloaded | Overridden methods (non-static) |
     * | Based on              | Reference type                     | Object type at runtime          |
     * | Performance           | Faster (no runtime check)          | Slower (resolved at runtime)    |
     * | Example               | Method overloading                 | Method overriding               |
     * | Supports Polymorphism | ❌ No                               | ✅ Yes                           |
     *
     * 🧠 Interview Tip:
     * Q: Why is dynamic binding important?
     *
     * A: It enables runtime polymorphism, where different objects can define their own versions of a method and the correct
     * version is called at runtime based on the object — making code extensible and flexible.
     */
}
