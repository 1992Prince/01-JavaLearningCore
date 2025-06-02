package com.easybytes.sec11interface.tim.interfaces;

public class BirdMain2 {

    public static void main(String[] args) {


        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        System.out.println("--------------------inFlight(bird)---------------------");
        System.out.println();

        inFlight(bird);

        /*
        Bird is taking off
        Bird is flying
        Bird s coordinates recorded
        Bird is landing
         */

        System.out.println();
        System.out.println("--------------------inFlight(flier)---------------------");

        inFlight(flier);

        /*
        Bird is taking off
        Bird is flying
        Bird s coordinates recorded
        Bird is landing
         */

       // inFlight(animal); // will not work since animal is type of Animal and not FlightEnabled and need explicit casting
        // inFlight(tracked); // will not work since tracked is type of Tracked and not FlightEnabled and need explicit casting

        System.out.println();
        System.out.println("------------------------ inFlight(jet)-----------------------------------");
        System.out.println();

        Jet jet = new Jet();
        inFlight(jet);

        /*
        Jet is taking off
        Jet is flying
        Jet s coordinates recorded
        Jet is landing
         */

        System.out.println();
        System.out.println("------------------------Truck obj-----------------------------------");
        System.out.println();

        Truck truck = new Truck();
        truck.track();              // Truck s coordinates recorded

        System.out.println();
        System.out.println("------------------------Accessing Final Variables-------------------");
        double kmsTraveled = 100;
        double milesTraveled = FlightEnabled.KM_TO_MILES * kmsTraveled;
        System.out.printf("The truck travelled %.2f km or %.2f miles%n",
                kmsTraveled, milesTraveled);
        // The truck travelled 100.00 km or 62.14 miles
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        /*
        If the object is a class that implements Trackable,
        then a local variable is set up named tracked, with the type Trackable.
         */
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
}
