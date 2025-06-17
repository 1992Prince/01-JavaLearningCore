package org.iostreams.durgamadanpractice;

import java.util.Scanner;

public class P6_ScannerClssPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name - " );
        String name = scanner.next();

        System.out.println("Enter your age - " );
        int age = scanner.nextInt();

        System.out.println("Name : " + name + " age : " + age);


    }
}
