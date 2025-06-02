package com.easybytes.sec10inheritance.tim.p4_polymorphism;

public class MovieMain3_TestingClassInstanceType {

    /*
    Here we will check the instance type of object returned from getMovie() method in MovieFactory class.
    After check only we will do downcasting to call watchAdventure() method.
    This will help us to ignore ClassCastException.

    This code shows ways to test for the runtime type of an object and perform downcasting accordingly.
     */
    public static void main(String[] args) {

        /*
        first way - obj.getClass().getSimpleName()
        We will create ref type of Object class and after downcasting we will call watchMovie() method.

        First check if return instance from getMovie() method is Adventure or Comedy and then call watchMovie() method

        See below we are downcasting directly from Object class type to Adventure class type
         */
        Object obj = MovieFactory.getMovie("Adventure", "Star Wars");

        if (obj.getClass().getSimpleName().equals("Adventure")) {
            Adventure adventure = (Adventure) obj;
            adventure.watchMovie();
        } else if (obj.getClass().getSimpleName().equals("Comedy")) {
            Comedy comedy = (Comedy) obj;
            comedy.watchMovie();
        }

        /* Output
        Star Wars is a Adventure film
        .. Pleasant Scene
        .. Scary Music
        .. Something Bad Happens
         */

        /*
        but above way of testing runtype is not good practice. So we will use instanceof operator
         */

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println();

        Object obj2 = MovieFactory.getMovie("Comedy", "Friends Series");

        if (obj2 instanceof Adventure) {
            Adventure adventure = (Adventure) obj2;
            adventure.watchMovie();
        } else if (obj2 instanceof Comedy comedy) { // latest jdk instanceOf way
            comedy.watchMovie();
        }

        /* output
        Friends Series is a Comedy film
        .. Something funny happens
        .. Something even funnier happens
        .. Happy Ending

         */
    }
}
