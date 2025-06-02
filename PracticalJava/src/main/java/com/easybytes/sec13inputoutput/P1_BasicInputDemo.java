package com.easybytes.sec13inputoutput;

import java.io.IOException;

public class P1_BasicInputDemo {

    public static void main(String[] args) throws IOException {

        System.out.println("Please enter numberic value");
        int num = System.in.read();
        System.out.println("Num value is - " + num);

        /*
        123
        Num value is - 49
        We are giving input 123 and it is printing 49 bcoz
        read() method returns ASCII value for given input data i.e. 5
         */

        /*
        Drawback of read() method -
        1) It returns ASCII value for given input
        2) It takes input in single character only , means if we give input 123
           but it returned ASCII value of only first character i.e. 1

           So we cann't use read() method in our daily promgramming
         */
    }
}
