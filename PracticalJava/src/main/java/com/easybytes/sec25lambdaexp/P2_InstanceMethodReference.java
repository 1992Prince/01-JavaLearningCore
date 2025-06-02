package com.easybytes.sec25lambdaexp;

public class P2_InstanceMethodReference {

    public static void main(String[] args) {

        /*
        Demo of Instance method reference in lambda expression
         */
        P1_ArithmeticExpression instanceMethodRef =
                new P2_InstanceMethodReference()::performAddition;

        int sum = instanceMethodRef.performOperation(100,100);
        System.out.println("Sum is - " + sum); // Sum is - 200

        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println();


    }

    public int performAddition(int a, int b){
        int sum = a + b;
        System.out.println("Sum is - " + sum);
        return sum;
    }


}
