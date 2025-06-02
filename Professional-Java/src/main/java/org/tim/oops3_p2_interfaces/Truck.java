package org.tim.oops3_p2_interfaces;

public class Truck implements Trackable{

    public void track() {
        System.out.println(getClass().getSimpleName() + " 's coordinates recorded");
    }
}
