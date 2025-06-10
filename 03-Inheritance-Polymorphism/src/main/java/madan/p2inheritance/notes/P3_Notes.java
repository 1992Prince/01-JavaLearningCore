package madan.p2inheritance.notes;

public class P3_Notes {

    /**
     * ===============================================
     * 📘 Object Class, Inheritance, and Design Notes
     * ===============================================
     *
     * 🔹 1. What is the Object class in Java?
     * ➤ `Object` is the **root class** of Java. Every class, either directly or indirectly, inherits from it.
     *    It is part of the `java.lang` package.
     *
     * ✅ Example:
     *   class MyClass { }
     *   // Internally: class MyClass extends Object { }
     *
     * ------------------------------------------------------------
     *
     * 🔹 2. Is Object class the default superclass?
     * ➤ Yes. If we don’t explicitly extend any class, Java automatically extends `java.lang.Object`.
     *
     * ✅ Example:
     *   class A { }  // Internally: class A extends Object { }
     *
     * ------------------------------------------------------------
     *
     * 🔹 3. Will every class have Object class methods available?
     * ➤ Yes. Since every class extends Object, its methods are inherited into all classes.
     *    Even if your class extends another class, the Object class is at the **top of the hierarchy**.
     *
     * ✅ Example:
     *   class Parent { }
     *   class Child extends Parent { }
     *
     *   Child c = new Child();
     *   c.toString();  // inherited from Object
     *
     * ------------------------------------------------------------
     *
     * 🔹 4. What if my subclass is extending another parent class? Will Object methods still be available?
     * ➤ Yes. Even if your class extends a parent class, the inheritance chain eventually reaches `Object`.
     *    Hence, Object methods are still available.
     *
     * ✅ Chain:
     *   Object → Parent → Child
     *
     * ------------------------------------------------------------
     *
     * 🔹 5. What are the methods available in Object class?
     *
     * ✅ Commonly used methods:
     * - `toString()`         → returns string representation of object
     * - `equals(Object obj)` → compares values (override for custom logic)
     * - `hashCode()`         → returns integer hash code
     * - `getClass()`         → returns runtime class info
     * - `clone()`            → creates and returns copy of object (needs Cloneable)
     * - `finalize()`         → called by GC before object is destroyed
     * - `notify()`, `notifyAll()`, `wait()` → used for thread synchronization
     *
     * ------------------------------------------------------------
     *
     * 🔹 6. What is the difference between Is-A and Has-A relationships?
     *
     * ➤ `Is-A` relationship:
     *   - Represents **inheritance**
     *   - One class is a type of another
     *   - Use `extends` or `implements`
     *
     * ✅ Example:
     *   class Car extends Vehicle  // Car IS-A Vehicle
     *
     * ➤ `Has-A` relationship:
     *   - Represents **composition**
     *   - One class contains another as a field
     *
     * ✅ Example:
     *   class Engine { }
     *   class Car {
     *       Engine e = new Engine(); // Car HAS-A Engine
     *   }
     *
     * ------------------------------------------------------------
     *
     * 🔹 7. Which package is automatically imported in every Java class?
     * ➤ `java.lang` package is automatically imported in all Java files.
     *    It contains commonly used classes like:
     *    - `Object`, `String`, `System`, `Math`, `Thread`, `Exception`, etc.
     *
     * ✅ No need to import:
     *   import java.lang.String; // ❌ Not required
     *
     * ------------------------------------------------------------
     *
     * 🔹 8. When should I use inheritance in my design? (Scenarios)
     *
     * ✅ Use inheritance when:
     * - There's a clear **is-a** relationship
     * - You want to promote **code reuse**
     * - You have shared logic across multiple classes
     * - You want to implement **polymorphism**
     *
     * ✅ Scenarios:
     * - `Employee` and `Manager` (Manager IS-A Employee)
     * - `Shape` → `Circle`, `Rectangle`, `Square` share common methods like `draw()`
     * - `Animal` → `Dog`, `Cat`, `Cow` inherit `eat()` and `sleep()` methods
     * - `Exception` → custom exceptions extend built-in `Exception` class
     *
     */

}
