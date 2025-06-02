package com.easybytes.sec11interface.tim.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BirdMain3 {

    /*
    Interface type Coding
     */

    public static void main(String[] args) {


        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        triggerFliers(fliers);  // Bird is taking off
        flyFliers(fliers);      // Bird is flying
        landFliers(fliers);     // Bird is landing

        System.out.println();

        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(betterFliers);  // Bird is taking off
        flyFliers(betterFliers);      // Bird is flying
        landFliers(betterFliers);     // Bird is landing

        /*
        Method parameters, method return types, local variable references, and even class variables

        should try to use the interface type, as the reference variable type, when possible.

        This will make your code more extensible in the future.

        Coding to an interface scales well, to support new subtypes,

        and it helps when refactoring code,
         */


    }

    private static void triggerFliers(List<FlightEnabled> fliers) {
        for (FlightEnabled flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers) {
        for (FlightEnabled flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers) {
        for (FlightEnabled flier : fliers) {
            flier.land();
        }
    }
}
