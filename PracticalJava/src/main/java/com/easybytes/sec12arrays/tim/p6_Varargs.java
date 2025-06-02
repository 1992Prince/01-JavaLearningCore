package com.easybytes.sec12arrays.tim;

public class p6_Varargs {

    /*
    String[] can be replaced with String... means method will accept zero or more String arguments
     */
    public static void main(String[] args) {

        System.out.println("Bharat Mata Ki Jai!!!!");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);
        System.out.println();
        printText("Hello");            // Hello
        System.out.println();
        printText("Hello", "World");   // Hello World
        System.out.println();
        printText();
        System.out.println();
        /*

        String[] vs String... in method parameter

        In Java, String[] and String... (varargs) are both used to handle arrays of strings,
        but they serve slightly different purposes and are used in different contexts.

        String[]
        String[] is a standard way to define an array of strings.
        It can be used as a parameter in methods, and it represents a fixed-size collection of String objects.

        String[] can be replaced with String... means method will accept zero or more String arguments

        String...
        String... is a varargs (variable-length argument list) syntax that allows you to pass a variable number of String
        arguments to a method. Internally, it is treated as a String[], but it provides more flexibility in how you call the method.

        U can see above that to varargs parameter we can pass single string , multiple strings
        string array or no string at all

        but if we use String[] in method parameter then we can only pass string array


         */

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println();

        String[] strArray = {"Hello", "World", "Bharat", "Ki", "Jai", "Har", "Har", "Bhole"};
        String stmnt = String.join(",", strArray);

        /*
        In String.join() method, last parameter is varargs parameter
        so we can pass multiple strings or string array or no string at all

        The String.join() method in Java is used to concatenate elements of a String array or an Iterable (such as a List)
        into a single String with a specified delimiter between each element.
        This method is particularly useful for constructing a single String from multiple substrings,
        separated by a common delimiter.
         */
        System.out.println(stmnt); // Hello,World,Bharat,Ki,Jai,Har,Har,Bhole
    }

    private static void printText(String... textList) {

        for (String t : textList) {
            System.out.print(t + " "); // Hello World again
        }
    }

    private static void printText2(String... textList) {

        for (String t : textList) {
            System.out.print(t + " "); // Hello World again
        }
    }
}
