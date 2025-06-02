package com.easybytes.sec13inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4_BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);

        System.out.println("Enter a input1 - ");
        String input1 = bf.readLine();

        System.out.println("Enter a input2 - ");
        String input2 = bf.readLine();
        bf.close();

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        System.out.println("Sum is - " + (num1 + num2));

    }
}
