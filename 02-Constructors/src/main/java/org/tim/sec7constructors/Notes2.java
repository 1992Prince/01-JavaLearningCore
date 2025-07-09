package org.tim.sec7constructors;

public class Notes2 {

    /**
     * 🔹 Q1: Can constructor be private?
     * ✅ Yes, used in Singleton pattern or Factory pattern.
     * class A {
     *     private A() {}
     * }
     *
     * 🔹 Q2: Can constructor be final, static, or abstract?
     * ❌ No!
     * final: Constructor can’t be inherited.
     * abstract: Constructors can’t be abstract.
     * static: Not allowed — constructors are instance-based.
     *
     * 🔹 Q3: Can you call a constructor explicitly?
     * ✅ Yes, using this() or super() only inside constructor.
     *
     * 🔹 Q4: Can constructor call another method?
     * ✅ Yes, but not before this() or super().
     *
     * 🔹 Q5: Will constructor be inherited?
     * ❌ No, constructors are not inherited.
     *
     * 🔹 Q6: What if a class has only parameterized constructors and you do new A()?
     * ❌ Compile-time error — no default constructor present.
     *
     * 🔹 Q7: What gets called first — static block or constructor?
     * ✅ Static block → Constructor
     * class A {
     *     static {
     *         System.out.println("Static");
     *     }
     *     A() {
     *         System.out.println("Constructor");
     *     }
     * }
     *
     * 🔹 Q8: Can we have code before super() or this()?
     * ❌ No! First statement must be this() or super().
     *    Also we can't have this() or super() together
     *    Java compiler add super() by default to default constructor but
     *    it doesn't add this() anywhere in code by deafult
     *
     * ------------------------------------------------------------------------------------
     *
     *✅ 1. Default Constructor vs No-Arg Constructor vs Parameterized Constructor
     * | Type                      | Defined by You?          | Takes Parameters? | Java Provides it?                               |
     * | ------------------------- | ------------------------ | ----------------- | ----------------------------------------------- |
     * | Default Constructor       | ❌ (provided by compiler) | ❌ No              | ✅ Yes (only if no other constructor is defined) |
     * | No-Arg Constructor        | ✅ (you write it)         | ❌ No              | ❌ Only if you define it                         |
     * | Parameterized Constructor | ✅ (you write it)         | ✅ Yes             | ❌ No                                            |
     *
     * 🔹 Examples:
     *
     * 🔸 Default Constructor (compiler-generated)
     * class A {
     *     // No constructor written
     * }
     * class Test {
     *     public static void main(String[] args) {
     *         A a = new A(); // Works: compiler provides default constructor
     *     }
     * }
     *
     * 🔸 No-Arg Constructor (you write it)
     * class A {
     *     A() {
     *         System.out.println("No-arg constructor");
     *     }
     * }
     *
     * 🔸 Parameterized Constructor
     * class A {
     *     A(int x) {
     *         System.out.println("Parameterized: " + x);
     *     }
     * }
     *
     * ✅ 2. Constructor Overloading vs Constructor Chaining
     * 🔹 Constructor Overloading
     * Multiple constructors with different parameter lists.
     * Improves flexibility.
     *
     * class A {
     *     A() { }
     *     A(int x) { }
     *     A(String s, int y) { }
     * }
     *
     * 🔹 Constructor Chaining
     * One constructor calls another using this() (same class) or super() (parent class).
     * Helps avoid code duplication.
     *
     * class A {
     *     A() {
     *         this(10); // Calls parameterized constructor
     *     }
     *     A(int x) {
     *         System.out.println("Value: " + x);
     *     }
     * }
     *
     *
     * ✅ 3. Can We Call Multiple Constructors from One Constructor?
     * ❌ NO – You can only call one constructor using this() from another constructor, and it must be the first line.
     *
     * class A {
     *     A() {
     *         // this(10);  ✅
     *         // this("Hello"); ❌ Compile error: already called another constructor
     *     }
     *     A(int x) {}
     *     A(String s) {}
     * }
     *
     * ✅ 4. In Inheritance, How Are Parent Class Variables Initialized?
     *
     * When you create a child class object:
     * Parent constructor is called first.
     * Parent variables get initialized before child's.
     *
     * class Parent {
     *     int a = 10;
     *     Parent() {
     *         System.out.println("Parent Constructor");
     *     }
     * }
     * class Child extends Parent {
     *     int b = 20;
     *     Child() {
     *         System.out.println("Child Constructor");
     *     }
     * }
     *
     * Output
     * Parent Constructor
     * Child Constructor
     *
     * ✅ 5. What Access Modifiers Are Allowed for Constructors?
     * | Modifier    | Allowed? | Use Case                               |
     * | ----------- | -------- | -------------------------------------- |
     * | `public`    | ✅        | Accessible everywhere                  |
     * | `protected` | ✅        | Accessible in same package or subclass |
     * | `default`   | ✅        | Accessible in same package             |
     * | `private`   | ✅        | Singleton Pattern / Factory Method     |
     *
     * ✅ 6. Why final Constructor Is Not Allowed?
     * Constructors are not inherited, so marking them final makes no sense.
     * final = no overriding, but constructors can't be overridden anyway.
     * So this gives compile-time error:
     *
     * class A {
     *     final A() {}  // ❌ Invalid
     * }
     *
     * ✅ 7. How Child Class Calls Parent Constructor?
     * Automatically via super() (invisible if not written).
     * Or explicitly using super(...) to call parameterized parent constructor.
     *
     * class Parent {
     *     Parent() {
     *         System.out.println("Parent");
     *     }
     * }
     * class Child extends Parent {
     *     Child() {
     *         super(); // Optional, added by compiler
     *         System.out.println("Child");
     *     }
     * }
     *
     * ✅ 8. JVM Order: What Executes Before Constructor?
     *
     * 🔽 Execution Order:
     * Static Blocks (only once per class)
     * Instance Variables and Instance Initializer Blocks
     * Constructor
     *
     * class A {
     *     static {
     *         System.out.println("Static Block");
     *     }
     *     {
     *         System.out.println("Instance Block");
     *     }
     *     A() {
     *         System.out.println("Constructor");
     *     }
     * }
     *
     * output
     * Static Block
     * Instance Block
     * Constructor
     *
     * ✅ 9. Can We Do Dependency Injection via Constructor?
     * ✅ Yes. It’s called Constructor Injection. Very common in frameworks like Spring.
     * class Engine {}
     * class Car {
     *     Engine engine;
     *     Car(Engine engine) {
     *         this.engine = engine;
     *     }
     * }
     * This approach ensures required dependencies are set during object creation.
     *
     * ✅ 10. Constructor Behavior in Inheritance
     * Parent class constructor is always called first.
     * If parent doesn't have a no-arg constructor, child must call it explicitly with super(...).
     *
     * class Parent {
     *     Parent(int x) {
     *         System.out.println("Parent " + x);
     *     }
     * }
     * class Child extends Parent {
     *     Child() {
     *         super(10); // Must be called because no no-arg constructor in parent
     *         System.out.println("Child");
     *     }
     * }
     *
     *  INTERVIEW RAPID FIRE (Constructor Edition)
     *
     *  | Question                           | Answer                       |
     * | ---------------------------------- | ---------------------------- |
     * | Can constructor be static?         | ❌ No                         |
     * | Can constructor be private?        | ✅ Yes                        |
     * | Can constructor return value?      | ❌ No (even void not allowed) |
     * | Can constructor be abstract/final? | ❌ No                         |
     * | Does constructor get inherited?    | ❌ No                         |
     * | Can you overload constructor?      | ✅ Yes                        |
     * | Can you override constructor?      | ❌ No                         |
     *
     *
     * 🚘 Constructor Use Case in Automation Frameworks (Selenium + TestNG or Page Object Model)
     * 🔹 Scenario:
     * You want to use a WebDriver instance across multiple page classes, so you inject it via constructor.
     *
     * ✅ Page Class Example (Constructor Injection):
     *
     * import org.openqa.selenium.WebDriver;
     * import org.openqa.selenium.By;
     *
     * public class LoginPage {
     *     WebDriver driver;
     *
     *     // Constructor Injection
     *     public LoginPage(WebDriver driver) {
     *         this.driver = driver;
     *     }
     *
     *     public void login(String user, String pass) {
     *         driver.findElement(By.id("username")).sendKeys(user);
     *         driver.findElement(By.id("password")).sendKeys(pass);
     *         driver.findElement(By.id("loginBtn")).click();
     *     }
     * }
     *
     * ✅ Test Class Example:
     * import org.openqa.selenium.WebDriver;
     * import org.openqa.selenium.chrome.ChromeDriver;
     * import org.testng.annotations.*;
     *
     * public class LoginTest {
     *     WebDriver driver;
     *
     *     @BeforeMethod
     *     public void setup() {
     *         driver = new ChromeDriver(); // Driver created
     *         driver.get("https://example.com/login");
     *     }
     *
     *     @Test
     *     public void testLogin() {
     *         // Constructor Injection
     *         LoginPage login = new LoginPage(driver);
     *         login.login("admin", "1234");
     *     }
     *
     *     @AfterMethod
     *     public void tearDown() {
     *         driver.quit();
     *     }
     * }
     *
     * ✅ Why Constructor Injection in Automation?
     *
     * | Reason                      | Benefit                            |
     * | --------------------------- | ---------------------------------- |
     * | Sharing WebDriver           | No duplication, central control    |
     * | Reusability of Page Objects | Constructor makes it portable      |
     * | Testability (e.g., Mocking) | You can mock dependencies in tests |
     * | Better for POM Frameworks   | Each page gets only what it needs  |
     *
     * ✅ Constructors vs. Normal Methods in Java
     * | Feature                 | Constructor                                     | Normal Method                        |
     * | ----------------------- | ----------------------------------------------- | ------------------------------------ |
     * | Purpose                 | To **initialize** an object                     | To **define behavior/functionality** |
     * | Name                    | Same as class name                              | Any valid identifier                 |
     * | Return Type             | ❌ No return type (not even `void`)              | ✅ Must have a return type            |
     * | Call                    | Called **automatically** when object is created | Called **manually** using object     |
     * | Inheritance             | ❌ Not inherited                                 | ✅ Inherited                          |
     * | Overriding              | ❌ Cannot be overridden                          | ✅ Can be overridden (polymorphism)   |
     * | Overloading             | ✅ Yes                                           | ✅ Yes                                |
     * | Can use `return` value? | ❌ No                                            | ✅ Yes                                |
     * | Called by JVM?          | ✅ Yes (at object creation)                      | ❌ No                                 |
     *
     * ✅ Do Constructors Have Method Signatures?
     * 👉 Yes, but not fully like normal methods.
     *
     * A method signature in Java = method name + parameter types.
     * For constructors:
     * The name is the class name.
     * The parameter list matters.
     * Return type is not part of constructor signature, because it has no return type.
     * So, you can overload constructors using different signatures:
     *
     * class A {
     *     A() { }             // Constructor 1
     *     A(int x) { }        // Constructor 2 (different signature)
     *     A(String s) { }     // Constructor 3 (different signature)
     * }
     * ✅ This is valid due to different constructor signatures (parameter types).
     */
}
