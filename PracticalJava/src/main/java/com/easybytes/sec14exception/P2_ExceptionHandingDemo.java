package com.easybytes.sec14exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class P2_ExceptionHandingDemo {

    private static Logger logger = Logger.getLogger(P2_ExceptionHandingDemo.class.getName());

    public static void main(String[] args) {

        /*
        If u think u have any code wch is risky and can throw exception then keep it under try and catch block

        Below if u enter String or char value as input then code will not break abruptly and execution will go into
        catch block

        So catch blocks only are going to be executed in scenarios of run time exception wch is mathcing with type
        of inputMatchException

        e.printStackTrace() will print detail exception trace i.e.
        java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:947)
	at java.base/java.util.Scanner.next(Scanner.java:1602)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
	at com.easybytes.sec14exception.P2_ExceptionHandingDemo.main(P2_ExceptionHandingDemo.java:21)

         */

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number - ");
            int num1 = scanner.nextInt();
            System.out.println("Number is - " + num1);
            scanner.close();
        } catch (InputMismatchException e) {
            //  System.out.println(e.getCause());
            //  System.out.println(e.getStackTrace());  // will print stackTrack array object
            //e.printStackTrace(); // prints detail exception stacktrace
            System.out.println("Please provide input in numerical format only and try again");
        }

        System.out.println();
        System.out.println("_".repeat(50));
        System.out.println();

        // Handling ArrayIndexOutOfBoundException

        int[] numbers = {1,2,3,4,5};
        try{
            System.out.println("Array value at index is - " + numbers[6]);
        } catch (ArrayIndexOutOfBoundsException e){
            logger.severe("Invalid Array Index. Please try again with a valid index number");
            System.out.println("Invalid Array Index. Please try again with a valid index number");
        }

        /*
        If u want to handle any kind of Exception and doesn't know at run time what exception will be thrown
        then use Exception class in catch block, since all exceptions extends this class.
        And it can handle any exception at run time.
         */


    }
}
