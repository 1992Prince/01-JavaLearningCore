package com.easybytes.sec25lambdaexp.tim;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class P5_MethodReferences {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "Anna", "Bob", "Chuck", "Dave"
        ));

        /*
        Anna
        Bob
        Chuck
        Dave
         */

        System.out.println();
        list.forEach(s -> System.out.println(s));

        // Lambda can be replaced with method reference
        list.forEach(System.out::println);

        System.out.println();

        /*
        sum it's simply a static method on the Integer wrapper class, that returns the sum of two integers,
        which obviously replaces the plus operator, when the operands are integers.

        This is the second type of method reference,
        that uses a static method on a class, with the class type as the reference on the left.
         */

        calculator((a,b) -> a + b, 10, 20);
        // above lambda can be replcaed with below static Method Reference
        calculator(Integer::sum, 10, 20);

        System.out.println();

        calculator((a,b) -> a + b, 10.0, 20.0);
        // above lambda can be replcaed with below static Method Reference
        calculator(Double::sum, 10.0, 20.0);

    }

    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1, value2);
        System.out.println("Operation result - " + result);
    }
}
