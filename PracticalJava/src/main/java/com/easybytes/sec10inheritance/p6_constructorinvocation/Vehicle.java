package com.easybytes.sec10inheritance.p6_constructorinvocation;

public class Vehicle {

    public int horsePower;
    public String color;

    public double turningRadius;
    public String madeFor;

    public Vehicle(){
        System.out.println("Inside Vehicle default constructor");
        horsePower = 120;
        color = "White";
        turningRadius = 5.23;
        madeFor = "Road";
    }
}
