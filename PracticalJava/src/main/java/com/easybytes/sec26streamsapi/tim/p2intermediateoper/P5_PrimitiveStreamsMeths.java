package com.easybytes.sec26streamsapi.tim.p2intermediateoper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P5_PrimitiveStreamsMeths {

    /**
     * Java mein IntStream, DoubleStream, aur LongStream jaise primitive streams hote hain jo specifically int, double, aur long data types
     * ke saath kaam karte hain.
     * Ye streams normal Stream<T> se thodi different hain kyunki inka focus performance pe hota hai – autoboxing/unboxing ko avoid karte hain,
     * jo memory aur speed ke liye acha hai.
     * <p>
     * 🔹 1. IntStream, DoubleStream, LongStream – Kya Hai?
     * Java mein Stream API mein 3 Primitive Streams diye gaye hain — performance boost ke liye:
     * <p>
     * Primitive Stream	    Data Type	   Purpose / Real-time Example
     * IntStream        	  int	       Sum of marks, counting numbers, filtering even nums
     * DoubleStream	          double	   Salary average, bank interest, float values
     * LongStream	          long	       Timestamps, IDs, large integer processing
     * <p>
     * ✅ Ye streams boxing-unboxing se bachate hain → memory + performance optimized
     * 👉 Ye primitive type stream hain, jo boxing se bachate hain:
     * <p>
     * IntStream → int values (e.g., marks, ages)
     * DoubleStream → double values (e.g., salary, GPA)
     * LongStream → long values (e.g., timestamps, large IDs)
     */

    public static void main(String[] args) {

        // 1. IntStream - Ye int values ke liye stream hai. Iska use numbers ke sequence ya operations ke liye hota hai.

        // Real-time example: 1 se 10 tak numbers print karo
        IntStream.range(1, 5)
                .forEach(System.out::println);

        // 2. DoubleStream - Ye double values ke liye hota hai, jab decimal numbers pe kaam karna ho.

        // 3. LongStream - Ye long values ke liye hai, jab bade integers pe kaam karna ho.


        /**
         * 🔷 1. mapToInt() — Object Stream → Primitive IntStream
         * 🧠 Use when:
         * Tumhare paas boxed data (Stream<Integer>, Stream<String>) hai aur tum chahte ho numeric processing (sum, avg, etc.)
         */
        List<Integer> list = List.of(10, 20, 30);

        // Convert to IntStream and sum
        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        List<String> list2 = List.of("1", "2", "3");

        int total = list2.stream()
                .mapToInt(Integer::parseInt) // String to int
                .sum();


        /***
         * 🔷 2. mapToObj() — Primitive Stream → Object Stream
         * 🧠 Use when:
         * Tumhare paas primitive stream hai (e.g., IntStream) aur tum use Objects me convert karna chahte ho (e.g., String, Integer, custom class)
         */

        //✅ Example 1: IntStream to List<String>
        List<String> result = IntStream.range(1, 4)
                .mapToObj(i -> "Item-" + i)
                .collect(Collectors.toList());

        System.out.println(result); // [Item-1, Item-2, Item-3]

        // ✅ Example 2: chars() → Char → String

        String input = "abc123";

        List<String> letters = input.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> String.valueOf((char)c)) // String.valueOf(c) will give [97, 98, 99] so we need to convert ASCII code to char again using String.valueOf((char)c)
                .collect(Collectors.toList());

        System.out.println(letters); // [a, b, c]

        System.out.println();

        /**
         * 🔷 3. boxed() — Primitive Stream → Boxed Object Stream
         * 🧠 Use when:
         * Tumhare paas primitive stream (like IntStream) hai aur tum chahte ho usko boxed stream me convert karna (like Stream<Integer>) —
         * mostly jab Collectors use karne ho.
         */

        List<Integer> list3 = IntStream.range(1, 5)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(list3); // [1, 2, 3, 4]

        // ✅ Example 2: Square and collect even numbers

        List<Integer> evenSquares = IntStream.range(1, 10)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(evenSquares); // [4, 16, 36, 64]

        System.out.println();
        System.out.println();

        /**
         * Convert List<Integer> to int[] using streams
         */

        List<Integer> list4 = List.of(10,20,30);
        // Convert List<Integer> to int[]
        int[] arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(arr)); // [10, 20, 30]

        System.out.println();

        /**
         * vice-versa of above
         * 🔁 2. int[] → List<Integer>
         * ✅ Using IntStream.of() + boxed():
         */

        int[] arr2 = {10, 20, 30};
        List<Integer> list5 = Arrays.stream(arr2)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list5);     // [10, 20, 30]






    }
}
