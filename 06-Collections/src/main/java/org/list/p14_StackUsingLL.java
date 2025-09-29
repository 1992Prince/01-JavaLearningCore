package org.list;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class p14_StackUsingLL {

    /**
     * 🧱 1. Stack using LinkedList (LIFO)
     *
     * 🔹 Operations:
     * | Method   | What it does                         | Return Type | Empty Stack Behavior              |
     * | -------- | ------------------------------------ | ----------- | --------------------------------- |
     * | `push()` | Adds element at top                  | `void`      | N/A                               |
     * | `pop()`  | Removes and returns top element      | `E`         | ❌ Throws `NoSuchElementException` |
     * | `peek()` | Returns top element without removing | `E`         | ✅ Returns `null`                  |
     */
    public static void main(String[] args) {


        LinkedList<Integer> stack = new LinkedList<>();

        // push(): adds to top
        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("Stack: " + stack); // [300, 200, 100]
        // pop(): removes top
        Integer popEle = stack.pop();
        System.out.println("Popped: " + popEle); // 300
        System.out.println("After pop: " + stack); // [200, 100]

        System.out.println();

        // empty behavior
        stack.pop();
        stack.pop();
        try {
            stack.pop(); // ❌ will throw exception
        } catch (NoSuchElementException e) {
            System.out.println("Stack is empty! Cannot pop."); // Stack is empty! Cannot pop.
        }

        System.out.println("Peek on empty: " + stack.peek()); // Peek on empty: null

    }
}
