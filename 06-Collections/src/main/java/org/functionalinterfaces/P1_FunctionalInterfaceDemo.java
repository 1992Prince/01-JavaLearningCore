package org.functionalinterfaces;

public class P1_FunctionalInterfaceDemo {

    public static void main(String[] args) {

        // Defining first lambda exp impl for Functional Interface abstract method
        CalcOperationI operation = (a,b) -> a+b;

        // executing lambda expression
        int addRes = operation.add(10,20);
        System.out.println("addRes - " + addRes); // addRes - 30

        /**
         * But now u want another impl of that Functional abstract method
         * instead of modifying existing impl we can create another lamda exp impl
         * for same abstract method of Function Interface
         * And so we have multiple lambda exp impl for same abstract method of Functional Interface
         */

        // defining another impl
        CalcOperationI operation2 = (a,b) -> (a+b) * 10;

        // executing lambda expression
        int addRes2 = operation2.add(10,20);
        System.out.println("addRes2 - " + addRes2); // addRes2 - 300

        /**
         * IF u r creating class and giving impl then for each diff impl u need to create seperate
         * class
         * So this is benefit of having lambda expressions.
         *
         * We can give end no of impl to abstract mehtod of Functional interface via lambda expression
         * without creating multiple no of classes.
         */
    }
}
