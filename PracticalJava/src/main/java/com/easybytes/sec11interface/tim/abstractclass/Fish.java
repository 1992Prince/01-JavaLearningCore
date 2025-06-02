package com.easybytes.sec11interface.tim.abstractclass;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")){
            System.out.println(getExplicitType() + " lazily swimming");
        } else {
            System.out.println(getExplicitType() + " darting frantically");
        }
    }


    /*
    Note - We should always use .equals() to compare strings, == operator checks if both strings reference are pointing to same memory loc or not
     */
    @Override
    public void makeNoise() {
        if (type == "Goldfish"){
            System.out.println("swish ");
        } else {
            System.out.println("splash ");
        }
    }
}
