package com.easybytes.sec10inheritance.tim.p5_polychallenge1;

public class CarFactory {

    public static Car getCar(String carType) {
        return switch (carType.toLowerCase()) {
            case "gas" -> new GasPoweredCar("Gas Car", 13.6, 6);
            case "electric" -> new ElectricCar("Electric Car", 25, 4);
            case "hybrid" -> new HybridCar("Hybrid Car", 31.1, 8, 25, 4);
            default -> new Car("Unknown Car");
        };
    }
}
