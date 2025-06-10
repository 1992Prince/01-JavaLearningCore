package org.tim.sec7basicoops1;

public class OOPMain {

    public static void main(String[] args) {

        System.out.println("=== CLASSES AND OBJECTS ===");

        // Creating objects
        P1_Student student1 = new P1_Student("Rahul", 20);
        P1_Student student2 = new P1_Student("Priya", 22);

        // Accessing through getters
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Age: " + student1.getAge());
        System.out.println("Student 1 GPA (default): " + student1.getGpa());

        /**
         * === CLASSES AND OBJECTS ===
         * Student 1 Name: Rahul
         * Student 1 Age: 20
         * Student 1 GPA (default): 0.0
         */

        // Modifying through setters
        student1.setGpa(3.8);
        student1.setActive(true);
        student1.setGrade('A');

        System.out.println("\nAfter setting values:");
        student1.displayInfo();

        /**
         * After setting values:
         * Name: Rahul
         * Age: 20
         * GPA: 3.8
         * Active: true
         * Grade: A
         */

        System.out.println("\n=== ENCAPSULATION EXAMPLE ===");
        P2_BankAccount account = new P2_BankAccount("ACC001", "John Doe");

        // Can't directly access balance - this would cause compile error:
        // account.balance = 1000;  // ERROR! balance is private

        // Must use controlled methods
        account.deposit(1000);
        account.withdraw(200);
        System.out.println("Final Balance: $" + account.getBalance());

        /**
         * === ENCAPSULATION EXAMPLE ===
         * Deposited: $1000.0
         * Withdrawn: $200.0
         * Final Balance: $800.0
         */

        System.out.println("\n=== DEFAULT VALUES ===");
        P3_DefaultValuesDemo demo = new P3_DefaultValuesDemo();
        demo.printDefaults();

        /**
         * === DEFAULT VALUES ===
         * === DEFAULT VALUES ===
         * boolean: false
         * byte: 0
         * short: 0
         * int: 0
         * long: 0
         * char: ' ' (ASCII: 0)
         * float: 0.0
         * double: 0.0
         * String: null
         * Array: null
         */
    }
}
