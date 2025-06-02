package com.easybytes.sec10inheritance.child.heroes;

import com.easybytes.sec10inheritance.base.Person;

public class CaptainAmerica extends Person {

    // below method is specific to IronMan only
    public void usePower(){
        System.out.println("CaptainAmerica using its power");
    }
}
