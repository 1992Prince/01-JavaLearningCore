package com.easybytes.sec24functionalprogramming.prelearning;

interface MyInterface{
    void something();
}

public class P1_AnonymousClass {

    public static void main(String[] args) {

        /*
        Anonymous classes in Java allow you to create a class and instantiate it all at once.
        They are used when you need to override the methods of a class or interface but don't want to create a separate named class.

        Below with help of Anonymous class we have given implementaion to something() method and instantiated it.
        Then with this instance we are calling something() method
         */

        MyInterface impl1 = new MyInterface() {
            @Override
            public void something() {
                System.out.println("Perform something man");
            }
        };

        impl1.something();   // Perform something man

        /*
        We can give another implementation also with anonymous class and create instance.
         */

        MyInterface impl2 = new MyInterface() {
            @Override
            public void something() {
                System.out.println("I am another implementation bro!"); // I am another implementation bro!
            }
        };

        impl2.something();
    }
}
