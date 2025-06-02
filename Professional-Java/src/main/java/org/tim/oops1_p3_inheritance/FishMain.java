package org.tim.oops1_p3_inheritance;

public class FishMain {

    public static void main(String[] args) {

        Fish fish = new Fish("goldfish", 0.25, 2, 3);
        Main.doAnimalStuff(fish, "fast");

        /**
         * output
         * goldfish makes some kind of noise
         * goldfish moves fast
         * muscles movingbackfin moving
         * Fish{gills=2, fins=3}Animal{type='goldfish', size='small', weight=0.25}
         */
    }
}
