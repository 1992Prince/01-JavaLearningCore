package madan.p3polymorphism.notes;

public class P4_Overloading {

    /**
     * 🔷 Type Promotion in Method Overloading
     * 🔹 What is Type Promotion?
     * Jab exact matching method na mile, Java automatically promote karta hai smaller datatype ko larger datatype me.
     *
     * ✅ Promotion Hierarchy (Important to Remember):
     *
     * byte → short → int → long → float → double
     *           ↑     ↑
     *         char  (char → int)
     *
     *
     *  ✅ Example 1: char promoted to int
     *
     *  class Test {
     *     void show(int a) {
     *         System.out.println("int method");
     *     }
     *
     *     public static void main(String[] args) {
     *         Test t = new Test();
     *         t.show('A');  // char → int → "int method"
     *     }
     * }
     *
     * 🔸 'A' is char → promoted to int
     * ✅ So method show(int a) is called.
     *
     * ✅ Example 2: int promoted to long
     *
     * class Demo {
     *     void print(long a) {
     *         System.out.println("long method");
     *     }
     *
     *     public static void main(String[] args) {
     *         new Demo().print(10); // int → long → "long method"
     *     }
     * }
     *
     * ❌ Example 3: Ambiguity due to multiple valid promotions
     *
     * class Ambiguity {
     *     void test(int a, float b) {
     *         System.out.println("int, float");
     *     }
     *
     *     void test(float a, int b) {
     *         System.out.println("float, int");
     *     }
     *
     *     public static void main(String[] args) {
     *         // new Ambiguity().test(10, 10); ❌ Compile-time error
     *     }
     * }
     *
     * Why Ambiguity?
     * void test(int a, float b)
     * void test(float a, int b)
     * isme ambiguity kyu hoti hai jab tu test(10, 10) call karta hai?
     *
     * 🔹 Let's say:
     * test(10, 10); // int, int
     * Ab Java ko dekhna padega ki konsa test() method match karega.
     *
     * Available options:
     * test(int, float)
     * test(float, int)
     *
     * But input arguments are: int, int
     *
     * 🔁 Now What Java Does?
     * Java tries automatic type promotion to fit the method.
     *
     * So:
     *
     * 10 (int) can be promoted to float
     *
     * 10 (int) can also be promoted to float
     *
     * So both these are possible:
     *
     * test(int, float) → ✅ valid (2nd arg int → float)
     *
     * test(float, int) → ✅ valid (1st arg int → float)
     *
     * 💥 So Java gets confused — both methods are equally valid after promotion.
     *
     * 🔴 test(10, 10) → could match either method after promotion
     * ➡ Java says: “I can’t decide” → Compile-time error
     *
     *
     *
     * ✅ Example 4: Promotion + Exact Match Priority
     * class Example {
     *     void fun(int a) {
     *         System.out.println("int method");
     *     }
     *
     *     void fun(double a) {
     *         System.out.println("double method");
     *     }
     *
     *     public static void main(String[] args) {
     *         new Example().fun(10);     // int → Exact match
     *         new Example().fun(10.5f);  // float → promoted to double
     *     }
     * }
     *
     * ✔ Java prefers exact match (int)
     * ✔ float promoted to double if no float version
     *
     * 🔥 Real-Time Interview Trick:
     * class Trick {
     *     void method(short a) {
     *         System.out.println("short");
     *     }
     *
     *     void method(long a) {
     *         System.out.println("long");
     *     }
     *
     *     public static void main(String[] args) {
     *         byte b = 10;
     *         new Trick().method(b); // byte → short → "short"
     *     }
     * }
     *
     * ☑ Java promotes byte → short → matches method(short a)
     *
     *
     *
     * ========================================================================
     *
     * 🔷 Case 1: Method with float parameter
     * void test(float val) {
     *     System.out.println("float method");
     * }
     * When you call: test(10); // 10 is int
     * ✅ Java will promote int → float
     * So this works perfectly and prints: float method
     *
     * ✔ int → float is valid promotion
     * Java automatically promotes 10 (int) to 10.0f
     *
     * 🔷 Case 2: Method with double parameter
     * void test(double val) {
     *     System.out.println("double method");
     * }
     *
     * When you call: test(10); // 10 is int
     *
     * ✅ Java will promote int → double
     *
     * So output is: double method
     * ✔ int → double is valid promotion
     * And Java will pick this method.
     *
     *
     * 🔷 But What If Both float and double Methods Exist?
     *
     * void test(float val) {
     *     System.out.println("float method");
     * }
     * void test(double val) {
     *     System.out.println("double method");
     * }
     *
     * Now call:
     * test(10); // 10 is int
     *
     * 🧠 Question: Which one Java will pick?
     *
     * ➡ Java will always choose the narrower promotion, so:
     *
     * 🔹 int → float is smaller promotion
     * 🔹 int → double is wider
     *
     * ✅ So it will choose: float method
     *
     *
     * 🔷 What If Only byte or short Method Exists?
     *
     * void test(byte val) { ... }
     * void test(short val) { ... }
     *
     * Call: test(10); // 10 is int
     *
     * ❌ ❌ ❌ Java won't auto-demote int → byte or short
     *
     * ➡ You’ll get compile-time error:
     * no suitable method found for test(int)
     *
     * ✅ Extra Tip
     * Java only promotes, never auto-demotes.
     * So if method has byte, short, or char — and you're passing int, you'll get error unless you explicitly cast:
     *
     * test((byte) 10); // Now works
     *
     * ========================================================================
     *
     * 🔷 Overloading main() Method in Java
     *
     * 🔹 Can we overload main() method?
     * ✅ Yes, we can overload it like any other method.
     *
     * But 👇
     *
     * Only public static void main(String[] args) is used as program entry point by JVM.
     *
     * ✅ Example:
     *
     * public class MainOverload {
     *     public static void main(String[] args) {
     *         System.out.println("main(String[] args)");
     *
     *         // You can call other overloaded main manually
     *         main(10);
     *         main("ChatGPT");
     *     }
     *
     *     public static void main(int a) {
     *         System.out.println("main(int): " + a);
     *     }
     *
     *     public static void main(String s) {
     *         System.out.println("main(String): " + s);
     *     }
     * }
     *
     * 🧾 Output:
     * main(String[] args)
     * main(int): 10
     * main(String): ChatGPT
     *
     * 🔸 Why Allow This?
     * Because method overloading is based on method signature.
     *
     * JVM always looks for:
     * public static void main(String[] args)
     * But rest are like normal overloaded methods.
     */
}
