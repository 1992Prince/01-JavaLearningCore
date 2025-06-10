package org.inheritance.part2singleinheritance;

public class P2_Notes {

    /**
     * ✅ 1. Why We Initialize WebDriver in @BeforeMethod vs @BeforeTest?
     * | Scenario                           | Where to initialize driver       | Why                                                    |
     * | ---------------------------------- | -------------------------------- | ------------------------------------------------------ |
     * | Run **each test in fresh browser** | `@BeforeMethod` + `@AfterMethod` | Ensures **test independence**, good for parallel tests |
     * | Run **all tests in same browser**  | `@BeforeTest` + `@AfterTest`     | **Faster**, saves time, but **state sharing risk**     |
     *
     * ✅ Best Practice: Use @BeforeMethod for UI tests to avoid session leaks and flaky tests.
     *
     * Code Example
     * @BeforeMethod
     * public void setup() {
     *     driver = new ChromeDriver(); // new browser per test
     * }
     *
     * @AfterMethod
     * public void tearDown() {
     *     driver.quit();
     * }
     *
     * ✅ 2. Why All Test Classes Extend BaseTest
     * | Benefit             | Explanation                                             |
     * | ------------------- | ------------------------------------------------------- |
     * | 🔁 Reusability      | Avoid writing driver setup/teardown in every test class |
     * | 💡 DRY Principle    | Don’t Repeat Yourself: `BaseTest` holds common logic    |
     * | ✅ Cleaner Code      | Test class focuses only on business test flow           |
     * | 🔧 Easy Maintenance | If setup logic changes, only update in `BaseTest`       |
     *
     * ✅ 3. Why All Page Classes Extend BasePage
     * | Reason                  | Explanation                                                  |
     * | ----------------------- | ------------------------------------------------------------ |
     * | ♻️ Reuse Common Actions | `click()`, `type()`, `waitForElement()` go in `BasePage`     |
     * | 📦 Central Utility Hub  | Customized wrapper methods (logging, exception handling)     |
     * | ✅ POM-friendly Design   | Every page object gets same base functionality               |
     * | 🔌 Plug & Play          | Any new page class auto-gets utility methods via inheritance |
     *
     *
     * ✅ 4. Why Constructor Injection of WebDriver (Driver Passing)
     * public class LoginPage extends BasePage {
     *     public LoginPage(WebDriver driver) {
     *         super(driver);  // constructor injection
     *     }
     * }
     * 🔍 Benefits of Constructor Injection:
     * | Benefit                        | Explanation                                            |
     * | ------------------------------ | ------------------------------------------------------ |
     * | ✅ **Decoupling**               | Page classes don’t create `WebDriver`, they receive it |
     * | 🧪 **Easy for Unit Testing**   | You can mock driver and inject into page class         |
     * | 🛠 **Control and Flexibility** | One place controls lifecycle (`BaseTest`)              |
     * | 🚫 **Avoid Global State**      | Reduces dependency on static/global drivers            |
     * | 💼 **Industry Standard**       | Used in frameworks like Selenium + Spring + Cucumber   |
     *
     * ✅ 5. Why protected WebDriver driver and Not public? - bcoz driver can only be accessible in sub-class in same or other packages
     *       and not everywhere
     * 🔐 Access Modifiers Comparison:
     *       | Modifier    | Who Can Access                      | Should We Use?             | Why?                               |
     * | ----------- | ----------------------------------- | -------------------------- | ---------------------------------- |
     * | `private`   | Only within the same class          | ❌ No                       | We need access in child classes    |
     * | `public`    | Anywhere                            | ❌ No                       | Breaks encapsulation; unsafe       |
     * | `protected` | Subclasses in same or other package | ✅ YES                      | Ideal for inheritance with control |
     * | `default`   | Only within same package            | 🚫 No (limits flexibility) |                                    |
     *
     * 💡 Summary:
     * protected gives controlled access to subclasses like LoginTest, LoginPage.
     * Prevents outsiders from messing with driver.
     * Maintains encapsulation and flexibility.
     *
     * Interview-Worthy Explanation
     * “In our framework, all test classes extend BaseTest to reuse setup/teardown logic.
     * The WebDriver is initialized in @BeforeMethod for test independence, and it's passed via constructor injection to page classes,
     * promoting loose coupling and reusability.
     * Page classes extend BasePage to inherit common methods like click/type, and we declare the driver as protected to ensure controlled
     * inheritance while preserving encapsulation.”
     */
}
