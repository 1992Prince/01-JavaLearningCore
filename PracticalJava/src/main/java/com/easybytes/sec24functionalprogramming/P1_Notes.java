package com.easybytes.sec24functionalprogramming;

public class P1_Notes {

    /*
    Lambda Expression is introduced from java 8 as part of Functional Programming.
    These Lambda funs will not have any name.

    We can't write Lambda expression where ever we want. We can only define Lambda expr
    under context of Functional Interfaces.

    public void printHello() {
       System.out.println("Hello");
    }

    via lambda exp can be written as

    () -> System.out.println("Hello");

    and

     public void printSum(int num1, int num2) {
       System.out.println(num1 + num2);
    }

    via lambda exp can be written as

    (num1, num2) -> System.out.println(num1 + num2);

    and

    public int printSum(int num1, int num2) {
       int result = num1 + num2;
       return result;
    }

    via lambda exp can be written as

    (a, b) -> {
      int result = a + b;
      return result;
    };

    or

    (a,b) -> return (a + b);

    or

    (a,b) -> a+b;

    So we can write only Lambda expression for only functional interfaces.

    A functional interface is an interface that specifies exactly a single abstract method (SAM).


     */
}
