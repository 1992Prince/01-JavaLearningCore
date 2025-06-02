package com.easybytes.sec14exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P6_CheckedExceptionDemo {

    public static void main(String[] args) {

        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(inputStreamReader)) {

            System.out.println("Enter a value - ");
            String input = bf.readLine();

        } catch (IOException ex){
            ex.printStackTrace();
        }



    }
}
