package com.easybytes.sec10inheritance.base;

/*
below we are defining a class called Person with 2 fields and these 2 fields are declared protected
Bcoz I want only child classes of Person should be able to access these 2 fields and not all other classes can access them
 */
public class Person {

    protected String name;
    protected int age;

    public void eat(String food){
        System.out.println("Person is eating " + food);
    }

    public void walk() {
        System.out.println("Person is walking");
    }

    public void sleep() {
        System.out.println("Person is sleeping");
    }

    /*
   if below method is declared as private then it will not be accessible to child classes.

   if u declare below method as default then it will be accessible to child classes in same package only.
   IronMan child class is in diff package and so it will not be able to access this method
    */
    void calculateAge() {
        System.out.println("Age method");
    }

    /*
    below method will be accessible to child classes only. and child classes can be in any package
     */
    protected void calculateOverallAge() {
        System.out.println("Overall Age method");
    }

    /*
    if we declare below method as protected then it will be accessible to child classes only.
     */
    private void calculateAge(int age){
        System.out.println("Age method");
    }
}
