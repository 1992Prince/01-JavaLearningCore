package com.easybytes.sec24functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class P3_PredicateDemo {

    public static void main(String[] args) {

        /*
        Note - If u have multiple params then use can define lambda exp with (num1, num2) etc.
               But if u have single param then u can remove () from lambda expression

               filter fun accepts Predicate Interface lambda exp so, we can pass
               conditionals inside streams filter method.
         */

        /*
        write lambda exp, if given no is even or not
         */
        Predicate<Integer> isEven = num -> num % 2 == 0;
        boolean bool1 = isEven.test(50);
        boolean bool2 = isEven.test(13);
        System.out.println(bool1 + " " + bool2); // true false

        System.out.println();

        /*
        Write lambda exp to see if given num is greater than 50 or not
         */

        Predicate<Integer> isGreaterThan50 = num -> num > 50;
        boolean bool3 = isEven.test(60);
        boolean bool4 = isEven.test(13);
        System.out.println(bool3 + " " + bool4); // true false

        System.out.println();

        /*
        Write lambda exp to see if given num is even and greater than 50 i.e we need to check
        if given no is even and greater than 50 then return true else false

        Here we need to chain two predicates using OR or AND default methods
        or / and methods are default methods avaialble in Predicate interface
         */

        Predicate<Integer> twoPredConditionalsAnd = isEven.and(isGreaterThan50);
        boolean bool5 = twoPredConditionalsAnd.test(170);
        boolean bool6 = twoPredConditionalsAnd.test(171);
        boolean bool7 = twoPredConditionalsAnd.test(32);
        System.out.println(bool5 + " - " + bool6 + " - " + bool7); // true - false - false

        System.out.println();

        /*
        Write lambda exp to see if given num is even or greater than 50 i.e we need to check
        if given no is even or greater than 50 then return true else false

        Here we need to chain two predicates using OR or AND methods
         */

        Predicate<Integer> twoPredConditionalsOr = isEven.or(isGreaterThan50);
        boolean bool8 = twoPredConditionalsOr.test(170);
        boolean bool9 = twoPredConditionalsOr.test(171);
        boolean bool10 = twoPredConditionalsOr.test(31);
        System.out.println(bool8 + " - " + bool9 + " - " + bool10); // true - true - false

        System.out.println();

        /*
        Negate default method present in Predicate Interface
        Using negate default method we should be able to negate output
         */
        System.out.println("Negate default method demo");
        boolean bool11 = isEven.negate().test(50);
        System.out.println("Bool11 negate value is - " + bool11);

        System.out.println();
        System.out.println();
        System.out.println("Filter even numbers from list via Predicate interface");

        /*
        filter() accepts Predicate functional interface lambda expression
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // List<Integer> evenList = list.stream().filter(isEven).collect(Collectors.toList());

        /*
        'collect(toList())' can be replaced with 'toList()' - intellije suggestion
        List<Integer> evenList =
                list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());*/

        List<Integer> evenList =
                list.stream().filter(num -> num % 2 == 0).toList();

        System.out.println("Even List is - " + evenList); // Even List is - [2, 4, 6, 8, 10]

        System.out.println();



    }
}

