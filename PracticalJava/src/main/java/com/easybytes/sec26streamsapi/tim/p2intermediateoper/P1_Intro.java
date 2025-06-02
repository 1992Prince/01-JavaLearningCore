package com.easybytes.sec26streamsapi.tim.p2intermediateoper;

import java.util.List;
import java.util.stream.Collectors;

public class P1_Intro {

    /**
     * 💡 What are Intermediate Operations?
     * They transform or filter the stream.
     * They are lazy — they don’t run until a terminal operation (like forEach, collect, count, etc.) is called.
     *
     * 🔥 Let’s Cover:
     * distinct()
     * filter(Predicate)
     * map(Function) – transforming
     * skip(n)
     * limit(n)
     * takeWhile(Predicate)
     * dropWhile(Predicate)
     */

    /**
     * ✅ Intermediate Operations & Functional Interfaces Mapping
     * Stream Operation	   Functional Interface Accepted	Signature
     * filter()	           Predicate<T>	                      T -> boolean
     * map()	           Function<T, R>	                  T -> R
     * flatMap()	       Function<T, Stream<R>>	          T -> Stream<R>
     * distinct()	      — (uses equals() internally)	—
     * sorted()	          Comparator<T> (optional)	          (T, T) -> int
     * peek()	           Consumer<T>	                       T -> void
     * limit(n)	—	—
     * skip(n)	—	—
     * ✅ Note: Predicate, Function, Consumer are all part of java.util.function.
     * @param args
     */

    public static void main(String[] args) {

        // ✅ 1. distinct() – removes duplicates
        List<Integer> nums = List.of(1, 2, 2, 3, 4, 4, 5);

        List<Integer> list1 = nums.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("List1 - " + list1); // List1 - [1, 2, 3, 4, 5]

        List<String> names = List.of("Amit", "Amit", "Ravi", "Ravi", "Sita");
        List<String> list2 = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("List2 - " + list2); // List2 - [Amit, Ravi, Sita]

        // ✅ 2. filter() – select elements matching a condition
        List<Integer> evenList =nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());  // even numbers
        System.out.println("Even List - " + evenList);

        names.stream()
                .filter(ele -> ele.startsWith("R"))
                .forEach(System.out::print); // RaviRavi

        System.out.println();

        //✅ 3. map() – transform elements
        List<Integer> list3 = nums.stream()
                .map(n -> n * 10) // multiply each by 10
                .collect(Collectors.toList());
        System.out.println("List3 - " + list3); // List3 - [10, 20, 20, 30, 40, 40, 50]

        names.stream()
                .map(String::toUpperCase) // convert each string to UpperCase
                .forEach(System.out::print); // AMITAMITRAVIRAVISITA

        System.out.println();
        System.out.println();

        //✅ 4. skip(n) – skip first n elements
        System.out.println("Original List - " + nums); // Original List - [1, 2, 2, 3, 4, 4, 5]
        List<Integer> list4 = nums.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println("List4 - " + list4);  // List4 - [3, 4, 4, 5]

        //✅ 5. limit(n) – limit to first n elements
        List<Integer> list5 = nums.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("List5 - " + list5); // List5 - [1, 2, 2]



    }
}
