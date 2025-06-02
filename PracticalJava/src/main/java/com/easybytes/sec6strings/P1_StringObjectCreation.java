package com.easybytes.sec6strings;

public class P1_StringObjectCreation {

    public static void main(String[] args) {

        // 1️⃣ STRING CREATION USING LITERAL
        String str1 = "Hello";
        String str2 = "Hello";

        /*
         * ✅ Explanation:
         * - Both str1 and str2 are created using string literals.
         * - String literals are stored in a special memory area called the **String Pool**.
         * - If a string with the same content already exists in the pool,
         *   Java will reuse the existing object instead of creating a new one.
         * - So here, str1 and str2 refer to the SAME object in the pool.
         */

        // == operator compares the references (memory addresses) of the objects
        // equals() method in Object class also compares the ref of objects but in String class it is
        // overridden to compare the content of the strings
        System.out.println("str1.equals(str2) : " + str1.equals(str2)); // str1.equals(str2) : true
        System.out.println("str1 == str2 : " + (str1 == str2));         // str1 == str2 : true

        // 2️⃣ STRING CREATION USING NEW OPERATOR
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        /*
         * ❌ Explanation:
         * - Using `new` creates a NEW object in the Heap every time, even if the content is the same.
         * - The string literal "Hello" is still placed in the String Pool once (if not already there),
         *   but the `new String("Hello")` call wraps that in a new object on the heap.
         * - So str3 and str4 are different objects, even though their content is the same.
         */

        System.out.println("str3 == str4 : " + (str3 == str4)); // str3 == str4 : false
        System.out.println("str3.equals(str4) : " + str3.equals(str4)); // str3.equals(str4) : true

        /**
         * 🔍 == Operator in Java
         * ✅ What it compares:
         * The == operator compares memory addresses (references) — not the actual content.
         *
         * ✅ When does == return true?
         * It returns true only if both references point to the exact same object in memory.
         *
         * ❌ When does == return false?
         * Even if the content is same, but the objects are stored in different locations, == will return false.
         */
    }
}
