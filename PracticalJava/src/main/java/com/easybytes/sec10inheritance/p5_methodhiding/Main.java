package com.easybytes.sec10inheritance.p5_methodhiding;

public class Main {

    /*
    Method hiding in Java occurs when a subclass defines a static method with the same name and signature as a static method in its superclass.
    The subclass method hides the superclass method, meaning that the method that gets called depends on the reference type used to invoke it,
    rather than the actual object type.
     */

    public static void main(String[] args) {
        Car.start();       // Car Started
        Vehicle.start();   // Vehicle Started


        Vehicle vehicle = new Car();
        vehicle.start();  // Vehicle Started bcoz Method Hiding is compile time and not run time
    }
}
