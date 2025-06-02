package com.easybytes.sec13inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3_BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Enter a value - ");

        String num = bf.readLine();
        bf.close();

        int i = Integer.parseInt(num);
        if (i % 2 == 0) {
            System.out.println("Numeric value is even");
        } else {
            System.out.println("Numeric value is odd");
        }

    }
}
