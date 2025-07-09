package org.coding.arrays.basic;

import java.util.Arrays;

public class P6_MyStack {
    private int[] arr;
    private int top;

    public P6_MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // [EDGE CASE] - chk if array[stack arr] is full
        if(top == arr.length-1) return;

        top++;
        arr[top] = x;
    }

    public int pop() {
       // [EDGE CASE] - chk if array[stack arr] is not empty
        if(top == -1) return -1;

        int popVal = arr[top];
        top--;

        return popVal;
    }

    public static void main(String[] args) {

        P6_MyStack s = new P6_MyStack();

        s.push(2);
        s.push(3);
        System.out.println(s.pop()); // 3
        s.push(4);
        System.out.println(s.pop()); // 4

    }
}
