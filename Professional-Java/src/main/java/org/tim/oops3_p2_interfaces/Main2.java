package org.tim.oops3_p2_interfaces;

public class Main2 {

    public static void main(String[] args) {

        Bird bird = new Bird();

        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        /**
         * Bird class extends Animal cls and also implements FlightEnabled and Trackable interfaces
         */
        inFlight(flier);

        /**
         * Bird is taking off
         * Bird is flying
         * Bird 's coordinates recorded
         * Bird is landing
         */

        System.out.println();
        inFlight(new Jet());

        /**
         * Jet is taking off
         * Jet is flying
         * Jet 's coordinates recorded
         * Jet is landing
         */

        System.out.println();

        Trackable truck = new Truck();
        truck.track();

    }

    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable){
            Trackable trckble = (Trackable) flier;
            trckble.track();
        }
        flier.land();

    }
}
