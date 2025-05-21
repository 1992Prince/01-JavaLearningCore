package org.tim.sec3primtivetypes;

public class P3_PrimitiveCastingNotes {

    // 🔹 1. What are Primitive Data Types in Java and where are they stored in memory?

/*
 Java provides 8 primitive data types which are the most basic types of data.
 These are not objects and store actual values directly.

 Categories:
 - Whole Numbers   → byte, short, int, long
 - Decimal Numbers → float, double
 - Character       → char
 - Boolean         → boolean

 🔸 Memory Storage:
 - If declared locally in a method: stored in **stack memory**.
 - If part of an object: stored in **heap memory** (inside object).

 Example:
    int age = 25;
    double price = 99.99;
    char grade = 'A';
    boolean isPassed = true;

 Behind the scenes:
 - For 'int age = 25;', a 4-byte memory is allocated on the stack for 'age', and 25 is stored directly in it.
*/

// 🔹 2. What are Wrapper Classes and Why we need them if we have primitive types?

/*
 Java provides wrapper classes for all primitive types which are part of java.lang package.

 Wrapper Classes:
 - byte      → Byte
 - short     → Short
 - int       → Integer
 - long      → Long
 - float     → Float
 - double    → Double
 - char      → Character
 - boolean   → Boolean

 🔸 Why Wrapper Classes?
 1. Collections in Java (like ArrayList, HashMap) can only store objects, not primitives.
 2. They allow null values.
 3. Provide utility methods (e.g., Integer.parseInt("123"))
 4. Autoboxing/unboxing simplifies conversion between primitives and wrappers.

 Example:
    int num = 10;
    Integer numObj = num;  // Autoboxing

    ArrayList<Integer> list = new ArrayList<>();
    list.add(numObj); // valid
*/

// 🔹 3. What is Casting and Why we need it? Casting between byte, int, short, long

/*
 Casting means converting a variable from one type to another.

 🔸 Two Types of Casting:
 1. Widening (Implicit): converting from smaller to larger type (safe)
    byte → short → int → long → float → double
 2. Narrowing (Explicit): converting from larger to smaller type (may lose data)
    double → float → long → int → short → byte

 Example:
    byte b = 10;
    int i = b;  // Widening

    int x = 300;
    byte y = (byte) x; // Narrowing, will overflow and give wrong value

 🔸 Why Casting?
 - Needed when assigning a larger type value into a smaller type
 - Used when methods require a specific type
*/

// 🔹 4. What happens behind the scenes when we write: int var1 = 144;

/*
    int var1 = 144;

 - A memory location of 4 bytes is allocated in stack memory (if declared in a method).
 - The literal 144 is stored directly at that location.
 - Variable name 'var1' acts as a label to access that memory.
 - No object creation, no reference, just raw value.
*/

// 🔹 5. What is default type of numeric values in Java?

/*
 - By default, integer numeric literals are of type 'int'.
 - Decimal numeric literals are of type 'double'.

 Example:
    int x = 100;       // Valid
    long l = 100L;     // Add L to make it long

    double d = 10.5;   // Default is double
    float f = 10.5f;   // Need to add 'f' to make it float
*/

}
