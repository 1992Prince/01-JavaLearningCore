package com.easybytes.sec13inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2_BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Enter a value - ");

        /*
        below read() method is exact copy of previous read() method wch we studied
        in previous program P1_BasicInputDemo.
        It also returns ASCII value of first input character only

        int num = bf.read();
        */

        // readLine() - always returns value in String format
        String input = bf.readLine();
        System.out.println("String value is - " + input);

        // we must need to close the connection with the file or keyboard inputs
        bf.close();

        /*
        So whenever we are dealing with resource related objects like
        stream objects,
        We need to make sure we are closing these stream objects
         */
    }
}
