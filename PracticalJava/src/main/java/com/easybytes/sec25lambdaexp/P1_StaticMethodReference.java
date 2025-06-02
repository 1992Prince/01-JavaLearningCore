package com.easybytes.sec25lambdaexp;

import com.easybytes.sec24functionalprogramming.interfaces.ArithmeticExpression;

public class P1_StaticMethodReference {

    public static void main(String[] args) {

        ArithmeticExpression sumOperation = (a, b) -> {
            int sum = a + b;
            System.out.println("Sum is - " + sum);
            return sum;
        };

        sumOperation.operation(10, 20); // Sum is - 30

        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println();

        /*
        above u can see we have given implementation using lambda expression for abstract operation method
        of ArithemeticExpression interface.

        Below u can see same implemenation code is available in static method of this class ie. performAddition()

        Instead of writing duplicate code in lambda expression , we can use static method reference inside lambda expression
        below we did the same
         */

        ArithmeticExpression staticMethodRef = P1_StaticMethodReference::performAddition;
        int sumOpe = staticMethodRef.operation(100, 100);
        System.out.println("SumOpe - " + sumOpe); // SumOpe - 200

    }

    public static int performAddition(int a, int b){
        int sum = a + b;
        System.out.println("Sum is - " + sum);
        return sum;
    }


}
