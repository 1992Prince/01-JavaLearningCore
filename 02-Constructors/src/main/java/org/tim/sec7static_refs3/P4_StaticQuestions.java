package org.tim.sec7static_refs3;

public class P4_StaticQuestions {

    /**
     * public class StaticKeywordDeepDive {
     *
     *     // ✅ 1. What is the static keyword in Java?
     *     // Static means the member belongs to the class, not object.
     *     static int staticVar = 10; // shared among all objects
     *     int instanceVar = 5; // separate per object
     *
     *     // ✅ 2. Can we override static methods in Java?
     *     // ❌ No. They are hidden, not overridden.
     *     static class Parent {
     *         static void show() {
     *             System.out.println("Parent static method");
     *         }
     *     }
     *     static class Child extends Parent {
     *         static void show() {
     *             System.out.println("Child static method");
     *         }
     *     }
     *
     *     // ✅ 3. Can we overload static methods?
     *     static void greet() {
     *         System.out.println("Hello");
     *     }
     *     static void greet(String name) {
     *         System.out.println("Hello " + name);
     *     }
     *
     *     // ✅ 4. Can we use 'this' inside a static method?
     *     // ❌ No. Static methods can't use 'this'.
     *     static void staticMethod() {
     *         // System.out.println(this); // Compilation error
     *     }
     *
     *     // ✅ 5. Where are static variables stored in memory?
     *     // 🔹 Stored in Method Area (class-level memory)
     *
     *     // ✅ 6. When are static blocks executed?
     *     static {
     *         System.out.println("Static block executed once during class load");
     *     }
     *
     *     // ✅ 7. Can a class be static?
     *     // 🔹 Yes, only nested classes.
     *     static class StaticNestedClass {
     *         void say() {
     *             System.out.println("Inside static nested class");
     *         }
     *     }
     *
     *     // ✅ 8. Can constructors be static?
     *     // ❌ No. Constructors are meant for object creation.
     *
     *     // ✅ 9. Why do we use static methods in utility/helper classes?
     *     // 🔹 Because we don’t need object creation, saves memory, faster access.
     *
     *     // ✅ 10. Difference between static and final:
     *     // static = shared
     *     // final = unchangeable
     *     // static final = constant
     *     static final int MAX_USERS = 100;
     *
     *     // ✅ 11. Limitations of static members:
     *     // - Can't use 'this'
     *     // - Harder to test
     *     // - Global state can lead to bugs
     *
     *     // ✅ 12. Can static methods access non-static data?
     *     // ❌ No, unless through an object.
     *
     *     // ✅ Static block example
     *     static String config;
     *     static {
     *         config = "Loaded config from file...";
     *     }
     *
     *     // ✅ Multiple static blocks
     *     static {
     *         System.out.println("Another static block executed");
     *     }
     *
     *     // ✅ Instance initializer block
     *     {
     *         System.out.println("Instance block executed before constructor");
     *     }
     *
     *     StaticKeywordDeepDive() {
     *         System.out.println("Constructor executed");
     *     }
     *
     *     // ✅ this/super inside instance block
     *     {
     *         System.out.println("this.instanceVar = " + this.instanceVar);
     *     }
     *
     *     // 🔥 Tricky: Static method vs instance method with same signature
     *     static void example() {
     *         System.out.println("Static example()");
     *     }
     *     void example(int x) {
     *         System.out.println("Instance example(" + x + ")");
     *     }
     *
     *     // 🔥 Misusing static driver
     *     // static WebDriver driver;  // ❌ Not good for parallel
     *     // ThreadLocal<WebDriver> driver = new ThreadLocal<>(); // ✅ Thread-safe
     *
     *     public static void main(String[] args) {
     *
     *         System.out.println("\n--- Static Method Hiding ---");
     *         Parent p = new Child();
     *         p.show(); // Output: Parent static method
     *
     *         System.out.println("\n--- Static Overloading ---");
     *         greet();
     *         greet("Ravi");
     *
     *         System.out.println("\n--- Static Nested Class ---");
     *         StaticNestedClass obj = new StaticNestedClass();
     *         obj.say();
     *
     *         System.out.println("\n--- Instance Block Execution ---");
     *         new StaticKeywordDeepDive();
     *
     *         System.out.println("\n--- Tricky Method Names ---");
     *         new StaticKeywordDeepDive().example(42);
     *         StaticKeywordDeepDive.example();
     *
     *         System.out.println("\n--- Config Loaded in Static Block ---");
     *         System.out.println(config);
     *     }
     *
     *     /*
     *      🔹 Execution Order:
     *      1. Static blocks (once)
     *      2. Instance blocks (every object)
     *      3. Constructor
     *      4. main()
     *
     *      🔹 Rapid Fire:
     *      Can static be used in interface (Java 8+)? ✅ Yes
     *      Can static method call non-static? ❌ No
     *      Can instance call static? ✅ Yes
     *      Can static class have non-static fields? ✅ Yes
     *      Can static method be abstract? ❌ No
     *      Is static block mandatory? ❌ No
     *      Can static variable be null? ✅ Yes
     *      Can static methods be synchronized? ✅ Yes
     *      Can static method access private static vars? ✅ Yes
     *
     *      Agar tumhare class mein static block, instance block, aur constructor tino hain, to Java execution ka flow niche jaise hota hai:
     *      ✅ Execution Flow (Order)
     * Static Block(s)
     * 🔹 Executes once when class is loaded into memory
     * 🔹 Runs before main method and object creation
     *
     * Instance Block(s)
     * 🔹 Executes every time before constructor
     * 🔹 Runs when object is created, before constructor
     *
     * Constructor
     * 🔹 Executes after instance block, during object creation
     * 🔹 Used to initialize the current object
     *
     * 🔁 Full Flow:
     * Class Load (JVM):
     *    └── Static Block(s) → executed once
     *
     * Object Creation:
     *    └── Instance Block(s) → executed first (per object)
     *         └── Constructor → executed after instance block
     *
     *  ✅ Example Code to See the Flow
     *  public class ExecutionFlowExample {
     *
     *     static {
     *         System.out.println("✅ Static Block");
     *     }
     *
     *     {
     *         System.out.println("🟡 Instance Block");
     *     }
     *
     *     ExecutionFlowExample() {
     *         System.out.println("🟢 Constructor");
     *     }
     *
     *     public static void main(String[] args) {
     *         System.out.println("🚀 Main Method");
     *         new ExecutionFlowExample();
     *         System.out.println("------");
     *         new ExecutionFlowExample(); // creating second object
     *     }
     * }
     *
     * Output
     * ✅ Static Block
     * 🚀 Main Method
     * 🟡 Instance Block
     * 🟢 Constructor
     * ------
     * 🟡 Instance Block
     * 🟢 Constructor
     *
     * ✅ Summary:
     * | Block          | When it Runs             | How Often             |
     * | -------------- | ------------------------ | --------------------- |
     * | Static Block   | Class load (before main) | Once per class        |
     * | Instance Block | Before constructor       | Every object creation |
     * | Constructor    | During object creation   | Every object creation |
     *     */

}
