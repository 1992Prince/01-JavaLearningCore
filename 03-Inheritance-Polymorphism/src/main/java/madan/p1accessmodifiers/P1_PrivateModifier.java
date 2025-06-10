package madan.p1accessmodifiers;


public class P1_PrivateModifier {

    /**
     * 🔐 private Access Modifier – Concept
     * private members sirf usi class ke andar accessible hote hain jahan wo declare hue hain.
     * Na subclass, na object, na koi doosra class — koi bhi access nahi kar sakta outside that class.
     *
     * ✅ Scenario 1: Access within the same class – ✅ Allowed
     * class A {
     *     private int x = 10;
     *
     *     private void show() {
     *         System.out.println("Inside show(): x = " + x);
     *     }
     *
     *     public void test() {
     *         // ✅ Private members accessible within same class
     *         show();
     *         System.out.println("Inside test(): x = " + x);
     *     }
     * }
     *
     * class Main {
     *     public static void main(String[] args) {
     *         A obj = new A();
     *         obj.test(); // ✅ Allowed — calling public method which internally uses private members
     *     }
     * }
     *
     * ✅ Here, private x and show() are accessed only inside class A → Legal
     *
     * Also if u have main method inside class A then also inside main method u can access private members and methods
     *
     *
     * ❌ Scenario 2: Access from another class [another class can be in same package or other package] using object – ❌ Not Allowed
     *
     * class A {
     *     private int x = 10;
     *
     *     private void show() {
     *         System.out.println("x = " + x);
     *     }
     * }
     *
     * class Main {
     *     public static void main(String[] args) {
     *         A obj = new A();
     *         // System.out.println(obj.x);     ❌ Error
     *         // obj.show();                    ❌ Error
     *     }
     * }
     *
     * ❌ Error: x and show() are private, so Main class cannot access them.
     *
     *
     * ❌ Scenario 3: Access inside subclass using inheritance – ❌ Still Not Allowed
     *
     * class A {
     *     private int x = 10;
     *
     *     private void show() {
     *         System.out.println("x = " + x);
     *     }
     * }
     *
     * class B extends A {
     *     public void display() {
     *         // System.out.println(x);   ❌ Error - private not inherited
     *         // show();                  ❌ Error - private method not accessible
     *     }
     * }
     *
     * 🧠 Even though B extends A, private members are not inherited, so subclass can’t access them.
     *
     * ❌ Scenario 4: Create object of subclass in main and try to access private members of parent – ❌ Still Error
     *
     *
     * 🔥 Summary Table: private Access
     * | Scenario                                         | Allowed? | Reason                                 |
     * | ------------------------------------------------ | -------- | -------------------------------------- |
     * | Inside same class                                | ✅        | `private` is accessible in its class   |
     * | Outside class via object                         | ❌        | Not accessible from outside            |
     * | In subclass using inheritance (even in same pkg) | ❌        | `private` members are not inherited    |
     * | Inside subclass's method                         | ❌        | Cannot access parent's private members |
     * | Via getter/setter methods                        | ✅        | Indirect controlled access             |
     */
}
