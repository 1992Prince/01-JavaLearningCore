package com.easybytes.sec12arrays.easybytes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P3_ConvertArray {

    public static void main(String[] args) {

        // ✅ 1. Convert Array to String
        // 🧠 Note: This is mainly for debugging or logging. It gives a readable string representation of the array.
        int[] numbers = {1, 2, 3, 4};

        String arrayAsString = Arrays.toString(numbers);
        System.out.println(arrayAsString); // Output: [1, 2, 3, 4]

        System.out.println();

        // ✅ 2. Convert Array to List
        // a) Using Arrays.asList(array) – fixed-size list
        // ⚠️ Limitation: Arrays.asList() returns a fixed-size list backed by the array. You can't add/remove elements.
        // but u can modify it or update it and backed array will also be updated

        String[] fruits = {"apple", "banana", "cherry"};

        System.out.println("Before Modification - " + Arrays.toString(fruits)); // Before Modification - [apple, banana, cherry]

        List<String> fruitList = Arrays.asList(fruits);

        // fruitList.add("orange"); // Throws UnsupportedOperationException
        fruitList.set(1, "grapes"); // Allowed (modifies the backing array)

        System.out.println(fruitList);                 // Output: [apple, grapes, cherry]
        System.out.println("After Modification - " + Arrays.toString(fruits)); // After Modification - [apple, grapes, cherry]

        System.out.println();

        // b) To get a modifiable list:
        // ✅ Use Case: When you need dynamic operations like add(), remove().

        String[] colors = {"red", "blue", "green"};

        // Wrap with new ArrayList to make it modifiable
        List<String> modifiableList = new ArrayList<>(Arrays.asList(colors));
        modifiableList.add("yellow"); // ✅ Now this works

        System.out.println(modifiableList);                                 // Output: [red, blue, green, yellow]
        System.out.println("Colors Array - " + Arrays.toString(colors));    // Colors Array - [red, blue, green]


        System.out.println();
        System.out.println();

        // ✅ 3. Convert Array to Stream
        // For object arrays (e.g., String[], Integer[]):

        String[] animals = {"dog", "cat", "cow"};

        Stream<String> stream = Arrays.stream(animals);
        stream.forEach(System.out::print); // dogcatcow

        System.out.println();
        System.out.println();


        // For primitive arrays:
        int[] nums = {10, 20, 30};
        IntStream numsSream = Arrays.stream(nums);
        int[] numsSqr = numsSream
                .map(num -> num * 2)
                .toArray();

        System.out.println("Nums Square - " + Arrays.toString(numsSqr)); // Nums Square - [20, 40, 60]
    }
}
