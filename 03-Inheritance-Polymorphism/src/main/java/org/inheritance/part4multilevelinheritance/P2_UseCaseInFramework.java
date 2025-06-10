package org.inheritance.part4multilevelinheritance;

public class P2_UseCaseInFramework {

    /**
     * 🚨 Real-World Problem Statement (Project Context)
     * “We are building an enterprise-grade Selenium framework. Many different teams are writing page actions, utility functions, and test logic.
     * We want to modularize the logic into layers so that:
     *
     * Low-level WebDriver operations (like click/sendkeys) are handled in one place
     * All page classes should inherit common page-level utilities (like wait, getTitle, etc.)
     * Each page like LoginPage, HomePage should only focus on page-specific business flows
     * We want to reduce code duplication, increase reusability, and keep it scalable as the team grows”
     *
     * ✅ Suggestion: Multilevel Inheritance is Best Here
     * Why? Because you want to build on top of previous layers and give each layer a dedicated responsibility.
     *
     * Let’s break the solution into 3 levels:
     *
     * 🔹 Level 1 – ElementUtil: Generic low-level utility class
     * Wraps raw Selenium code
     * Handles click, sendKeys, getText, waitForElement, etc.
     * Goal: DRY out repeated WebDriver calls
     *
     * public class ElementUtil {
     *     protected WebDriver driver;
     *
     *     public ElementUtil(WebDriver driver) {
     *         this.driver = driver;
     *     }
     *
     *     public void click(By locator) {
     *         driver.findElement(locator).click();
     *     }
     *
     *     public void type(By locator, String text) {
     *         driver.findElement(locator).sendKeys(text);
     *     }
     *
     *     public String getPageTitle() {
     *         return driver.getTitle();
     *     }
     * }
     *
     * 🔹 Level 2 – BasePage: Page-level abstraction
     * Inherits ElementUtil to reuse click/type/etc.
     * Adds common page methods: e.g. header validation, checking logos, footer, etc.
     * Shared across all page objects
     *
     * public class BasePage extends ElementUtil {
     *
     *     public BasePage(WebDriver driver) {
     *         super(driver);
     *     }
     *
     *     public boolean isHeaderDisplayed() {
     *         return driver.findElement(By.id("header")).isDisplayed();
     *     }
     * }
     *
     * 🔹 Level 3 – LoginPage: Actual page object (business logic)
     * Inherits from BasePage → indirectly gets access to all methods from ElementUtil too
     * Has its own locators & actions like doLogin()
     *
     * public class LoginPage extends BasePage {
     *
     *     private By username = By.id("username");
     *     private By password = By.id("password");
     *     private By loginBtn = By.id("login");
     *
     *     public LoginPage(WebDriver driver) {
     *         super(driver);
     *     }
     *
     *     public void doLogin(String user, String pass) {
     *         type(username, user);   // from ElementUtil
     *         type(password, pass);
     *         click(loginBtn);        // from ElementUtil
     *     }
     * }
     *
     * 🔍 Why Multilevel is Best Here?
     * | 🎯 Goal                                   | ✅ Achieved By                 |
     * | ----------------------------------------- | ----------------------------- |
     * | Separate raw Selenium logic               | `ElementUtil` layer           |
     * | Add reusable page-specific methods        | `BasePage`                    |
     * | Focus business logic per page             | `LoginPage`, `HomePage`, etc. |
     * | Inherit everything via single constructor | `super(driver)` in each layer |
     * | Avoid duplication, improve readability    | Through class hierarchy       |
     *
     * 🧠 Interview Line:
     * “We structured the framework using multilevel inheritance where ElementUtil handled all low-level WebDriver actions, BasePage added reusable
     * page-level behavior, and specific page objects like LoginPage extended that for business flows.
     * This helped us isolate logic, enable code reuse, and keep the design highly scalable.”
     *
     * 📌 Best Practices While Using This Pattern
     * | 🔧 Practice                            | ✅ Why It Matters                  |
     * | -------------------------------------- | --------------------------------- |
     * | Use `protected WebDriver`              | So subclasses can use it          |
     * | Call `super(driver)` from all layers   | To keep the WebDriver chain alive |
     * | Don’t make inheritance too deep        | 3 levels is clean and practical   |
     * | Avoid declaring `driver` in each class | Inherit instead of duplicating    |
     *
     * 🔚 Summary
     * Multilevel Inheritance in a framework:
     *  ElementUtil → BasePage → LoginPage
     *    ↑           ↑            ↑
     *  Low-level   Reusable     Business
     *  helpers     page utils   logic
     *
     *  It’s clean, modular, interview-proof, and real-world tested.
     *
     *
     *  ✅ How It Applies to Automation Framework
     * Let’s say you want to modularize test logic in layers:
     * Each layer builds on the previous one for more specialized functionality.
     *
     * ✅ Framework Use Case – Multilevel Structure:
     *
     *           ElementUtil (common helper)
     *                   ↑
     *         BasePage (wrapper for WebDriver)
     *                   ↑
     *         LoginPage (page-specific methods)
     *
     *         Or Similarly
     *
     *           BaseSetup
     *                ↑
     *          BaseTest
     *                ↑
     *         RegressionTest / LoginTest
     */
}
