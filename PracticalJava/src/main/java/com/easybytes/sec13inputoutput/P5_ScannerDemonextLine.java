package com.easybytes.sec13inputoutput;

import java.util.Scanner;

public class P5_ScannerDemonextLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name - ");

        /*
        U can enter name in single word or multiple words also
         */
        String name = scanner.nextLine();

        System.out.println("Enter your age - ");
        int age = scanner.nextInt();

        System.out.println("Hello "+name+ " , you are "+age+" years old");

        scanner.close();
    }
}
