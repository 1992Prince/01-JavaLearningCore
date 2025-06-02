package org.tim.oops1_p4_strings;

public class P6_StringBuilder {

    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        /**
         * String = Hello World
         * Length = 11
         */
        printInformation(helloWorldBuilder);
        /**
         * StringBuilder = Hello World and Goodbye
         * Length = 23
         */

        // reverse method is also present in StringBuilder wch is not available in String class

    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
    }
}
