package madan.p2inheritance.p4downcasting;

public class Main2 {

    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.setName("BullDog");

        Animal cat = new Cat();
        cat.setName("micky meeni");

        AnimalUtility.performAction(dog);
        /*
        Animal is eating
        Dog is barking
         */
        AnimalUtility.performAction(cat);
        /*
        Animal is eating
        Cat is meowing
         */
    }

    /**
     * 📘 Notes: Polymorphism + Runtime Type Identification + Downcasting Safely
     *
     * ▶️ Scenario:
     *    - We are creating Animal references, but assigning Dog and Cat objects (i.e., Upcasting).
     *    - Then passing those references to a utility method (AnimalUtility.performAction)
     *    - Inside that method, we perform common as well as specific actions (like bark, meow).
     *
     * ▶️ Line: Animal dog = new Dog();
     *    - ✅ Upcasting: Dog object is assigned to Animal reference.
     *    - Only Animal-type methods can be called directly on `dog`.
     *
     * ▶️ Line: AnimalUtility.performAction(dog);
     *    - Here, `performAction` method will receive the reference of type Animal,
     *      but actual object will be Dog.
     *    - This is where **runtime polymorphism** and **instanceof check** are used.
     *
     * ▶️ Inside performAction Method:
     *
     *     public static void performAction(Animal animal) {
     *         animal.eat(); // ✅ Animal class method (inherited or overridden)
     *
     *         // Now we want to perform Dog or Cat specific action if possible
     *         if (animal instanceof Dog) {
     *             Dog dog = (Dog) animal;   // ✅ Safe downcasting
     *             dog.bark();
     *         } else if (animal instanceof Cat) {
     *             Cat cat = (Cat) animal;   // ✅ Safe downcasting
     *             cat.meow();
     *         }
     *     }
     *
     * 🔍 What is happening here?
     *   - `instanceof` checks object type at **runtime**, not compile time.
     *   - Then we do safe downcasting to access child-class-specific methods like `bark()` or `meow()`.
     *
     * 🚫 Without instanceof:
     *   - Direct downcasting can lead to `ClassCastException` if actual object is not of that type.
     *
     * ✅ Benefits of This Design:
     *   - We can write a **single reusable method** that works for all subclasses of Animal.
     *   - Common behavior + specialized behavior → clean separation.
     *   - Reduces duplicate code and increases maintainability (OOP best practice).
     *
     * 💡 OOP Principles Used:
     *   - Inheritance (Animal → Dog, Cat)
     *   - Polymorphism (Method accepts parent type)
     *   - Runtime Type Identification (`instanceof`)
     *   - Downcasting (after type check)
     *
     */

}
