package org.inheritance.part5multipleinheritance;

public class P2_Notes {

    /**
     * ✅ So How Does Java Support Multiple Inheritance? ➡️ Through Interfaces, NOT through classes.
     *
     * ✅ Example: Multiple Inheritance Using Interfaces
     *
     * interface A {
     *     void print();
     * }
     *
     * interface B {
     *     void print();
     * }
     *
     * class C implements A, B {
     *     public void print() {
     *         System.out.println("C's implementation");
     *     }
     * }
     *
     * ✔ No ambiguity, because class C must override the method.
     *
     * ✅ Java 8: What if Interface Has Default Method?
     * interface A {
     *     default void print() {
     *         System.out.println("A print");
     *     }
     * }
     *
     * interface B {
     *     default void print() {
     *         System.out.println("B print");
     *     }
     * }
     *
     * class C implements A, B {
     *     // Must override to resolve conflict
     *     public void print() {
     *         A.super.print();  // OR B.super.print()
     *         System.out.println("C print");
     *     }
     * }
     *
     * 🔁 This is how Java allows us to resolve conflicts explicitly. So no ambiguity.
     */
}
