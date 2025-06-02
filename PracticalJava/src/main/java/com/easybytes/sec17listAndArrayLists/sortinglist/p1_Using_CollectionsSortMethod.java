package com.easybytes.sec17listAndArrayLists.sortinglist;

import java.util.ArrayList;
import java.util.Collections;

public class p1_Using_CollectionsSortMethod {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(47);
        numbers.add(43);
        numbers.add(67);
        numbers.add(92);
        numbers.add(3);
        numbers.add(-67);
        numbers.add(-2);
        numbers.add(0);

        System.out.println("Before Sorting: " + numbers); // Output: [47, 43, 67, 92, 3, -67, -2, 0]

        // Sorting in Ascending Order
        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers); // Output: [-67, -2, 0, 3, 43, 47, 67, 92]

        ArrayList<Integer> numbers2 = new ArrayList<>(numbers);

        // Sorting in Descending Order
        Collections.sort(numbers2, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers2); // Output: [92, 67, 47, 43, 3, 0, -2, -67]
        
    }
}
