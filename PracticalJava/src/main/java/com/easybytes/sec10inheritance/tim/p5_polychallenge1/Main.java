package com.easybytes.sec10inheritance.tim.p5_polychallenge1;

public class Main {

    public static void main(String[] args) {

        Car car = CarFactory.getCar("hybrid");
        runRace(car);

        System.out.println();
        System.out.println();

        Car car2 = CarFactory.getCar("gas");
        runRace(car2);
    }

    static void runRace(Car car) {
        if (car instanceof GasPoweredCar gasCar) {
            gasCar.startEngine();
            gasCar.drive();
        } else if (car instanceof ElectricCar electricCar) {
            electricCar.startEngine();
            electricCar.drive();
        } else if (car instanceof HybridCar hybridCar){
            hybridCar.startEngine();
            hybridCar.drive();
        } else {
            car.startEngine();
            car.drive();
        }
    }
}
