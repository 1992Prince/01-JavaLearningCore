package org.list;

import java.util.*;

public class p12_SidAssigment {

    public static void main(String[] args) {

        // Write a Program to Remove Duplicates from an ArrayList:


        List<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        // here using LinkedHashSet bcoz it preserves insertion order while HashSet not
        Set<Integer> set = new LinkedHashSet<>(listWithDuplicates);

        List<Integer> listWithoutDuplicates = new ArrayList<>(set);
        System.out.println(listWithoutDuplicates); // [1, 2, 3, 4, 5]

        // This approach uses a Set to automatically handle duplicate elements since Set does not allow duplicates.


        // How to Reverse an ArrayList?
        // use Collections.reverse(list);
        // The Collections.reverse() method can reverse the order of elements in the ArrayList.
        Collections.reverse(listWithoutDuplicates);
        System.out.println(listWithoutDuplicates); // [5, 4, 3, 2, 1]

        System.out.println();

        // convert list to array - use list.toArray() method
        Integer[] arr = listWithoutDuplicates.toArray(new Integer[0]);
        System.out.println("Arr is - " + Arrays.toString(arr));


    }
}
