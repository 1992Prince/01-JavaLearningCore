package com.easybytes.sec26streamsapi.tim.p1streamsintro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P3_PrimtiveStreams {

    /**
     * ✅ What are Primitive Streams in Java?
     * Normally, Java streams work with objects like Integer, Double, etc.
     * But for performance reasons, Java provides special streams for primitives — to avoid boxing/unboxing.
     *
     * 🔹 There are 3 main primitive streams:
     *      Stream Type	     Works with
     *       IntStream	     int values
     *       LongStream	     long values
     *       DoubleStream	 double values
     *
     * ✅ Why use them?
     *      Avoids converting int to Integer, etc. (i.e., no boxing/unboxing).
     *      More efficient with large datasets.
     *      Comes with extra methods like sum(), average(), min(), max().
     */

    public static void main(String[] args) {

        int[] marks = {85, 92, 76, 88, 95};

        /**
         * Now we want to:
         *
         * ✅ Calculate sum
         * ✅ Find average
         * ✅ Filter marks > 90
         * ✅ Sort and print them
         *
         * Normally, if we use object stream (Stream<Integer>), we’d have to box/unbox which is less efficient.
         * But with Primitive Streams (IntStream), it’s clean and faster! 🏎️
         */

        /**
         * 🔥 Example 1: Sum of all marks
         * ✔️ Here Arrays.stream(marks) gives an IntStream, and sum() is a built-in method.
         */

        IntStream intStream = Arrays.stream(marks);
        int sum = intStream.sum();
        System.out.println("Sum of all marks: " + sum); // Sum of all marks: 436

        /**
         * We can also write above code as - Arrays.stream(marks).sum();
         */

        System.out.println();

        // 🔥 Example 2: Average marks
        double avg = Arrays.stream(marks)
                .average()
                .orElse(0.0); // in case array is empty
        System.out.println("Average marks: " + avg); // Average marks: 87.2

        System.out.println();

        // 🔥 Example 3: Filter marks greater than 90
        Arrays.stream(marks)
                .filter(mark -> mark > 90)
                .forEach(System.out::println);

        /**
         * 92
         * 95
         */

        System.out.println();

        // 🔥 Example 4: Sort and print marks
        Arrays.stream(marks)
                .sorted()
                .forEach(System.out::println);

        /**
         * 76
         * 85
         * 88
         * 92
         * 95
         */

        System.out.println();

        /**
         * Suppose u want to sort and print in reverse order means
         * Agar tu primitive array ya IntStream ko reverse order me sort and print karna chahta hai, toh thoda sa twist hai —
         * because IntStream ka sorted() method sirf ascending sort karta hai.
         *
         * Toh reverse karne ke liye hume box → sort → reverse → unbox (optional) ka jugad karna padta hai.
         */

        Arrays.stream(marks)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        /**
         * 95
         * 92
         * 88
         * 85
         * 76
         */

        System.out.println();
        System.out.println();

        /**
         * Lets learn
         *
         * 🔥 Breakdown:
         * Arrays.stream(arr) → gives IntStream
         * .boxed() → converts primitive int to wrapper Integer
         * .collect(Collectors.toList()) → final List
         */
        // ✅ 1. Convert int[] → List<Integer>
        int[] arr = {10, 20, 30, 40};

        List<Integer> list = Arrays.stream(arr)  // IntStream
                .boxed()                             // convert int → Integer
                .collect(Collectors.toList());       // collect into List

        System.out.println(list);  // [10, 20, 30, 40]

        System.out.println();

        //✅ 2. Convert List<Integer> → int[]
        /**
         * 🔥 Breakdown:
         * .mapToInt(Integer::intValue) → primitive conversion
         * .toArray() → gives int[]
         */
        List<Integer> list2 = List.of(10, 20, 30, 40);

        int[] arr2 = list2.stream()               // Stream<Integer>
                .mapToInt(Integer::intValue)       // convert Integer → int
                .toArray();                        // get int[]

        System.out.println(Arrays.toString(arr2));  // [10, 20, 30, 40]


    }


}
