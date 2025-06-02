package com.easybytes.sec6strings;

public class P2_StringInterning {

    public static void main(String[] args) {

        /**
         * 🧠 What is String Interning?
         * In Java, the String Pool is a special memory area in the heap where string literals are stored to save memory.
         * When you write: String s1 = "Hello";
         * Java checks if "Hello" already exists in the pool.
         *
         * ✅ If yes → Reuses the object.
         * ❌ If not → Creates and stores it in the pool.
         *
         * 🔥 Now, the real stuff: .intern() method
         * ✅ What it does:
         * intern() tells Java:
         * "Put this string in the String Pool if it's not already there, or return the reference from the pool if it exists."
         *
         * 🔍 Example Breakdown:
         * String str1 = "Object";                     // stored in String pool
         * String str2 = new String("Object");         // new object in Heap
         * System.out.println(str1 == str2);           // ❌ false — different references
         *
         * ⚡ Now using .intern()
         * String str3 = new String("Object").intern(); // tries to find "Object" in pool
         * System.out.println(str1 == str3);            // ✅ true — both refer to same pool object
         */

        String str1 = "Object";  // 🔹 Stored in String Pool

        String str2 = new String("Object"); // 🔸 New object in Heap

        System.out.println(str1 == str2);   // ❌ false – different references

        String str3 = new String("Object").intern(); // 🔄 Goes to String Pool

        System.out.println(str1 == str3);   // ✅ true – both from String Pool

        String str4 = str2.intern();  //  Now str4 refers to pooled string

        System.out.println("str1 == str2 : " + (str1 == str2)); // str1 == str2 : false
        System.out.println("str1 == str4 : " + (str1 == str4)); // str1 == str4 : true
    }
}
