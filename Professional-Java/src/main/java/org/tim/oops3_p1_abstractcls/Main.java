package org.tim.oops3_p1_abstractcls;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * We can't create obj of Abstract class
         * Animal obj = new Animal("Dog", "Big", 100);
         */
        Dog dog = new Dog("Wolf", "Big", 100);
        dog.makeNoise(); // Howling!

        System.out.println("-------------------------");

        /**
         * We can Dog everywhere where Animal is expected
         * Polymorphism at work #1: the type of object is resolved at runtime
         *
         *
         */
        Animal animal = new Dog("Wolf", "Big", 100);
        animal.makeNoise();  // Howling!

        System.out.println();

/**
 * I've said that you can't create an instance of Animal, because it's abstract.
 *
 * That's true, but that doesn't prevent us from using that type in methods,
 * declarations, and lists. In fact, this is what makes the code so flexible
 * and scalable.
 * The abstract class told the world that animals move and make
 * noise, so anyone can use an Animal class and call those methods on the object
 * that it gets at runtime.
 *
 * Regardless of what that object is, as long as it's an Animal, meaning it has
 * the Animal class in its hierarchy, this code will continue to work.
 *
 * This is abstraction, promoting polymorphism techniques through:
 * 1. Method overriding
 * 2. Runtime polymorphism
 * 3. Dynamic method dispatch
 */

// Calling doAnimalStuff() with Dog instance - Dog's overridden methods will be executed
        doAnimalStuff(dog);

        /**
         * Howling!
         * Dog (Wolf) walking
         */

        System.out.println();

        /**
         * Going back to the main method, what I want to show
         *
         * you now is how writing code using the more generic or abstract type saves you a lot of effort.
         *
         * Going back to the main method, what I want to show
         *
         * you now is how writing code using the more generic or abstract type saves you a lot of effort.
         *
         * This feature is not unique to an abstract class, it's just a benefit of inheritance in this case.
         */

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("Shepherd", "Big", 100));
        animals.add(new Fish("Goldfish", "Small", 0.25));

        for (Animal animal2: animals){
            doAnimalStuff(animal2);
            System.out.println();
        }

        /**
         * Howling!
         * Dog (Wolf) walking
         *
         * Woofing!
         * Dog (Shepherd) walking
         *
         * swish!
         * Fish (Goldfish) lazily swimming
         */

    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
