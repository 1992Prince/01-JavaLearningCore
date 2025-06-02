package org.tim.oops2_p3_polymorphism;

public class Main3 {

    public static void main(String[] args) {
        /**
         * demo of instanceOf operator
         * with Object class we can't access watchMovie method and we are storing our runtime obj inside Object class ref
         * and if it is Comedy then we are typecasting it ie. downCasting to access watchMovie method
         *
         * Our purpose was to use factory method to get class obj and access watchMovie method
         */

        Object unknownObj = Movie.getMovie("C", "Airplane");
        if(unknownObj.getClass().getSimpleName().equals("Comedy")){
           Comedy comedy = (Comedy) unknownObj;
           comedy.watchMovie();
        }

        /**
         * Airplane is a Comedy film
         * .. Something funny happens
         * .. Something even funnier happens
         * .. Happy Ending
         */

        /**
         * Above way is fine to test the runtime type but it is not best way
         * below is better way using instanceOf Operator
         */

        System.out.println();
        Object unknownObj2 = Movie.getMovie("S", "Alibaba");
        if(unknownObj2 instanceof ScienceFiction){
            ScienceFiction scienceFictionObj = (ScienceFiction) unknownObj2;
            scienceFictionObj.watchMovie();
        }

        /**
         * Alibaba is a ScienceFiction film
         * .. Aliens are coming
         * .. Run run run
         * .. God saved us..Hurray...
         */

    }

}
