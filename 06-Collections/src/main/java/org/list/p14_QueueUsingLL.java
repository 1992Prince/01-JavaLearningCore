package org.list;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class p14_QueueUsingLL {

    /**
     * 🚦 2. Queue using LinkedList (FIFO)
     *
     * 🔹 Operations:
     * | Method    | What it does                           | Return Type | Empty Queue Behavior     |
     * | --------- | -------------------------------------- | ----------- | ------------------------ |
     * | `offer()` | Adds element at rear                   | `boolean`   | ✅ Returns `false` (rare) |
     * | `poll()`  | Removes and returns front element      | `E`         | ✅ Returns `null`         |
     * | `peek()`  | Returns front element without removing | `E`         | ✅ Returns `null`         |
     */
    public static void main(String[] args) {


        LinkedList<String> queue  = new LinkedList<>();

        // offer(): adds to end
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        System.out.println("Queue: " + queue); // [Apple, Banana, Cherry]

        // peek(): front element
        System.out.println("Front: " + queue.peek()); // Apple

        // poll(): remove front
        System.out.println("Polled: " + queue.poll()); // Apple
        System.out.println("Queue after poll: " + queue); // [Banana, Cherry]

        System.out.println();
        System.out.println();

        // empty behavior
        queue.poll(); // Banana
        queue.poll(); // Cherry
        System.out.println("Poll on empty: " + queue.poll()); // Poll on empty: null
        System.out.println("Peek on empty: " + queue.peek()); // Peek on empty: null

    }
}
