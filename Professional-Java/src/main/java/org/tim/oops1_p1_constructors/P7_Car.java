package org.tim.oops1_p1_constructors;

public class P7_Car {

    /*
    Demo of Constructor Chaining with this() keyword
    this() keyword must be the first statement in constructor
     */

    private String make;
    private String model;
    private int doors;
    private String color;
    private boolean isConvertible;

    /**
     * below we have added our own constructor and java will not add default constructor
     * constructors overloading
     */
    public P7_Car() {
        this("tesla", "ciaz", 4, "white", false);
    }

    public P7_Car(String make, String model, int doors, String color, boolean isConvertible) {
        System.out.println("Constructor with parameters called");
        this.setMake(make);
        this.model = model;
        this.doors = doors;
        this.color = color;
        this.isConvertible = isConvertible;
    }

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
