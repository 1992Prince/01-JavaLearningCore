package org.tim.oops2_p1_composition;

public class Main {

    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Engine electricEngine = new ElectricalEngine();

        Car petrolCar = new Car(petrolEngine);
        Car electricCar = new Car(electricEngine);

        petrolCar.startCar(); // Uses Petrol Engine
        /**
         * Petrol Engine started...
         * Car is running..
         */
        electricCar.startCar(); // Uses Electric Engine
        /**
         * Electrical Engine started...
         * Car is running...
         */
    }
}
