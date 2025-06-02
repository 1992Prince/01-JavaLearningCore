package org.com.arrays.jdk8str;

import java.util.*;
import java.util.stream.Collectors;

public class P5_Problems {

    public static void main(String[] args) {

        /**
         * Problem 1: Convert int[] to ArrayList<Integer> or List<Integer>
         */
        System.out.println("=== Problem 1: Convert int[] to List/ArrayList<Integer> ===");
        int[] productPrices = {100, 200, 150, 300};

        // Using Streams API
        List<Integer> priceList = Arrays.stream(productPrices)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("List<Integer> (Streams): " + priceList);
        // Output: [100, 200, 150, 300]

        ArrayList<Integer> priceArrayList = Arrays.stream(productPrices)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("ArrayList<Integer> (Streams): " + priceArrayList);
        // Output: [100, 200, 150, 300]

        // Old Approach
        List<Integer> oldPriceList = new ArrayList<>();
        for (int price : productPrices) {
            oldPriceList.add(price);
        }
        System.out.println("List<Integer> (Old Approach): " + oldPriceList);
        // Output: [100, 200, 150, 300]

        System.out.println("\n");

        /**
         * Problem 2: Remove duplicates from int[] and store in new int[]
         */
        System.out.println("=== Problem 2: Remove Duplicates from int[] ===");
        int[] numbers = {1, 2, 3, 4, 5, 3, 2};

        // Using Streams API
        int[] uniqueNumbers = Arrays.stream(numbers)
                .distinct() // Removes duplicates
                .toArray();
        System.out.println("Unique Numbers (Streams): " + Arrays.toString(uniqueNumbers));
        // Output: [1, 2, 3, 4, 5]

        // Old Approach
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : numbers) {
            uniqueSet.add(num);
        }
        int[] uniqueNumbersOld = uniqueSet.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Unique Numbers (Old Approach): " + Arrays.toString(uniqueNumbersOld));
        // Output: [1, 2, 3, 4, 5]

        System.out.println("\n");

        /**
         * Problem 3: Remove duplicates, sort the array, and store in new int[]
         */
        System.out.println("=== Problem 3: Remove Duplicates and Sort int[] ===");

        // Using Streams API
        int[] sortedUniqueNumbers = Arrays.stream(numbers)
                .distinct() // Removes duplicates
                .sorted()   // Sorts the array
                .toArray();
        System.out.println("Sorted Unique Numbers (Streams): " + Arrays.toString(sortedUniqueNumbers));
        // Output: [1, 2, 3, 4, 5]

        // Old Approach
        Set<Integer> sortedSet = new TreeSet<>();
        for (int num : numbers) {
            sortedSet.add(num);
        }
        int[] sortedUniqueNumbersOld = sortedSet.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Sorted Unique Numbers (Old Approach): " + Arrays.toString(sortedUniqueNumbersOld));
        // Output: [1, 2, 3, 4, 5]
    }
}
