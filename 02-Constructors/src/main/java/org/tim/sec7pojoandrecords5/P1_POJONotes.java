package org.tim.sec7pojoandrecords5;

public class P1_POJONotes {

    /**
     * ✅ What is POJO (Plain Old Java Object)?
     * A POJO is a simple Java object that does not extend/implement any special class/interface. It's used to hold data — kind of like a data container.
     *
     * 💡 Characteristics:
     * No need to extend any class or implement interface
     * Has private fields
     * Public getters/setters
     * May include constructors and toString()
     *
     * 🔧 Example POJO:
     *
     * public class User {
     *     private String name;
     *     private int age;
     *
     *     public User() {} // No-arg constructor
     *
     *     public User(String name, int age) {
     *         this.name = name;
     *         this.age = age;
     *     }
     *
     *     // Getters & Setters
     *     public String getName() {
     *         return name;
     *     }
     *
     *     public void setName(String name) {
     *         this.name = name;
     *     }
     *
     *     public int getAge() {
     *         return age;
     *     }
     *
     *     public void setAge(int age) {
     *         this.age = age;
     *     }
     *
     *     public String toString() {
     *         return name + " (" + age + ")";
     *     }
     * }
     *
     * ✅ Use Cases of POJO in Automation Framework
     * | Use Case           | Explanation                                                                     |
     * | ------------------ | ------------------------------------------------------------------------------- |
     * | ✅ Data Mapping     | Used with libraries like **Jackson** or **Gson** to map JSON/XML to Java object |
     * | ✅ Test Data Holder | Store test data in objects (e.g. `User`, `Product`)                             |
     * | ✅ Model Class      | When working with Page Objects, APIs, DB result sets                            |
     * | ✅ Config Wrapper   | For reading config files into an object                                         |
     *
     * 🚀 Example in Automation:
     * // testdata.json
     * {
     *   "username": "admin",
     *   "password": "pass123"
     * }
     * // POJO
     * public class LoginData {
     *     private String username;
     *     private String password;
     *
     *     // Getters/Setters
     * }
     *
     * // Jackson mapping
     * ObjectMapper mapper = new ObjectMapper();
     * LoginData data = mapper.readValue(new File("testdata.json"), LoginData.class);
     *
     * ❌ Cons of POJO:
     * Too much boilerplate: getters, setters, toString(), equals(), etc.
     * You write too much repetitive code just to hold data.
     *
     * From interview point of view
     * ====================================
     *
     * ✅ What is POJO and Why We Use It? — Interview Answer (with Automation Focus)
     * 🔹 "POJO stands for Plain Old Java Object."
     * It's a simple Java class that doesn’t extend or implement any special Java library class.
     * It’s used to store and transfer data in a clean, object-oriented way.
     *
     * ✅ Characteristics:
     * No inheritance from frameworks (e.g., no need to extend Serializable or implement any interface)
     * Has private fields
     * Has getters/setters, constructors, and sometimes toString(), equals() etc.
     *
     * ✅ Why I Use POJO in My Automation Framework:
     * 🧠 "In my automation framework, I use POJO classes mainly to store and organize data. For example:"
     *
     * ✅ Test Data Mapping:
     * I create POJO classes that match the structure of my test data (JSON/YAML).
     * I use libraries like Jackson or Gson to map that test data into POJO objects.
     * E.g., mapping login credentials from JSON to Java class.
     *
     * ✅ API Automation:
     * When working with REST APIs, I map API request and response payloads to POJO classes.
     * Makes assertions and validations cleaner.
     *
     * ✅ Config Wrapper:
     * I create POJOs to load and hold config data (like URLs, timeouts, environment).
     *
     * ✅ DB Result Mapping (in Hybrid frameworks):
     * I map DB rows to POJO models for data-driven testing.
     *
     * 🧩 Example to Say in Interview:
     * "I had a User.java POJO class with fields like username and password.
     * I loaded this object from a JSON test data file using Jackson, and passed it directly into my Page class for login automation."
     *
     * ✅ Benefits You Can Mention:
     * | Benefit               | Explanation                              |
     * | --------------------- | ---------------------------------------- |
     * | Code Cleanliness      | No need to work with raw Maps or Strings |
     * | Reusability           | You can reuse POJOs across tests         |
     * | Serialization Support | Works well with Jackson/Gson/XML         |
     * | Strong Typing         | Safer than unstructured data             |
     *
     * ❗Drawback of POJO:
     * Too much boilerplate code (getters, setters, constructors)
     * But we handle this using Lombok in many frameworks now
     * OR we use Java Records in newer versions (for immutability)
     *
     * ✅ Summary to Speak at End:
     * "So in short, POJOs are very useful in automation frameworks for data modeling — especially when integrating with APIs, test data files,
     * or config. I use them to improve readability, maintainability, and separation of concerns." 💡
     */
}
