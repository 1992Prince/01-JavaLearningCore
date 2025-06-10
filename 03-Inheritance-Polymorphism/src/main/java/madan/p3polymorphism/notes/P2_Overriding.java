package madan.p3polymorphism.notes;

public class P2_Overriding {

    /**
     * ✅ Method Overriding Rules with Examples in Java
     *
     * 🔸 Rule 1: Same Method Signature
     *
     * class Parent {
     *     void show() {
     *         System.out.println("Parent show()");
     *     }
     * }
     *
     * class Child extends Parent {
     *     @Override
     *     void show() {
     *         System.out.println("Child show()");
     *     }
     * }
     *
     * 🧠 Signature = method name + parameter types. Return type can be covariant.
     *
     * 🔸 Rule 2: Access Modifier – Can’t Reduce Visibility
     *
     * class Parent {
     *     public void display() {
     *         System.out.println("Parent display");
     *     }
     * }
     *
     * class Child extends Parent {
     *     // ❌ private void display() {...} → Error!
     *     public void display() {
     *         System.out.println("Child display");
     *     }
     * }
     *
     * 🟢 Allowed: public → public
     * ❌ Not allowed: public → private
     *
     * 🧠 What is Covariant Return Type in Java?
     * ➡ Covariant return type ka matlab hota hai:
     * While overriding a method, subclass is allowed to change the return type to a subclass of the original return type.
     *
     * 🔸 Rule 3: Covariant Return Type Allowed
     *
     * class Animal {}
     *
     * class Dog extends Animal {}
     *
     * class Parent {
     *     Animal getAnimal() {
     *         return new Animal();
     *     }
     * }
     *
     * class Child extends Parent {
     *     @Override
     *     Dog getAnimal() {
     *         return new Dog();  // ✅ valid because Dog is subclass of Animal
     *     }
     * }
     *
     * 🔸 Rule 4: Final Method Cannot Be Overridden
     * 🔸 Rule 5: Static Method – Method Hiding, Not Overriding
     *
     * class Parent {
     *     static void greet() {
     *         System.out.println("Parent static greet");
     *     }
     * }
     *
     * class Child extends Parent {
     *     static void greet() {
     *         System.out.println("Child static greet");
     *     }
     * }
     *
     * public class Test {
     *     public static void main(String[] args) {
     *         Parent p = new Child();
     *         p.greet(); // Output: Parent static greet (based on reference type)
     *     }
     * }
     *
     * 🧠 Static methods are resolved at compile-time — this is method hiding, not overriding.
     *
     * 🔸 Rule 6: Constructors Cannot Be Overridden
     * 🔸 Rule 7: Private Methods Cannot Be Overridden
     * 🔸 Rule 8: Exception Rule in Overriding
     *
     * Child method can throw fewer or same checked exceptions, not more.
     *
     * class Parent {
     *     void show() throws IOException {
     *         System.out.println("Parent show");
     *     }
     * }
     *
     * class Child extends Parent {
     *     @Override
     *     void show() throws FileNotFoundException { // ✅ valid (subclass exception)
     *         System.out.println("Child show");
     *     }
     * }
     *
     * ❌ Can't throw broader exception like Exception if parent throws IOException
     *
     *
     *
     *
     * ❓ Can We Override Parent Class Members (Fields)?
     * NO — Java doesn't support variable overriding.
     *
     * class Parent {
     *     int x = 10;
     * }
     *
     * class Child extends Parent {
     *     int x = 20;
     * }
     *
     * public class Test {
     *     public static void main(String[] args) {
     *         Parent obj = new Child();
     *         System.out.println(obj.x); // Output: 10 (reference type decides)
     *     }
     * }
     *
     * 🧠 Fields are resolved at compile time, based on reference type, not object type
     *
     * 🔑 How to Access Parent Class Members from Subclass?
     * 1. Method → super.method()
     *
     * class Parent {
     *     void display() {
     *         System.out.println("Parent display");
     *     }
     * }
     *
     * class Child extends Parent {
     *     @Override
     *     void display() {
     *         super.display(); // call parent version
     *         System.out.println("Child display");
     *     }
     * }
     *
     * 2. Variable → super.variable
     *
     * class Parent {
     *     int x = 10;
     * }
     *
     * class Child extends Parent {
     *     int x = 20;
     *
     *     void show() {
     *         System.out.println(super.x); // 10
     *         System.out.println(this.x);  // 20
     *     }
     * }
     */
}
