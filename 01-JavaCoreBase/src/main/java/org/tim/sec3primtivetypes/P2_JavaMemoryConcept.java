package org.tim.sec3primtivetypes;

public class P2_JavaMemoryConcept {

    /*
     * 🔥 Java Memory Concepts - Deep Dive 🔥
     * ----------------------------------------------------
     * Java memory is mainly divided into 5 key areas:
     *
     * 1. 🧠 Stack Memory
     * 2. 🗃️ Heap Memory
     * 3. 📥 Method Area (also known as Metaspace in Java 8+)
     * 4. 🧾 PC Registers
     * 5. 🧮 Native Method Stack
     *
     * We'll focus on the first 3, which are most relevant to Java developers.
     *
     * ----------------------------------------------------
     * 1️⃣ STACK MEMORY (Thread-specific)
     * ----------------------------------------------------
     * - Stores: local variables, method call info, references to objects in heap
     * - Each thread has its own stack
     * - Follows LIFO (Last In First Out)
     * - Primitive data types (int, float, boolean, etc.) are stored here directly
     * - Reference variables (like Person p) are also stored here but point to heap
     *
     * Example:
     * int age = 30;
     * 🔸 "age" is a local primitive variable → Stored in Stack directly
     *
     * String name = "John";
     * 🔸 "name" reference is stored in Stack → Actual object may be in Heap
     *
     *
     * ----------------------------------------------------
     * 2️⃣ HEAP MEMORY (Shared among all threads)
     * ----------------------------------------------------
     * - Stores: all objects and their instance variables
     * - Garbage collected by JVM
     * - Bigger in size than Stack
     * - When you use `new`, memory is allocated in heap
     *
     * Example:
     * class Car {
     *   int speed = 100;
     * }
     * Car c = new Car();
     * 🔸 "c" (reference) → Stack
     * 🔸 Object created using `new` (Car instance) → Heap
     *
     * ⚠️ Memory leak happens if objects in heap are not garbage collected
     *
     * ----------------------------------------------------
     * 3️⃣ METHOD AREA (a.k.a Metaspace in Java 8+)
     * ----------------------------------------------------
     * - Stores class-level data: class names, static variables, method bytecode, etc.
     * - Shared across all threads
     * - Loaded when the class is loaded by ClassLoader
     *
     * Example:
     * static int count = 0;
     * 🔸 Static variable → Stored in Method Area
     *
     * class Test {
     *   void print() {}
     * }
     * 🔸 Method bytecode for print() → Stored in Method Area
     *
     * ----------------------------------------------------
     * 📌 PC REGISTERS & NATIVE METHOD STACK (less commonly asked)
     * ----------------------------------------------------
     * - PC Register stores the address of the current JVM instruction
     * - Native Method Stack holds native (non-Java) method calls, like JNI
     *
     * ----------------------------------------------------
     * 💡 Summary Table:
     * ----------------------------------------------------
     * | Memory Area     | Stores                                  |
     * |-----------------|------------------------------------------|
     * | Stack           | Local variables, references              |
     * | Heap            | Objects, instance variables              |
     * | Method Area     | Class info, static vars, method bytecode |
     *
     *
     * ----------------------------------------------------
     * 🧠 Interview Insight:
     * ----------------------------------------------------
     * Q: Where are static variables stored?
     * A: In the Method Area (Metaspace in Java 8+)
     *
     * Q: Where is the memory allocated for new objects?
     * A: Heap
     *
     * Q: What happens to a reference variable after the method ends?
     * A: It’s removed from Stack (eligible for GC if no references exist)
     */

}
