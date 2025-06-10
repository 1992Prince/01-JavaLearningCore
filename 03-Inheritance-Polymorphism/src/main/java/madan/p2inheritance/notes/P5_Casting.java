package madan.p2inheritance.notes;

public class P5_Casting {

    /**
     * ============================================
     * 📘 Java Typecasting — Full Explanation
     * ============================================
     *
     * 🔶 In Java, typecasting is converting one data type into another.
     * There are two main types of casting:
     *
     *   1️⃣ Primitive Typecasting (for primitive data types)
     *   2️⃣ Reference Typecasting (for objects & inheritance)
     *
     * ============================================
     * ✅ 1. Primitive Typecasting
     * ============================================
     *
     * Primitive casting is done between data types like int, float, byte, double, etc.
     * Two types:
     *
     * 🔹 A. Widening Casting (Implicit)
     *    ➤ Done automatically
     *    ➤ Converts smaller type to larger type
     *    ➤ No data loss
     *
     * Example:
     *   int a = 10;
     *   double b = a; // int → double (implicit)
     *
     * 🔹 B. Narrowing Casting (Explicit)
     *    ➤ Done manually (using typecast)
     *    ➤ Converts larger type to smaller type
     *    ➤ May lead to data loss
     *
     * Example:
     *   double x = 9.87;
     *   int y = (int) x; // double → int (explicit) → value becomes 9
     *
     * ============================================
     * ✅ 2. Reference Typecasting (Inheritance)
     * ============================================
     *
     * Done between objects of related classes using inheritance.
     * Two types:
     *
     * 🔹 A. Upcasting (Widening Object Typecasting)
     *    ➤ Subclass object is assigned to a superclass reference
     *    ➤ Done implicitly
     *    ➤ Safe and used in polymorphism
     *
     * Example:
     *   class Animal {
     *       void speak() { System.out.println("Animal speaking"); }
     *   }
     *   class Dog extends Animal {
     *       void bark() { System.out.println("Dog barking"); }
     *   }
     *
     *   Animal a = new Dog(); // ✅ Upcasting (implicit)
     *   a.speak();            // Allowed
     *   // a.bark();         // ❌ Not allowed - only superclass methods visible
     *
     * 🔹 B. Downcasting (Narrowing Object Typecasting)
     *    ➤ Superclass reference is cast back to subclass
     *    ➤ Done explicitly using typecast
     *    ➤ Risky if object is not actually of subclass type
     *
     * Example:
     *   Animal a = new Dog();    // Upcasting
     *   Dog d = (Dog) a;         // ✅ Downcasting (explicit)
     *   d.bark();                // Works fine
     *
     * ⚠️ Wrong Downcasting:
     *   Animal a = new Animal();
     *   Dog d = (Dog) a;         // ❌ Runtime error: ClassCastException
     *
     * ✅ Safe Downcasting using instanceof:
     *   if (a instanceof Dog) {
     *       Dog d = (Dog) a;
     *       d.bark();
     *   }
     *
     * ============================================
     * 🧠 Summary of Differences
     * ============================================
     *
     * | Feature             | Primitive Typecasting            | Reference Typecasting (Objects)         |
     * |---------------------|----------------------------------|------------------------------------------|
     * | Data type involved  | int, float, double, etc.         | Classes in inheritance                  |
     * | Types               | Widening, Narrowing              | Upcasting, Downcasting                  |
     * | Implicit            | Widening                         | Upcasting                               |
     * | Explicit            | Narrowing                        | Downcasting                             |
     * | Risk                | Data loss                        | Runtime ClassCastException              |
     *
     * ============================================
     * ✅ Best Practices:
     * ============================================
     * - Prefer widening where possible (safe and automatic)
     * - Always use `instanceof` check before downcasting
     * - Avoid unnecessary casting — use proper object design
     * - Use interfaces and polymorphism to reduce casting needs
     */

