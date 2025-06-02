package com.easybytes.sec10inheritance.p6_constructorinvocation;

public class Car extends Vehicle{

    public int horsePower;
    public String color;

    public String turningRadius;
    public boolean isAutomatic;

    public Car(){
        System.out.println("Inside Car default constructor");
        horsePower = 150;
        color = "Black";
        turningRadius = "6.23";
        isAutomatic = true;
    }
}
