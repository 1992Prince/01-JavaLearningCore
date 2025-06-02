package org.tim.oops3_p2_interfaces;

public class Main {

    public static void main(String[] args) {

        /**
         * I want to get back to the main method on Main and create an instance of this class.
         *
         * This is the usual way to create a new instance of bird and assign it to a reference variable, bird.
         *
         * But we can say a Bird is an Animal, and that it's also FlightEnabled and Trackable.
         *
         * That means I can assign my bird object to different reference types, which I'll do now.
         *
         * A bird as it turns out, can be assigned
         *
         * to any of these four different types
         *
         * Bird bird = new Bird()
         * Animal animal = new Bird()
         * FlightEnabled flier = new Bird()
         * Trackable tracked = new Bird()
         */

        Bird bird = new Bird();

        Animal animal = bird;
        // Create a reference variable of type FlightEnabled and assign the bird object to it
        FlightEnabled flier = bird;
        // Create a reference variable of type Trackable and assign the bird object to it
        Trackable tracked = bird;

        /**
         * The type you use, meaning the variable's declared
         *
         * type, determines which methods you can call in your code.
         *
         * When we assigned the bird object to the FlightEnabled and Trackable variables,
         *
         * those types don't have a move method on them, so this is why we get this error.
         *
         * The compiler only cares about the declared type. I'll comment out those last two lines.
         */
        animal.move();    // Flaps wings
        // flier.move();
        // tracked.move();

        /**
         * So if U want to access Animal class methods then u need to Animal class ref
         * but if u want to access FlightEnabled class methods then u need to FlightEnabled class ref
         * and if u want to access Trackable class methods then u need to Trackable class ref
         * so u need to create a separate ref for each class
         * and then u can call the methods
         */

        // accessing FlightEnabled class methods
        flier.takeOff();   // Bird is taking off
        flier.fly();       // Bird is flying
        // accessing Trackable class methods
        tracked.track();   // Bird 's coordinates recorded
        flier.land();      // Bird is landing

        /**
         * We can describe a bird in many ways now,
         *
         * in the code, treating it as a member of multiple, and quite different groups.
         */
    }
}
