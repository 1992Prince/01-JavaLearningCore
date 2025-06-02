package com.easybytes.sec10inheritance.tim.p4_polymorphism;

public class MovieFactory {

    /*
    getMovie method takes two parameters:
    1. type - a single character representing the type of movie
    2. title - the title of the movie
    The method returns a new instance of the appropriate Movie subclass based on the type parameter.
     */
    public static Movie getMovie(String type, String title) {

        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}
