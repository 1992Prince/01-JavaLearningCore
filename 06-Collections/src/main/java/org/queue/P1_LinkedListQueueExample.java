package org.queue;

import java.util.LinkedList;
import java.util.Queue;

public class P1_LinkedListQueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Adding elements
        // offer Adds the specified element as the tail (last element) of this list.
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        System.out.println("Queue: " + queue); // Queue: [Apple, Banana, Cherry]
        String peekEle1 = queue.peek();
        System.out.println("Head element: " + peekEle1); // Head element: Apple

        System.out.println();

        String fstPollEle = queue.poll();
        String peekEle2 = queue.peek();
        System.out.println("fstPollEle - " + fstPollEle + " , peekEle2 - " + peekEle2);
        // fstPollEle - Apple , peekEle2 - Banana
    }
}
