package org.tim.sec3primtivetypes;

public class P5_JavaCharBooleanAndDataHandling {

    /*
     🔹 char (Character) in Java:
     - 'char' is a primitive data type used to store a single 16-bit Unicode character.
     - Size: 2 bytes
     - Range: '\u0000' (0) to '\uffff' (65,535)

     Example:
       char letter = 'A';
       char digit = '7';

     💡 Memory:
     - Stored in stack (because it's primitive).
     - Uses UTF-16 encoding internally.

     ----------------------------------------------------------

     🔹 boolean in Java:
     - 'boolean' is a primitive type that stores either true or false.
     - Size: JVM dependent (technically 1 bit, but practically it takes 1 byte or more for alignment).
     - It’s used mainly in conditional statements and logical operations.

     Example:
       boolean isJavaFun = true;
       boolean isLightOn = false;

     💡 Memory:
     - Stored in stack.

     ----------------------------------------------------------

     🔹 char vs String in Java:

     ➤ char:
       - Represents a single character.
       - Primitive type.
       - Size: 2 bytes.
       - Faster and memory-efficient for single characters.

       Example:
         char c = 'X';

     ➤ String:
       - Represents a sequence of characters.
       - Reference type (Object).
       - Immutable (cannot be changed once created).
       - Comes from `java.lang.String` class.

       Example:
         String name = "Java";

     💡 Use 'char' for single characters and 'String' for words, sentences, or collections of characters.

     ----------------------------------------------------------

     🔹 How Java Handles Data:

     1️⃣ Java’s Primitives:
       - Includes 8 types: byte, short, int, long, float, double, char, boolean.
       - Stored in stack memory (if used as local variables).
       - Fast and low-memory overhead.

     2️⃣ Java’s Built-in Classes:
       - Includes classes like String, Integer, Double, Boolean, ArrayList, HashMap, etc.
       - Come from Java API (e.g., java.lang, java.util).
       - Stored in heap memory (objects), references live in stack.

       Example:
         String name = "OpenAI";
         Integer age = 25;

     3️⃣ Your Classes:
       - Custom classes created by developers.
       - Also stored in heap when instantiated.
       - Supports encapsulation, inheritance, polymorphism, abstraction.

       Example:
         class Car {
           String model;
           int year;
         }

         Car myCar = new Car();

     ----------------------------------------------------------
    */
}
