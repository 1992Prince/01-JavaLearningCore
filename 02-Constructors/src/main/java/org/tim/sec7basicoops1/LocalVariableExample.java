package org.tim.sec7basicoops1;

// QUESTION 3: LOCAL VARIABLES WITHOUT INITIALIZATION
public class LocalVariableExample {
    public void demonstrateLocalVariables() {
        int localVar;        // Declared but not initialized
        String localString;  // Declared but not initialized

        // This will cause COMPILE-TIME ERROR:
        // System.out.println(localVar);     // ERROR: Variable might not be initialized
        // System.out.println(localString);  // ERROR: Variable might not be initialized

        // Must initialize before use:
        localVar = 10;
        localString = "Hello";
        System.out.println(localVar);     // Now OK
        System.out.println(localString);  // Now OK
    }

    public void conditionalInitialization() {
        int x;
        boolean condition = true;

        if (condition) {
            x = 5;
        }
        // This might cause error because compiler can't guarantee x is initialized
        // System.out.println(x);  // Potential compile error

        // Better approach:
        int y = 0;  // Initialize with default
        if (condition) {
            y = 5;
        }
        System.out.println(y);  // Always safe
    }

    public static void main(String[] args) {

        LocalVariableExample obj = new LocalVariableExample();
        obj.demonstrateLocalVariables();
        obj.conditionalInitialization();

        /**
         * 10
         * Hello
         * 5
         */

    }

}
