package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P2_Arrays_asListDemo {

    public static void main(String[] args) {

        /*
         Section 1: Arrays.asList() - Fixed-size List
         The Arrays.asList() method creates a fixed-size List backed by the original array.
         Any changes made to the array will reflect in the List, and vice versa.
         However, you cannot add or remove elements from this List, as it is of fixed size.
         */
        String[] stringArray = {"foo", "bar", "baz"};
        List<String> fixedSizeList = Arrays.asList(stringArray);
        System.out.println("Fixed-size List: " + fixedSizeList); // Output: [foo, bar, baz]

        // Modifications in the array reflect in the List
        stringArray[1] = "modified";
        System.out.println("After modifying array: " + fixedSizeList); // Output: [foo, modified, baz]

        // Adding or removing elements throws UnsupportedOperationException
        try {
            fixedSizeList.add("newElement");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot add elements to a fixed-size List."); // Output: Cannot add elements to a fixed-size List.
        }

        /*
         Section 2: Creating a modifiable List
         To create a resizable List, pass the fixed-size List to the ArrayList constructor.
         */
        List<String> modifiableList = new ArrayList<>(Arrays.asList(stringArray));
        modifiableList.add("newElement");
        System.out.println("Modifiable List: " + modifiableList); // Output: [foo, modified, baz, newElement]

        /*
         Section 3: Using Java SE 7 Diamond Operator
         The Diamond Operator <> reduces verbosity when declaring generic types.
         */
        List<String> diamondList = new ArrayList<>(Arrays.asList(stringArray));
        diamondList.add("anotherElement");
        System.out.println("List with Diamond operator: " + diamondList); // Output: [foo, modified, baz, anotherElement]

        /*
         Section 4: Using ArrayList.addAll()
         The addAll() method can copy all elements from the fixed-size List into a new resizable List.
         */
        ArrayList<String> addAllList = new ArrayList<>();
        addAllList.addAll(Arrays.asList(stringArray));
        System.out.println("List using addAll(): " + addAllList); // Output: [foo, modified, baz]

        /*
         Section 5: Using Collections.addAll()
         Collections.addAll() is another way to copy elements into a resizable List.
         */
        ArrayList<String> collectionsList = new ArrayList<>();
        Collections.addAll(collectionsList, stringArray);
        System.out.println("List using Collections.addAll(): " + collectionsList); // Output: [foo, modified, baz]

        /*
         Section 6: Streams (Java SE 8)
         Use Streams to convert primitive arrays or object arrays to Lists.
         */
        int[] intArray = {1, 2, 3};
        List<Integer> intList = Arrays.stream(intArray) // Convert int[] to IntStream
                .boxed() // Convert primitive ints to Integers
                .collect(Collectors.toList());
        System.out.println("List from int[] using Streams: " + intList); // Output: [1, 2, 3]

        List<Object> stringStreamList = Arrays.stream(stringArray).collect(Collectors.toList());
        System.out.println("List from String array using Streams: " + stringStreamList); // Output: [foo, modified, baz]

        /*
         Section 7: Important Notes about Arrays.asList()

         Arrays.asList() creates a fixed-size List.
         For primitive arrays, it creates a List containing the entire array as a single element (not the individual elements).
         So we can't use asList() method to convert int[] array elements into ArrayList<Integer>
         */
        int[] primitiveArray = {1, 2, 3};
        List<int[]> wrongList = Arrays.asList(primitiveArray); // List contains one element: the entire array
        System.out.println("Primitive array as List<int[]>: " + wrongList); // Output: [[I@<hashcode>]
        System.out.println("Contains check (wrong): " + wrongList.contains(1)); // Output: false

        // Correct way: Use an Integer array for individual elements
        Integer[] integerArray = {1, 2, 3};
        List<Integer> correctList = Arrays.asList(integerArray);
        System.out.println("Correct List from Integer[]: " + correctList); // Output: [1, 2, 3]
        System.out.println("Contains check (correct): " + correctList.contains(1)); // Output: true

        /*
         Section 8: Directly Using Varargs in Arrays.asList()
         Varargs allow passing a variable number of arguments to a method.
         Arrays.asList(varargs) can directly create a List from individual elements.
         */
        List<Integer> varargsList = Arrays.asList(1, 2, 3);
        System.out.println("List from varargs: " + varargsList); // Output: [1, 2, 3]
        System.out.println("Contains check (varargs): " + varargsList.contains(1)); // Output: true
    }
}
