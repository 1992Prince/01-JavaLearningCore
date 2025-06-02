package com.easybytes.sec10inheritance.tim.p4_polymorphism;

import static com.easybytes.sec10inheritance.tim.p4_polymorphism.MovieFactory.getMovie;

public class MovieMain2_DowncastingExample {

    /*
    Upcasting happens automatically when we assign a subclass object to a superclass reference variable like we created getMovie() method in
    MovieFactory class. This method is doing upcasting automatically for us.
    This method can accept any subclass of Movie class and return Movie class instance or child class instance stored in Movie class reference

    Or we can do upcasting explicitly like e.g.  Movie theMovie = new Adventure("The Lord of the Rings");

    But Downcasting always needs explicit casting. We need to explicitly cast the superclass reference variable to the subclass type.

    Downcasting is the process of converting a superclass reference variable to a subclass type.
    Downcasting is the opposite of upcasting. We need to explicitly cast the superclass reference variable to the subclass type to perform
    downcasting.

    Downcasting can cause ClassCastException if the object being downcasted is not an instance of the subclass being downcasted to.
     */

    public static void main(String[] args) {


        /*
        Can we store getMovie() method return value in Object class reference variable?
        Yes, we can store the return value of  getMovie() method in Movie class reference variable, but Compiler will only
        be able to access Object class methods. We can not access any Movie class specific methods.

        WebDriver driver = new ChromeDriver();
        here also driver ref variable can access only WebDriver interface declared methods and not ChromeDriver class specific methods.


         */

        Object obj = getMovie("Dump", "Jack Reacher");
        // obj.watchMovie(); // we can't access watchMovie() method because Object class does not have watchMovie() method

        /*
        but if u want to access Movie class method  watchMovie() then u can downcast obj refe from Object type to Movie type and
        then access watchMovie() method
         */

        Movie movie = (Movie) obj; // downcasting happening
        movie.watchMovie();  // Jack Reacher is a Movie film

        /*
        Now Question
        WebDriver driver = new ChromeDriver(); // Here we do Upcasting to access all WebDriver interface methods declared in it using driver reference variable

        JavascriptExecutore js = (JavascriptExecutore) driver; // Y we do this? Here we want to access JavaScriptExecutor interface specific declared method
        using driver ref variable.

        If u want to access JavascriptExecutor methods like executeScript() then u need to downcast driver reference variable to
        JavascriptExecutor type. This is downcasting.
        WebDriver interface don't have executeScript() method. JavascriptExecutor interface has executeScript() method.

        IMP - Compiler will just look Reference type to fetch methods available in that class.
              Movie theMovie = new Adventure("Jack and jill");
              In above line compiler will only look at Movie class methods and not Adventure class methods.
              If any Movie class method is overridden in Adventure class then compiler will execute that overridden method at run time
              And if not overridden then compiler will execute Movie class method, if u call that method using ref variable.
         */

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println();

        // below is explicit upcasting example, create instance of Adventure subclass and storing it in Movie parent class reference
        Movie theMovie = new Adventure("The Lord of the Rings");

        // below we are doing explict downcasting i.e. converting superclass reference variable to subclass type
        Adventure  adventureMovie = (Adventure) theMovie;

        adventureMovie.watchMovie();

        /* output
        The Lord of the Rings is a Adventure film
        .. Pleasant Scene
        .. Scary Music
        .. Something Bad Happens
         */
        System.out.println();
        /*
        Downcasting can cause ClassCastException if the object being downcasted is not an instance of the subclass being downcasted to.

       1)  Movie anotherMovie = new ScienceFiction("Star Wars");

        In below line we are doing explicit downcasting of super class ref that holds ScienceFiction class instance and
        converting i.e. downcasting it into Adventure class reference type. This will throw ClassCastException

       2)  Adventure anotherAdventureMovie = (Adventure) anotherMovie; // Exception in thread "main" java.lang.ClassCastException:

       To overcome this ClassCastException we need to ensure that the object being downcasted is actually an instance of the subclass
       being downcasted to.
       We can use instanceof operator to check if the object is an instance of the subclass.
       Also we can use object.getClass().getSimpleName() to get the class name of the object
        */




    }
}
