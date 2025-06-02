package com.easybytes.sec10inheritance.p3_downcasting;

import com.easybytes.sec10inheritance.p2_upcasting.Animal;
import com.easybytes.sec10inheritance.p2_upcasting.AnimalUtility;
import com.easybytes.sec10inheritance.p2_upcasting.Cat;
import com.easybytes.sec10inheritance.p2_upcasting.Dog;

public class P3_DowncastingDemo2usingUtiltyMethod {

    /*
    Note - Always remember Upcasting and Downcasting of method will happen only in Parent and child class
     */

    public static void main(String[] args) {

        Animal anm;

        Dog dog = new Dog();

        anm = dog; // upcasting and anm is holding obj of dog

        AnimalUtility.performActiom(anm);
        /*
        Dog is eating
        Dog is Barking
         */

        System.out.println();
        System.out.println("==============================================");
        System.out.println();

        Cat cat = new Cat();
        anm = cat;
        AnimalUtility.performActiom(anm);

        /*
        Cat is eating
        Cat is meowing
         */
        
    }
}
