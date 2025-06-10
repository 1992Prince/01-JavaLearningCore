package org.tim.sec7pojoandrecords5;

public class P2_RecordsNotes {

    /**
     * ✅ What are Records in Java?
     * A record is a special kind of class in Java introduced in Java 14 (preview) and made stable in Java 16.
     * It is designed to hold data only — without writing boilerplate code like constructors, getters, toString(), equals(), and hashCode().
     *
     * 🔑 In simple words:
     * “Records are immutable POJOs with less code.”
     *
     * ✅ Syntax:
     * public record User(String name, int age) {}
     *
     * This is equivalent to writing a class with:
     * private final name
     * private final age
     * Constructor
     * Getters: name(), age()
     * toString(), equals(), hashCode()
     *
     * ✅ Full Example:
     * public record Employee(String name, int id, double salary) {}
     *
     * public class Main {
     *     public static void main(String[] args) {
     *         Employee emp = new Employee("Amit", 101, 50000);
     *
     *         System.out.println(emp.name());     // Amit
     *         System.out.println(emp.id());       // 101
     *         System.out.println(emp.salary());   // 50000.0
     *
     *         System.out.println(emp); // toString() auto generated
     *     }
     * }
     *
     * ✅ Features of Records
     * | Feature                                | Supported                |
     * | -------------------------------------- | ------------------------ |
     * | Immutable Fields                       | ✅ (final by default)     |
     * | Auto-generated constructor             | ✅                        |
     * | Auto getters (`name()`)                | ✅                        |
     * | `toString()`, `equals()`, `hashCode()` | ✅                        |
     * | Implements interfaces                  | ✅                        |
     * | Can extend class                       | ❌ (records can’t extend) |
     * | Can have static fields/methods         | ✅                        |
     * | Can include custom methods             | ✅                        |
     *
     * We don't have setters methods in Records since it is immutable.
     * But can have setter methods in POJO.
     *
     * ✅ Why Use Records? (Benefits)
     * | Feature          | POJO         | Record         |
     * | ---------------- | ------------ | -------------- |
     * | Less boilerplate | ❌ More code  | ✅ One-liner    |
     * | Immutability     | Optional     | ✅ Always final |
     * | Clean data model | ✅            | ✅              |
     * | IDE-friendly     | ❌ Manual gen | ✅ Auto support |
     *
     * ✅ Use Cases of Records in Real World:
     * | Use Case                       | Why Records?                  |
     * | ------------------------------ | ----------------------------- |
     * | ✅ DTO (Data Transfer Object)   | No mutation needed            |
     * | ✅ API Request/Response mapping | Immutable and clean           |
     * | ✅ Configuration classes        | Load once, no change          |
     * | ✅ Utility return types         | Structured return (like Pair) |
     * | ✅ Response validation in tests | Immutability ensures safety   |
     *
     *
     * ✅ Records in Automation Framework
     *
     * 1. 🔹 API Automation
     * public record LoginRequest(String username, String password) {}
     *
     * Jackson will map it easily:
     * ObjectMapper mapper = new ObjectMapper();
     * LoginRequest req = mapper.readValue(new File("login.json"), LoginRequest.class);
     *
     * 2. 🔹 Config/Env Mapping
     * public record Config(String baseUrl, int timeout) {}
     *
     * ❌ Limitations of Records:
     * | Limitation                  | Why                          |
     * | --------------------------- | ---------------------------- |
     * | Cannot be mutable           | Fields are `final`           |
     * | Cannot extend another class | Java prevents it             |
     * | No no-arg constructor       | Always parameterized         |
     * | Can’t have setters          | Immutable                    |
     * | Java 14+ only               | Older versions don't support |
     *
     * ✅ Record vs POJO: Interview Table
     * | Criteria          | POJO                        | Record                               |
     * | ----------------- | --------------------------- | ------------------------------------ |
     * | Mutability        | Mutable                     | Immutable                            |
     * | Boilerplate Code  | High (get/set/constructors) | Very low (auto-generated)            |
     * | Use in Frameworks | Test data, Config, DTO      | Same, but cleaner + less error-prone |
     * | Java Version      | Java 1.0+                   | Java 14+ (16 stable)                 |
     * | Inheritance       | Can extend classes          | ❌ Cannot extend classes              |
     *
     * ✅ Interview-Ready Answer:
     * “I use Records in places where I need clean, immutable data holders like API request/response, test data, or configurations.
     * Since Records reduce boilerplate and prevent accidental data changes, they help me write safer and more maintainable test automation code.
     * Compared to POJOs, they’re faster to implement and ideal for read-only objects.”
     *
     * ✅ 1. Can We Add Methods in Records?
     * Yes, records can have methods (but only non-mutating methods because fields are final & immutable).
     *
     * public record Product(String name, double price) {
     *
     *     // Custom method allowed
     *     public double applyDiscount(double percent) {
     *         return price - (price * percent / 100);
     *     }
     *
     *     // Static method also allowed
     *     public static String info() {
     *         return "Record used to store product info.";
     *     }
     * }
     *
     * So yes — custom instance & static methods are allowed, but:
     *
     * ❌ No setters
     * ✅ Can override toString(), equals(), etc. if needed
     * ✅ Can add validation logic in compact constructor
     *
     * ✅ 1. Records Don’t Have Setters – Why?
     * Yes bhai, Java Records do not have setters.
     *
     * 🔹 Why?
     * Because:
     * All fields inside a record are private final by default.
     * So once initialized through the constructor, you can’t change them.
     *
     * public record Config(String url, String browser) {}
     *
     * Config config = new Config("https://test.com", "chrome");
     *
     * // ❌ This is NOT allowed
     * // config.url = "https://new.com";   // Compiler error
     * // config.setUrl("new")              // No setter method exists
     * 👉 So: Records = Immutable Data Holders
     * Perfect for storing values like config, API response, etc.
     */
}
