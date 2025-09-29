package org.list;

import java.util.*;

public class p13_LinkedListMethodsCategories {

    /**
     *
     *
     * java.util.LinkedList in Java is a very versatile class because it implements both the List and Deque
     * interfaces.
     *
     * This gives it two major powers:
     *      💡 It behaves like a List → ordered, index-based access
     *      💡 It behaves like a Queue/Deque (Double-Ended Queue) → can add/remove from both ends
     *
     * ✅ So, here are the main categories of methods in LinkedList:
     *
     * 1. List-based Methods (from List interface)
     *
     * These allow you to work with LinkedList like an ArrayList.
     *
     *      add(E e) → Add to end
     *      add(int index, E e) → Insert at position
     *      get(int index) → Get element at index
     *      set(int index, E element) → Replace at index
     *      remove(int index) → Remove at index
     *      indexOf(Object o) / lastIndexOf(Object o)
     *      size(), isEmpty(), clear()
     *
     * 📌 Use case: When you want ordered, index-based access like a regular list.
     *
     * 2. Queue / Deque Methods (Double-ended queue)
     *
     * This makes LinkedList suitable for implementing Stacks, Queues, and Deques.
     *
     * Queue style (FIFO):
     *
     *      offer(E e) → Add to tail
     *      poll() → Remove from head
     *      peek() → Look at head
     *
     * Stack style (LIFO):
     *
     *      push(E e) → Add to head (like stack push)
     *      pop() → Remove from head (like stack pop)
     *      peek() → Look at head

     * Deque (both ends):
     *
     *      addFirst(E e) / addLast(E e)
     *      removeFirst() / removeLast()
     *      getFirst() / getLast()
     *      offerFirst(E e) / offerLast(E e)
     *      pollFirst() / pollLast()
     *
     * 📌 Use case: Perfect for Stacks, Queues, Sliding window, BFS, etc.
     *
     * 3. Collection Methods (inherited from Collection)
     *
     *  contains(Object o)
     * iterator(), listIterator()
     * toArray()
     * retainAll(), removeAll()
     * equals(Object o), hashCode()
     *
     * 🔥 Summary:
     * | Category       | Key Methods Examples                      | Use For                     |
     * | -------------- | ----------------------------------------- | --------------------------- |
     * | **List**       | `add(int, E)`, `get(int)`, `remove(int)`  | Index-based list operations |
     * | **Queue**      | `offer()`, `poll()`, `peek()`             | FIFO queues                 |
     * | **Deque**      | `addFirst()`, `removeLast()`, `getLast()` | Double-ended operations     |
     * | **Stack**      | `push()`, `pop()`, `peek()`               | LIFO stacks                 |
     * | **Collection** | `contains()`, `clear()`, `toArray()`      | Common collection behavior  |
     */
    public static void main(String[] args) {



    }
}
