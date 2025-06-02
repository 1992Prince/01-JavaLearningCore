package com.easybytes.sec10inheritance.p2_upcasting;

public class AnimalUtility {

    /*
    In printName method eat() and getName() method is present in Super class and subclass to since sub class extends it
    Also sub class could have overriden it
     */
    public static void printName(Animal animal) {
        System.out.println(animal.getName());
        animal.eat();
    }

    /*
    But now this time I want to create a utility common method for all classes
    and subclasses can have some method wch is specific to them only and not available in parent class
     */

    /*
    Rule for instanceOf Operator use
    we can only use instanceOf operator with classes wch have inheritance relationship.

    I can't compare animal method with some String or anyother classes.
    U can use instanceOF operator where there is super class and sub class relationship. e.g.
    Below Animal is super class and Cat and Dog are sub classes
     */

    public static void performActiom(Animal animal){
        /*
        eat() method is present in super class and sub class so no need to check is animal obj is instance of Dog or Cat
         */
        animal.eat();

        /*
        animal is Dog type then call bark method and
        if animal is Cat type then call meow method

        Also from java 16 instanceOF new syntax is released
        below code I am goign to replace with new syntax i.e.

        else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;

            with

            else if (animal instanceof Cat cat) {
            cat.meow();

         */
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;  // if animal is instance of Dog then only do explicitly doing downcasting
            dog.bark();
        } else if (animal instanceof Cat cat) { // latest jdk way of doing downcasting
            cat.meow();
        }
    }
}
