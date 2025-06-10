package org.inheritance.part2singleinheritance;

public class P1_SingleInheritanceNotes {

    /**
     * 🔍 1. Single Inheritance - One child class inherits from one parent class.
     *
     * 🔧 Java Example:
     *
     * class TestBase {
     *     void launchBrowser() {
     *         System.out.println("Browser launched");
     *     }
     * }
     *
     * class LoginTest extends TestBase {
     *     void login() {
     *         System.out.println("Login successful");
     *     }
     * }
     *
     * public class Demo {
     *     public static void main(String[] args) {
     *         LoginTest test = new LoginTest();
     *         test.launchBrowser(); // inherited
     *         test.login();         // own method
     *     }
     * }
     *
     * ✅ SDET Use Case
     * BaseTest → LoginTest, HomeTest extend it.
     * Contains common logic like:
     *      WebDriver setup/teardown
     *      Screenshots
     *      Logs
     *
     * ✅ Why Follow Single Inheritance in Frameworks?
     * | Reason                    | Explanation                                                                                        |
     * | ------------------------- | -------------------------------------------------------------------------------------------------- |
     * | 🔁 Code Reusability       | Common logic like setup/teardown is written once in `BaseTest` and reused across all test classes. |
     * | 📚 Better Maintainability | Updating logic (e.g., browser setup) in `BaseTest` automatically reflects in all tests.            |
     * | ✅ Clean Architecture      | Clear separation between framework infrastructure (`BaseTest`) and test logic (`LoginTest`).       |
     *
     * 🔧 Constructor Usage in BaseTest and BasePage
     * // BaseTest.java
     * public class BaseTest {
     *     public WebDriver driver;
     *
     *     public BaseTest() {
     *         System.out.println("BaseTest Constructor: Launching Browser");
     *         driver = new ChromeDriver();
     *     }
     *
     *     @BeforeMethod
     *     public void setUp() {
     *         driver.manage().window().maximize();
     *     }
     * }
     *
     * // BasePage.java
     * public class BasePage {
     *     public WebDriver driver;
     *
     *     public BasePage(WebDriver driver) {
     *         this.driver = driver;
     *     }
     *
     *     public void click(WebElement element) {
     *         element.click();
     *     }
     * }
     *
     * // LoginPage.java
     * public class LoginPage extends BasePage {
     *     public LoginPage(WebDriver driver) {
     *         super(driver);
     *     }
     *
     *     public void login(String user, String pass) {
     *         // Use driver here
     *     }
     * }
     *
     * 🚀 Best Practice
     * Always initialize WebDriver in BaseTest constructor.
     * Pass WebDriver to BasePage via constructor injection — promotes loose coupling and reusability.
     *
     *
     *
     * 🎯 Interview Question
     * Q: Why is Single Inheritance preferred in frameworks?
     * A: It keeps the code simple and promotes reuse of common logic across multiple test classes.
     */
}
