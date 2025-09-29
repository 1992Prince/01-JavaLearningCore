package org.coding.stackqueue;

import java.util.Stack;

public class P1_JavaStackExample {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        // ✅ Push elements into the stack
        stack.push("Apple");     // returns "Apple"
        stack.push("Banana");    // returns "Banana"
        stack.push("Cherry");    // returns "Cherry"

        System.out.println("Stack: " + stack);  // [Apple, Banana, Cherry]

        System.out.println();

        // ✅ Peek (view top without removing)
        String topElement = stack.peek();       // returns "Cherry"
        System.out.println("Top Element: " + topElement);
        System.out.println();

        // ✅ Pop (removes top element)
        String popped = stack.pop();            // removes "Cherry", returns it
        System.out.println("Popped: " + popped);
        System.out.println("After Pop: " + stack); // [Apple, Banana]
        System.out.println();

        // ✅ Search (1-based index from top)
        int index = stack.search("Apple");      // returns 2 (from top)
        System.out.println("Index of Apple (from top): " + index); // Index of Apple (from top): 2
        System.out.println();

        // ❌ Search element not found
        int missing = stack.search("Orange");   // returns -1
        System.out.println("Search missing: " + missing); // Search missing: -1
        System.out.println();

        // ❌ Peek/Pop on empty stack will throw EmptyStackException
        stack.clear(); // removes all elements
        try {
            stack.pop(); // Throws java.util.EmptyStackException
        } catch (Exception e) {
            System.out.println("Exception on pop: " + e); // Exception on pop: java.util.EmptyStackException
        }

    }

    /**
     * 🔍 Operation Summary
     * | Operation | Method             | Return Type | Description                             |
     * | --------- | ------------------ | ----------- | --------------------------------------- |
     * | Push      | `push(E item)`     | `E`         | Adds item to top                        |
     * | Pop       | `pop()`            | `E`         | Removes & returns top item              |
     * | Peek      | `peek()`           | `E`         | Returns top item (without removing)     |
     * | Search    | `search(Object o)` | `int`       | Returns 1-based index from top, or `-1` |
     * | Size      | `size()`           | `int`       | Number of elements in stack             |
     * | Is Empty  | `empty()`          | `boolean`   | Checks if stack is empty                |
     */
}
