package org.tim.oops1_p1_constructors;

public class P4_Car {

    /*
    Demo of setters methods and adding validations in setter methods
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

    /*
    In below way we are not adding any validations inside setMake() method
    public void setMake(String make) {
        this.make = make;
    }

     In below way we are adding any validations inside setMake() method
    */

    public void setMake(String make) {
        if(make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> this.make = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public void descibeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (isConvertible ? "Convertible" : ""));
    }
}
