package madan.p3polymorphism.notes;

public class P7_finalkeyword {

    /**
     * 🔷 What is final in Java?
     * final keyword ka use hota hai to restrict behavior.
     *
     * ✅ 1. final Variable — 🔐 Value can't be changed (constant)
     * ➤ Purpose:
     * Prevent re-assignment (make it constant)
     * Used in constants, like PI, MAX_VALUE
     *
     * final int x = 10;
     * x = 20; // ❌ Error: can't assign a value to final variable
     *
     * Note:
     * final variables must be initialized (either at declaration or in constructor for instance vars)
     *
     * ✅ 2. final Method — 🔒 Can't be overridden in subclass
     * ➤ Purpose:
     * To lock implementation so no subclass can modify it
     *
     * Used for security or business logic protection
     *
     * class Parent {
     *     final void show() {
     *         System.out.println("Final method from parent");
     *     }
     * }
     *
     * class Child extends Parent {
     *     // void show() {} ❌ Error: Cannot override final method
     * }
     *
     * Real-life use:
     * Java classes like String, Math use final methods to protect core logic.
     *
     * ✅ 3. final Class — 🔐 Can't be inherited
     * ➤ Purpose:
     * Prevent inheritance
     * Used when you want to make a class non-extendable (security, performance, final utility class)
     *
     * final class Vehicle {
     *     void run() {
     *         System.out.println("Running...");
     *     }
     * }
     *
     * class Car extends Vehicle {  // ❌ Error: Cannot inherit from final class
     * }
     *
     * 🧠 Summary Table
     * | `final` used on... | What it restricts            | Purpose           |
     * | ------------------ | ---------------------------- | ----------------- |
     * | `variable`         | Can't reassign value         | Make constant     |
     * | `method`           | Can't override in subclass   | Lock behavior     |
     * | `class`            | Can't extend/inherit from it | Prevent extension |
     *
     * 🔥 Tricky Points
     * | Trick                                | Explanation                                                           |
     * | ------------------------------------ | --------------------------------------------------------------------- |
     * | Can a `final` variable be blank?     | ✅ Yes, if initialized in constructor                                  |
     * | Can `final` method be `abstract`?    | ❌ No! Final → can't override, Abstract → must override. Contradiction |
     * | Can a `final` class have subclasses? | ❌ No                                                                  |
     * | Can constructor be `final`?          | ❌ No need — constructors are never inherited or overridden            |
     *
     * ✅ Bonus: Combination Confusions
     * | Keyword Combo                     | Valid?    | Reason                                                 |
     * | --------------------------------- | --------- | ------------------------------------------------------ |
     * | `final` + `abstract` method       | ❌ Invalid | Can't be both override-required and override-prevented |
     * | `final` + `static` method         | ✅ Valid   | Common in utility methods                              |
     * | `final` class with `final` method | ✅ Valid   | Fully sealed class                                     |
     */
}
