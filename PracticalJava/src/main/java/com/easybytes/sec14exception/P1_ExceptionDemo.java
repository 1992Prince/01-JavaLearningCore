package com.easybytes.sec14exception;

public class P1_ExceptionDemo {

    public static void main(String[] args) {

        /*
        In below code, if we enters number then code will work smoothly. But
        If we add numbers in String format then code will throw InputMismatchException

        This is bcoz , code is not properly exception handled
        In java, anything which is going to fail your programme to end abruptly.
        Such things we call them exceptions in Java
        Here nextInt() throws this exception at runtime

        U can uncomment below lines of code and test it
         */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int num1 = scanner.nextInt();
        System.out.println("Number is - " + num1);
        scanner.close();*/



        /*
        ArrayIndexOutOfBoundException
        Below line of code will throw
        java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at run time
         */

        int[] numbers = {1,2,3,4,5};
        //System.out.println("Number at 6th index is - " + numbers[5]);

        /*
        Below code will throw
        java.lang.StringIndexOutOfBoundsException: Index 7 out of bounds for length 7

        Note - str1[index] will not work how we used it in array
         */
        String str1 = "Pikachu";
        //System.out.println("Char at particular index - " + str1.charAt(7));
    }
}
