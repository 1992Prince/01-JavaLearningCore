package com.easybytes.sec24functionalprogramming;

import com.easybytes.sec24functionalprogramming.interfaces.ArithmeticExpression;
import com.easybytes.sec24functionalprogramming.interfaces.Hello;

public class P2_LambdaExpDemo {

    public static void main(String[] args) {

        /*
        Approach 1 -
            - giving lambda expression implementation to Functional interface abstract method
            - then passing that Functional interface variable to process method
         */
        Hello hello = () -> System.out.println("Hello Easybytes");
        process(hello);    // Hello Easybytes

        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println();

        /*
        Approach 2 - of passing Functional interface abstract method behaviour directly as lambda expression
         */
        process(() -> System.out.println("Hello Easybytes - lambda expression passed directly to method - !!!!"));

        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println();

        ArithmeticExpression arithExp1 = (num1, num2) -> num1 + num2;
        int sum = arithExp1.operation(10, 20);

        ArithmeticExpression arithExp2 = (num1, num2) -> num1 * num2;
        int mul = arithExp2.operation(10, 20);

        ArithmeticExpression arithExp3 = (num1, num2) -> num1 - num2;
        int sub = arithExp3.operation(10, 20);

        System.out.println("Sum is - " + sum + " Mul is - " + mul + " Sub is - " + sub);

    }

    public static void process(Hello h){
        h.sayHello();
    }
}
