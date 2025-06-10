package org.inheritance.part5multipleinheritance;

public class P1_Notes {

    /**
     * 🔴 What is Multiple Inheritance?
     * When a class tries to inherit from two or more classes, it's called multiple inheritance.
     *
     * Example (not allowed in Java):
     * class A {
     *     void msg() { System.out.println("Hello from A"); }
     * }
     *
     * class B {
     *     void msg() { System.out.println("Hello from B"); }
     * }
     *
     * // ❌ Not allowed in Java
     * class C extends A, B {  // Compilation error!
     * }
     *
     * In java we can extend only one class and not more that it. If u tries to extends multiple classes then you will get
     * compilation error
     *
     * 🚫 Why Java Doesn’t Support Multiple Inheritance? - 👉 Because of the Diamond Problem.
     *
     * 💎 Explain Diamond Problem
     *       A
     *      / \
     *     B   C
     *      \ /
     *       D
     * Class B and C both inherit from A.
     * Class D inherits from both B and C.
     * What if A has a method display() and D calls it?
     * ❓ Which version of display() should be called — from B or C?
     * → This creates ambiguity.
     *
     * Case 1: B and C do not override method from A
     *
     * class A {
     *     void display() {
     *         System.out.println("A");
     *     }
     * }
     *
     * class B extends A {
     *     // no override
     * }
     *
     * class C extends A {
     *     // no override
     * }
     *
     * // ❌ Illegal in Java
     * class D extends B, C {
     *     // Which display() to inherit? Ambiguity!
     * }
     *
     * 👉 ❗ Even in this case — there is ambiguity!
     * Java can’t decide whether to pick A → from B’s path or from C’s path.
     * Even though they are same, inheritance tree becomes ambiguous when 2 paths reach the same method.
     *
     * So Java says:
     *
     * “Nope, I won’t even allow this inheritance structure!”
     * That’s why it disallows multiple class inheritance altogether.
     *
     *
     * Case 2: B and C override the method from A
     * class A {
     *     void display() {
     *         System.out.println("A");
     *     }
     * }
     *
     * class B extends A {
     *     void display() {
     *         System.out.println("B");
     *     }
     * }
     *
     * class C extends A {
     *     void display() {
     *         System.out.println("C");
     *     }
     * }
     *
     * // ❌ Not allowed
     * class D extends B, C {
     *     // Now ambiguity is even worse!
     * }
     *
     * 🧨 Now D.display() could mean:
     * B’s version
     * OR C’s version
     * This makes the conflict explicit and serious.
     *
     * ✅ Start with a Clear One-Liner:
     * "Diamond problem is a classic ambiguity issue in multiple inheritance when a class inherits from two classes that
     * share a common superclass, and both paths lead to the same method — making the compiler confused about which method to execute."
     *
     * ✅ Then Draw This Verbal Diagram (explain while drawing or imagining):
     *          A
     *        /   \
     *       B     C
     *        \   /
     *          D
     *
     *  “Suppose class B and class C both extend class A, and then class D extends both B and C.”
     *
     *  ✅ Then Walk Through the Method Ambiguity:
     *  "Let’s say A has a method called display(). Now, if class D calls display(), the compiler gets confused —
     *  should it call the method via B → A or C → A? That’s the diamond problem — multiple inheritance leads to multiple paths to the same method, and
     *  Java doesn’t know which path to choose."
     *
     *  ✅ Add Two Scenarios:
     * 1. If B and C DO NOT override display()
     * "Even then, Java says it's ambiguous, because method resolution depends on multiple paths."
     *
     * 2. If B and C DO override display()
     * "Now the conflict is even worse — both override the method differently, and class D has no way to choose between B.display() or C.display() unless you explicitly tell it."
     *
     * ✅ Final Statement (Power Sentence):
     * “That’s why Java doesn't allow multiple inheritance with classes — to prevent such ambiguity.
     * Instead, Java uses interfaces, where even if two interfaces have the same method, the implementing class is forced to override
     * and resolve the conflict explicitly. That makes it safe and controlled.”
     */
}
