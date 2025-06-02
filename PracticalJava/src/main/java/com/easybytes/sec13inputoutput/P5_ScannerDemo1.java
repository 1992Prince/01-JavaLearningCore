package com.easybytes.sec13inputoutput;

import java.util.Scanner;

public class P5_ScannerDemo1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name - ");
        /*
        here we need to give input with single word only else
        it will throw exception InputMisMatchException e.g.
        if u give inputs Shiv Kumar etc.

        So next() method reads only first word and second input word it is
        treating it int but actual it is String i.e. Kumar
        and So it throwing MisMatchException
         */
        String name = scanner.next();

        System.out.println("Enter your age - ");
        int age = scanner.nextInt();

        scanner.close();
    }
}
