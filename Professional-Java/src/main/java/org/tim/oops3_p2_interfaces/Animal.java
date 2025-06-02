package org.tim.oops3_p2_interfaces;

interface FlightEnabled{
    void takeOff();
    void land();
    void fly();
}

interface Trackable{
    void track();
}

public abstract class Animal {

    public abstract void move();
}
