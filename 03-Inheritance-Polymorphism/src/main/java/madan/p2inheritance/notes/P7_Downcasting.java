package madan.p2inheritance.notes;

public class P7_Downcasting {

    /**
     * 🔹 1. Why is Widening (Primitive Casting) implicit but Narrowing needs explicit cast?
     * int a = 10;
     * long b = a;         // ✅ Widening - implicit
     * int c = (int) b;    // 🔻 Narrowing - explicit
     *
     * ✅ Widening Casting (Implicit)
     * Smaller → Larger type (e.g., int → long, float → double)
     * Safe operation, no data loss.
     * JVM handles this automatically.

     * ❌ Narrowing Casting (Explicit)
     * Larger → Smaller type (e.g., long → int, double → float)
     * Risk of data loss or overflow.
     * That’s why Java forces you to explicitly tell the compiler: “Yes, I know the risk, do it anyway.”
     * example
     * long l = 1234567890L;
     * int i = (int) l;  // Need explicit cast because int may not hold full long value
     *
     * 🔹 2. Why is Upcasting (Object Casting) implicit but Downcasting is explicit?
     * Dog dog = new Dog();
     * Animal animal = dog;        // ✅ Upcasting - implicit
     * Dog d = (Dog) animal;       // 🔻 Downcasting - explicit
     *
     * ✅ Upcasting (Child → Parent)
     * Always safe because child class is-a type of parent class.
     * No data loss or unexpected behavior.
     * Compiler knows that all Dog objects are also Animal.
     *
     * ❌ Downcasting (Parent → Child)
     * Risky because not every Animal is a Dog.
     * JVM can't guarantee that the actual object is of target type.
     * So you have to explicitly cast and take responsibility.
     * example
     * Animal animal = new Animal();
     * Dog dog = (Dog) animal;  // ❌ This will throw ClassCastException at runtime
     *
     * 🔥 3. When does ClassCastException come?
     * ❌ Happens at Runtime, not at Compile Time.
     * Occurs when:
     * You try to downcast an object to a type it’s not actually an instance of.
     * 🧨 Example:
     * Animal animal = new Dog();  // OK
     * Cat cat = (Cat) animal;     // ❌ Runtime error: Dog can't be cast to Cat
     *
     * ✅ How to avoid:
     * if (animal instanceof Cat) {
     *     Cat cat = (Cat) animal; // Safe
     * } else {
     *     System.out.println("Not a Cat");
     * }
     */
}
