package org.com.arrays.jdk8str;

import java.util.*;
import java.util.stream.Collectors;

public class P4_BoxedExample {

    /**
     * boxed() is useful when dealing with scenarios where primitive data (like int[], long[], double[]) needs to be
     * processed and stored in a collection of wrapper types (like List<Integer> or List<Double>).
     *
     */
    public static void main(String[] args) {


        int[] productPrices = {100, 200, 150, 300};

        // Convert int[] to List<Integer> for further processing
        List<Integer> priceList = Arrays.stream(productPrices)
                .boxed() // Convert IntStream to Stream<Integer>
                .collect(Collectors.toList());

        System.out.println("Product Prices as List<Integer>: " + priceList);
        // Output: Product Prices as List<Integer>: [100, 200, 150, 300]

        System.out.println();
        System.out.println();

        /*
        Above we are converting into List<Integer> but if u want ArrayList<Integer>
         */
        ArrayList<Integer> priceList2 = Arrays.stream(productPrices)
                .boxed() // Convert IntStream to Stream<Integer>
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Product Prices as ArrayList<Integer>: " + priceList2);
        // Product Prices as ArrayList<Integer>: [100, 200, 150, 300]

        // old approach
        List<Integer> oldPriceList = new ArrayList<>();
        for (int price : productPrices) {
            oldPriceList.add(price); // Manually add elements to the list
        }
        System.out.println("Product Prices (Old Approach): " + oldPriceList);

        System.out.println();
        System.out.println();

        // Convert int[] to Set<Integer>
        int[] numbers = {1, 2, 3, 4, 5, 3}; // Array with duplicate values
        Set<Integer> hashSet = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println("HashSet: " + hashSet);
        // Output: HashSet: [1, 2, 3, 4, 5] (removes duplicates)

        // old approach
        Set<Integer> oldHashSet = new HashSet<>();
        for (int num : numbers) {
            oldHashSet.add(num); // Add elements to HashSet manually
        }
        System.out.println("HashSet (Old Approach): " + oldHashSet);
        // Output: HashSet (Old Approach): [1, 2, 3, 4, 5]

        // Convert int[] to TreeSet<Integer> (Sorted Set)
        TreeSet<Integer> treeSet = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("TreeSet: " + treeSet);
        // Output: TreeSet: [1, 2, 3, 4, 5] (sorted and removes duplicates)
        
    }
}
