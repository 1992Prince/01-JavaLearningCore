package madan.p1accessmodifiers;

public class P2_ProtectedModifier {

    /**
     * 🔐 protected Access Modifier – Concept
     * protected members:
     *
     * ✅ Accessible within the same class
     * ✅ Accessible in subclasses (even if subclass is in different package)
     * ✅ Accessible in same package (even without inheritance)
     * ❌ ❌ Not accessible via object from outside package, unless within subclass
     *
     * ✅ Scenario 1: Access within same class – ✅ Works
     * class A {
     *     protected int x = 10;
     *
     *     protected void show() {
     *         System.out.println("A.show(): x = " + x);
     *     }
     *
     *     public void test() {
     *         show();                 // ✅ Allowed
     *         System.out.println(x);  // ✅ Allowed
     *     }
     * }
     *
     * class Main {
     *     public static void main(String[] args) {
     *         A obj = new A();
     *         obj.test();             // ✅ Calls method that uses protected members
     *     }
     * }
     *
     * ✅ Scenario 2: Same package — access via object in another class – ✅ Works
     *
     * // Same package
     * class A {
     *     protected int x = 20;
     *
     *     protected void show() {
     *         System.out.println("x = " + x);
     *     }
     * }
     *
     * class Main {
     *     public static void main(String[] args) {
     *         A obj = new A();
     *         System.out.println(obj.x); // ✅ Allowed — same package
     *         obj.show();                // ✅
     *     }
     * }
     *
     * ✅ Scenario 3: Subclass (same or different package) — ✅ Works (via inheritance)
     * class A {
     *     protected int x = 30;
     *
     *     protected void show() {
     *         System.out.println("A.show(): x = " + x);
     *     }
     * }
     *
     * class B extends A {
     *     public void display() {
     *         System.out.println("B.display(): x = " + x); // ✅ Inherited
     *         show(); // ✅ Inherited
     *     }
     * }
     *
     * class Main {
     *     public static void main(String[] args) {
     *         B obj = new B();
     *         obj.display();      // ✅ Works
     *     }
     * }
     *
     *
     * ❌ Scenario 4: Subclass – try to access protected member via object (outside subclass)
     *
     * class A {
     *     protected int x = 40;
     *
     *     protected void show() {
     *         System.out.println("x = " + x);
     *     }
     * }
     *
     * class B extends A {
     *     public void display() {
     *         System.out.println("Inside B: x = " + x); // ✅ inherited
     *         show();                                   // ✅
     *     }
     * }
     *
     * class Main {
     *     public static void main(String[] args) {
     *         B obj = new B();
     *         obj.display();      // ✅ Allowed
     *
     *         // Direct access via object ❌❌
     *         // System.out.println(obj.x); // ❌ Not allowed if in different package
     *         // obj.show();               // ❌
     *     }
     * }
     *
     * 🧠 Reason: Even though x is inherited, Main is not a subclass. So you can’t access x using object from outside.
     *
     * 🧠 Golden Rule for protected:
     * ✅ Subclass mein inheritance se access allowed.
     * ❌ Lekin object ke through access sirf subclass ke andar se allowed hai — baahar se nahi.
     *
     * 🔥 Summary Table – protected Access
     *
     * | Where?                                      | Access allowed? | Why?                   |
     * | ------------------------------------------- | --------------- | ---------------------- |
     * | Same class                                  | ✅               | Always allowed         |
     * | Same package (any class)                    | ✅               | Package-level access   |
     * | Subclass in same/different package          | ✅               | Inherited              |
     * | Outside subclass using object (other class) | ❌               | Not allowed via object |
     */
}
