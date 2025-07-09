package org.set;

import java.util.*;

public class P1_HashSetMethodsDemo {

    public static void main(String[] args) {

        // ✅ 1. Create a HashSet
        Set<String> fruits = new HashSet<>();

        // ✅ 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana"); // Duplicate, won't be added

        // ✅ 3. Print HashSet
        System.out.println("Fruits Set: " + fruits); // Unordered, no duplicates
        // Fruits Set: [Apple, Mango, Orange, Banana]

        // ✅ 4. Check if an element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango")); // Contains Mango? true
        System.out.println("Contains Papaya? " + fruits.contains("Papaya")); // Contains Papaya? false

        // ✅ 5. Remove element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits); // After removing Orange: [Apple, Mango, Banana]

        // ✅ 6. Size
        System.out.println("Size of set: " + fruits.size()); // Size of set: 3

        // ✅ 7. isEmpty
        System.out.println("Is set empty? " + fruits.isEmpty()); // s set empty? false

        // ✅ 8. Iterate (using for-each)
        System.out.println("Iterating using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        /**
         * Iterating using for-each:
         * Apple
         * Mango
         * Banana
         */

        // ✅ 9. Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        /**
         * Iterating using Iterator:
         * Apple
         * Mango
         * Banana
         */

        // ✅ 10. Clear all elements
        fruits.clear();
        System.out.println("After clear(): " + fruits); // After clear(): []
        System.out.println("Is set empty now? " + fruits.isEmpty()); // Is set empty now? true

        // ✅ 11. AddAll from another collection
        Set<String> moreFruits = new HashSet<>(List.of("Guava", "Pineapple", "Litchi"));
        fruits.addAll(moreFruits);
        System.out.println("After addAll: " + fruits); // After addAll: [Guava, Litchi, Pineapple]

        // ✅ 12. Retain common elements
        Set<String> tropical = new HashSet<>(List.of("Litchi", "Banana", "Coconut"));
        fruits.retainAll(tropical);
        System.out.println("After retainAll (intersection): " + fruits); // After retainAll (intersection): [Litchi]

        // ✅ 13. RemoveAll (difference)
        fruits.removeAll(tropical);
        System.out.println("After removeAll: " + fruits); // After removeAll: []

        System.out.println();

        // ✅ Example: Convert ArrayList with duplicates to unique list using HashSet
        // ✅ 1. Original ArrayList with duplicates
        List<String> names = new ArrayList<>(
                Arrays.asList("Arun", "Brijesh", "apple", "Brijesh", "pikachu", "apple", "Pathak", "Sunita", "Mutthu")
        );

        System.out.println("Original List (with duplicates):");
        System.out.println(names);
        // [Arun, Brijesh, apple, Brijesh, pikachu, apple, Pathak, Sunita, Mutthu]

        // ✅ 2. Convert to HashSet to remove duplicates
        Set<String> uniqueSet = new HashSet<>(names);

        System.out.println("\nUnique elements (HashSet):");
        System.out.println(uniqueSet);
        // [apple, Brijesh, Arun, pikachu, Mutthu, Sunita, Pathak]

        // ✅ 3. Optional: Convert back to List (if you need List again)
        List<String> uniqueList = new ArrayList<>(uniqueSet);

        System.out.println("\nUnique List (after removing duplicates):");
        System.out.println(uniqueList);
        // [apple, Brijesh, Arun, pikachu, Mutthu, Sunita, Pathak]
    }
}
