package com.easybytes.sec10inheritance.p2_upcastingpractice;

public class VehicleUtility {

    public static void startVehicle(Vehicle vehicle) {
        vehicle.start();  // Upcasting allows us to call start on any Vehicle
    }

}
