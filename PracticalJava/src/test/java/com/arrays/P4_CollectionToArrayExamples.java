package com.arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P4_CollectionToArrayExamples {

    public static void main(String[] args) {

        /*
         Concept 1: Using Object[] toArray()
         - Returns an Object[] containing all the elements of the collection.
         - The resulting array is not type-safe, so you need to cast elements manually if required.
        */
        Set<String> colorSet = new HashSet<>();
        colorSet.add("red");
        colorSet.add("blue");

        Object[] objectArray = colorSet.toArray();
        System.out.println("Object[] from Set: " + java.util.Arrays.toString(objectArray));
        // Output: Object[] from Set: [red, blue]

        // Casting is required to use specific types
        for (Object obj : objectArray) {
            String color = (String) obj;
            System.out.println("Color: " + color); // Output: Color: red, Color: blue
        }


        /*
         Concept 2: Using <T> T[] toArray(T[] a)
         - Returns an array of the specified type containing all the elements of the collection.
         - If the input array size is smaller than the collection size, a new array of the same type is created.
         - If the input array size is equal to or greater than the collection size, the input array is used directly.
        */

        String[] stringArray = colorSet.toArray(new String[0]); // Recommended: new String[0]
        System.out.println("String[] from Set (new String[0]): " + java.util.Arrays.toString(stringArray));
        // Output: String[] from Set (new String[0]): [red, blue]


        /*
         Concept 3: Using Stream (Java SE 8+)
         - You can use Stream.toArray() to create an array from a collection.
         - This approach is concise and works seamlessly with Streams.
        */
        List<String> colorList = Stream.of("green", "yellow", "pink").collect(Collectors.toList());
        String[] streamArray = colorList.stream().toArray(String[]::new); // Stream.toArray with a generator
        System.out.println("String[] from Stream: " + java.util.Arrays.toString(streamArray));
        // Output: String[] from Stream: [green, yellow, pink]

        /*
         Summary of Methods:
         1. Object[] toArray(): Simple but not type-safe. Use cautiously when type information is critical.
         2. <T> T[] toArray(T[] a): Type-safe and widely used for generic collections.
         3. Stream.toArray(): Modern and concise, preferred when using Streams.
        */
    }
}
