package org.coding.arrays.basic;

public class P7_MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    P7_MyQueue() {
        front = 0;
        rear = 0;
    }

    // Function to push an element x in a queue. [before pushing check if queue is not full]
    void push(int x) {
        if(rear == arr.length) return;

        arr[rear++] = x;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        if(rear == front) return -1;

        int rearVal = arr[front++];
        return  rearVal;
    }

    public static void main(String[] args) {

        P7_MyQueue myQueue = new P7_MyQueue();
        myQueue.push(2);
        myQueue.push(3);
        System.out.println(myQueue.pop());
        myQueue.push(4);
        System.out.println(myQueue.pop());

        System.out.println();

        P7_MyQueue myQueue2 = new P7_MyQueue();
        myQueue2.push(3);
        System.out.println(myQueue2.pop());
        System.out.println(myQueue2.pop());
        myQueue2.push(4);

    }
}
