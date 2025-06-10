package org.inheritance.part4multilevelinheritance;

public class P1_Notes {
    /**
     * ✅ What is Multilevel Inheritance in Java?
     * Definition: When a class inherits from a child class which is already inheriting from another class.
     *
     *       A (Grandparent)
     *          ↑
     *       B (Parent)
     *          ↑
     *       C (Child)
     *
     * 🔧 Java Code Example:
     * class A {
     *     void methodA() {
     *         System.out.println("Method from A");
     *     }
     * }
     *
     * class B extends A {
     *     void methodB() {
     *         System.out.println("Method from B");
     *     }
     * }
     *
     * class C extends B {
     *     void methodC() {
     *         System.out.println("Method from C");
     *     }
     * }
     *
     * public class TestMulti {
     *     public static void main(String[] args) {
     *         C obj = new C();
     *         obj.methodA(); // inherited from A
     *         obj.methodB(); // inherited from B
     *         obj.methodC(); // defined in C
     *     }
     * }
     */
}
