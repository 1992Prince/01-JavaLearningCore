package madan.p3polymorphism.overridingdemo;

public class Main {

    public static void main(String[] args) {
        Animal obj = new Dog(); // Upcasting - polymorphism
        obj.sound();            // Dynamic binding → Dog's sound() // Dog barks

        // Downcasting not required for overridden method
        // But to access Dog-specific methods, you need it
        System.out.println("\n--- Accessing super and this in subclass ---");
        Dog dog = new Dog();
        dog.showDetails();

        /**
         * --- Accessing super and this in subclass ---
         * Animal makes a sound
         * Dog barks
         * Child type: Dog
         * Parent type: Generic Animal
         * This is an Animal
         */

        /**
         * 📚 Concepts Covered:
         * | Concept                | Demonstrated In                         |
         * | ---------------------- | --------------------------------------- |
         * | ✅ Polymorphism         | `Animal obj = new Dog();`               |
         * | ✅ Method Overriding    | `sound()` method in `Dog`               |
         * | ✅ Dynamic Binding      | `obj.sound()` calls Dog’s version       |
         * | ✅ `super` for method   | `super.sound()` calls parent method     |
         * | ✅ `super` for variable | `super.type` accesses parent’s variable |
         * | ✅ `this` keyword       | `this.sound()` and `this.type`          |
         * | ✅ Inheritance          | `Dog extends Animal`                    |
         */
    }
}
