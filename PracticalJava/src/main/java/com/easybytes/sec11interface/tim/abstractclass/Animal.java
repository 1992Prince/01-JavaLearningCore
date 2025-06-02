package com.easybytes.sec11interface.tim.abstractclass;

public abstract class Animal {

    protected String type;
    private String size;
    private double weight;

    // abstract class can have constructors
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

    // abstract class can have concrete methods also and method is declared final so no subclass can override this method also
    public final String getExplicitType(){
        return getClass().getSimpleName() + " ( " + type + " ) ";
    }
}

/*
creating another abstract class that extends Animal abstract class
 */
abstract class Mammal extends Animal{

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

}
