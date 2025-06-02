package com.easybytes.sec10inheritance.p2_upcastingpractice;

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}