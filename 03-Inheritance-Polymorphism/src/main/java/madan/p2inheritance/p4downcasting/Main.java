package madan.p2inheritance.p4downcasting;

public class Main {

    public static void main(String[] args) {

        Animal anm;
        Dog dog = new Dog();

        anm = dog; // this is upcasting - assigning parent reference to child class object
        // but wth anm u can access only parent method or parent class overridden methods but not child class specific method

        // to access child class specific method we need to do downcasting
        Dog d = (Dog) anm; // here we are doing downcasting

        d.bark(); // Dog is barking

        // lets c how classCastException comes?
        //Cat cat = (Cat) anm; // here anm ref contains Dog object but we are casting it to Cat class ref and so it will give below exp


        /**
         * Exception in thread "main" java.lang.ClassCastException: class madan.p2inheritance.p4downcasting.Dog cannot be cast to class madan.p2inheritance.p4downcasting.Cat (madan.p2inheritance.p4downcasting.Dog and madan.p2inheritance.p4downcasting.Cat are in unnamed module of loader 'app')
         * 	at madan.p2inheritance.p4downcasting.Main.main(Main.java:19)
         */

        // To avoid ClassCastException use instanceof operator
        if(anm instanceof Cat){
            Cat cat = (Cat) anm;
        }else {
            System.out.println("anm can't be casted to Cat type"); // anm can't be casted to Cat type
        }
        /**
         * 📘 Notes: ClassCastException in Java (Upcasting & Downcasting)
         *
         * 🔹 Upcasting
         * - Assigning a child class object to a parent class reference.
         * - ✅ Safe and happens implicitly (no explicit cast needed).
         *
         *   Example:
         *       Animal anm;
         *       Dog dog = new Dog();
         *       anm = dog; // ✅ Upcasting - Safe
         *
         * - You can only access:
         *     ✔ Parent class methods
         *     ✔ Overridden methods
         *   ❌ Not child-specific methods (e.g., bark())
         *
         * 🔹 Downcasting
         * - Converting a parent class reference back to a child class type.
         * - ⚠️ Needs **explicit casting**, and it's **risky** if the actual object is not of that type.
         *
         *   Example:
         *       Dog d = (Dog) anm; // ✅ Valid downcasting (since anm holds a Dog object)
         *       d.bark(); // OK
         *
         * 🔻 ❗ ClassCastException
         * - Occurs when you try to cast an object into a class it's **not an instance of**.
         *
         *   Example:
         *       Cat cat = (Cat) anm; // ❌ anm holds a Dog object, not a Cat
         *       // Throws ClassCastException at runtime
         *
         *       Exception:
         *       java.lang.ClassCastException: class Dog cannot be cast to class Cat
         *
         * 🔒 How to Avoid ClassCastException?
         * - Always use `instanceof` operator before downcasting to check the actual type.
         *
         *   Example:
         *       if (anm instanceof Dog) {
         *           Dog d = (Dog) anm;
         *           d.bark();
         *       } else {
         *           System.out.println("Not a Dog instance");
         *       }
         *
         * ✅ Summary:
         * - Upcasting is always safe.
         * - Downcasting is **unsafe without checks** – it may throw ClassCastException at runtime.
         * - Always validate type using `instanceof` before downcasting to avoid exceptions.
         */

        /**
         * 📘 Notes Continued: Using `instanceof` to Avoid ClassCastException
         *
         * 🔹 Problem Recap:
         *   - ClassCastException aata hai jab aap kisi object ko galat type mein cast karte ho.
         *   - Jaise: Dog object ko Cat mein cast karna → ❌ Runtime crash.
         *
         * 🔹 `instanceof` Operator
         *   - Java keyword used to check whether an object **is an instance of a specific class or subclass**.
         *   - ✅ Returns true if object is of specified type (or subclass), else false.
         *
         * 🔹 Example:
         *
         *     Animal anm = new Dog(); // Upcasting
         *
         *     if (anm instanceof Cat) {
         *         Cat cat = (Cat) anm; // ✅ Downcasting only if object is actually a Cat
         *         cat.meow();
         *     } else {
         *         System.out.println("anm is not an instance of Cat");
         *     }
         *
         * 🔍 How this helps?
         *   - Prevents runtime error like:
         *     java.lang.ClassCastException: Dog cannot be cast to Cat
         *   - Ensures that downcasting is performed **only when the object is truly of that type**.
         *
         * ✅ Output:
         *   If anm is Dog:
         *     → `instanceof Cat` returns false → No cast is attempted → No crash.
         *
         * 🔹 Real-world analogy:
         *   - You don’t try to use a Dog as if it were a Cat unless you’ve checked if it’s actually a Cat 🐶 ≠ 🐱
         *
         * 🔐 Best Practice:
         *   Always use `instanceof` before downcasting if you are not 100% sure of the object type.
         *
         * 🔁 Summary:
         * - `instanceof` ensures type safety at runtime.
         * - Prevents ClassCastException by checking actual object type before casting.
         */


    }
}
