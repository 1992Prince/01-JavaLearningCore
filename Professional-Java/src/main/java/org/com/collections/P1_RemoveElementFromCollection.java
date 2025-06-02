package org.com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P1_RemoveElementFromCollection {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        /**
         * Incorrect ways to remove items:
         *
         * 1) For loop ke andar remove karna (Banana skip ho jata hai):
         */
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");    // Apple Strawberry
            if ("Apple".equals(fruits.get(i))) {
                fruits.remove(i);  // Apple remove ho jayega, but Banana skip hoga
            }

        }

        System.out.println();
        System.out.println("----------------- Using Iterator --------------------");
        System.out.println();

        List<String> fruits2 = new ArrayList<String>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Strawberry");

        /**
         * correct ways to remove items:
         *
         * 1) using iterator
         */
        Iterator<String> fruitIterator = fruits2.iterator();
        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.print(fruit + " ");  // Apple Banana Strawberry
            if ("Apple".equals(fruit)) {
                fruitIterator.remove();  // Apple ko safely remove karenge
            }
        }

    }
}
