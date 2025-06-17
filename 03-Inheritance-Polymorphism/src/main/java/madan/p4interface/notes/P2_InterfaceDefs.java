package madan.p4interface.notes;

public class P2_InterfaceDefs {

    /**
     * 🔷 Interfaces in Java (Till Java 9)
     *
     * ✅ What is an Interface in Java?
     * An interface in Java defines a contract that a class must follow.
     * It contains method signatures only, not the actual implementation (until Java 7).
     * A class that implements an interface must provide concrete implementations of all its abstract methods.
     *
     * Interfaces specify:
     *      Method name
     *      Return type
     *      Parameter types
     *
     * They help achieve:
     *      Abstraction
     *      Polymorphism
     *      Multiple inheritance
     *      Loose coupling
     *      Reusability & Modularity
     *
     *      ---------------------------------------------------------------------------------
     *
     * 🟡 What About abstract Keyword in Interfaces?
     * In Java, interfaces are implicitly abstract, meaning you do not need to use the abstract keyword while defining them.
     *
     * Even if you write it, it’s redundant:
     * // Both are same
     * public interface Payment {}           // Recommended
     * public abstract interface Payment {} // Works, but not needed
     *
     * Similarly, all methods in an interface are abstract and public by default (till Java 7).
     * variables are public static final and methods are public abstract.
     * WHy abstract bcoz classes that implment should provide their implementation
     * and variables are final bcoz no imp classes can change its value. These are constants
     *
     *  ✅ Syntax to Create an Interface
     *  [access_modifier] interface InterfaceName {
     *     // abstract methods (implicitly public and abstract)
     * }
     *
     * 🔸 Note: The abstract keyword is redundant in interface declarations, as interfaces are implicitly abstract.
     *
     * ✅ 1. Are variables in interfaces constants?
     * Yes. All variables declared in an interface are implicitly:
     *
     * public static final
     * Which means:
     *      They are constants.
     *      They belong to the interface itself, not to implementing classes.
     *      They cannot be modified after declaration.
     *
     * interface MyInterface {
     *     int VALUE = 10;  // implicitly public static final
     * }
     * This is same as writing:
     * public static final int VALUE = 10;
     *
     * ✅ 2. Can we use private or protected variables in an interface?
     * ❌ No, we cannot declare interface variables as private or protected.
     *
     * Because:
     * Interface is meant to be implemented and shared across classes.
     * private/protected goes against the "public contract" concept of interfaces.
     * ❌ Illegal:
     * private int x = 5;     // Not allowed
     * protected int y = 10;  // Not allowed
     * ✅ Only allowed:
     * int a = 100; // this is public static final
     *
     *
     * ---------------------------------------------------------------------------------
     *
     * ✅ Characteristics of Interfaces (Java 7 and before)
     * Only allowed:
     *      Public static final variables (i.e., constants)
     *      Abstract methods (no method body)
     *      No method could have implementation inside an interface.
     *
     * ✅ 🔹 JDK 7 Interface Example
     * (Only abstract methods + constants)
     *
     * public interface PaymentGateway {
     *
     *     // Constants
     *     int TIMEOUT = 30;           // implicitly public static final
     *     String PROVIDER = "PayFast";
     *
     *     // Abstract methods
     *     void pay(double amount);
     *     String getStatus();
     * }
     *
     * ---------------------------------------------------------------------------------
     *
     * ✅ Enhancements in Java 8
     * Java 8 added concrete methods inside interfaces:
     *
     * 1) Default Methods:
     *      Declared with the default keyword.
     *      Provide a method body.
     *
     * default void show() {
     *     System.out.println("This is a default method");
     * }
     *
     * 2) Static Methods:
     *      Belong to the interface itself (not to implementing classes).
     *      Can have implementation.
     *
     * static void utility() {
     *     System.out.println("Static method in interface");
     * }
     *
     *
     * ✅ 🔹 JDK 8 Interface Example
     * (+ default and static methods added)
     *
     * public interface PaymentGateway {
     *
     *     // Constants
     *     int TIMEOUT = 30;
     *     String PROVIDER = "PayFast";
     *
     *     // Abstract methods
     *     void pay(double amount);
     *     String getStatus();
     *
     *     // Default method (new in Java 8)
     *     default void printReceipt() {
     *         System.out.println("Receipt printed.");
     *     }
     *
     *     // Static method (new in Java 8)
     *     static void showProviderInfo() {
     *         System.out.println("Provider: " + PROVIDER);
     *     }
     * }
     * ---------------------------------------------------------------------------------
     * ✅ Enhancements in Java 9
     * Java 9 introduced private methods in interfaces:
     *
     * 1) Private Instance Methods:
     *      Reusable logic for default methods.
     *      private void log(String msg) {
     *     System.out.println("Log: " + msg);
     * }
     *
     * 2) Private Static Methods:
     *      Reusable by static methods.
     *
     *      private static void helper() {
     *     System.out.println("Helper method");
     * }
     *
     *
     * ✅ 🔹 JDK 9 Interface Example
     * (+ private and private static methods added)
     *
     * public interface PaymentGateway {
     *
     *     // Constants
     *     int TIMEOUT = 30;
     *     String PROVIDER = "PayFast";
     *
     *     // Abstract methods
     *     void pay(double amount);
     *     String getStatus();
     *
     *     // Default method
     *     default void printReceipt() {
     *         log("Receipt is being printed...");
     *         System.out.println("Receipt printed.");
     *     }
     *
     *     // Static method
     *     static void showProviderInfo() {
     *         helper();
     *         System.out.println("Provider: " + PROVIDER);
     *     }
     *
     *     // 🔒 Private method (new in Java 9)
     *     private void log(String msg) {
     *         System.out.println("[LOG] " + msg);
     *     }
     *
     *     // 🔒 Private static method (new in Java 9)
     *     private static void helper() {
     *         System.out.println("Performing helper logic...");
     *     }
     * }
     * ----------------------------------------------------------------------------------
     * These private methods improve code reusability and maintainability inside interfaces.
     *
     * ✅ Important Notes
     * Interfaces cannot be instantiated directly.
     * A class implements an interface.
     * An interface can extend another interface (not a class).
     * All methods (abstract, default, static) are public by default.
     * Interfaces cannot have constructors.
     *
     * ✅ Quick Summary (Version-wise)
     * | Java Version | Interface Features                   |
     * | ------------ | ------------------------------------ |
     * | Java 7       | Abstract methods + constants only    |
     * | Java 8       | `default` & `static` methods         |
     * | Java 9       | `private` & `private static` methods |
     *
     * ---------------------------------------------------------------------------------
     *
     *
     * 🔷 1. Why default and static methods were introduced in Java 8?
     * 🔹 Problem Before Java 8 (JDK 7 and earlier):
     * Interfaces could only have abstract methods.
     *
     * Suppose ek interface hai used by 100+ classes, and now you want to add a new method.
     * 🔥 Boom! All 100 classes break because they all must implement that new method.
     *
     * interface Printer {
     *     void print();
     * }
     *
     * // Now you add:
     * void scan(); // All classes that implemented Printer will break
     *
     * ✅ Solution: default Methods in Java 8
     * Java 8 introduced default methods so you can add new methods with a body to interfaces without breaking existing classes.
     *
     * So existing implementations don't need to override unless they want to.
     *
     * interface Printer {
     *     void print();
     *
     *     default void scan() {
     *         System.out.println("Default scan logic");
     *     }
     * }
     *
     * Use Case: Maintain backward compatibility while evolving APIs.
     *
     * ✅ Can I Override default Method in My Class?
     * Yes bhai! You can override a default method in the implementing class:
     *
     * class MyPrinter implements Printer {
     *     public void print() {
     *         System.out.println("Printing...");
     *     }
     *
     *     @Override
     *     public void scan() {
     *         System.out.println("My custom scan logic");
     *     }
     * }
     *
     * So default method is just a default option — you can replace it anytime.
     *
     * ✅ Why static Methods in Interfaces (Java 8)?
     * To provide utility/helper methods that are related to the interface but not tied to instance.
     *
     * You don’t want these methods inherited by implementing classes.
     *
     * interface Utils {
     *     static void showInfo() {
     *         System.out.println("Utility info");
     *     }
     * }
     *
     * Use case: Logging, validation, factory methods inside interface itself.
     *
     *
     * 🔷 2. Why private methods were added in Java 9?
     * 🔹 Problem in Java 8:
     * default and static methods can contain logic.
     *
     * But if you want to reuse common logic inside multiple default methods, you have to repeat code — because you can't define helper methods.
     *
     * default void a() {
     *     System.out.println("Start...");
     *     // some logic
     *     System.out.println("End...");
     * }
     *
     * default void b() {
     *     System.out.println("Start...");
     *     // same logic again
     *     System.out.println("End...");
     * }
     *
     * ✅ Solution: Java 9 introduced private and private static methods
     * Now you can write reusable helper logic inside interface, without exposing it to implementing classes.
     *
     * interface Payment {
     *     default void makePayment() {
     *         log("Making payment");
     *     }
     *
     *     default void refund() {
     *         log("Refund processing");
     *     }
     *
     *     private void log(String msg) {
     *         System.out.println("LOG: " + msg);
     *     }
     * }
     *
     * 🔒 This keeps your interface clean, DRY, and encapsulated.
     *
     * 🧠 Final Interview Style Summary
     *
     * "Default and static methods were added in Java 8 to make interfaces backward-compatible and more flexible — especially for evolving
     * APIs like Java collections.
     * Default methods allow adding new behavior without breaking existing implementations.
     * Static methods serve as utility functions tied to the interface, not its instances.
     * Later in Java 9, private methods were introduced to reduce code duplication and improve modularity inside default/static methods."
     */
}
