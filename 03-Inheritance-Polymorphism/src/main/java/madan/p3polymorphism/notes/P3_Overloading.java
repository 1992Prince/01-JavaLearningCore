package madan.p3polymorphism.notes;

public class P3_Overloading {

    /**
     * 🔷 What is Method Overloading in Java?
     * Method Overloading means having multiple methods with the same name in the same class,
     * but with different parameter list (type, number, or order).
     *
     * ✅ Rules of Method Overloading
     * | Rule                                          | Explanation                                      |
     * | --------------------------------------------- | ------------------------------------------------ |
     * | ✔ Method name must be same                    | Always                                           |
     * | ✔ Parameters must differ                      | In **type**, **number**, or **order**            |
     * | ❌ Return type doesn't matter                  | Can’t overload just by changing return type      |
     * | ❌ Access modifier doesn't matter              | You can overload even if access modifiers differ |
     * | ✔ Can overload static, private, final methods | Yes! Because overloading is compile-time         |
     *
     * ✅ Simple Examples
     * class Calculator {
     *     // 1 param
     *     int add(int a) {
     *         return a + 10;
     *     }
     *
     *     // 2 params
     *     int add(int a, int b) {
     *         return a + b;
     *     }
     *
     *     // 2 params, different types
     *     double add(double a, int b) {
     *         return a + b;
     *     }
     *
     *     // Same types, different order
     *     String add(String a, int b) {
     *         return a + b;
     *     }
     *
     *     String add(int b, String a) {
     *         return b + a;
     *     }
     * }
     *
     * ❌ Return Type Alone Can’t Overload
     *
     * class Test {
     *     // int print() {...}
     *     // String print() {...}  // ❌ Compile-time error: same signature
     * }
     *
     * 🧠 Reason: Method signature = name + parameter types only. Return type is not considered.
     *
     *
     * 🔥 Tricky Example 1 – Type Promotion
     *
     * class Demo {
     *     void show(int a, long b) {
     *         System.out.println("int, long");
     *     }
     *
     *     void show(long a, int b) {
     *         System.out.println("long, int");
     *     }
     *
     *     public static void main(String[] args) {
     *         Demo d = new Demo();
     *         d.show(10, 20L); // int, long
     *         d.show(10L, 20); // long, int
     *     }
     * }
     *
     *
     * 🔥 Tricky Example 2 – Type Promotion Confusion
     *
     * class Test {
     *     void display(int a) {
     *         System.out.println("int");
     *     }
     *
     *     void display(double a) {
     *         System.out.println("double");
     *     }
     *
     *     public static void main(String[] args) {
     *         Test t = new Test();
     *         t.display('A');  // Output: int → char promoted to int
     *     }
     * }
     *
     * ✅ Overloading main() Method (Yes, it’s possible!)
     * public class MainTest {
     *     public static void main(String[] args) {
     *         System.out.println("main(String[]) called");
     *         main(5);
     *     }
     *
     *     public static void main(int x) {
     *         System.out.println("main(int) called: " + x);
     *     }
     * }
     *
     * ✅ Overloading Static Methods
     * class StaticDemo {
     *     static void show(int a) {
     *         System.out.println("int");
     *     }
     *
     *     static void show(String a) {
     *         System.out.println("String");
     *     }
     *
     *     public static void main(String[] args) {
     *         show(100);         // int
     *         show("ChatGPT");   // String
     *     }
     * }
     */
}
