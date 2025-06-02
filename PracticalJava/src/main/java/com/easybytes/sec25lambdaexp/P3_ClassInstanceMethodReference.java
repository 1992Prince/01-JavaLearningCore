package com.easybytes.sec25lambdaexp;

import java.util.List;

public class P3_ClassInstanceMethodReference {

    public static void main(String[] args) {

        /*
        System: This is a final class in the java.lang package.
                It cannot be instantiated or subclassed.
        out: This is a static member of the System class.
                It is an instance of PrintStream, which is a class used for printing
                various data values conveniently. out represents the standard output stream.
        println: This is a method of the PrintStream class.
                 It prints the argument passed to it, followed by a newline character.
                 There are multiple overloaded versions of println,
                 which can take different types of arguments
                 (e.g., String, int, boolean, etc.).

       So u can say out is an instance of PrintStream class and static member of
       System class
       since out is static member of System class, we can access it via - System.out
       now
       System.out is an instance of class PrintStream class and it can access any instance
       method of PrintStream class.

       One such method of PrintStream class is println
         */

        var departmentList = List.of("Supply", "HR", "Sales", "Marketting");

        /*
        forEach() method accepts Consumer and Consumer accepts input parameter
        but don't return anything
         */
        departmentList.forEach(dept -> System.out.println(dept));
        /*
        Supply
        HR
        Sales
        Marketting
         */

        System.out.println();
        System.out.println();

        // using ClassInstanceMethodReference in lambda expression
        departmentList.forEach(System.out::println);

        /*
        Supply
        HR
        Sales
        Marketting
         */


    }
}
