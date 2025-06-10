package org.inheritance.part2singleinheritance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseTest {
    protected WebDriver driver;

    public BaseTest() {
        System.out.println("🔧 BaseTest Constructor: Preparing for test execution...");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("🚀 Launching Chrome browser...");
        driver = new ChromeDriver(); // Make sure chromedriver is on path
        driver.manage().window().maximize();
        driver.get("https://example.com/login");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("🧹 Closing browser...");
        driver.quit();
    }
}
