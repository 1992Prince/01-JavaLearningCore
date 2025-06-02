package org.tim.oops1_p4_strings;

public class P4_StringMethods {

    public static void main(String[] args) {

        String helloWorld = "Hello World";
        String helloWorldLower = helloWorld.toLowerCase();

        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }

        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values match ignoring cases");  // Values match ignoring cases
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");   // String starts with Hello
        }

        if(helloWorld.endsWith("Hello")){
            System.out.println("String ends with Hello");
        }

        if(helloWorld.contains("World")){
            System.out.println("String contains World");  // String contains World
        }

        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly");  // Values match exactly
        }


    }
}
