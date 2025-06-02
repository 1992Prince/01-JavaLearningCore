package com.easybytes.sec10inheritance.tim.p5_polychallenge1;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine()");
    }
    public void drive() {
        System.out.println("Car -> driving, type is " + this.getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine()");
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    public void drive() {
        System.out.println("GasPoweredCar -> driving, type is " + this.getClass().getSimpleName());
        runEngine();


    }

    protected void runEngine() {
        System.out.printf("Gas --> usage exceeds the average: %.2f %n ", avgKmPerLitre);
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("ElectricCar -> startEngine()");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("ElectricCar -> driving");
    }

    protected void runEngine() {
        System.out.println("ElectricCar -> runEngine()");
    }
}

class HybridCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;
    private double avgKmPerCharge;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int cylinders,double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("HybridCar -> startEngine()");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("HybridCar -> driving");
    }

    protected void runEngine() {
        System.out.println("HybridCar -> runEngine()");
    }
}
