package madan.p4interface.notes;

public class P3_Notes {

    /**
     * ✅ 1. Can we remove public modifier from interface variables and methods?
     * Yes, we can remove public — but it is still implicitly public.
     * Same applies to interface variables — they are public static final by default.
     *
     * interface Sample {
     *     int VALUE = 100; // public static final int VALUE
     *     void display();  // public abstract void display()
     * }
     *
     * ✅ 2. Class vs Interface (Key Differences)
     * | Feature         | Class                      | Interface                                                      |
     * | --------------- | -------------------------- | -------------------------------------------------------------- |
     * | Methods         | Can have implementation    | Only abstract till Java 7, from Java 8 can have default/static |
     * | Variables       | Instance variables allowed | Only constants (public static final)                           |
     * | Inheritance     | Single inheritance         | Multiple interface implementation allowed                      |
     * | Object creation | Can instantiate            | Cannot instantiate directly                                    |
     *
     * ✅ 3. Implementing an Interface by Class
     * interface Animal {
     *     void makeSound();
     * }
     *
     * class Dog implements Animal {
     *     public void makeSound() {
     *         System.out.println("Woof");
     *     }
     * }
     *
     * ✅ 4. Implementing Multiple Interfaces by a Class
     *
     * interface Printable {
     *     void print();
     * }
     *
     * interface Scannable {
     *     void scan();
     * }
     *
     * class Printer implements Printable, Scannable {
     *     public void print() {
     *         System.out.println("Printing...");
     *     }
     *
     *     public void scan() {
     *         System.out.println("Scanning...");
     *     }
     * }
     *
     * ✅ 5. Implementing Multiple Interfaces + Extending a Class
     * class Machine {
     *     void start() {
     *         System.out.println("Machine started");
     *     }
     * }
     *
     * interface Printable {
     *     void print();
     * }
     *
     * interface Scannable {
     *     void scan();
     * }
     *
     * class SmartPrinter extends Machine implements Printable, Scannable {
     *     public void print() {
     *         System.out.println("Printing...");
     *     }
     *
     *     public void scan() {
     *         System.out.println("Scanning...");
     *     }
     * }
     *
     * ✅ 6. Interface Extending Other Interfaces
     * An interface can extend one or more interfaces using extends.
     *
     * interface A {
     *     void methodA();
     * }
     *
     * interface B extends A {
     *     void methodB();
     * }
     *
     * ✅ Syntax: Interface extending multiple interfaces
     * interface A {
     *     void methodA();
     * }
     *
     * interface B {
     *     void methodB();
     * }
     *
     * // Interface C extending both A and B
     * interface C extends A, B {
     *     void methodC();
     * }
     *
     * 🧠 Ab koi bhi class jo C ko implement karegi, usko A, B, aur C ke sabhi methods implement karne honge.
     *
     * ✅ 7. Can Interface implement Another Interface?
     * ❌ No, interfaces extend other interfaces, they don't implement.
     * Only classes implement interfaces.
     *
     * ✅ 8. What If a Class Implements Interface But Doesn’t Want to Implement Methods?
     * Then the class must be declared as abstract.
     *
     * interface Animal {
     *     void makeSound();
     * }
     *
     * abstract class Dog implements Animal {
     *     // No implementation, so class must be abstract
     * }
     *
     * ✅ 9. All constants in an interface are public static final by default
     * interface Config {
     *     int TIMEOUT = 30; // implicitly public static final
     * }
     * Note: You can omit public static final, but values should be in UPPER_CASE by naming convention.
     */
}
