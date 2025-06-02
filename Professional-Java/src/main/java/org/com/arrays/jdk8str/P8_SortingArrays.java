package org.com.arrays.jdk8str;

import java.util.Arrays;

public class P8_SortingArrays {

    public static void main(String[] args) {

        /*
        sort int[]
         */

        int[] array = {7, 4, 2, 1, 19};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // prints [1, 2, 4, 7, 19]
        System.out.println();

        Arrays.stream(array).sorted().forEach(System.out::print); // 124719
        System.out.println();

        /*
        sort String[]
        When you sort an array of String using sort() method, it sorts array into natural order defined by
        Comparable interface, as shown below
         */

        String[] strings = {"a", "c", "b", "d"};
        System.out.println(Arrays.toString(strings));  // [a, c, b, d]
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));  // [a, b, c, d]
        System.out.println();

        String[] names = {"John", "Steve", "Shane", "Adam", "Ben"};
        System.out.println("String array before sorting : " + Arrays.toString(names));
        // String array before sorting : [John, Steve, Shane, Adam, Ben]
        Arrays.sort(names);
        System.out.println("String array after sorting in ascending order : " + Arrays.toString(names));
        // String array after sorting in ascending order : [Adam, Ben, John, Shane, Steve]
        System.out.println();

        // via streams
        Arrays.stream(names).sorted().forEach(System.out::println);

        /**
         * Adam
         * Ben
         * John
         * Shane
         * Steve
         */
    }
}
