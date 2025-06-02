package com.easybytes.sec14exception;

import com.easybytes.sec14exception.custom.InvalidAgeException;

import java.util.Scanner;

public class P10_CustomCheckedException {

    /*
    In below case , if we give age in negative still code will print -ve age and
    age can't be in negative.
    If user enter 100+ then also code will process it and we knw age can't be more than 100

    So here we need to create custom exception

    Below we are throwing Exception clas exception
    But best practice is throw exact custom based exception
    Lets create InvalidAgeException custom checked exception
     */

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = scanner.nextInt();


        if (age < 0 || age > 100){
           // throw new Exception("Invalid age details entered. Pls enter valid age.");
            throw new InvalidAgeException("Invalid age details entered. Pls enter valid age.");
        }else {
            System.out.println("Your Age is - " + age);
        }
    }
}
