package org.tim.oops2_p3_polymorphism;

public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    /*
    This is a method I'll be using to demonstrate polymorphism
    I'll be using it in the main method of the Main class
     */

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }


    /**
     * Factory method that creates and returns a Movie instance based on the movie type
     * @param type First letter determines the type of movie to create:
     *             'A' for Adventure
     *             'C' for Comedy
     *             'S' for ScienceFiction
     *             Any other letter returns base Movie class
     * @param title The title of the movie
     * @return A Movie object of the specified type
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

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something bad happens");
    }
}


class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Aliens are coming",
                "Run run run",
                "God saved us..Hurray...");
    }
}