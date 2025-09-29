package org.coding.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class P2_JavaQueueExample {

    /**
     * 📦 Java Queue Example – All Operations
     * Java has no direct Queue class, but it provides a Queue interface, which is implemented by:
     *
     * - LinkedList
     * - ArrayDeque
     * - PriorityQueue (for sorted queues)
     */

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // ✅ Enqueue (add to rear)
        queue.offer("A");   // returns true
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);  // [A, B, C]
        System.out.println();

        // ✅ Peek (view front without removing)
        String front = queue.peek();           // returns "A"
        System.out.println("Front: " + front); // Front: A
        System.out.println();

        // ✅ Dequeue (remove front)
        String removed = queue.poll();         // returns "A", removes it
        System.out.println("Removed: " + removed); // Removed: A
        System.out.println("Queue after poll: " + queue); // [B, C]
        System.out.println();

        // ❌ Dequeue or Peek on empty queue
        queue.clear();
        System.out.println("After clear: " + queue);       // After clear: []
        System.out.println("Peek empty: " + queue.peek()); // returns null - Peek empty: null
        System.out.println("Poll empty: " + queue.poll()); // returns null - Poll empty: null
    }

    /**
     * 🔍 Operation Summary
     * | Operation | Method       | Return Type | Description                                 |
     * | --------- | ------------ | ----------- | ------------------------------------------- |
     * | Enqueue   | `offer(E e)` | `boolean`   | Adds to rear (preferred)                    |
     * | Dequeue   | `poll()`     | `E`         | Removes & returns front, or `null` if empty |
     * | Peek      | `peek()`     | `E`         | Returns front, or `null` if empty           |
     * | Size      | `size()`     | `int`       | Number of elements                          |
     * | Is Empty  | `isEmpty()`  | `boolean`   | Checks if queue is empty                    |
     */
}
