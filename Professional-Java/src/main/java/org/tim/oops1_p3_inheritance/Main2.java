package org.tim.oops1_p3_inheritance;

public class Main2 {

    public static void main(String[] args) {

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        /**
         * output
         * WOOF WOOF!
         * Wolf moves slow
         * Dog walking!
         * Tail Wagging!
         *
         * Dog{earShape='Perky', tailShape='Curled'}Animal{type='Wolf', size='large', weight=40.0}
         */

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println();
    }
}
