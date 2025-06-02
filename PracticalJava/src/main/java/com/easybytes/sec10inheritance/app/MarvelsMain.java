package com.easybytes.sec10inheritance.app;

import com.easybytes.sec10inheritance.child.heroes.IronMan;

public class MarvelsMain {

    public static void main(String[] args) {

        // creating object of child classes

        /*
        With IronMan obj we can access all parent class public methods

        Also with ironMan obj we can't access Parent class variables bcoz we have created ironMan obj in diff
        package and class wch is not extending Person class i.e. here
        MarvelsMain class is not extending Person class and so Person class variables are not accessible
        even if u try to create obj of Person child class

        But if u create IronMan obj in same package and same class where Person class is extending then u can access all parent class variables
        Like if u r creating IronMan obj in IronMan class then u can access all Person class variables

         */
        IronMan ironMan = new IronMan();
        /*
        calling parents class methods  using child class object
         */
        ironMan.eat("Fuel");
        ironMan.walk();
        ironMan.sleep();

        // calling IronMan specific class method
        ironMan.usePower();

        /*
        below code will throw compilation error bcoz u can't access parent class calculateAge method since it is declared default and
        accessible only in same package.

        Person parent class and its child class IronMan are in diff package, so with child class obj we can't access this method

        But

        if Parent class and child class are in same package then we can access this method with child class obj i.e. itonMan
         */
        /*
        ironMan.calculateAge();
        ironMan.calculateAge(10);
         */

        /*
        When you try to access the protected method from a class that is neither in the same package as the superclass nor a subclass,
        it leads to a compile-time error.
        If this main class is present in base package or heroes package then below method will be accessible

        ironMan.calculateOverallAge();
         */


    }
}
