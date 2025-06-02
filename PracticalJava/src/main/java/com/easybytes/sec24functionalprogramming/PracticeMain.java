package com.easybytes.sec24functionalprogramming;

import com.easybytes.sec24functionalprogramming.interfaces.ArithmeticExpression;

public class PracticeMain {

    public static void main(String[] args) {

        ArithmeticExpression oper = (num1, num2) -> num1 + num2;
        int sum = oper.operation(10,10);
        System.out.println("Sum - " + sum);
    }
}
