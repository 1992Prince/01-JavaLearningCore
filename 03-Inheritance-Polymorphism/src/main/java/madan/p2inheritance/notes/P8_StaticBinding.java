package madan.p2inheritance.notes;

public class P8_StaticBinding {

    /**
     * 🔥 Static Binding (Early Binding)
     * Definition: Static Binding is the process where the method call is resolved at compile-time.
     * It is used when the type of object is known at compile time and there is no overriding involved.
     *
     * ✅ Happens in:
     * Static methods
     * Final methods
     * Private methods
     * Method Overloading (same method name, different parameters)
     *
     * 🔍 What is Static Binding?
     * Static binding (a.k.a. early binding) means:
     * Method resolution (deciding which method to call) is done by the compiler at compile time.
     * It uses the reference type, not the actual object type.
     *
     * 🔧 How Compiler Knows It’s Static Binding?
     * The compiler makes decisions using:
     * The reference type on the left-hand side.
     * Whether the method is static, final, or private, or whether it's overloaded.
     * These methods cannot be overridden, so Java knows for sure at compile time which method to bind.
     *
     * ✅ Static Binding Cases
     *
     * 1. Static Methods
     * Why? Because they belong to the class, not the object.
     *
     * Cannot be overridden.
     *
     * class StaticExample {
     *     static void greet() {
     *         System.out.println("Static greet()");
     *     }
     * }
     *
     * class Test {
     *     public static void main(String[] args) {
     *         StaticExample.greet(); // ✅ Static binding: resolved by compiler using class name
     *     }
     * }
     *
     * If you write obj.greet() it still works, but not recommended. Compiler still binds it statically.
     *
     * 2. Overloaded Methods
     * Why? Overloading means same method name, different parameters.
     *
     * Method is resolved based on reference type + parameter types, at compile time.
     *
     * class OverloadExample {
     *     void show(int a) {
     *         System.out.println("int version");
     *     }
     *
     *     void show(String s) {
     *         System.out.println("String version");
     *     }
     *
     *     public static void main(String[] args) {
     *         OverloadExample obj = new OverloadExample();
     *         obj.show(5);        // Compiler chooses int version
     *         obj.show("hello");  // Compiler chooses String version
     *     }
     * }
     *
     * 3. Private Methods
     * Why? Private methods are not visible outside the class, hence not inherited, so overriding not possible.
     *
     * Bound at compile time
     *
     * class PrivateParent {
     *     private void display() {
     *         System.out.println("Parent display()");
     *     }
     *
     *     public void call() {
     *         display(); // ✅ Compiler binds it statically (knows it's private to this class)
     *     }
     * }
     *
     * class PrivateChild extends PrivateParent {
     *     private void display() {
     *         System.out.println("Child display()");
     *     }
     * }
     *
     * Even though both classes have display(), it’s not overriding.
     * Each class has its own method, and compiler binds display() statically in PrivateParent.
     *
     * 4. Final Methods
     * Why? Final methods can't be overridden.
     *
     * So, compiler binds them statically.
     * class FinalExample {
     *     final void sayHello() {
     *         System.out.println("Hello!");
     *     }
     * }
     *
     * ❌ Instance Methods (Not Static Binding)
     * If a method is:
     *
     * Not static
     * Not final
     * Not private
     *
     * And overridden, Java uses dynamic binding.
     *
     * class A {
     *     void greet() {
     *         System.out.println("A greet");
     *     }
     * }
     *
     * class B extends A {
     *     void greet() {
     *         System.out.println("B greet");
     *     }
     * }
     *
     * class Test {
     *     public static void main(String[] args) {
     *         A obj = new B();
     *         obj.greet(); // 🔥 Dynamic binding: resolved at runtime based on object (B)
     *     }
     * }
     *
     * 🎯 Summary Table (Cheat Sheet)
     * | Case                  | Binding Type    | Reason                              |
     * | --------------------- | --------------- | ----------------------------------- |
     * | Static method         | Static binding  | Not overridden, class-level         |
     * | Overloaded method     | Static binding  | Chosen at compile time              |
     * | Private method        | Static binding  | Not visible for overriding          |
     * | Final method          | Static binding  | Can't be overridden                 |
     * | Instance + Overridden | Dynamic binding | Decided by actual object at runtime |
     */
}
