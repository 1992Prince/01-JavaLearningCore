package org.tim.oops1_p4_strings;

public class P3_StringMethods {

    public static void main(String[] args) {

        printInformation("Hello World");

        /**
         * Length = 11
         * First char = H
         */

        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println();

        printInformation(""); // passing empty String

        /**
         * Length = 0
         * String is Empty
         */

        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println();

        printInformation("\t  \n"); // passing blank String , this means there are still characters like tabs, new lines or spaces etc.

        /**
         * Length = 4
         * String is Blank
         * First char =
         * Last char =
         */

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));          // index of r = 8
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));  // index of World = 6
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));          // index of l = 2
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l')); // index of l = 9

        // now I want to get index of l after index 2 and 8
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3)); // index of l = 3
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8)); // index of l = 9
    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if(string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }

        if(string.isBlank()){
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length-1));
    }
}
