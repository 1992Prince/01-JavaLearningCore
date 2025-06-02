package com.tim.p1_arraylists;

import java.util.ArrayList;
import java.util.List;

public class P4_MoreLists {

    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");

        ArrayList<String> nextList = new ArrayList<>(List.of("Pickles", "Mustard", "Cheese"));

        groceries.addAll(nextList);
        System.out.println("groceries - " + groceries); // groceries - [apples, bananas, milk, eggs, Yogurt, Pickles, Mustard, Cheese]

        /**
         * ArrayList is indexbased, so we can get the 3rd item by 0,1,2,3
         * 0 - apples
         * 1 - bananas
         * 2 - milk
         * 3 - eggs
         */
        System.out.println("Grocery 4th item - " + groceries.get(3));  // Grocery 4th item - eggs

        /**
         * Check if ArrayList contains any particular element
         */
        if (groceries.contains("Mustard")) {
            System.out.println("List contains mustard");  // List contains mustard
        }

        /**
         * We can also use indexOf method or lastIndexOf() method. If either method finds the element it returns actual index pos
         * instead of returning boolean value.
         * And also it returns -1 if element was not found
         */

        groceries.add("Yogurt");
        System.out.println("First index of Yogurt - " + groceries.indexOf("Yogurt"));
        // First index of Yogurt - 4
        System.out.println("Last index of Yogurt - " + groceries.lastIndexOf("Yogurt"));
        // Last index of Yogurt - 8
        System.out.println("Last index of Yogurt - " + groceries.lastIndexOf("yogurt"));
        // Last index of Yogurt - -1

        System.out.println();

        /**
         * We can remove element by index or we can remove element by value
         * remove method will remove first occurrence of the element
         * So remove method will remove single element from list wch is first occurence
         */
        groceries.remove("Yogurt");
        System.out.println("Groceries - " + groceries); // Groceries - [apples, bananas, milk, eggs, Pickles, Mustard, Cheese, Yogurt]

        groceries.add("Yogurt");
        System.out.println("Groceries - " + groceries); // Groceries - [apples, bananas, milk, eggs, Pickles, Mustard, Cheese, Yogurt, Yogurt]
        System.out.println();

        /**
         * Since remove() method removes only one element from list but if u want to remove multiple elemment from list
         * then use removeAll() method
         * u can see all elements with name Yogurt is removed and apples element also it is removed
         *
         * removeAll() method takes collection as argument, so we can pass List.of() method to remove multiple elements
         */
        groceries.removeAll(List.of("Yogurt", "apples"));
        System.out.println("Groceries list new - " + groceries); // Groceries list new - [bananas, milk, eggs, Pickles, Mustard, Cheese]

        ArrayList<String> removeList = new ArrayList<>(List.of("milk", "eggs", "Cheese"));
        groceries.removeAll(removeList);
        System.out.println("Groceries list new - " + groceries); // Groceries list new - [bananas, Pickles, Mustard]

        /**
         * retainAll() is a method in the ArrayList class (part of java.util.List interface) that retains only the elements
         * present in a specified collection, removing all other elements from the list.
         */
        groceries.retainAll(List.of("bananas", "Pickles"));
        System.out.println("ArrayList after retainedLAdd - " + groceries); // ArrayList after retainedLAdd - [bananas, Pickles]

        System.out.println();

        /**
         * If you want to clear all elements from list then use clear() method
         */
        groceries.clear();
        System.out.println("Groceries list after clearing all its elements - " + groceries); // Groceries list after clearing all its elements - []

        /**
         * Get size of list
         * Empty list have 0 elements
         */
        System.out.println("Groceries list size - " + groceries.size()); // Groceries list size - 0

        /**
         * Check Groceries list is empty
         * isEmpty() method returns boolean value true if list is empty
         */
        System.out.println("Groceries isEmpty - " + groceries.isEmpty()); // Groceries isEmpty - true

        /**
         * Methods practiced in this code:
         * 1. List.of() - Create immutable list
         * 2. add() - Add single element
         * 3. addAll() - Add multiple elements from another collection
         * 4. get() - Get element by index
         * 5. contains() - Check if element exists
         * 6. indexOf() - Find first index of element
         * 7. lastIndexOf() - Find last index of element
         * 8. remove() - Remove single element
         * 9. removeAll() - Remove multiple elements
         * 10. retainAll() - Keep only specified elements
         * 11. clear() - Remove all elements
         * 12. size() - Get number of elements
         * 13. isEmpty() - Check if list is empty
         */


    }
}
