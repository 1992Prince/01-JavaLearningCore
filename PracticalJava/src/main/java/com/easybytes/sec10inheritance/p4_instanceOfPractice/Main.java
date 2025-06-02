package com.easybytes.sec10inheritance.p4_instanceOfPractice;

import static com.easybytes.sec10inheritance.p4_instanceOfPractice.AnimalUtility.makeSpecificSound;

public class Main {

    public static void main(String[] args) {

        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myAnimal = new Animal();

        makeSpecificSound(myDog);
        makeSpecificSound(myCat);
        makeSpecificSound(myAnimal);
    }
}
