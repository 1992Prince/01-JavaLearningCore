package org.tim.oops2_p3_polymorphism;

public class Main2 {

    public static void main(String[] args) {

  // Creating a Movie object using the factory method getMovie()
  // "S" indicates we want a ScienceFiction movie type
  // "Krrish" is the title of the movie
  Movie movieObj = Movie.getMovie("S", "Krrish");

  // Calling watchMovie() method on the movie object
  // This will play the movie and show relevant scenes
  movieObj.watchMovie();

        /**
         * Krrish is a ScienceFiction film
         * .. Aliens are coming
         * .. Run run run
         * .. God saved us..Hurray...
         */
    }
}
