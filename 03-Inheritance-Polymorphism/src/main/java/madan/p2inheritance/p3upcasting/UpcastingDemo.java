package madan.p2inheritance.p3upcasting;

public class UpcastingDemo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setName("Scobby");
        System.out.println(animal.getName()); // Scobby
        AnimalUtility.printName(animal);     // Scobby

        System.out.println();

        // Upcsting example
        Animal dog = new Dog();
        dog.setName("Charlie");
        System.out.println(dog.getName()); // Charlie
        AnimalUtility.printName(dog);      // Charlie
        dog.eat(); // Animal is eating
        dog.sleep(); // Dog is sleeping //here sleep overriden method in Dog class will be called
        // animal1.bark(); // this is will throw compile time exception - with animal1 u can only access parent class method and not child class

        /**
         * 🔸 Why AnimalUtility class was created?
         * - To demonstrate code reusability and generalization using Upcasting.
         * - The `printName(Animal animal)` method in AnimalUtility can accept any object
         *   that is a subclass of Animal — like Dog, Cat, etc.
         *
         * 🔸 How is `printName()` working for both Animal and Dog objects?
         * - Because both are passed as Animal references (even Dog is upcasted to Animal),
         *   and `getName()` is a method defined in Animal, it can be called safely.
         *
         * 🔸 What do we call this?
         * - This is an example of **Upcasting**.
         * - Also demonstrates **Polymorphism**, where one method works for multiple object types.
         *
         * 🔸 Benefits:
         * - Enables code reuse by handling multiple types using a single method.
         * - Reduces code duplication.
         * - Follows OOP principle of **programming to an interface (or supertype)**.
         * - Makes code flexible and easily extendable.
         */

        System.out.println();

        Cat cat = new Cat();
        cat.setName("Snoopy");
        AnimalUtility.printName(cat); // Snoopy

        /*
        Aboue for Cat we are not creating ref of Animal class then how AnimalUtility printName is priting Snoopy?
        ❓ Why this works?
            Kyuki Cat is a subclass of Animal:
            Aur printName() method ka signature kya hai? - Animal
            Toh jab tu cat object ko printName() method mein pass karta hai: - AnimalUtility.printName(cat);

            Java automatically upcast kar deta hai: Animal animal = cat; // ✅ Upcasting ho gaya silently

            Yeh allowed hai, kyunki Cat is-a Animal
         */
    }
}
