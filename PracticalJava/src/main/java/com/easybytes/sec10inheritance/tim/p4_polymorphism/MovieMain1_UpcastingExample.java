package com.easybytes.sec10inheritance.tim.p4_polymorphism;

import static com.easybytes.sec10inheritance.tim.p4_polymorphism.MovieFactory.getMovie;

public class MovieMain1_UpcastingExample {

    public static void main(String[] args) {

        Movie theMovie = new Movie("The Avengers");
        theMovie.watchMovie();  // The Avengers is a Movie film

        // below is Upcasting example and we are doing explicit upcasting
        Movie adventureMovie = new Adventure("The Lord of the Rings");
        adventureMovie.watchMovie();

        /* output
        The Lord of the Rings is a Adventure film
        .. Pleasant Scene
        .. Scary Music
        .. Something Bad Happens
         */

        System.out.println();
        System.out.println();
        // calling utility method to get Movie class instance
        Movie movie = getMovie("Science", "Star Wars");
        movie.watchMovie();

        /* output
        Star Wars is a ScienceFiction film
        .. Bad Aliens do bad stuff
        .. Space Guys Chase Aliens
        .. Planet Blows Up

         */

        System.out.println();
        System.out.println();

        /*
        we don't have any implementation for Documentary subclass and so Movie class instance is returned
         */
        Movie movie2 = getMovie("Documentary", "Delhi Crimes");
        movie2.watchMovie(); // Delhi Crimes is a Movie film
    }
}
