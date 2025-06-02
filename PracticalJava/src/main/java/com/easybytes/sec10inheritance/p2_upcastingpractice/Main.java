package com.easybytes.sec10inheritance.p2_upcastingpractice;

import static com.easybytes.sec10inheritance.p2_upcastingpractice.VehicleUtility.startVehicle;

public class Main {

    public static void main(String[] args) {

        /*
        Having reference of superclass and object of child class is Upcasting and below are example of it

        with help of startVehicle() method we can call start() method of any Vehicle due to Upcasting.
        In startVehicle() method upcasting is happening automatically i.e. at run time but
        below we are doing explicit upcasting.
         */

        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        startVehicle(myCar);    // Car started
        startVehicle(myBike);   // Bike started
    }
}
