package com.easybytes.sec6strings;

public class P4_StringObject {

    public static void main(String[] args) {

        /**
         * 🔹 1. Are String Methods Static or Instance Methods?
         * ✅ Mostly all String methods are instance methods.
         * Because:
         * They act on a specific String object (like str.length(), str.toUpperCase(), etc.)
         * You need an actual string instance to call them.
         *
         * ❗ Only a few methods like valueOf(), format(), etc. are static because:
         * They don’t need a specific instance to work — they create or operate on strings in a general way.
         *
         * 🔥 Examples:
         * String s = "hello";
         *
         * // 🔹 Instance methods
         * s.length();
         * s.toUpperCase();
         * s.concat(" world");
         *
         * // 🔸 Static methods
         * String.valueOf(100);
         * String.format("Name: %s", "Raj");
         *
         *
         * 🔒 2. Why is the String Class final?
         * ✅ final = cannot be extended/inherited.
         * 💡 Reason Java made it final:
         *  Reason	        Explanation
         * 🔐 Security	Strings are used in file paths, DB URLs, network sockets — immutability ensures no one tampers with them.
         * ⚡ Performance	Strings are used in intern pools and hash-based collections (like HashMap). If value changes, it would corrupt the hashcode.
         * 🧵 Thread safety	Immutability makes it naturally thread-safe — no sync issues.
         * ❌ Prevent Modification	If String wasn't final, someone could subclass it and override behavior — very risky!
         *
         *
         * 🧙 3. How Are We Able to Call String Methods Directly on String Literals?
         * 🔥 Magic of Java compiler! It auto-boxes string literals into String objects.
         * For example:   "hello".toUpperCase();     // ✅ valid
         * This works because:
         * "hello" is actually an instance of String
         * Java treats it like:
         *
         * String temp = "hello";
         * temp.toUpperCase();
         *
         * So, literals like "abc" are automatically treated as String objects — because string literals are implicitly objects.
         */
    }
}
