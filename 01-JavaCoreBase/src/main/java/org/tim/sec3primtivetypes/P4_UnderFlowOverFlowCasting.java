package org.tim.sec3primtivetypes;

public class P4_UnderFlowOverFlowCasting {

    /*
📘 Java Concept Notes: Overflow, Underflow, Casting

🔹 1. What is Overflow?

When a value exceeds the **maximum limit** of a data type, it wraps around to the **minimum value**.

Example:
- byte range = -128 to 127
- If you try to store 128 in a byte, it wraps around to -128



    public class OverflowUnderflowCastingNotes {
        public static void main(String[] args) {
            byte maxByte = 127;
            maxByte++;  // Overflow
            System.out.println("Overflow Example (byte): " + maxByte); // Output: -128

     */

/*
💡 Memory behind the scenes:
- byte is 8 bits → 2^8 = 256 values
- Range: -128 to 127
- 127 + 1 = -128 due to binary wrap-around
*/


/*
🔹 2. What is Underflow?

When a value goes below the **minimum limit**, it wraps around to the **maximum value**.

Example:
- byte range = -128 to 127
- If you subtract 1 from -128, it wraps around to 127


            byte minByte = -128;
            minByte--;  // Underflow
            System.out.println("Underflow Example (byte): " + minByte); // Output: 127

*/

/*
💡 This behavior applies to all integer-based primitive types like byte, short, int, long.

======================================================================

🔹 3. Casting in Java

Casting means converting a value from one data type to another.

Two Types:
  ✅ Implicit Casting (Widening)
  ✅ Explicit Casting (Narrowing)

*/

/*
🔸 Implicit Casting (Widening) - SAFE

➡ When smaller type is assigned to a larger type (no data loss)
➡ Happens automatically

Hierarchy: byte → short → int → long → float → double


            int myInt = 100;
            long myLong = myInt;        // Implicit casting (int to long)
            float myFloat = myLong;     // Implicit casting (long to float)
            System.out.println("Implicit Casting Result: " + myFloat); // 100.0

/*
💡 JVM does it for you. No need to write any casting syntax.

🔸 Explicit Casting (Narrowing) - MANUAL

➡ When larger type is assigned to a smaller type (possible data loss)
➡ You must use `(targetType)` syntax


            double myDouble = 123.456;
            int myNewInt = (int) myDouble;  // Explicit casting (data loss)
            System.out.println("Explicit Casting Result: " + myNewInt); // 123

/*
💡 Decimal part (.456) is truncated (not rounded).

======================================================================

🔹 4. Where is Casting Mostly Used?

✅ Situations where Java forces you to cast:

1️⃣ Arithmetic with byte/short/char:

    byte a = 10;
    byte b = 20;
    byte sum = (byte)(a + b); // because `a + b` becomes int by default

2️⃣ Converting user input from String:

    String num = "99";
    int value = Integer.parseInt(num); // conversion to int

3️⃣ Working with general Object types:

    Object obj = "Hello";
    String text = (String) obj;

4️⃣ Serialization/Deserialization (Object <-> Byte Stream)

5️⃣ Polymorphism (Parent → Child type):

    Animal a = new Dog();
    Dog d = (Dog) a;

6️⃣ Data constraints (long to int, double to float when saving memory)

======================================================================

🔹 5. Default Behaviors and Gotchas

✅ Implicit casting is SAFE
  - No data loss
  - Happens automatically

❌ Explicit casting is RISKY
  - You may lose precision or range
  - Java does **not** warn at runtime, only compile-time checks

✅ Integer arithmetic promotes types:
  - All operations on byte, short, char → result is `int` (need to cast back)
  - Floating-point constants are treated as `double` by default

Example:
    float f = 12.3f; // `f` required, otherwise compile-time error

*/

}



