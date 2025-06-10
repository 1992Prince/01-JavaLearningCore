package org.inheritance.part3hierarchicalinheritance;

public class P1_Notes {

    /**
     * Definition: When multiple child classes inherit from the same parent class, it's called hierarchical inheritance.
     *            BaseClass
     *              /   \
     *         Child1   Child2
     *
     * ✅ Simple Real-World Java Example:
     * class Animal {
     *     void eat() {
     *         System.out.println("Animal is eating");
     *     }
     * }
     *
     * class Dog extends Animal {
     *     void bark() {
     *         System.out.println("Dog is barking");
     *     }
     * }
     *
     * class Cat extends Animal {
     *     void meow() {
     *         System.out.println("Cat is meowing");
     *     }
     * }
     *
     * public class TestAnimal {
     *     public static void main(String[] args) {
     *         Dog d = new Dog();
     *         d.eat();  // inherited
     *         d.bark();
     *
     *         Cat c = new Cat();
     *         c.eat();  // inherited
     *         c.meow();
     *     }
     * }
     *
     * 🧠 Key Idea: Both Dog and Cat reuse Animal’s eat() method → no code duplication!
     *
     * 🔥 Hierarchical Inheritance in Automation Framework (Real-Time Use)
     *                BaseTest                          BasePage
     *                   |                                 |
     *      ┌────────────┴────────────┐       ┌────────────┴────────────┐
     *  LoginTest               HomeTest     LoginPage             HomePage
     *
     *  🧠 Benefits of Hierarchical Inheritance in Frameworks
     *  | 🔍 Point              | ✅ Benefit                                              |
     * | --------------------- | ------------------------------------------------------ |
     * | DRY Principle         | Avoids repetition in setup, actions, locators          |
     * | Reusability           | All tests/pages reuse the same `BaseTest` / `BasePage` |
     * | Better Maintenance    | One change in base reflects across tests               |
     * | Framework Scalability | Easily add 100s of page/test classes                   |
     * | Standardization       | All teams follow same class contract                   |
     * | Code Readability      | Clean, layered inheritance tree                        |
     *
     * 📌 Interview-Ready One-Liner:
     * “Hierarchical inheritance allows our test framework to define a standard structure where all test classes extend BaseTest for setup and
     * teardown logic, and all page classes extend BasePage to reuse element actions.
     * This eliminates duplication, improves scalability, and enables clean modularity.”
     *
     * ✅ "Our framework already follows hierarchical inheritance by design — all test classes extend BaseTest, and all page classes extend BasePage.
     * This ensures consistent browser setup and teardown in tests, and shared reusable methods in page classes like click, wait,
     * and getTitle — all inherited from a common base layer."
     */
}
