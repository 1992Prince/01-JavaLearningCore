package org.tim.sec7basicoops1;

public class Notes1 {

    // ============================================
// INTERVIEW QUESTIONS AND ANSWERS
// ============================================

/*
Q1: What are getters and setters? Why use them?
A1: Getters and setters are methods used to access and modify private fields.
    - Getters: Methods that return the value of private fields (data retrieval)
    - Setters: Methods that set/modify the value of private fields (data modification)

    Purpose:
    1. ENCAPSULATION: Hide internal implementation details
    2. VALIDATION: Add checks before setting values
    3. CONTROLLED ACCESS: Decide what can be read/written
    4. FLEXIBILITY: Can change internal representation without affecting client code

Q2: Why not make fields public instead of using getters/setters?
A2:
    - Public fields break encapsulation
    - No validation possible
    - Can't control access (read-only vs read-write)
    - Hard to maintain and debug
    - No way to add logging or other logic

Q3: What are default values in Java?
A3: When you declare fields in a class without initializing them, Java assigns default values:
    - boolean: false
    - byte, short, int, long: 0
    - char: '\u0000' (null character)
    - float, double: 0.0
    - Object references (String, arrays, etc.): null

    NOTE: Local variables inside methods DON'T get default values - must be initialized!

Q4: Difference between instance variables and local variables regarding default values?
A4:
    - Instance variables: Get default values automatically
    - Local variables: Must be initialized before use, no default values

Q5: What is encapsulation?
A5: Encapsulation is bundling data (fields) and methods that operate on that data
    into a single unit (class) and restricting direct access to internal data.
    Achieved through:
    - Private fields
    - Public getters/setters
    - Controlled access methods

Q6: When does JVM assign default values to instance variables?
A6: JVM assigns default values to instance variables during OBJECT CREATION,
    specifically BEFORE the constructor is called.

    Timeline:
    1. Memory allocated for object
    2. Instance variables set to default values
    3. Instance initialization blocks run
    4. Constructor executes

    BEST PRACTICES for initialization:
    - Direct initialization: private int score = 100;
    - Constructor initialization: this.name = name;
    - Initialization blocks: { this.value = calculateValue(); }
    - Always initialize in constructor if value depends on parameters

Q7  Purpose of Encapsulation and how to ensure it?
A7: PURPOSE:
    - Data Security: Hide sensitive information
    - Data Integrity: Prevent invalid state through validation
    - Maintainability: Change internal implementation without affecting clients
    - Controlled Access: Decide what can be read/written/modified

    HOW TO ENSURE ENCAPSULATION:
    ✓ Make all fields PRIVATE
    ✓ Provide PUBLIC getters/setters only when needed
    ✓ Add validation in setters
    ✓ Don't provide setters for read-only data
    ✓ Use private helper methods for internal logic
    ✓ Never return mutable objects directly (return copies)

Q8: Can we use local variables without initialization?
A8: NO! Attempting to use uninitialized local variables causes COMPILE-TIME ERROR.

    Key differences:
    - Instance variables: Get default values automatically
    - Local variables: Must be explicitly initialized before use
    - Compiler tracks local variable initialization and prevents usage of uninitialized variables

    This is a safety feature to prevent bugs from uninitialized data.
*/
}
