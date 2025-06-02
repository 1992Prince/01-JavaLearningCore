package org.tim.oops2_p3_polymorphism;

public class Main {

    public static void main(String[] args) {

        /**
         * Below runtime instance of movie variable is Movie class.
         */
        Movie movie = new Movie("The Matrix");
        movie.watchMovie();  // The Matrix is a Movie film

        System.out.println();

        /**
         * Lets create Adventure class instance
         * I don't have to change the type of the movie variable, It can stay as movie.
         * And this is because adventure is really a type of movie, a subclass.
         * And inheritance lets me say, adventure is a movie. This code compiles, and I can run it.
         *
         * Runtime Polymorphism[Here we are using Inheritance to support Polymorphism]:
         * - Variable 'adventure' is declared as Movie type (parent class)
         * - But actual object created is Adventure type (child class)
         * - This is possible due to inheritance relationship - Adventure extends Movie
         * - At runtime, JVM sees actual object type is Adventure
         * - So Adventure class's overridden watchMovie() method gets called
         * - This is called dynamic method dispatch or runtime polymorphism
         */
        Movie adventure = new Adventure("Star Wars");
        adventure.watchMovie();
        /**
         * Star Wars is a Adventure film
         * .. Pleasant Scene
         * .. Scary Music
         * .. Something bad happens
         */

        System.out.println();
    }
}
