package com.easybytes.sec11interface.tim.interfaces;

public class BirdMain {

    public static void main(String[] args) {

        /*
        We have Bird class that extends abstract class Animal and implements FlightEnabled and Trackable interfaces
        We create an instance of Bird and assign it to variables of type Animal, FlightEnabled, and Trackable
        This is possible because Bird is a subclass of Animal and implements the required interfaces
        This is an example of polymorphism where a subclass object is assigned to a superclass or interface reference variable

        So we can create object of Bird class and assign it to referece variables of type Animal, FlightEnabled, and Trackable
         */

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        System.out.println();
        System.out.println("Testing bird var ref");
        System.out.println();

        bird.move();    // Flaps wings
        bird.takeOff(); // Bird is taking off
        bird.land();    // Bird is landing
        bird.fly();     // Bird is flying
        bird.track();   // Bird s coordinates recorded

        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println();
        System.out.println("Testing animal var ref");
        System.out.println();

        animal.move();                     // Flaps wings
        // with animal , u can't access other methods of interfaces, if u want to access it then u need to cast explicitly first
        ((FlightEnabled)animal).takeOff(); // Bird is taking off
        ((Trackable)animal).track();       // Bird s coordinates recorded
        ((FlightEnabled)animal).land();    // Bird is landing
        ((FlightEnabled)animal).fly();     // Bird is flying

        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println();
        System.out.println("Testing flier var ref");
        System.out.println();

        flier.takeOff(); // Bird is taking off
        flier.fly();     // Bird is flying
        flier.land();    // Bird is landing
        //flier.track(); // compile time error, track() method is not defined in FlightEnabled interface
        // do explicit typecasting to access it
        ((Trackable)flier).track();   // Bird s coordinates recorded
        // explicitly casting FlightEnabled Type to Animal type
        ((Animal)flier).move();      // Flaps wings



       // flier.move();
       //  tracked.move();
        /*
        flier.move() and tracked.move() will give compilation error because
        FlightEnabled and Trackable interfaces do not have a move() method and they are not aware of
        Animal class move method

        Reference types determine what methods you can call in your code
        Compiler only cares about declared type
         */

        System.out.println();
        System.out.println();
        System.out.println("Testing tracked var ref");
        System.out.println();

        tracked.track();                       // Bird s coordinates recorded
        ((Animal)tracked).move();              // Flaps wings
        ((FlightEnabled)tracked).takeOff();    // Bird is taking off
        ((FlightEnabled)tracked).fly();        // Bird is flying
        ((FlightEnabled)tracked).land();       // Bird is landing



    }

}
