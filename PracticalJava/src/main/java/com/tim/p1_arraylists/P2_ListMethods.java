package com.tim.p1_arraylists;

import java.util.ArrayList;

record GroceryItem2(String name, String type, int count){

    public GroceryItem2(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }

}
public class P2_ListMethods {

    public static void main(String[] args) {

        // add() - add method of ArrayList adds element to end of List.

        ArrayList<GroceryItem2> objectList2 = new ArrayList<>();
        objectList2.add(new GroceryItem2("Butter"));
        objectList2.add(new GroceryItem2("Yogurt"));

        System.out.println(objectList2);
        // [1 BUTTER in DAIRY, 1 YOGURT in DAIRY]

        /**
         * Adding element at particular index
         * add(index, element) - adds element at particular index
         */
        objectList2.add(0, new GroceryItem2("Milk", "DAIRY", 1));
        System.out.println(objectList2);
        // [1 MILK in DAIRY, 1 BUTTER in DAIRY, 1 YOGURT in DAIRY]

        /**
         * ArrayList set method to replace an entry
         */
        objectList2.set(0, new GroceryItem2("Milk", "DAIRY", 3));
        System.out.println(objectList2); // [3 MILK in DAIRY, 1 BUTTER in DAIRY, 1 YOGURT in DAIRY]

        /**
         * Remove element for ArrayList
         * remove(index) - removes element at particular index
         * remove(element) - removes particular element
         */
        System.out.println();
        objectList2.remove(0);
        System.out.println(objectList2); // [1 BUTTER in DAIRY, 1 YOGURT in DAIRY]

        // removing element by particular element
        objectList2.remove(new GroceryItem2("Butter"));
        System.out.println(objectList2); // [1 YOGURT in DAIRY]

        /**
         * ArrayList methods learnt here are
         * add(), add(index), set(index), remove(index), remove(Element name)
         */



    }
}
