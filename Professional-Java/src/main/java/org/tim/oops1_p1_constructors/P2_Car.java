package org.tim.oops1_p1_constructors;

public class P2_Car {

    /*
    Demo of class blueprint , class members, getters and setters
    for below instance members we will set default values and all objects will be instantited with these values
     */

    private String make = "Tesla";
    private String model = "Model X";
    private int doors = 2;
    private String color = "Gray";
    private boolean isConvertible = true;

    public void descibeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (isConvertible ? "Convertible" : ""));
    }
}
