package com.easybytes.sec27optionaljava8;

import java.util.Random;

public class P1_OptionalDemo {

    /*
    Handling Null Pointer Exception without Optional Class
     */

    public static void main(String[] args) {

        String result = sayHello();

        /*
        Prince this is how u used to check if object is not null i.e. obj != null
         */
        if (result != null) {
            System.out.println(result);
        }else {
            System.out.println("Null Pointer Exception");
        }

    }

    public static String sayHello(){
        int num = new Random().nextInt();
        if (num % 2 == 0) {
            return "Hello World";
        }

        return null;
    }
}
