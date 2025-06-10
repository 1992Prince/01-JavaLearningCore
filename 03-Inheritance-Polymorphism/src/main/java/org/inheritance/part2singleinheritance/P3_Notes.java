package org.inheritance.part2singleinheritance;

public class P3_Notes {

    /**
     * 👇 Interpretation Guide (until image loads):
     *
     * ✅ Class Relationships
     * 🔷 BaseTest
     * protected WebDriver driver
     * @BeforeMethod setUp()
     * @AfterMethod tearDown()
     *
     * ⬇️ Inherited by:
     *
     * 🔶 LoginTest
     * @Test method: validateLogin()
     * Creates object of LoginPage
     *
     * 🔷 BasePage
     * protected WebDriver driver
     * click(locator), type(locator, text)
     *
     * ⬇️ Inherited by:
     *
     * 🔶 LoginPage
     * login(username, password)
     * Constructor takes driver (super(driver))
     *
     * 🔁 Object Flow / Dependency Flow
     * LoginTest
     *    |
     *    | creates --> LoginPage(driver)
     *    |
     * inherits
     *    ↓
     * BaseTest --- driver --> passed via constructor ---> BasePage
     *                                                ↑
     *                                            inherited by
     *                                                ↓
     *                                           LoginPage
     *
     * This shows:
     * Inheritance for reuse
     * Constructor injection for WebDriver
     * Clean separation of test logic and page behavior
     *                                           */
}
