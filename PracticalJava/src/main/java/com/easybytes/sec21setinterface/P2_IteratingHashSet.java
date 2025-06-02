package com.easybytes.sec21setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P2_IteratingHashSet {

    public static void main(String[] args) {

        Set<String> superPowers = new HashSet<>();
        superPowers.add("Invisibility");
        superPowers.add("Teleportation");
        superPowers.add("Mind Reading");
        superPowers.add("Super Strength");
        superPowers.add("Time Travel");
        superPowers.add("Laser Vision");
        superPowers.add("Weather Manipulation");
        superPowers.add("Telekinesis");
        superPowers.add("Shape-Shifting");
        superPowers.add("Chaos Induction");

        /**
         * Using for-each loop
         */
        for(String power : superPowers){
            System.out.print(power.toUpperCase()+" ");
        }
        System.out.println();

        // SHAPE-SHIFTING CHAOS INDUCTION TELEKINESIS WEATHER MANIPULATION LASER VISION INVISIBILITY MIND READING TELEPORTATION SUPER STRENGTH TIME TRAVEL

        /**
         * Using Iterator
         */

        Iterator<String> iterator = superPowers.iterator();

        while(iterator.hasNext()){
            String power = iterator.next();
            System.out.print(power.toLowerCase() + " ");
        }

        // shape-shifting chaos induction telekinesis weather manipulation laser vision invisibility mind reading teleportation super strength time travel

        System.out.println();

        /**
         * Using jdk8+
         */

        superPowers.forEach(power -> System.out.print(power.toUpperCase()+" "));

        // SHAPE-SHIFTING CHAOS INDUCTION TELEKINESIS WEATHER MANIPULATION LASER VISION INVISIBILITY MIND READING TELEPORTATION SUPER STRENGTH TIME TRAVEL



    }
}