    /**
     * ===============================
     * 🎯 Upcasting and Downcasting in Java
     * ===============================
     *
     * ✅ Definition 1: What is Upcasting?
     *
     * ➤ Upcasting is the process of converting a subclass (child) object into a superclass (parent) reference.
     * ➤ It is done **implicitly** and is always **safe**.
     * ➤ Used commonly in **runtime polymorphism**.
     *
     * 🔹 Interview Point:
     *    - “Upcasting allows a subclass object to be referred by a parent class reference.”
     *    - “Upcasting helps in writing generic, reusable code.”
     *
     * ✅ Example:
     *   class Animal {
     *       void sound() { System.out.println("Animal makes sound"); }
     *   }
     *
     *   class Dog extends Animal {
     *       void bark() { System.out.println("Dog barks"); }
     *   }
     *
     *   public class Test {
     *       public static void main(String[] args) {
     *           Animal a = new Dog();  // ✅ Upcasting
     *           a.sound();             // Works
     *           // a.bark();          // ❌ Not accessible (only Animal's methods visible)
     *       }
     *   }
     *
     * --------------------------------------------------
     *
     * ✅ Definition 2: What is Downcasting?
     *
     * ➤ Downcasting is the process of converting a superclass (parent) reference back into a subclass (child) reference.
     * ➤ It must be done **explicitly**, using casting syntax.
     * ➤ It can be **unsafe** if the object is not actually of the child class type.
     *
     * 🔹 Interview Point:
     *    - “Downcasting is used when we want to access subclass-specific methods from a superclass reference.”
     *    - “Always use `instanceof` check before downcasting to avoid `ClassCastException`.”
     *
     * ✅ Example:
     *   Animal a = new Dog();        // Upcasting
     *   Dog d = (Dog) a;             // ✅ Downcasting
     *   d.bark();                    // Now works
     *
     * ⚠️ Unsafe Example:
     *   Animal a = new Animal();
     *   Dog d = (Dog) a;   // ❌ Throws ClassCastException at runtime
     *
     * ✅ Safe Way:
     *   if (a instanceof Dog) {
     *       Dog d = (Dog) a;
     *       d.bark();
     *   }
     *
     * --------------------------------------------------
     *
     * ✅ Summary Table:
     *
     * | Feature        | Upcasting                    | Downcasting                         |
     * |----------------|------------------------------|-------------------------------------|
     * | Direction      | Child → Parent               | Parent → Child                      |
     * | Syntax         | Implicit (no cast needed)    | Explicit (requires cast)            |
     * | Safety         | Safe                         | Risky if object isn't of child type |
     * | Purpose        | Generalization / Polymorphism| Access subclass-specific features   |
     * | Usage          | Very common                  | Less common, use carefully          |
     *
     */

    /**
     * 🔹 Why can’t we access child class methods in Upcasting?
     * 🔸 Because of Reference Type Rules in Java:
     * Java decides what methods/fields are accessible based on the reference type, not the actual object.
     *
     * class Animal {
     *     void speak() { System.out.println("Animal speaking"); }
     * }
     *
     * class Dog extends Animal {
     *     void bark() { System.out.println("Dog barking"); }
     * }
     *
     * public class Test {
     *     public static void main(String[] args) {
     *         Animal a = new Dog();  // ✅ Upcasting
     *         a.speak();             // ✅ Allowed (present in Animal)
     *
     *         // a.bark();          // ❌ Compile-time error: bark() not in Animal
     *     }
     * }
     *
     * ✔️ a is a reference of type Animal, so it can only access Animal's methods, even though it points to Dog object.
     *
     * 🔹 Then Why Do We Need Downcasting?
     * To access subclass-specific methods/fields that are not available in the parent class.
     *
     * Animal a = new Dog();      // Upcasting
     * Dog d = (Dog) a;           // ✅ Downcasting
     * d.bark();                  // ✅ Now accessible
     *
     * 🔹 When Does ClassCastException Occur?
     * ❗ It occurs when you try to downcast an object to a subclass it doesn’t actually belong to.
     *
     * ❌ Example of Wrong Downcasting:
     * Animal a = new Animal();   // Real object is Animal
     * Dog d = (Dog) a;           // ❌ Runtime error
     *
     * Output - Exception in thread "main" java.lang.ClassCastException: Animal cannot be cast to Dog
     *
     * ✅ How to Prevent ClassCastException?
     * Use instanceof to check actual type of the object before downcasting:
     * if (a instanceof Dog) {
     *     Dog d = (Dog) a;
     *     d.bark();  // Safe
     * } else {
     *     System.out.println("Not a Dog object");
     * }
     *
     *
     * 🔁 In Simple Words:
     *
     * | Concept                         | Explanation                                                                                     |
     * | ------------------------------- | ----------------------------------------------------------------------------------------------- |
     * | Upcasting                       | You see the object as its parent — safe but limited to parent-level methods.                    |
     * | Why child methods inaccessible? | Java uses reference type (`Animal`) to decide what’s visible. Child methods aren't in `Animal`. |
     * | Why Downcast?                   | To access subclass methods not in parent.                                                       |
     * | When `ClassCastException`?      | When downcasting an object to the wrong type (like Animal to Dog, but it’s not a Dog).          |
     * | Best Practice                   | Always use `instanceof` before downcasting.                                                     |
     */


}
