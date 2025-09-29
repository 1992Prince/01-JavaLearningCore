package org.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class P3_PriorityQueueExample {

    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(50);
        pq.offer(10);
        pq.offer(30);

        System.out.println(pq); // [10, 50, 30]
        System.out.println("pq.peek - " + pq.peek()); // pq.peek - 10
        System.out.println(pq.poll()); // 10
        System.out.println();

        System.out.println("pq.peek 2 - " + pq.peek()); // pq.peek 2 - 30
        System.out.println(pq.poll()); // 30
        System.out.println();

        System.out.println("pq.peek 3 - " + pq.peek()); // pq.peek 3 - 50
    }
}
