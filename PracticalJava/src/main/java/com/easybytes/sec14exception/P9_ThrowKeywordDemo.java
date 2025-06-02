package com.easybytes.sec14exception;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class P9_ThrowKeywordDemo {

    /*
    With help of throw keyword, we can manually throw an exception from a method body
    Below we are throwing ArithmeticException
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numerator");
        String val1 = scanner.next();
        System.out.println("Enter denominator");
        String val2 = scanner.next();

        // throwing unchecked exception
        if (val2.equals("0")) {
            throw new ArithmeticException("Divide by zero");
        }

        /*
        if u throw checked exception using throw keyword then
        at method signature level also we need to declare that checked exception

        But if u throw unchecked exception using throw keyword, then
        we don't need to declare unchecked exception at method signature level
         */
        if (val2.equals("0")) {
            throw new FileNotFoundException("File is not present");
        }

        /*
        What exceptions we can throw via throws keyword?
        Any exception wch we want to ask callee method to provide code handling can be thrown.
        It can be checked and unchecked also.
        If u don't provide exception handle code for checked exceptions then compiler
        will force u to throw it at method signature level

        And we have shown example where we are throwing unchecked exception via throws keyword
        at method signature level.

        So conclusion is any checked or unchecked exception can be thrown via throws keyword
        at method signature level.
         */
    }
}
