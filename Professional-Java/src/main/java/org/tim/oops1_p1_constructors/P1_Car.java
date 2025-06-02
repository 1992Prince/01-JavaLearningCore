package org.tim.oops1_p1_constructors;

public class P1_Car {

    /*
    Demo of class blueprint , class members, getters and setters
    for below instance members java default values will be set
     */

    private String make;
    private String model;
    private int doors;
    private String color;
    private boolean isConvertible;

    public void descibeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (isConvertible ? "Convertible" : ""));
    }
}
