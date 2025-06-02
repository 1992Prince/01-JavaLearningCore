package com.easybytes.sec10inheritance.p4_instanceOfPractice;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public void bite() {
        System.out.println("Biting...");
    }
}
