package sid;

public class P1_String {

    /**
     * What are Strings?
     * Strings in Java are objects that represent sequences of characters.
     * They are instances of the java.lang.String class.
     * String class is present in java.lang package
     *
     * Declaration and Initialization
     *
     * Strings can be declared and initialised in two ways:
     *
     * 1) // Using string literal
     * String str1 = "Hello, World!";
     *
     * 2) // Using the new keyword or you can call it via constructor initialization
     * String str2 = new String("Hello, World!");
     *
     * 🔷 What Exactly is the String Pool?
     * String Pool ek special memory area hota hai heap ke andar, jise hum String Constant Pool bhi kehte hain.
     *
     * Jab bhi hum string literals likhte hain (String s = "hello";), Java uss literal ko String pool me store karta hai.
     *
     * Agar same value ka string pool me pehle se hai, to Java uska hi reference reuse karta hai — naye object ki zarurat nahi padti.
     *
     * 🔍 Important: String Pool Kaha Hota Hai?
     * 🧠 String Pool is part of Heap memory, specifically inside Method Area (earlier called PermGen before Java 8, now part of Metaspace).
     *
     * 🔸 So yes — String Pool lives in heap, but it is a dedicated area handled by JVM.
     *
     * 🎯 Purpose of String Pool
     * | 🎯 **Purpose**                 | ✅ **Why it matters**                            |
     * | ------------------------------ | ----------------------------------------------- |
     * | Avoid duplicate string objects | Saves heap memory                               |
     * | Improve performance            | Less object creation                            |
     * | Reuse string literals          | Fast comparison using `==`                      |
     * | JVM internal optimization      | For Strings, which are immutable & used heavily |
     *
     * 🔎 Let’s Break Down This Line:
     * String str = "test";
     * | Part     | Meaning                                                                                  |
     * | -------- | ---------------------------------------------------------------------------------------- |
     * | `"test"` | **String literal**, stored in String Pool                                                |
     * | `str`    | Reference variable of type `String`                                                      |
     * | `=`      | Assigns reference to the object in String Pool                                           |
     * | Result   | JVM checks if "test" already exists in pool — if yes, reuse; else create and add to pool |
     *
     * 🔥 Example:
     * String str1 = "hello";
     * String str2 = "hello";
     * System.out.println(str1 == str2); // ✅ true
     *
     * 🔄 JVM Flow for: String str1 = "hello";
     * JVM dekhta hai: "hello" ek string literal hai.
     * JVM String Pool me check karta hai — "hello" present hai?
     * ❌ Nahi mila? → JVM "hello" ko String Pool me create karta hai.
     * str1 variable ko pool me "hello" wale object ka reference de diya jata hai.
     *
     * 🔄 JVM Flow for: String str2 = "hello";
     * JVM dekhta hai "hello" ek string literal hai.
     * Ab JVM pool me check karta hai
     *  ✅ "hello" already present hai.
     * To JVM naya object create nahi karta, balki "hello" wale same reference ko str2 ko de deta hai.
     *
     * 🔍 Final Picture in Memory:
     * [String Pool]
     *
     * "hello"  <——— str1
     *           <——— str2
     *
     *           🔥 So When You Do:
     *           System.out.println(str1 == str2);  // ✅ true
     *           == checks reference equality.
     * Since both point to the same object in pool, output is ✅ true.
     */

    public static void main(String[] args) {

        // String declaration and initialization using literal
        String str = "testing";
        System.out.println("str - " + str); // str - testing

        // String declaration and initialization using new keyword
        String str1 = new String("Hello Sir");
        System.out.println("str1 - " + str1); // str1 - Hello Sir

        // prove the concept of String pool that for same literal same ref will be returned
        String str3 = "hello";
        String str4 = "hello";
        System.out.println(str3 == str4); // ✅ true

    }
}
