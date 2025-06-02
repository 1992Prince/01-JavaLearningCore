package com.easybytes.sec17listAndArrayLists.basicoperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class P1_ArrayListOperations {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 1. Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList after adding elements: " + list);
        // ArrayList after adding elements: [Apple, Banana, Cherry]

        // 2. Changing an element (Set element)
        list.set(1, "Blueberry");
        System.out.println("ArrayList after changing element at index 1: " + list);
        // ArrayList after changing element at index 1: [Apple, Blueberry, Cherry]

        // 3. Removing an element by value
        list.remove("Cherry");
        System.out.println("ArrayList after removing 'Cherry': " + list);
        // ArrayList after removing 'Cherry': [Apple, Blueberry]

        // 4. Removing an element by index
        list.remove(0);
        System.out.println("ArrayList after removing element at index 0: " + list);
        // ArrayList after removing element at index 0: [Blueberry]

        // 5. Iterating elements using for-each loop
        System.out.print("Iterating over ArrayList elements: ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        // Iterating over ArrayList elements: Blueberry

        // 6. Getting an element
        String element = list.get(0);
        System.out.println("Element at index 0: " + element);
        // Element at index 0: Blueberry

        // 7. Adding element in between two elements
        list.add(1, "Mango");
        System.out.println("ArrayList after adding 'Mango' at index 1: " + list);
        // ArrayList after adding 'Mango' at index 1: [Blueberry, Mango]

        // 8. Sorting elements
        Collections.sort(list);
        System.out.println("ArrayList after sorting: " + list);
        // ArrayList after sorting: [Blueberry, Mango]

        // 9. Getting the size of the ArrayList
        int size = list.size();
        System.out.println("Size of the ArrayList: " + size);
        // Size of the ArrayList: 2

        // 10. Iterating elements using an iterator
        Iterator<String> iterator = list.iterator();
        System.out.print("Iterating using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        // Iterating using iterator: Blueberry Mango
    }
}
