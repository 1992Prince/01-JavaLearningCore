package org.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class P2_ArrayDequeQueue {

    public static void main(String[] args) {

        // ArrayDeque implements Deque interface
        // Deque interface extends Queue interface
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(100);
        queue.offer(200);
        queue.offer(300);

        System.out.println(queue.poll()); // 100
        System.out.println(queue.peek()); // 200
    }
}
