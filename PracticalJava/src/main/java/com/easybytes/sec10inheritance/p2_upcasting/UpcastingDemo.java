package com.easybytes.sec10inheritance.p2_upcasting;

public class UpcastingDemo {

     /*
        Note -
        Whenever u r trying to build a common logic wch is going to be same for superclasses and subclasses
        then always try to leverage Upasting.
        Just write common logic and try to access object of Super class

        Since same code is executing and behaving differently based upon diff inputs.
        This kind of behavior is called Polymorphism
        */

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setName("Scobby");
        AnimalUtility.printName(animal); // Output: Scobby Animal is eating
        animal.eat(); // Animal is eating

        /*
        Upcasting is a process of converting a subclass object to a superclass object.
        It is an implicit conversion that happens automatically when a subclass object is assigned to a superclass reference variable.
        Upcasting does not require an explicit cast.

        below animal is object ref of super class
         */

        // Dog is an animal
        animal = new Dog(); // Upcasting: Assigning a Dog object to an Animal reference variable
        animal.setName("Tommy");
        AnimalUtility.printName(animal); // Output: Tommy Dog is eating
        animal.eat();  // Dog is eating

        /*

        Above u can see same AnimalUtility code is working for 2 diff types of objects
        One is object of Animal and other is object of Dog

        Why developers are doing Upcasting in Java?
        1. To achieve polymorphism
         */

        /*
        Below we are creating object of cat and reference of Cat. But we are passing this cat obj to AnimalUtility method printName()
        wch accepts Animal class.
        Now cat is an Animal i.e. child class of Animal and so printName accepts cat obj and do upcasting internally automatically.
        So below upcasting is happening automatically but in case of Dog scenario we performed the Upcasting manually externally.

        Benefit of Upcasting in Inheritance?
        We can write a single piece of code which is going to be executed for all subclasses and superclasses.
        This is the main benefit of Upcasting.

         */
        Cat cat = new Cat();
        cat.setName("Kitty");
        AnimalUtility.printName(cat); // Kitty Cat is eating
        cat.eat(); // Cat is eating



    }
}
