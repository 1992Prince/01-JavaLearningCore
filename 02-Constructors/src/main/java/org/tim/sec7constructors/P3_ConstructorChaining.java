package org.tim.sec7constructors;

public class P3_ConstructorChaining {

    P3_ConstructorChaining() {
        this("John", 25); // Calls the 2-arg constructor
        System.out.println("No-arg constructor");
    }

    P3_ConstructorChaining(String name) {
        this(); // Calls the no-arg constructor
        System.out.println("Name constructor: " + name);
    }

    P3_ConstructorChaining(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        P3_ConstructorChaining p1 = new P3_ConstructorChaining("Alex");

        /**
         * Name: John, Age: 25
         * No-arg constructor
         * Name constructor: Alex
         */
    }
}
