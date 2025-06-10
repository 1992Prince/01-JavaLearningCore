package org.tim.sec7static_refs3;

//Let’s clearly understand these four confusing Java terms — Reference, Object, Instance, and Class — especially in terms of memory.
// Interviewers love to mix these up.
public class P1_RefernceDefs {

    /**
     *✅ 1. Class
     * 🔹 Definition:
     * A blueprint/template that defines variables and methods.
     * No memory is allocated until an object is created.

     * 🔹 Memory:
     * Stored in Method Area (a part of JVM memory).
     * Loaded once by ClassLoader when the program starts or when it's first used.
     *
     * class Car {
     *     int speed;
     *     void drive() {}
     * }
     * This Car class is just a definition. No memory for speed yet.
     *
     * ✅ 2. Object
     * 🔹 Definition:
     * A real memory block created using new.
     * Represents a real entity in memory based on the class blueprint.
     *
     * 🔹 Memory:
     * Stored in Heap memory.
     * Contains actual data — values of fields like speed.
     *
     * Car c1 = new Car();  // Object is created in Heap
     * new Car() creates the Object — memory is now allocated for speed
     *
     * ✅ 3. Instance
     * 🔹 Definition:
     * Synonym for "object" — an instance of a class.
     * Used to say: "Object created from a class is an instance."
     *
     * 🔹 Memory:
     * Same as object — lives in Heap memory.
     * Car c1 = new Car();  // c1 is an instance of Car // c1 is both an object and an instance of Car.
     *
     * ✅ 4. Reference
     * 🔹 Definition:
     * The name/handle that points to an object in Heap.
     * Like a remote control for the object.
     *
     * 🔹 Memory:
     * Stored in Stack memory.
     * Holds the memory address (reference) of the object in the heap.
     *
     * Car c1 = new Car();
     * c1 is a reference in stack
     * new Car() is the object in heap
     * Car is the class
     * c1 is also an instance of Car
     *
     *
     * "Pass-by-Reference for Objects" or "Reference Sharing"
     * (Technically in Java, everything is pass-by-value, but for objects, the value of the reference is passed.)
     *
     * Example
     * class Car {
     *     int speed;
     * }
     *
     * public class Main {
     *     public static void main(String[] args) {
     *         Car c1 = new Car();  // Object created in Heap
     *         Car c2 = c1;         // Both point to same object
     *
     *         c1.speed = 100;
     *         System.out.println(c2.speed);  // Output: 100 ✅
     *
     *         c2.speed = 200;
     *         System.out.println(c1.speed);  // Output: 200 ✅
     *     }
     * }
     *
     * 💡 Explanation:
     * c1 and c2 both refer to the same object in heap.
     * Any change via one reference reflects on the other — because there is only one object.
     *
     * 🔁 Analogy:
     * Imagine c1 and c2 are two remotes controlling the same TV.
     * If one remote increases the volume, the other sees the same change.
     *
     * 🚫 Common Interview Trap:
     * Q: Is Java pass-by-reference?
     * 👉 Answer:
     * No. Java is strictly pass-by-value, but for objects, the value passed is a reference, so it behaves like reference-sharing.
     *
     *---------------------------------------------------------------------------------------------------
     * ✅ Pass-by-Value – Definition:
     * A copy of the actual value is passed to the method.
     * So changes made inside the method do NOT affect the original variable.
     *
     * 🔸 Java uses this — always (even for objects!).
     *
     * ✅ Pass-by-Reference – Definition:
     * A method receives the memory address (actual reference) of the variable,
     * so any changes made inside the method DO affect the original variable.
     *
     * 🛑 Java does NOT support this directly.
     *
     * 🔁 Pass-by-Value vs Pass-by-Reference
     * | Feature                  | Pass-by-Value (Java)  | Pass-by-Reference (C++, etc.)      |
     * | ------------------------ | --------------------- | ---------------------------------- |
     * | What is passed?          | **Copy of the value** | **Address (memory ref)**           |
     * | Can you modify original? | ❌ Not directly        | ✅ Yes                              |
     * | Does Java use this?      | ✅ Yes                 | ❌ No (Java never uses pass-by-ref) |
     *
     * 🔥 Primitive Example – Proves Pass-by-Value
     * class Demo {
     *     void changeValue(int a) {
     *         a = a + 10;
     *         System.out.println("Inside method: " + a); // 20
     *     }
     *
     *     public static void main(String[] args) {
     *         int x = 10;
     *         Demo d = new Demo();
     *         d.changeValue(x);
     *         System.out.println("After method: " + x);   // 10 ❌ not changed
     *     }
     * }
     *
     * 🔎 Why?
     * x ka value (10) copy ho ke a me gaya.
     * Change hua a me, not in x.
     *
     * 🔥 Object Reference Example – Still Pass-by-Value
     *
     * class Car {
     *     int speed = 50;
     * }
     *
     * class Demo {
     *     void modify(Car c) {
     *         c.speed = 100; // Modifying internal value
     *         c = new Car(); // Re-assigning reference
     *         c.speed = 200;
     *     }
     *
     *     public static void main(String[] args) {
     *         Car myCar = new Car();
     *         Demo d = new Demo();
     *         d.modify(myCar);
     *
     *         System.out.println(myCar.speed); // Output: 100 ✅ not 200
     *     }
     * }
     *
     * 🧪 Interview Trick Q:
     * Q: If I pass an object to a method and change it inside, will it reflect outside?
     * A:
     *
     * If you change its fields, yes.
     * If you reassign the object, no.
     * Why? Because Java is pass-by-value (of the reference).
     *
     *  class Demo {
     *      *     void modify(Car c) {
     *      *         c.speed = 100; // Modifying internal value
     *      *     }
     *      *
     *      *     public static void main(String[] args) {
     *      *         Car myCar = new Car();
     *      *         Demo d = new Demo();
     *      *         d.modify(myCar);
     *      *
     *      *         System.out.println(myCar.speed); // Output: 100
     *      *     }
     *      * }
     */
}
