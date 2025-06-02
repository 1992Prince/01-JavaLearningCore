package com.easybytes.sec6strings;

public class P3_StringConcatMeth {

    public static void main(String[] args) {

        /**
         * 🔐 Are Strings Immutable in Java?
         * ✅ Yes! Strings in Java are immutable.
         *
         * 🧠 What does Immutable mean?
         * Once an object is created, its state (value) cannot be changed.
         * For String, this means:
         * You cannot modify the characters or content of a String object once it's created.
         * Any operation that looks like it’s modifying a String actually creates a new object.
         */

        // 🔥 Example with concat():
        String s1 = "Java";
        String s2 = s1.concat("Script");

        System.out.println(s1);  // 👉 "Java"
        System.out.println(s2);  // 👉 "JavaScript"

        /**
         * 🔍 What happened?
         * s1 stays the same ("Java")
         * s2 is a new String object created as "JavaScript"
         * This proves immutability — original string isn’t changed.
         */

        // 🧪 Another Example:
        String name = "Dev";
        name.concat("eloper");

        System.out.println(name);  // 👉 "Dev" ❌ not "Developer"

        // The result of concat("eloper") was not stored.
        //Since String is immutable, the original name is untouched.

        // concatenating using concat() method
        String str1 = "Hello".concat(" ").concat("World").concat(" ").concat("!!!");
        System.out.println("str1 : " + str1); // str1 : Hello World !!!

        // concatenating using + operator
        String str2 = "Hello" + " " + "World" + " " + "!!!";
        System.out.println("str2 : " + str2); // str2 : Hello World !!!

        /**
         * 🔹 1. What is an Empty String?
         * An empty string is a valid String object, but it contains no characters.
         * String emptyStr = "";
         * It exists in memory
         * Its length is 0
         * It is not null
         * You can safely call methods like .length(), .isEmpty(), .charAt() (with caution)
         *
         * ✅ Example:
         * String s = "";
         * System.out.println(s.length());     // Output: 0
         * System.out.println(s.isEmpty());    // Output: true
         * System.out.println(s == "");        // Output: true
         *
         * 🔻 2. What is null in Java?
         * null means the reference is pointing to nothing — no object is assigned.
         * String s = null;
         * No memory is allocated for a string object
         * You can’t call any method on it — doing so gives NullPointerException
         *
         * String s = null;
         * System.out.println(s.length());  // ❌ NullPointerException
         *
         * ✅ Quick Examples:
         * String a = "";             // empty string
         * String b = null;           // null reference
         *
         * System.out.println(a.isEmpty());   // true
         * // System.out.println(b.isEmpty());   ❌ NullPointerException
         *
         * 💡 When to use which?
         * Use "" when you mean: "I have a String, but it's empty."
         * Use null when you mean: "There is no String object at all."
         */


    }
}
