package org.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P6_ArrayToStreams {

    public static void main(String[] args) {

        /*
====================================================================================================
🔰 Java Array Streams

👉 Purpose:
- `Arrays.stream()` and `Stream.of()` allow us to treat arrays like collections.
- Useful when we want to perform operations like filter, map, reduce, sort in a clean, chainable way.

----------------------------------------------------------------------------------------------------
1️⃣ Arrays.stream(array)
- Converts a primitive or object array into a Stream.

✅ Example with primitive array:
    int[] arr = {10, 20, 30};
    int sum = Arrays.stream(arr).sum(); // 60

✅ Example with object array:
    String[] names = {"Ram", "Shyam", "Mohan"};
    Arrays.stream(names).forEach(System.out::println);
*/


        int[] arr = {10, 20, 30, 9};

        /*
        ===========================================================================================
        🔹 Printing primitive array elements using Stream + forEach
        ===========================================================================================
        */
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));  // Output: 10 20 30 9
        System.out.println("\n");


        /*
        ===========================================================================================
        🔹 Filter even numbers and print them
        ===========================================================================================
        */
        Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.print(e + " "));  // Output: 10 20 30
        System.out.println("\n");


        /*
        ===========================================================================================
        🔹 Count of even numbers in array
        ===========================================================================================
        */
        long evenCount = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .count();
        System.out.println("Even numbers count - " + evenCount);  // Output: 3
        System.out.println();


        /*
        ===========================================================================================
        🔹 Filter even elements and store them in a new primitive int[] array
        ===========================================================================================
        */
        int[] evenArr = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .toArray();

        System.out.println("Filtered Even Array - " + Arrays.toString(evenArr));  // Output: [10, 20, 30]
        System.out.println();


        /*
        ===========================================================================================
        🔹 Convert to List<Integer> — Need to box primitive ints to Integer
           → Useful for List operations
           ✅ From Java 16+, .toList() can be used instead of collect(Collectors.toList())
        ===========================================================================================
        */
        List<Integer> evensList1 = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> evensList2 = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .boxed()
                .toList();  // Java 16+

        System.out.println("Even list1 - " + evensList1);  // Output: [10, 20, 30]
        System.out.println("Even list2 - " + evensList2);  // Output: [10, 20, 30]
        System.out.println();


        /*
        ===========================================================================================
        🔹 Map Operation: Multiply all elements by 2 and store in new array
        ===========================================================================================
        */
        int[] mapDouble = Arrays.stream(arr)
                .map(e -> e * 2)
                .toArray();

        System.out.println("Elements Doubled - " + Arrays.toString(mapDouble));  // Output: [20, 40, 60, 18]
        System.out.println();


        /*
        ===========================================================================================
        🔹 Aggregate Operations: sum(), average()
        ===========================================================================================
        */
        int sum = Arrays.stream(arr).sum();
        OptionalDouble avg = Arrays.stream(arr).average();

        System.out.println("Sum is - " + sum);                      // Output: 69
        System.out.println("Avg is - " + avg.getAsDouble());        // Output: 17.25

        /**
         * 🔸 Why boxed() is needed?
         * Primitive streams like IntStream don't support .collect(Collectors.toList()) directly.
         * So we use .boxed() to convert int → Integer.
         *
         * 🔸 When to use toList() vs collect()?
         * toList() is available from Java 16+, shorter syntax.
         * collect(Collectors.toList()) works in all versions.
         */



        /*
----------------------------------------------------------------------------------------------------
2️⃣ Stream.of(array)
- Also used to create a stream from an array.
- Works well with **object arrays**, NOT with primitive arrays (will treat as single element).

✅ Example:
    String[] cities = {"Delhi", "Mumbai"};
    Stream.of(cities).forEach(System.out::println);

⚠️ Warning:
    int[] nums = {1, 2, 3};
    Stream.of(nums).count(); // ⚠️ Gives 1 (whole array is treated as one element)

    ✅ Use Arrays.stream(nums) instead for primitives!

----------------------------------------------------------------------------------------------------
3️⃣ Stream from List (for comparison):
    List<String> list = Arrays.asList("A", "B", "C");
    list.stream().map(String::toLowerCase).forEach(System.out::println);

----------------------------------------------------------------------------------------------------
✅ Use Cases:
- Summing an array: `int sum = Arrays.stream(arr).sum();`
- Filtering values: `Arrays.stream(arr).filter(n -> n > 10)`
- Sorting: `Arrays.stream(arr).sorted()`
- Finding max/min: `Arrays.stream(arr).max().getAsInt();`
- Converting to List: `List<String> list = Arrays.stream(names).collect(Collectors.toList());`

====================================================================================================
*/
        System.out.println("\n");
        int[] arr2 = {1,2,3};
        /**
         * Below Stream.of() is considering primitive arr as single element and so
         * Arrays.toString() will print complete array
         * but only sout will print array object ref and not array elements
         * So its better to use Arrays.stream(arr) for primitives arr
         */
        Stream.of(arr2).forEach(e -> System.out.println(Arrays.toString(arr2))); // [1, 2, 3]
        Stream.of(arr2).forEach(e -> System.out.println(e)); // [I@2077d4de
        System.out.println();

        /**
         * But for Object arrays or Wrapper array, it prints elements
         */
        Integer[] arr3 = {1,2,3};
        Stream.of(arr3).forEach(e -> System.out.print(e + " ")); // 1 2 3

    }
}
