package org.list;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class p15_DequeUsingLL {

    /**
     * 🔁 3. Deque using LinkedList (Double-Ended Queue)
     *
     * 🔹 Operations:
     * | Method        | What it does                           | Return Type | Empty Deque Behavior |
     * | ------------- | -------------------------------------- | ----------- | -------------------- |
     * | `addFirst()`  | Adds element to front                  | `void`      | ❌ Throws Exception   |
     * | `addLast()`   | Adds element to rear                   | `void`      | ❌ Throws Exception   |
     * | `pollFirst()` | Removes and returns front element      | `E`         | ✅ Returns `null`     |
     * | `pollLast()`  | Removes and returns rear element       | `E`         | ✅ Returns `null`     |
     * | `peekFirst()` | Returns front element without removing | `E`         | ✅ Returns `null`     |
     * | `peekLast()`  | Returns rear element without removing  | `E`         | ✅ Returns `null`     |
     */
    public static void main(String[] args) {


        LinkedList<Integer> deque = new LinkedList<>();

        // Add to both ends
        deque.addFirst(1); // front
        deque.addLast(2);  // rear
        deque.addFirst(0);
        deque.addLast(3);

        System.out.println("Deque: " + deque); // Deque: [0, 1, 2, 3]
        System.out.println();

        // Peek from both ends
        System.out.println("Front: " + deque.peekFirst()); // Front: 0
        System.out.println("Rear: " + deque.peekLast());   // Rear: 3

        // Poll from both ends
        System.out.println("Poll front: " + deque.pollFirst()); // Poll front: 0
        System.out.println("Poll rear: " + deque.pollLast());   // Poll rear: 3

        System.out.println("After polling: " + deque); // After polling: [1, 2]
        System.out.println();

        // Empty Deque Behavior
        deque.pollFirst(); // 1
        deque.pollLast();  // 2
        System.out.println("Peek empty front: " + deque.peekFirst()); // Peek empty front: null
        System.out.println("Poll empty rear: " + deque.pollLast());   // Poll empty rear: null

    }
}
