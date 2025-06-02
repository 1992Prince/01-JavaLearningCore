package org.com.arrays.jdk8str;

import java.util.Arrays;

public class P7_WrapperArraysIteration {

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};

        // Traditional Approach: Using for loop
        System.out.println("Traditional For Loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Traditional Approach: Using for-each loop
        System.out.println("Traditional For-Each Loop:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Streams-Based Approach
        System.out.println("Streams-Based Approach:");
        Arrays.stream(numbers) // Create Stream<Integer>
                .forEach(System.out::println); // Process each element

    }
}
