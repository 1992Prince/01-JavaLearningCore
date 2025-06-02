package com.easybytes.sec10inheritance.p2_upcasting;

public class Cat extends Animal{

    public void eat() {
        System.out.println("Cat is eating");
    }

    /*
   meow() method is specific to Cat class and not available in super class i.e. Animal class
    */
    public void meow() {
        System.out.println("Cat is Meowing");
    }
}
