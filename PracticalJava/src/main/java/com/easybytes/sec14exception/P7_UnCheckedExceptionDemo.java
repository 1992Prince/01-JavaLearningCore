package com.easybytes.sec14exception;

public class P7_UnCheckedExceptionDemo {

    /*
    Java doesn't force programmer to handle unchecked exceptions in code.
    Why - bcoz compiler can't detect these exceptions whch can happen at run time.
    like exception is thrown due to some logic error or code input error and how compiler
    will come too know about it.
    e.g NullPointerException, ArithmeticException
     */

    public static void main(String[] args) {

        String input = null;
        input = "Madan";

        // will throw StringIndexOutOfBoundException
        input = input.substring(0, 11);
    }
}
