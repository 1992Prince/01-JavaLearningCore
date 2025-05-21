package org.tim.sec3primtivetypes;

public class P1_JavaBasicsDefs {

    /*
🔹 1. Variables
A variable is a name given to a memory location that stores data. In Java:

    int age = 25;

    int   → data type (tells the kind of data)
    age   → variable name (label pointing to memory)
    25    → literal (actual value stored)

💡 Behind the scenes:
- For primitive types, value is stored directly in the stack memory.
- So `age` points to a memory location in the stack where 25 is stored.

------------------------------------------------------
🔹 2. Keywords
- Keywords are reserved words in Java which have special meaning.
- Cannot be used as variable names.

Examples: `class`, `int`, `static`, `new`, `if`, `else`, `return`, etc.

------------------------------------------------------
🔹 3. Literals
- Fixed values assigned to variables are called literals.

Examples:
    int age = 25;              // 25 is an integer literal
    double pi = 3.14;          // 3.14 is a floating point literal
    char letter = 'A';         // 'A' is a character literal
    String name = "John";      // "John" is a string literal

------------------------------------------------------
🔹 4. Data Types
Java has two main types of data types:

1. Primitive (value stored directly in memory):
    - Whole numbers: byte, short, int, long
    - Decimal numbers: float, double
    - Character: char
    - Boolean: boolean

2. Non-Primitive (Reference types):
    - String, Arrays, Objects, etc.

------------------------------------------------------
🔹 5. Operators
Operators are special symbols that perform operations on variables and values.

Types:
    - Arithmetic: +, -, *, /, %
    - Relational: ==, !=, <, >, <=, >=
    - Logical: &&, ||, !
    - Assignment: =, +=, -=, etc.
    - Unary: ++, --, +, -

Example:
    int a = 10, b = 5;
    int sum = a + b;  // + is arithmetic operator
    boolean check = a > b;  // > is relational operator

------------------------------------------------------
🔹 6. Primitive Types

📘 Whole Number Types:

1. byte (1 byte = 8 bits)
    - Range: -128 to 127
    - Use: Saves memory in large arrays when memory is critical

2. short (2 bytes = 16 bits)
    - Range: -32,768 to 32,767
    - Use: Also for memory savings

3. int (4 bytes = 32 bits)
    - Range: -2,147,483,648 to 2,147,483,647
    - Default type for whole numbers
    - Stored in stack (for local vars)

4. long (8 bytes = 64 bits)
    - Range: -9 quintillion to +9 quintillion approx
    - Use suffix 'L':
        long bigNum = 10000000000L;

📘 Decimal Types:

1. float (4 bytes)
    - Use suffix 'f':
        float pi = 3.14f;
    - Less precision than double

2. double (8 bytes)
    - Default type for decimal numbers
        double rate = 5.678;

💡 Memory for primitives:
- Local variables → stored in **stack**
- Class/static variables → stored in **heap (object)** or **method area** (for static)

------------------------------------------------------
📌 Example:
    byte b = 10;
    short s = 200;
    int i = 10000;
    long l = 100000L;

    float f = 3.14f;
    double d = 98765.4321;

    📌 OTHER TYPES:
===============

3. **char** → 2 bytes → Stores a single 16-bit Unicode character

    Example:
    char grade = 'A';

    💡 Stored as numeric Unicode value internally. (e.g., 'A' = 65)

4. **boolean** → 1 bit (JVM-dependent) → true / false

    Example:
    boolean isJavaFun = true;

📌 MEMORY:
- `char` and `boolean` are also stored in the stack.

So total 8 primitive data types are there - 1) byte 2) int 3) short 4) long 5) float 6) double 7) char 8) boolean

*/



}
