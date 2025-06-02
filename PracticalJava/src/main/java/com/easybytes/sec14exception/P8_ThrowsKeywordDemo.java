package com.easybytes.sec14exception;

public class P8_ThrowsKeywordDemo {

    public static double division(String num1, String num2) throws NumberFormatException,
            ArithmeticException{
        int i  = Integer.parseInt(num1);
        int j = Integer.parseInt(num2);
        return (i/j);
    }
}
