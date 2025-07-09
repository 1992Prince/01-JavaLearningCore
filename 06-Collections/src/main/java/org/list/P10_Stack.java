package org.list;

import java.util.Stack;

public class P10_Stack {

    public static void main(String[] args) {

        // ✅ Create a Stack
        Stack<String> stack = new Stack<>();

        // ✅ push() – Add elements (LIFO)
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack after push: " + stack);  // [A, B, C]

        // ✅ peek() – See top element without removing
        System.out.println("Top element (peek): " + stack.peek());  // C

        // ✅ pop() – Remove and return top element
        String popped = stack.pop();
        System.out.println("Popped element: " + popped);  // C
        System.out.println("Stack after pop: " + stack);   // [A, B]

        // ✅ search() – Returns position from top (1-based)
        System.out.println("Position of 'A': " + stack.search("A")); // 2
        System.out.println("Position of 'Z': " + stack.search("Z")); // -1 (not found)

        // ✅ empty() – Check if stack is empty
        System.out.println("Is stack empty?: " + stack.empty());  // false

        // ✅ pop remaining elements
        stack.pop(); // Removes B
        stack.pop(); // Removes A

        // Now stack is empty
        System.out.println("Stack after clearing: " + stack);  // []
        System.out.println("Is stack empty?: " + stack.empty());  // true
    }
}
