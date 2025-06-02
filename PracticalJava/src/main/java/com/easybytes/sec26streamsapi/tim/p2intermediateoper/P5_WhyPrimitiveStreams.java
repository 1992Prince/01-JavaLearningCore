package com.easybytes.sec26streamsapi.tim.p2intermediateoper;

public class P5_WhyPrimitiveStreams {


    /**
     * ✅ Java Streams ke 2 type hote hain:
     *
     * 1) Object Streams
     *    → eg: Stream<String>, Stream<Integer>, Stream<Employee>
     *
     * 2) Primitive Streams
     *    → For performance optimization:
     *         IntStream → for int
     *         LongStream → for long
     *         DoubleStream → for double
     *
     * 📘 Why Primitive Streams (IntStream, LongStream, DoubleStream)?
     * 🔹 1. Performance Optimization
     *              Stream<Integer> works with boxed types (Integer) → leads to boxing/unboxing overhead.
     *              IntStream works directly with primitive int values → no overhead.
     *              Faster processing, especially with large datasets.
     *
     *  🔹 2. Memory Efficiency
     *              Boxed objects (Integer) take more memory than primitives (int).
     *              IntStream uses less memory → better for memory-sensitive apps.
     *
     *  🔹 3. Direct Math Operations
     *              Primitive streams have built-in methods:
     *                      sum()
     *                      average()
     *                      min()
     *                      max()
     *              🆚 Object streams need: reduce(0, Integer::sum) wch is ➡️ Less readable and slightly slower.
     *
     *   🔹 4. Better Parallel Performance
     *          Primitive streams perform better in parallel operations.
     *          Less object creation = better thread performance
     *
     *    🔹 6. Useful When Starting With Primitives
     *            E.g., String.chars(), IntStream.range(), etc. directly give you a primitive stream:
     *            int sum = IntStream.range(1, 6).sum(); // Output: 15
     *
     *
     *      🧠 Summary Line:
     *      Use Primitive Streams when working with numeric data, especially if you want high performance, clean code,
     *      and built-in math functions without the cost of boxing/unboxing.
     */
}
