package com.easybytes.sec14exception;

import com.easybytes.sec14exception.custom.DivideByZeroException;

import java.util.Scanner;

public class P11_CustomUnCheckedException {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numerator");
        int num1 = scanner.nextInt();

        System.out.println("Enter denominator");
        int num2 = scanner.nextInt();

        if (num2 == 0){
            throw new DivideByZeroException("Denominator can't be zero");
        }
    }
}
