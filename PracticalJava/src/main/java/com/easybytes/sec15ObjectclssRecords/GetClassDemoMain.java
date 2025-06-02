package com.easybytes.sec15ObjectclssRecords;

public class GetClassDemoMain {

    public static void main(String[] args) {

        // Create a new Person object
        Person person = new Person();
        // Get the runtime class object of the Person instance
        Class aClass = person.getClass();
        // getName(): Returns the fully qualified name of the class including package name
        System.out.println("aClass.getName() - " + aClass.getName()); // aClass.getName() - com.easybytes.sec15Objectclss.Person
        // getSimpleName(): Returns only the class name without the package name
        System.out.println("aClass.getSimpleName() - " + aClass.getSimpleName()); // aClass.getSimpleName() - Person
        // getPackageName(): Returns the package name of the class
        System.out.println("aClass.getPackageName() - " + aClass.getPackageName()); // aClass.getPackageName() - com.easybytes.sec15Objectclss
        // getSuperclass(): Returns the Class object representing the superclass of this class
        System.out.println("aClass.getSuperclass() - " + aClass.getSuperclass()); // aClass.getSuperclass() - class java.lang.Object
    }
}
