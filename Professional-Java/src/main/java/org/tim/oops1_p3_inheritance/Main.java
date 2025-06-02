package org.tim.oops1_p3_inheritance;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        /**
         * output
         * Generic Animal makes some kind of noise
         * Generic Animal moves slow
         * Animal{type='Generic Animal', size='Huge', weight=400.0}
         */

        System.out.println();

        /**
         * Creating a Dog object
         * Below we are passing the Dog object as the doAnimalStuff method argument when the type was declared as Animal
         * Why this is ok?
         * It works because Dog inherits from Animal and it is a type of Animal
         * I can pass dog instance to any method that takes an animal as a parameter
         * Similarly we can pass other subclasses of Animal as well to doAnimalStuff method
         * This is called polymorphism
         * Polymorphism allows us to write code that can work with many types as long as they are in the same type hierarchy
         *
         * below we are calling Dog constructor that takes 3 params
         */
        Dog dog = new Dog("German Shepherd", "Big", 100);
        doAnimalStuff(dog, "fast");

        /**
         * output
         * WOOF WOOF!
         *
         * German Shepherd moves fast
         * Dog Running!
         * WOOF WOOF!
         *
         * Dog{earShape='null', tailShape='null'}Animal{type='German Shepherd', size='Big', weight=100.0}
         */

        System.out.println();

        // below we are calling Dog constructor that takes 2 params
        Dog poddle = new Dog("Poodle", 15);
        doAnimalStuff(poddle, "fast");

        /**
         * output
         * WOOF WOOF!
         *
         * Poodle moves fast
         * Dog Running!
         * WOOF WOOF!
         *
         * Dog{earShape='Perky', tailShape='Curled'}Animal{type='Poodle', size='medium', weight=15.0}
         */

        System.out.println();

        // below we are calling Dog constructor that takes 4 params
        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        /**
         * output
         * WOOF WOOF!
         *
         * Labrador Retriever moves slow
         * Dog walking!
         * Tail Wagging!
         *
         * Dog{earShape='Floppy', tailShape='Swimmer'}Animal{type='Labrador Retriever', size='large', weight=65.0}
         */

        /**
         * Key Learning Points:
         * 1. Child class objects can be passed to parent class references (e.g. doAnimalStuff accepts Dog objects through Animal reference)
         * 2. Multiple constructors can exist in a class (Dog class has multiple constructors)
         * 3. Dog constructor's first statement is super() to initialize parent class object first
         * 4. Constructor chaining is demonstrated inside Dog class
         * 5. Parent class methods can be accessed in child class using super keyword (super.toString(), super.move())
         * 6. Parent class methods can be overridden in child class
         * 7. Private methods can be called inside another method in Dog class
         * 8. Dog class specific methods are defined
         * 9. Private members/methods cannot be accessed in child class even using super keyword
         * 10. Protected members are accessible in child classes but not in other classes
         * 11. When parent and child have same methods/variables:
         *     - Use this to access child class members
         *     - Use super to access parent class members
         * 12. Method overriding rules:
         *     - Can override parent class public/protected methods
         *     - Cannot override private methods
         *     - Can override protected methods
         * 13. Cannot override parent class members (variables)
         * 14. Cannot override static methods (method hiding occurs instead)
         * 15. Data/Method hiding occurs when child class declares same variable/static method as parent
         * 16. Java handles method calls at runtime through dynamic method dispatch - no explicit type checking needed.
         *     This enables easy code extensibility through subclassing and method overriding. [Polymorphism]
         */

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println();
    }
}