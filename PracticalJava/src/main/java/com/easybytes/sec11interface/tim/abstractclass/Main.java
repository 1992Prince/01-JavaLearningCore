package com.easybytes.sec11interface.tim.abstractclass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
        We can't instantiate an abstract class and if we try to do it we will get compile time error
        Animal animal = new Animal("Dog", "Large", 15.0);
     */


    /*
        We can create a reference variable of abstract class type and assign it to the object of concrete class
     */
        Animal animal = new Dog("Dog", "Large", 15.0);
        animal.makeNoise(); // Woof!

        System.out.println();

        Dog dog = new Dog("Wolf", "Large", 15.0);
        dog.makeNoise(); // Howling!

        System.out.println();

        doAnimalStuff(dog);
        /* output
        Howling!
        Dog ( Wolf )  is walking
         */

        /*
        Let's c how writing code using the more generic or abstract type saves you a lot of effort.

        We have specified Animal in ArrayList bcoz so that list can accepts subclass objects also i.e. inheritance concept
        We can pass any instace in this list that inherits from Animal class
         */

        System.out.println();
        System.out.println("*************************************************************************");
        System.out.println();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Fish("Goldfish", "Small", 0.1));
        animals.add(new Dog("German Shephard", "big", 150));

        for (Animal animal1 : animals){
            doAnimalStuff(animal1);
        }

        /* output
        Howling!
        Dog ( Wolf )  is walking
        swish
        Fish ( Goldfish )  lazily swimming
        Woof!
        Dog ( German Shephard )  is walking

        And now if I run this. You see output for all our different types of dogs and fish. So that's nice that we can have an
        ArrayList of an abstracted type. And at runtime, instances that
        inherit from that class can use polymorphism to execute code specific to the concrete type.

         */
    }

    /*
    The abstract class told the world that animals move and make noise, so anyone can use an Animal class and call those
    methods on the object that it gets at runtime. Regardless of what that object is, as long as
    it's an Animal, meaning it has the Animal class in its hierarchy, this code will continue to work.

     This is abstraction, promoting polymorphism techniques.
     */
    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }


}
