package org.coding.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class P3_MyStack {


    public Queue<Integer> queue1;
    public Queue<Integer> queue2;

    public P3_MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.offer(x);
    }

    public int pop() {
        int len = queue1.size();
        for (int i = 1; i < len; i++) {
            queue2.offer(queue1.poll());
        }

        int pollEle = queue1.poll();
        queue1 = queue2;
        return pollEle;
    }

    public int top() {
        int len = queue1.size();
        for (int i = 1; i < len; i++) {
            queue2.offer(queue1.poll());
        }

        int peekEle = queue1.peek();
        queue2.offer(queue1.poll());
        queue1 = queue2;
        return peekEle;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    @Override
    public String toString() {
        return queue1.toString();
    }

    public static void main(String[] args) {

        P3_MyStack stack = new P3_MyStack();
        stack.push(1);
        stack.push(2);

        System.out.println(stack);
        System.out.println("PeekEle: " + stack.top());
        System.out.println("PopEle: " + stack.pop());
        System.out.println(stack.empty());

    }
}
