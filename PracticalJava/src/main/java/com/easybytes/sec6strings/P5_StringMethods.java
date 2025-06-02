package com.easybytes.sec6strings;

public class P5_StringMethods {

    /**
     * // 🔹 equals() is defined in Object class and compares reference
     * // 🔹 In String class, equals() is OVERRIDDEN to compare actual content
     *
     * // 🔸 == compares memory address (reference)
     * // 🔸 equals() in String compares content (overridden behavior)
     *
     * // 🔹 toString() in Object returns: getClass().getName() + @ + hashCode
     * // 🔹 In String, toString() is overridden to return the content itself
     *
     * // ✅ That's why you can directly print a String, and it shows the text
     */

    public static void main(String[] args) {

        // 1️⃣ LENGTH
        // ➤ Definition: Returns the number of characters in the string
        // ➤ Syntax: int length()
        // ➤ Return type: int
        String text = "Java 💻";
        System.out.println("Length: " + text.length()); // Output: 6

        // 2️⃣ EQUALS vs ==
        // ➤ equals(): Compares content (overridden in String class)
        // ➤ Syntax: boolean equals(Object obj)
        // ➤ Return type: boolean
        // ➤ ==: Compares object references (default Object behavior)
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println("== : " + (str1 == str2)); // false
        System.out.println("equals() : " + str1.equals(str2)); // true

        // 3️⃣ COMPARETO
        // ➤ Definition: Compares two strings lexicographically based on Unicode value
        // ➤ Syntax: int compareTo(String anotherString)
        // ➤ Return type: int (0 if equal, < 0 if less, > 0 if greater)
        System.out.println("abc vs abd: " + "abc".compareTo("abd")); // -1
        System.out.println("abc vs abc: " + "abc".compareTo("abc")); // 0
        System.out.println("xyz vs abc: " + "xyz".compareTo("abc")); // > 0

        // ➤ Use equals() when you want to compare string values for equality.
        // ➤ Use compareTo() when you need sorting or lexicographical comparison.

        // 4️⃣ CHARAT
        // ➤ Definition: Returns the character at a given index
        // ➤ Syntax: char charAt(int index)
        // ➤ Return type: char
        // ➤ Throws: StringIndexOutOfBoundsException if index < 0 or >= length
        String name = "OpenAI";
        System.out.println("charAt(0): " + name.charAt(0)); // O

        // 5️⃣ ISEMPTY & LENGTH
        // ➤ isEmpty(): Checks if string is empty
        // ➤ Syntax: boolean isEmpty()
        // ➤ Return type: boolean
        String empty = "";
        System.out.println("isEmpty: " + empty.isEmpty()); // true
        System.out.println("length == 0: " + (empty.length() == 0)); // true

        /**
         * ✅ 1️⃣ String str = null; — Null String
         * It means the reference str is not pointing to any object.
         * No memory is allocated for a String object.
         * If you try to call any method like str.length(), it will throw: NullPointerException
         * Example
         * String str = null;
         * System.out.println(str.length()); // ❌ NullPointerException
         *
         * ✅ 2️⃣ String str = ""; — Empty String
         * It means str is pointing to a valid String object, but it contains 0 characters.
         * It’s a valid String stored in String Pool.
         * You can safely call methods like length(): - str.length() // ✅ returns 0
         *
         * Example
         * String str = "";
         * System.out.println(str.length()); // ✅ 0
         */

        // 6️⃣ CASE CONVERSION
        // ➤ toUpperCase(): Converts all characters to uppercase
        // ➤ toLowerCase(): Converts all characters to lowercase
        // ➤ Syntax: String toUpperCase(), String toLowerCase()
        // ➤ Return type: String
        String mix = "JaVa";
        System.out.println("Upper: " + mix.toUpperCase()); // JAVA
        System.out.println("Lower: " + mix.toLowerCase()); // java

        // 7️⃣ STRING VALUEOF
        // ➤ Definition: Converts primitive values or objects to their string representation
        // ➤ Syntax: static String valueOf(type value)
        // ➤ Return type: String
        int age = 30;
        double pi = 3.14;
        boolean isTrue = true;
        char ch = 'X';
        System.out.println("int as String: " + String.valueOf(age));       // "30"
        System.out.println("double as String: " + String.valueOf(pi));     // "3.14"
        System.out.println("boolean as String: " + String.valueOf(isTrue));// "true"
        System.out.println("char as String: " + String.valueOf(ch));       // "X"

        // 8️⃣ PRINTING INT TRICK
        // ➤ Java evaluates expressions from left to right
        // ➤ When string is encountered, remaining values are treated as strings
        System.out.println("My age is: " + 34 + 33); // "My age is: 3433"
        System.out.println("Correct sum: " + (34 + 33)); // "My age is: 67"
    }
}
