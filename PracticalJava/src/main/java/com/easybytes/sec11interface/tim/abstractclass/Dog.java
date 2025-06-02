package com.easybytes.sec11interface.tim.abstractclass;

public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")){
            System.out.println(getExplicitType() + " is walking");
        } else {
            System.out.println(getExplicitType() + " is running");
        }
    }


    /*
    Note - We should always use .equals() to compare strings, == operator checks if both strings reference are pointing to same memory loc or not
     */
    @Override
    public void makeNoise() {
        if (type == "Wolf"){
            System.out.println("Howling! ");
        } else {
            System.out.println("Woof! ");
        }
    }
}
