package com.easybytes.sec17listAndArrayLists.basicoperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P4_ArrayListAdvancedOperations {

    /*
    
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Grapes");

        // remove(int index) and remove(Object o)
        list.remove(0);
        System.out.println("After removing element at index 0: " + list);
        // Output: [Banana, Cherry, Grapes]

        list.remove("Grapes");
        System.out.println("After removing 'Grapes': " + list);
        // Output: [Banana, Cherry]

        // removeAll(Collection c)
        ArrayList<String> fruitsToRemove = new ArrayList<>();
        fruitsToRemove.add("Banana");
        list.removeAll(fruitsToRemove);
        System.out.println("After removing all specified fruits: " + list);
        // Output: [Cherry]

        // retainAll(Collection<?> c)
        list.add("Banana");
        list.add("Grapes");
        list.retainAll(Collections.singleton("Cherry"));
        System.out.println("After retaining 'Cherry': " + list);
        // Output: [Cherry]

        // Adding back elements for demonstration of pending methods
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        // subList(int fromIndex, int toIndex)
        List<String> subList = list.subList(0, 2);
        System.out.println("Sublist from index 0 to 2: " + subList);
        // Output: [Cherry, Apple]

        // trimToSize()
        list.trimToSize();
        System.out.println("After trimming to size: " + list);
        // Output: [Cherry, Apple, Banana, Grapes]
    }
}
