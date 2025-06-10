package madan.p2inheritance.notes;

public class P1_Defs {

    /**
     * ================================
     * 📘 Inheritance in Java - Notes
     * ================================
     *
     * 🔹 Definition:
     * Inheritance is a mechanism in Java by which one class (child/subclass) can
     * inherit properties and behaviors (fields and methods) from another class (parent/superclass).
     *
     * 🔹 Terminologies:
     * - Superclass / Base Class: The class whose members are inherited.
     * - Subclass / Derived Class / Child Class: The class that inherits from the superclass.
     *
     * 🔹 Is Inheritance Already Used in Java?
     * Yes — for example:
     * - All classes implicitly inherit from `java.lang.Object`.
     * - Common in frameworks (e.g., `AppCompatActivity` in Android inherits from `Activity`).
     *
     * 🔹 Types of Inheritance in Java:
     * 1. Single Inheritance       → A → B
     * 2. Multilevel Inheritance   → A → B → C
     * 3. Hierarchical Inheritance → A → B, A → C
     *
     * ❌ Multiple Inheritance (via classes) is NOT supported in Java due to the "Diamond Problem".
     * ✅ Achieved via interfaces.
     *
     * 🔹 Benefits of Inheritance:
     * - Avoids code duplication
     * - Promotes code reusability
     * - Improves maintainability
     *
     * 🔹 Important Rule:
     * Constructors are NOT inherited.
     * - But the parent constructor can be explicitly called using `super()` inside child class constructor.
     *
     * 🔹 Design Principles for Inheritance:
     * - Use inheritance for **"is-a" relationship**.
     *   Example:
     *     class Animal { void eat(); }
     *     class Dog extends Animal { void bark(); }
     *     ✅ Dog *is an* Animal → Valid inheritance.
     *
     * - Don't use inheritance for **code reuse only** — prefer composition in that case.
     *
     * 🔹 Are all parent members inherited by subclasses?
     * - ✅ public, protected, and default (if in same package) are inherited.
     * - ❌ private members are NOT inherited.
     *   ➤ But accessible via getters/setters if provided by parent.
     *
     * 🔹 Special Cases:
     * - static methods: ✅ Inherited, but can't be overridden in child classes (they are class-level, not instance-level).
     * - final methods: ✅ Inherited, ❌ Cannot be overridden.
     * - constructors: ❌ Not inherited, ✅ Can be called via `super()` in child constructor.
     * - static variables: ✅ Inherited (but shared across class, not per object).
     *
     */

}
