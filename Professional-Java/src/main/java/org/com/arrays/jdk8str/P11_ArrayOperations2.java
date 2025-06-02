package org.com.arrays.jdk8str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P11_ArrayOperations2 {

    public static void main(String[] args) {

        /*
        1 - Remove an element from an array
         Java doesn't provide a direct method in java.util.Arrays to remove an element from an array. To perform it, you
         can either copy the original array to a new one without the element to remove or convert your array to another
         structure allowing the removal.
         */
        String[] array = new String[]{"foo", "bar", "baz"};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.remove("foo");

        // Creates a new array with the same size as the list and copies the list elements to it.

        array = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array)); //[bar, baz]
        System.out.println();

        /*
        2 -  Comparing arrays for equality
         Array types inherit their equals() (and hashCode()) implementations from java.lang.Object, so equals() will only
         return true when comparing against the exact same array object. To compare arrays for equality based on their
         values,
         use java.util.Arrays.equals, which is overloaded for all array types.
         */

        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{1, 2, 3};
        System.out.println(a.equals(b));         //prints "false" because a and b refer to different objects
        System.out.println(Arrays.equals(a, b)); //prints "true" because the elements of a and b have the same values
        System.out.println();

        /*
         3 - Copying arrays
         */

        // for loop
        int[] a3 = { 4, 1, 3, 2 };
        int[] b3 = new int[a3.length];
        for (int i = 0; i < a3.length; i++) {
            b3[i] = a3[i];
        }
        System.out.println();

        //  Arrays.copyOf()
        int[] a4 = {4, 1, 3, 2};
        int[] b4 = Arrays.copyOf(a4, a4.length); // [4, 1, 3, 2



    }
}
