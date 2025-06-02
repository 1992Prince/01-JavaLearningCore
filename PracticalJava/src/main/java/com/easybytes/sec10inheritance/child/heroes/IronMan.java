package com.easybytes.sec10inheritance.child.heroes;

import com.easybytes.sec10inheritance.base.Person;

public class IronMan extends Person {

    // below method is specific to IronMan only
    public void usePower(){
        System.out.println("Ironman using its power");
    }

    public static void main(String[] args) {

        // demo of accessing parent variables using child class obj
        IronMan ironMan = new IronMan();
        ironMan.name = "Tony";

    }
}
