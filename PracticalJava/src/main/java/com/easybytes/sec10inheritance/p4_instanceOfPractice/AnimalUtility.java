package com.easybytes.sec10inheritance.p4_instanceOfPractice;

public class AnimalUtility {

    /*
    In this example, instanceof is used to determine the actual type of the animal object before casting it to Dog or Cat. This avoids the risk of a ClassCastException
     */
    public static void makeSpecificSound(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bite();  // Safe cast because we checked with instanceof
            dog.makeSound();
        } else if (animal instanceof Cat cat) {
            cat.makeSound();  // No special methods for Cat, just make sound
        } else {
            animal.makeSound();  // Default behavior for general Animal
        }
    }
}
