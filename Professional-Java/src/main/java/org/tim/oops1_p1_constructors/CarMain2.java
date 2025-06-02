package org.tim.oops1_p1_constructors;

public class CarMain2 {

    public static void main(String[] args) {

        // create Car obj and no -args constructor stmnt will be printed first
        P5_Car car1 = new P5_Car();  // prints Empty constructor called


        System.out.println();

        /**
         * P6_Car have 2 constructors
         * 1. No-args constructor
         * 2. Constructor with 5 args
         * And Constructor with 5 args will be called since we are passing 5 args and no-args constructor will be skipped
         */
        P6_Car car2 = new P6_Car("tesla", "four wheeler model", 4, "green", true);
        car2.descibeCar();

        /** Output
         * Constructor with parameters called
         * 4-Door green tesla four wheeler model Convertible
         */

        System.out.println();

        /**
         * In P7_Car we will show constructor chaining
         * We will create object of no-args constructor and it will call the constructor with 5 args
         */
        P7_Car car3 = new P7_Car();
        car3.descibeCar();

        /**
         * Constructor with parameters called
         * 4-Door white tesla ciaz
         */



    }
}
