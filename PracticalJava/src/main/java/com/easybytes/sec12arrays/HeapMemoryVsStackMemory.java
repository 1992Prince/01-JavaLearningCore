package com.easybytes.sec12arrays;

public class HeapMemoryVsStackMemory {

    /**
     * ☕ Java Memory Model – Main Parts
     * 🔹 1. Heap Memory:
     * Stores: All Java objects and their instance variables.
     * Shared among all threads.
     * Managed by Garbage Collector (GC).
     *
     * 📌 Whenever you write new, memory is allocated in Heap.
     *
     * 🔹 2. Stack Memory:
     * Stores: Method calls (stack frames), local variables, references to objects.
     * Each thread has its own stack.
     * Memory is automatically freed when the method ends.
     *
     * 👁️ Visualize This:
     *
     * public class Demo {
     *     public static void main(String[] args) {
     *         int x = 10;                        // Stored in Stack
     *         String name = new String("Ram");  // 'name' ref in Stack, object in Heap
     *     }
     * }
     *
     * Location	        What’s stored
     * Stack	        x, reference name
     * Heap	            "Ram" object (created via new)
     *
     * 🧹 Java Garbage Collector (GC)
     * 🔸 GC manages the Heap memory:
     * Automatically removes unreachable objects (those with no references).
     *
     * Runs in background using various algorithms (Mark & Sweep, G1, etc).
     *
     * Helps prevent memory leaks.
     *
     * ✅ When is an object eligible for GC?
     * When no active reference exists to that object.
     * String str = new String("A"); // object created in heap
     * str = null; // now eligible for GC
     *
     * 🔄 Heap vs Stack – Key Differences
     * Feature	                Stack	                            Heap
     * Memory type	        Short-term (temporary)	        Long-term (until GC clears)
     * Stores	            Method calls, local variables	Objects, instance variables
     * Thread safe?	        Yes (each thread has own)	    No (shared among threads)
     * GC managed?	        No (auto clean-up by JVM)	    Yes (by GC)
     */
}
