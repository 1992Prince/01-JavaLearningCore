package org.inheritance.part2singleinheritance;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    public LoginTest() {
        super();
        System.out.println("🧪 LoginTest Constructor: Test class initialized");
    }

    @Test
    public void validateLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "password123");
        System.out.println("✅ Login test executed");
    }
}

/**
 * 🧪 Output (TestNG Console)
 * 🔧 BaseTest Constructor: Preparing for test execution...
 * 🧪 LoginTest Constructor: Test class initialized
 * 🚀 Launching Chrome browser...
 * 📄 BasePage Constructor: WebDriver injected
 * 🔐 LoginPage Constructor: Ready to perform login
 * ✅ Login test executed
 * 🧹 Closing browser...
 *
 * 🔥 What You Practiced Here:
 * | 🔍 Concept             | ✅ Done In Code                           |
 * | ---------------------- | ---------------------------------------- |
 * | Constructor Chaining   | `BaseTest → LoginTest`                   |
 * | Constructor Injection  | `BasePage(WebDriver driver)`             |
 * | Single Inheritance     | `LoginTest extends BaseTest`             |
 * | POM Integration        | `LoginPage extends BasePage`             |
 * | TestNG Lifecycle       | `@BeforeMethod`, `@Test`, `@AfterMethod` |
 * | Real browser execution | ✅ ChromeDriver setup                     |
 */
