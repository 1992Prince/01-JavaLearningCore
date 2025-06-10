package org.tim.sec7static_refs3;

public class P2_StaticKeyword {

    /**
     * ✅ static Keyword in Java – Overview
     * static means belonging to the class, not to any specific object.
     *
     * If something is static, it:
     *   Is shared across all instances (objects)
     *   Can be accessed without creating object
     *   Is loaded into memory only once (at class loading)
     *
     *   🔹 1. Static Variables
     *   class Car {
     *     static int wheels = 4; // shared by all cars
     *     String color;
     * }
     * 🧠 Purpose:
     * Shared data (e.g. config, constants, counters)
     * Saves memory – created once only
     *
     * 🔹 2. Instance Variables
     * Car c1 = new Car();
     * c1.color = "Red";
     *
     * Stored per object (Heap)
     * Each object has its own copy
     *
     * 🔁 Static vs Instance Variables
     * | Feature         | Static Variable             | Instance Variable                |
     * | --------------- | --------------------------- | -------------------------------- |
     * | Memory Location | **Method Area**             | **Heap Memory**                  |
     * | Shared?         | ✅ Shared across all objects | ❌ Unique per object              |
     * | Accessed using? | Class name or object        | Only via object                  |
     * | Lifetime        | Till class is unloaded      | Till object is garbage collected |
     *
     * 🔹 3. Static Methods
     *
     * class Utils {
     *     static void printHello() {
     *         System.out.println("Hello!");
     *     }
     * }
     *
     * 🧠 Key Points:
     * Belongs to class, not object
     * Can be called using class name: Utils.printHello();
     * Cannot use this keyword inside
     * Cannot directly access non-static members or instance members
     * but instance methods can use of call static variables inside their block
     *
     * 🔁 Static vs Instance Methods
     * | Feature                   | Static Method             | Instance Method   |
     * | ------------------------- | ------------------------- | ----------------- |
     * | Bound to?                 | Class                     | Object            |
     * | Can access instance vars? | ❌ No (without object ref) | ✅ Yes             |
     * | Can use `this`?           | ❌ No                      | ✅ Yes             |
     * | Access                    | `ClassName.method()`      | `object.method()` |
     *
     * 🔹 4. Static Block
     * class Demo {
     *     static {
     *         System.out.println("Static block called once");
     *     }
     * }
     *
     * Executes once when class is loaded (before main)
     * Good for static initialization like config loading
     *
     * 🔹 5. Static Class (Only nested static class allowed)
     *
     * class Outer {
     *     static class Inner {
     *         void msg() {
     *             System.out.println("Static nested class");
     *         }
     *     }
     * }
     *
     * Can access static members of outer class
     * No need for outer class object
     *
     * 🔹 6. this keyword and static
     * // ❌ Illegal:
     * static void doSomething() {
     *     // System.out.println(this); // ❌ Error: Cannot use 'this' in static
     * }
     * Why? this refers to current object, but static methods don’t belong to any object.
     *
     * 🧠 Where is static stored in memory?
     * | Element          | Stored In              |
     * | ---------------- | ---------------------- |
     * | `static` members | **Method Area** of JVM |
     * | Instance members | **Heap**               |
     *
     * ✅ Use Cases of Static in Automation Frameworks
     * | Use Case                        | Example                                  |
     * | ------------------------------- | ---------------------------------------- |
     * | Common Config                   | `static String BASE_URL = "https://xyz"` |
     * | Utility Methods                 | `public static void clickElement()`      |
     * | Driver Reuse (carefully)        | `public static WebDriver driver;`        |
     * | Constants                       | `static final String HOME_PAGE = "..."`  |
     * | Test Hooks (if shared globally) | `static WebDriver initialized once`      |
     *
     * ✅ Interview Angle:
     * "Why did you choose static for certain components in your automation framework instead of instance-level?"
     *
     * 📌 1. Static is Loaded Only Once (Class Loading Phase)
     * 💡 JVM Life Cycle Flow:
     * → Class Loaded (Once) → Static Variables + Static Blocks Initialized
     * → Object Created (if any) → Instance Vars Initialized
     * → Methods Executed
     *
     * ✅ Benefit in Framework:
     * Static content (like test data, config, driver path, common methods) is loaded once per execution
     * Saves memory (no multiple objects with same data)
     * Improves performance (no repeated I/O or parsing)
     *
     * 🏗️ 2. Where Static Makes Sense in Framework – With Reasoning
     * | Use Case                   | Why Static?                                                                   |
     * | -------------------------- | ----------------------------------------------------------------------------- |
     * | `ConfigReader.loadProps()` | Properties file should load **once** for all tests                            |
     * | `TestDataReader.readCSV()` | No need to reload same test data per test — reuse static object               |
     * | `WebDriver driver`         | Share single driver across hooks/tests (cautiously, in simple parallel tests) |
     * | `Constants.java`           | Fixed values (like base URL, env, timeout) – should never change              |
     * | `Utility methods`          | Reusable logic (`click()`, `waitFor()`) doesn’t depend on object state        |
     *
     * ✅ 3. How Static Saves Memory – Architecture Flow
     * 🔍 Without static:
     * [Test1] → creates ConfigReader → loads file into memory
     * [Test2] → creates another ConfigReader → again loads same file
     * → Memory wasted (duplicate reads)
     *
     * 🔥 With static:
     * [Framework Start] → Static block loads file once
     * [Test1/Test2/Test3] → all use same static config map
     * → Memory efficient + faster execution
     *
     * 🧠 Key Architectural Thinking:
     * Static members live in Method Area (shared JVM space)
     *
     * Instance members live in Heap (per object)
     *
     * So using static:
     *  -> Reduces heap usage
     *  -> Avoids object duplication
     *  -> Keeps configs global and centralized
     *
     *  ✅ Example: Static in ConfigReader
     *  public class ConfigReader {
     *     public static Properties config = new Properties();
     *
     *     static {
     *         try {
     *             FileInputStream fis = new FileInputStream("config.properties");
     *             config.load(fis);
     *         } catch (Exception e) {
     *             e.printStackTrace();
     *         }
     *     }
     *
     *     public static String get(String key) {
     *         return config.getProperty(key);
     *     }
     * }
     *
     * 💬 Interview Justification:
     * "Instead of reading config.properties in every test class or constructor,
     * I loaded it once using a static block, which ensures that the config is cached in memory during class loading — this saves memory,
     * reduces I/O, and keeps access centralized."
     *
     * ⚠️ When NOT to Use Static?
     * | Avoid Static When...                           | Why?                                  |
     * | ---------------------------------------------- | ------------------------------------- |
     * | You need **object-specific state**             | Static is shared – can't isolate data |
     * | In **parallel execution without isolation**    | Shared static driver might get messy  |
     * | For complex design patterns like DI, Singleton | Use wisely or use factories           |
     *
     * "In my framework, I used static members for common configurations, constants, reusable utilities, and shared driver setup.
     * This ensured these components were initialized once and reused across the suite. It minimized memory usage, reduced I/O operations, and avoided unnecessary object creation.
     * Since static members are tied to the class rather than object instances, it aligned perfectly for global config and utility-style access."
     *
     */
}
