package org.tim.oops2_p1_composition;

/*
// Car can use different engine types like ElectricalEngine or PetrolEngine
 */
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
        System.out.println("Car is running...");
    }
}
