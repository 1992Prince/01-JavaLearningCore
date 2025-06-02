package com.easybytes.sec10inheritance.p2_upcasting;

public class Dog extends Animal{

    public void eat() {
        System.out.println("Dog is eating");
    }

    /*
    bark() method is specific to Dog class and not available in super class i.e. Animal class
     */
    public void bark() {
        System.out.println("Dog is Barking");
    }
}
