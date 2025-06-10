package org.tim.sec7constructors2;

// ✅ 5. Constructor in Inheritance – When We Don't Call super() Explicitly
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}
public class P5_Dog extends Animal {

    P5_Dog() {
        System.out.println("Dog constructor");
    }

    public static void main(String[] args) {
        P5_Dog d = new P5_Dog();

        /**
         * Animal constructor
         * Dog constructor
         *
         * Explanation: Since Animal() is a no-arg constructor, Java automatically adds super() in Dog() constructor.
         */
    }
}
