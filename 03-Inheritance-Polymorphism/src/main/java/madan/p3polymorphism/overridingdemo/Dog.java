package madan.p3polymorphism.overridingdemo;

public class Dog extends Animal{

    String type = "Dog";

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void showDetails() {
        // Accessing overridden method from parent
        super.sound(); // Animal's sound()
        this.sound();  // Dog's sound()

        // Accessing variables
        System.out.println("Child type: " + this.type);    // Dog
        System.out.println("Parent type: " + super.type);  // Generic Animal

        // Accessing parent method
        super.info();
    }
}
