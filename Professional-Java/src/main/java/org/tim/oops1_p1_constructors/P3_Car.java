package org.tim.oops1_p1_constructors;

public class P3_Car {

    /*
    Demo of class blueprint , class members, getters and setters methods
    for below instance members we will set default values and have getter methods to access them outside the clss
     */

    private String make = "Tesla";
    private String model = "Model X";
    private int doors = 2;
    private String color = "Gray";
    private boolean isConvertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void descibeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (isConvertible ? "Convertible" : ""));
    }
}
