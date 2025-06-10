package org.tim.sec7static_refs3;

public class P3_StaticQuestions {

    /**
     * ✅ 1. “If WebDriver is static, how do you manage parallel execution in your automation framework?”
     * ⚠️ Problem with Static WebDriver:
     * static WebDriver driver means only one copy for the whole JVM.
     *
     * In parallel execution (like testng.xml parallel="true"), all threads will try to use the same WebDriver object, leading to:
     * Test case collision
     * Unexpected behavior
     * Session overwritten
     *
     * ✅ Solution: Use ThreadLocal WebDriver
     * public class DriverFactory {
     *     private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
     *
     *     public static WebDriver getDriver() {
     *         return tlDriver.get();
     *     }
     *
     *     public static void setDriver(WebDriver driver) {
     *         tlDriver.set(driver);
     *     }
     *
     *     public static void initDriver() {
     *         WebDriver driver = new ChromeDriver();
     *         setDriver(driver);
     *     }
     *
     *     public static void quitDriver() {
     *         getDriver().quit();
     *         tlDriver.remove();
     *     }
     * }
     * 💬 Interview Justification:
     * "Since static WebDriver causes thread safety issues in parallel execution,
     * I used ThreadLocal which gives each thread its own WebDriver instance. This isolates sessions per test thread, preventing session leakage."
     *
     * ✅ 2. Constructor & Static — Interview Architecture Q&A
     *
     * 🔸 Q: “Why did you use constructors in your Page Object classes?”
     * "I used constructors for dependency injection. It allowed me to inject WebDriver or Logger object into page classes in a clean and testable way.
     * For example:
     * public class LoginPage {
     *     WebDriver driver;
     *
     *     public LoginPage(WebDriver driver) {
     *         this.driver = driver;
     *     }
     * }
     * This supports loose coupling and aligns with good design principles."
     *
     * 🔸 Q: “Why use static methods or utility classes?”
     * "For reusable methods that don't require object state — like waits, scrolling, clicking — I used static utility methods to avoid
     * creating new object instances every time.
     * It saves memory and reduces object churn."
     *
     * 🔸 Q: “How do you design your test framework architecture?”
     * 💡 Answer Framework Layers + Why:
     *
     * Test Layer (TestNG)
     * ↓
     * Business Layer (Flows)
     * ↓
     * Page Layer (POM)
     * ↓
     * Utils (Waits, Screenshots)
     * ↓
     * Driver Factory (ThreadLocal Driver)
     * ↓
     * Config/Constants (Static)
     *
     * | Layer              | Reason                                         |
     * | ------------------ | ---------------------------------------------- |
     * | Page Layer         | Page Object Model (separation of concerns)     |
     * | Constructor        | For injecting driver (dependency injection)    |
     * | Static Utils       | Reusable, memory-efficient methods             |
     * | Static Config      | Load only once, avoid I/O every test           |
     * | ThreadLocal Driver | Thread-safe execution, crucial for parallelism |
     *
     * ✅ 3. Interview-Worthy Architecture Decisions & Justifications
     * | Decision                       | Reason (How to Explain in Interview)                                       |
     * | ------------------------------ | -------------------------------------------------------------------------- |
     * | `static Config/Constants`      | Load once during class loading, avoids repeated reads, improves efficiency |
     * | Constructor injection in POM   | Supports reusability, testability, better for DI and mocking               |
     * | `ThreadLocal<WebDriver>`       | Allows safe parallel execution (TestNG parallel classes/methods)           |
     * | Avoid static WebDriver         | Not thread-safe, breaks in parallel tests                                  |
     * | `static Utility methods`       | Object-independent logic, prevents unnecessary object creation             |
     * | Separate base class with Hooks | Reuse setup/teardown across tests using TestNG annotations                 |
     *
     *
     * ✅ 4. Extra Interview Questions You Can Prepare
     * Why ThreadLocal instead of static?
     * Why not read config.properties in every test?
     * How does constructor help in DI and testing?
     * Where are static variables stored and when are they initialized?
     * In your framework, how do you control driver lifecycle in parallel?
     * How does POM + Constructor + ThreadLocal improve maintainability and scalability?
     * How will you make your framework multi-browser and thread-safe?
     */
}
