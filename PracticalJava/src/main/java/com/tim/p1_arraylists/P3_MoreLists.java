package com.tim.p1_arraylists;

import java.util.ArrayList;
import java.util.List;

public class P3_MoreLists {

    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};

        /**
         * Factory methods - where you can call a static method on a class, and it returns new instance of something back to us.
         * Below we are calling static method on list call of() and that returns a list of String elements back to us.
         * And I will be assigning it to List variable.
         * Also note return type of below method is List, so we can assign it to List variable.
         * And we are passing array of String items to it.
         * return type of below method s not ArrayList
         */
        List<String> list = List.of(items);
        System.out.println("Factory Method list - " + list); // Factory Method list - [apples, bananas, milk, eggs]

        /**
         * Lets explore what kind of object we're getting back from factory method
         * We are using getName() method bcz it give more information
         * When to use getSimpleName() or getName()
         * getSimpleName() - returns name of class without package name
         * getName() - returns name of class with package name
         *
         * Below we are getting clas is ListN and it's a nested clss within immutable collection class and imp part is it is IMMUTABLE
         * If we try to add new element to it, it will throw UnsupportedOperationException
         */

        System.out.println("Factory Method list - " + list.getClass().getName()); // Factory Method list - java.util.ImmutableCollections$ListN

        // list.add("Yogurt"); // Exception in thread "main" java.lang.UnsupportedOperationException

        /**
         * If we can't add any element to this list then what is purpose of this factory method?
         * This method can be used in creation of an arraylist to make populating the array list a bit easier.
         *
         * The result of below instantiation is a new mutable array list, populated with elements from the immutable list I passed
         */

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println("ArrayList groceries - " + groceries); // ArrayList groceries - [apples, bananas, milk, eggs, Yogurt]

        System.out.println();

        /**
         * List.of() is a overloaded method and we can simplify above code and create a list with specfied elements in 1 statement
         * This time I am passing list of strings to static method on list
         *
         * This is one way to create and populate a small array list in one statement
         */

        ArrayList<String> nextList = new ArrayList<>(List.of("Pickles", "Mustard", "Cheese"));
        System.out.println("nextList - " + nextList); // nextList - [Pickles, Mustard, Cheese]

        System.out.println();

        /**
         * There is another method called addAll() wch takes list as argument.
         * Below we are adding everything in nextList to first list called groceries
         */
        // groceries.addAll(List.of("Pickles", "Mustard", "Cheese"));
        groceries.addAll(nextList);
        System.out.println("groceries - " + groceries); // groceries - [apples, bananas, milk, eggs, Yogurt, Pickles, Mustard, Cheese]

        /**
         * Here we learnt
         * Factory static overloaded method - List.of()
         * ArrayList method - addAll()
         * How to create and populate an array list in one statement
         */

    }
}
