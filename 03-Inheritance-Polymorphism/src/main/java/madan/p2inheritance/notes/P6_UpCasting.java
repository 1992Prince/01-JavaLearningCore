package madan.p2inheritance.notes;

public class P6_UpCasting {

    /**
     * For Upcasting / Downcasting is it mandtory to have parent child relationship ?
     *
     * Bhai, haan, Upcasting aur Downcasting sirf parent-child (inheritance) relationship mein hi possible hai. Yeh Java ka basic rule hai.
     *
     * ✅ Must-Have: Inheritance Relationship
     * Agar do classes ke beech inheritance (i.e., "is-a" relationship) nahi hai, to:
     *
     * Upcasting: ❌ Not allowed
     * Downcasting: ❌ Not allowed
     * Agar karne ki koshish karega to Compile-time error ya ClassCastException milega.
     *
     * Yes, upcasting and downcasting require a parent-child relationship in Java.
     * If the classes do not share an inheritance hierarchy, typecasting between them is not allowed — either at compile time or
     * it throws a ClassCastException at runtime.
     */

    /**
     * 📘 Notes: Upcasting & Utility Methods in Java
     *
     * 🔹 What is Upcasting?
     * - When we assign a child class object to a parent class reference.
     * - Example:
     *     Animal animal = new Dog(); // Upcasting
     *
     * 🔹 What can we access after Upcasting?
     * - Only:
     *   ✔ Parent class methods
     *   ✔ Overridden methods (i.e., child class overrides parent method, that version gets called)
     * - ❌ Child-specific methods (not in parent class) cannot be accessed directly.
     *
     * 🔹 Example:
     *     Animal animal = new Dog();
     *     animal.eat(); // Allowed (defined in parent)
     *     animal.bark(); // ❌ Not allowed (bark is in Dog only)
     *
     * 🔹 Why is Upcasting useful?
     * - We can write **generic utility methods** that work for any subclass of a parent class.
     * - Reduces code duplication.
     * - Follows **polymorphism** and **code reusability** principles.
     *
     * 🔹 Utility Method Example:
     *     public class AnimalUtility {
     *         public static void printName(Animal animal) {
     *             System.out.println(animal.getName());
     *         }
     *     }
     *
     *     // Works for all:
     *     AnimalUtility.printName(new Animal());
     *     AnimalUtility.printName(new Dog());
     *     AnimalUtility.printName(new Cat());
     *
     * 🔹 What can such generic method access?
     * - Only:
     *   ✔ Members/methods defined in the parent class (like getName())
     *   ✔ Overridden methods (e.g., if `eat()` is overridden in Dog, overridden version runs)
     * - ❌ It cannot access child-specific methods (like `bark()`, `meow()`), unless you downcast inside method.
     *
     * 🔹 Summary:
     * - Upcasting = Flexibility + Reusability
     * - Generic methods using parent reference help avoid repeating same logic for every subclass.
     * - Such methods remain limited to parent-level functionality only.
     */

}
