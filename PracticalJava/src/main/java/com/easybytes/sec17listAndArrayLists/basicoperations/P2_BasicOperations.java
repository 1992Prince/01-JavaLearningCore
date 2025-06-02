package com.easybytes.sec17listAndArrayLists.basicoperations;

import java.util.ArrayList;

public class P2_BasicOperations {

    public static void main(String[] args) {
        // Initialize an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial ArrayList: " + list);
        // Output: [Apple, Banana, Cherry]

        // add(int index, Object element)
        list.add(1, "Blueberry");
        System.out.println("After adding 'Blueberry' at index 1: " + list);
        // Output: [Apple, Blueberry, Banana, Cherry]

        // addAll(Collection C)
        ArrayList<String> newFruits = new ArrayList<>();
        newFruits.add("Mango");
        newFruits.add("Pineapple");
        list.addAll(newFruits);
        System.out.println("After adding new fruits: " + list);
        // Output: [Apple, Blueberry, Banana, Cherry, Mango, Pineapple]

        // addAll(int index, Collection C)
        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Orange");
        moreFruits.add("Grapes");
        list.addAll(2, moreFruits);
        System.out.println("After adding more fruits at index 2: " + list);
        // Output: [Apple, Blueberry, Orange, Grapes, Banana, Cherry, Mango, Pineapple]

        // clone()
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned ArrayList: " + clonedList);
        // Output: [Apple, Blueberry, Orange, Grapes, Banana, Cherry, Mango, Pineapple]

        // contains(Object o)
        boolean containsMango = list.contains("Mango");
        System.out.println("Does the list contain 'Mango'? " + containsMango);
        // Output: true

        // clear()
        ArrayList<String> tempList = new ArrayList<>(list);
        tempList.clear();
        System.out.println("After clearing tempList: " + tempList);
        // Output: []
    }
}
