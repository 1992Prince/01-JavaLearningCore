package com.easybytes.sec11interface.tim.interfaces;

public class Truck implements Trackable{

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " s coordinates recorded");
    }
}
