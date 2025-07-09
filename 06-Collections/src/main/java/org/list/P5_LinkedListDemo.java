package org.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class P5_LinkedListDemo {

    public static void main(String[] args) {

        // ✅ Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // ✅ List Interface Methods (inherited by LinkedList)

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana"); // Allows duplicates
        list.add(1, "Mango"); // Insert at index
        System.out.println("List after add: " + list); // List after add: [Apple, Mango, Banana, Cherry, Banana]

        // Get element by index
        System.out.println("Element at index 2: " + list.get(2)); // Element at index 2: Banana

        // Set (replace) element
        list.set(2, "Blueberry");
        System.out.println("List after set: " + list); // List after set: [Apple, Mango, Blueberry, Cherry, Banana]

        // Remove by index
        list.remove(1);
        System.out.println("List after remove(index): " + list); // List after remove(index): [Apple, Blueberry, Cherry, Banana]

        // Remove by value
        list.remove("Banana");
        System.out.println("List after remove(value): " + list); // List after remove(value): [Apple, Blueberry, Cherry]

        // Check if contains
        System.out.println("Contains 'Apple': " + list.contains("Apple")); // Contains 'Apple': true

        // IndexOf and LastIndexOf
        list.add("Apple");
        System.out.println("Index of Apple: " + list.indexOf("Apple"));              // Index of Apple: 0
        System.out.println("Last index of Apple: " + list.lastIndexOf("Apple")); // Last index of Apple: 3

        // Size and isEmpty
        System.out.println("Size: " + list.size());        // Size: 4
        System.out.println("Is Empty: " + list.isEmpty()); // Is Empty: false

        // Iteration (for-each)
        System.out.print("Iterate: ");
        for (String item : list) {
            System.out.print(item + " "); // Iterate: Apple Blueberry Cherry Apple
        }
        System.out.println();

        // Sublist
        System.out.println("Sublist (1 to 3): " + list.subList(1, 3)); // Sublist (1 to 3): [Blueberry, Cherry]

        // Clear
        LinkedList<String> copy = new LinkedList<>(list); // keep copy for LinkedList methods
        list.clear();
        System.out.println("After clear: " + list); // After clear: []

        System.out.println();
        System.out.println();

        System.out.println("----------✅ LinkedList-Specific Methods (Not in ArrayList)--------------");
        System.out.println();

        LinkedList<String> ll = copy;
        System.out.println("copy - " + copy); // copy - [Apple, Blueberry, Cherry, Apple]

        ll.addFirst("First");
        ll.addLast("Last");
        System.out.println("After addFirst & addLast: " + ll);
        // After addFirst & addLast: [First, Apple, Blueberry, Cherry, Apple, Last]

        System.out.println("getFirst(): " + ll.getFirst()); // getFirst(): First
        System.out.println("getLast(): " + ll.getLast());  // getLast(): Last

        ll.removeFirst();
        ll.removeLast();
        System.out.println("After removeFirst & removeLast: " + ll);
        // After removeFirst & removeLast: [Apple, Blueberry, Cherry, Apple]

        ll.offer("Offer"); // Add to end
        ll.offerFirst("OfferFirst");
        ll.offerLast("OfferLast");
        System.out.println("After offer methods: " + ll);
        // After offer methods: [OfferFirst, Apple, Blueberry, Cherry, Apple, Offer, OfferLast]

        ll.poll(); // Remove first
        ll.pollFirst();
        ll.pollLast();
        System.out.println("After poll methods: " + ll);
        // After poll methods: [Blueberry, Cherry, Apple, Offer]

        ll.push("Pushed"); // Add to front
        System.out.println("After push: " + ll);
        // After push: [Pushed, Blueberry, Cherry, Apple, Offer]

        ll.pop(); // Remove from front
        System.out.println("After pop: " + ll);

        // Descending iterator
        System.out.print("Reverse order: ");
        Iterator<String> desc = ll.descendingIterator();
        while (desc.hasNext()) {
            System.out.print(desc.next() + " ");
        }
        System.out.println();

        // Clone (shallow copy)
        LinkedList<String> cloned = (LinkedList<String>) ll.clone();
        System.out.println("Cloned list: " + cloned);


    }
}
