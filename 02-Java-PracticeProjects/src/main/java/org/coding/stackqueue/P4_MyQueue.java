package org.coding.stackqueue;

import java.util.Stack;

public class P4_MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public P4_MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();

    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        int s1Len = stack1.size();
        for(int i=1;i<s1Len;i++){
            stack2.push(stack1.pop());
        }

        int popEle = stack1.pop();

        for(int i=1;i<=s1Len-1;i++){
            stack1.push(stack2.pop());
        }

        return popEle;
    }

    public int peek() {

        int s1Len = stack1.size();
        for(int i=1;i<s1Len;i++){
            stack2.push(stack1.pop());
        }

        int peekEle = stack1.peek();
        stack2.push(stack1.pop()); // adding last element after performing peek operation

        for(int i=1;i<=s1Len;i++){
            stack1.push(stack2.pop());
        }
        return peekEle;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {

        P4_MyQueue myq = new P4_MyQueue();
        myq.push(1);
        myq.push(2);
        System.out.println(myq.peek());
        System.out.println(myq.pop());
        System.out.println(myq.empty());



    }

}
