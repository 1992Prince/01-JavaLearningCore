package com.easybytes.sec24functionalprogramming;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class P7_SupplierDemo {

    /*
    Supplier is sibling of Consumer and it works completely opposite of Consumer
    Consumer accepts single input but don't returns any output but
    Supplier don't accepts any input but returns an output

    Supplier can help u to return instances of class like RandomNumber etc.

    We can use Supplier in scenarios where u want to generate a report or otp
    without accepting any data or random numbers

    Stream class generate() method accepts Supplier

    Supplier is like a getter method inside Pojo class.
    Consumer is like a setter method inside Pojo class.

    There are no static or default methods available inside Supplier

    Supplier functional interface have only get() method
     */

    public static void main(String[] args) {

        Supplier<Integer> getCurrentMonth = () -> LocalDate.now().getMonthValue();
        Supplier<Integer> getCurrentDay = () -> LocalDate.now().getDayOfMonth();

        System.out.println("getCurrentMonth() - " + getCurrentMonth.get());
        System.out.println("getCurrentDay() - " + getCurrentDay.get());
        // getCurrentMonth() - 6
        // getCurrentDay() - 30

        System.out.println();
        System.out.println();

        Random random = new Random();
        Supplier<Integer> randomNum = () -> random.nextInt();
        System.out.println("Random no is - " + randomNum.get()); // Random no is - 1703421288

    }
}

