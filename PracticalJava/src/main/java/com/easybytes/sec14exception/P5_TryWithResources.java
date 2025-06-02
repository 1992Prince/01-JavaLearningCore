package com.easybytes.sec14exception;

import java.util.Scanner;

public class P5_TryWithResources {

    /*
    Since we are using try with resources so we don't need to call scanner.close()
    explicitly and JVM will call it automatically

     */

    public static void main(String[] args) {

        try(Scanner scanner =  new Scanner(System.in)) {
            System.out.println("Enter number pls - ");
            int num = scanner.nextInt();
            System.out.println(num);
        }catch (Exception ex){
            System.out.println("Some Exception occured");
        }
    }
}
