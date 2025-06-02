package org.tim.oops1_p1_constructors;

public class CarMain {

    public static void main(String[] args) {

        // creating instance of car with java default values
        P1_Car car1 = new P1_Car();
        car1.descibeCar();          // 0-Door null null null

        System.out.println();

        // creating instance of car with user defined default values
        P2_Car car2 = new P2_Car();
        car2.descibeCar();         // 2-Door Gray Tesla Model X Convertible

        System.out.println();

        // creating instance of car to access class members values via getter methods
        P3_Car car3 = new P3_Car();
        System.out.println("make = " + car3.getMake());
        System.out.println("model = " + car3.getModel());

        /*
        Output -
        make = Tesla
        model = Model X
         */

        System.out.println();

        P4_Car car4 = new P4_Car();
        car4.setMake("Holden");
        car4.setModel("Mustang");
        System.out.println("make = " + car4.getMake());
        System.out.println("model = " + car4.getModel());

        /**
         * Output
         * make = Holden
         * model = Mustang
         */

        System.out.println();

        P4_Car car5 = new P4_Car();
        car5.setMake("ford");
        car5.setModel("Mustang");
        System.out.println("make = " + car5.getMake());
        System.out.println("model = " + car5.getModel());

        /**
         * Output
         * make = Unsupported
         * model = Mustang
         */
    }
}
