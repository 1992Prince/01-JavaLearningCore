package org.tim.sec7project4;

public class Requirements {

    /**
     * 🔧 Project Idea: "User Login System Simulation"
     * 🎯 Objective:
     * A small console-based Java app that simulates:
     *  Creating users (via constructor)
     *  Tracking login counts (using static)
     *  Inheritance: Admin vs Regular User
     *  Utility class using static methods
     *
     *  📁 Project Structure:
     *  com.login
     * │
     * ├── Main.java               → main method
     * ├── User.java               → Base class with constructor, instance/static logic
     * ├── AdminUser.java          → Inherits User
     * ├── UserUtils.java          → Static helper methods (like validations)
     *
     * 📌 Concepts Covered:
     * | Concept              | Where Used                       |
     * | -------------------- | -------------------------------- |
     * | Constructor          | `User` and `AdminUser` classes   |
     * | Constructor Chaining | `super(...)` in `AdminUser`      |
     * | Static Variable      | `userCount` to count users       |
     * | Static Method        | `showTotalUsers()` & `UserUtils` |
     * | Inheritance          | `AdminUser extends User`         |
     * | Encapsulation        | Fields with limited access       |
     * | Utility Class        | `UserUtils` for password logic   |
     */
}
