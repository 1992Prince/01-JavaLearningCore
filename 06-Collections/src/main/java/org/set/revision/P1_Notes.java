package org.set.revision;

import java.util.*;

public class P1_Notes {
    /**
     * HashSet is one of the most commonly used implementation class of Set.
     * Here's an example of how to create a Set in Java: Set<String> mySet = new HashSet<>();
     *
     * You can also create a Set from an existing Collection
     * This creates a new HashSet object that contains all the unique elements in myList.
     *
     * List<String> myList = new ArrayList<>() ;
     * // add some elements to the list
     * Set<String> mySet = new HashSet<>(myList);
     *
     * 🎯 2️ Key Features of Set Interface
     * 			✅ Stores unique elements only (no duplicates allowed).
     * 			✅ Allows at most one null value (depends on implementation, like HashSet).
     * 			✅ Does not maintain insertion order (except for LinkedHashSet and TreeSet).
     * 			✅ Common Implementations:
     * 					HashSet
     * 					LinkedHashSet
     * 					TreeSet
     *
     * 	✅ 3️ What is HashSet Class?
     * 			HashSet is the most commonly used implementation of the Set interface.
     * 			It is based on a Hash Table and uses hashing mechanisms to store elements.
     * 			The order of elements is not maintained; it depends on the hash value.
     * 			It allows one null element.
     *
     * 	📌 4️ Key Characteristics of HashSet
     * 			✅ Stores unique elements using hashing.
     * 			✅ Allows one null value.
     * 			✅ Non-synchronized (not thread-safe).
     * 			✅ Fast operations for add, remove, and search (O(1) average time complexity).
     * 			❌ Does not maintain insertion order.
     * 			❌ Not suitable for multi-threaded environments without external synchronization.
     * 		    Note - We don't have any get() method to access HashSet elements or objects
     * 		           We can only access HashSet elements using iterator or enhanced for loop.
     *
     * 	🔒 🔑 1 Thread-Safety with HashSet
     * HashSet is not synchronized by default. Since HashSet class is non-synchronized,
     * we should not be using it for multi-threading environments.
     *
     * If you need to use it in a multi-threaded environment: Make it Synchronized:
     * Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet<>());
     */

    public static void main(String[] args) {

        //HashSet demo

        Set<String> set1 = new HashSet<>();
        set1.add("zebra");
        set1.add("banana");
        set1.add("giraffe");
        set1.add("apple");

        System.out.println(set1); // [zebra, banana, apple, giraffe]
        System.out.println();

        // we don't have get() method to retrieve elements from hashset, so we will be using iterator
        Iterator<String> itr = set1.iterator();
        while(itr.hasNext()){
            String ele = itr.next();
            System.out.print(ele + " "); // zebra banana apple giraffe
        }

        System.out.println();
        System.out.println();

        // We can also retrieve elements using foreach loop but not using for loop
        // since HashSet is not indexing based but hashing based.
        for(String ele:set1){
            System.out.print(ele + " ");
        }

        System.out.println();
        System.out.println(); // zebra banana apple giraffe

        /**
         * Why we can't use get(index) method for retrieving HashSet elements?
         * 🟥 HashSet doesn't support indexing. Elements are stored with their hash code value.
         * It is unordered, non-indexed, and based on hashing, not on position like a list or array.
         * ❌ HashSet:
         * Internally backed by a HashMap
         * Does not guarantee any order
         * No concept of element at index i
         * So: set.get(0) ❌ Compile-time error
         */

        System.out.println();

        /**
         * Convert ArrayList to HashSet object
         */

        List<Integer> list = List.of(20, 30, 40, 50, 50, 40);
        List<Integer> arrList = new ArrayList<>(list);
        System.out.println("arrList - " + arrList); // arrList - [20, 30, 40, 50, 50, 40]
        System.out.println();

        // converting arrList to HashSet obj
        Set<Integer> set = new HashSet<>(arrList);
        System.out.println("set - " + set); // set - [50, 20, 40, 30]
        // duplicates are removed
        // converting back it to ArrayList
        List<Integer> arrList2 = new ArrayList<>(set);
        System.out.println(arrList2); // [50, 20, 40, 30]

    }

    /**
     * Q - How HashSet maintains Uniqueness?
     * 🔹 1. Internally uses a HashMap
     *      HashSet internally uses a HashMap to store elements.
     *      Every element you add is stored as a key in the map.
     *      The value is a dummy object (commonly PRESENT).
     *
     * 🔹 2. Process of Adding Element in HashSet
     *      Whenever you add an element, HashSet follows two main steps:
     *      🧮 Step 1: hashCode() is called
     *              HashSet computes the hashCode of the object.
     *              It finds the corresponding bucket (memory slot) based on this hash code.
     *              If no other element exists in that bucket → ✅ add directly.
     *
     *       ⚖ Step 2: equals() is called (if collision occurs)
     *              If some other element already exists in the same bucket (hash collision),
     *              Then HashSet compares new element with existing ones using equals().
     *       ✅ If equals() returns true → element is considered duplicate, and not added.
     *       ❌ If equals() returns false → element is unique, so it's added to the same bucket (like linked list/tree).
     *
     *🔹 3. What if multiple elements have same hash code?
     * That’s common!
     * Java uses bucket chaining — multiple elements with same hash code are stored in the same bucket
     * (as list or tree depending on size).
     * But still, equals() will ensure true uniqueness.
     *
     * 🔹 4. No Indexing, No Order
     * HashSet is unordered, so it doesn't maintain insertion order or indexing.
     * That's why get(index) method doesn’t exist.
     */

}
