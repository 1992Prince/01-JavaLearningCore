package com.easybytes.sec24functionalprogramming.prelearning;

public class P2_LambdaExpression {

    /*
    Lambda Expression eliminate the need for an anonymous class when a simple implementation is required.
     */

    public static void main(String[] args) {

        /*
        Below we have used lambda expression to provide impl to Functional Interface method and
        assigning it to variable
        Then calling method
         */
        MyInterface impl3 = () -> System.out.println("I am implemented via Lambda expression");
        impl3.something(); // I am implemented via Lambda expression

        System.out.println();

        // calling performAction method
        performAction(impl3); // I am implemented via Lambda expression

        System.out.println();

        /*
        we can also pass lambda exp directly to performAction method
        so u can say that performAction method accepts Functional interface MyInterface
        and via lambda exp, we have directly passed imp of its abstract method
         */

        performAction(() -> System.out.println("I am lambda expression and passed directly"));
        // I am lambda expression and passed directly
    }

    public static void performAction(MyInterface action){
        action.something();
    }
}
