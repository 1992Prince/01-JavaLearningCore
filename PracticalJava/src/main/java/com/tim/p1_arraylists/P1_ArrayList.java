package com.tim.p1_arraylists;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){

    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

}
public class P1_ArrayList {

    public static void main(String[] args) {


        Object[] grocerArray = new Object[3];
        grocerArray[0] = new GroceryItem("Milk");
        // below we are calling record deault implicit constructor
        grocerArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        grocerArray[2] = "5 Oranges";
        System.out.println(Arrays.toString(grocerArray));

        /**
         * Above we are creating array of Object class type and so we are able to keep any type of instances in groceryArray
         * output - [GroceryItem[name=Milk, type=DAIRY, count=1], GroceryItem[name=apples, type=PRODUCE, count=6], 5 Oranges]
         *
         * But if we created groceryArray of GroceryItem type then we can only keep GroceryItem instances in it and
         * line no 21 will throw Compile Time error
         *
         */

        GroceryItem[] grocerArray2 = new GroceryItem[3];
        grocerArray2[0] = new GroceryItem("Milk");
        // below we are calling record deault implicit constructor
        grocerArray2[1] = new GroceryItem("apples", "PRODUCE", 6);
        // grocerArray2[2] = "5 Oranges"; // compile Time error
        grocerArray2[2] = new GroceryItem("Oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(grocerArray2));

        // [GroceryItem[name=Milk, type=DAIRY, count=1], GroceryItem[name=apples, type=PRODUCE, count=6], GroceryItem[name=Oranges, type=PRODUCE, count=5]]

        /**
         * So above we learnt that array of Object class type can hold any type of instances in it.
         * Since Object class is parent of all classes
         * But array of Specific type will let u hold only that type of instances in it.
         * So if we created array of GroceryItem type then we can only keep GroceryItem instances in it and
         */

        System.out.println();
        System.out.println();

        /**
         * If u hover over ArrayList - u will get warning - Raw use of parameterized class 'ArrayList'
         * Means If I don't specify any type with an ArrayList, it's going to use the object class by default.
         * This is called raw use of a type.
         * And we can add any type of instances in this ArrayList
         *
         * Doing things this way is generally not what we want to do.
         *
         * When you declare an array list, you probably know what data you want in that list.
         */
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        System.out.println();
        System.out.println();

        /**
         * We can create ArrayList of specific type by passing that type as a parameter to ArrayList
         * So below we are creating ArrayList of GroceryItem type and so we can only keep GroceryItem instances in it
         */
        ArrayList<GroceryItem> objectList2 = new ArrayList<>();
        objectList2.add(new GroceryItem("Butter"));
        objectList2.add(new GroceryItem("Yogurt"));
        objectList2.add(new GroceryItem("Milk", "DAIRY", 1));
        objectList2.add(new GroceryItem("apples", "PRODUCE", 6));
        // objectList2.add("Yogurt"); // Compile Time Error

        System.out.println(objectList2);

        // [GroceryItem[name=Butter, type=DAIRY, count=1], GroceryItem[name=Yogurt, type=DAIRY, count=1], GroceryItem[name=Milk, type=DAIRY, count=1], GroceryItem[name=apples, type=PRODUCE, count=6]]

        /**
         * add method of ArrayList adds element to end of List.
         */
    }
}
