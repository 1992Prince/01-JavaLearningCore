package org.arrays;

public class P7_MoreMethods {

    /*
    🔰 Arrays Important Utility Methods (Interview Point of View)

    ======================================================================================
    1️⃣ Arrays.asList(T... a)
    ✅ Converts an array into a fixed-size List.
    ✅ List backed by original array – changes reflect both ways.
    ❌ add()/remove() not allowed – throws UnsupportedOperationException

    Example:
        String[] arr = {"a", "b"};
        List<String> list = Arrays.asList(arr);
        list.set(1, "B");  // ✅ works
        list.add("c");     // ❌ UnsupportedOperationException
    ======================================================================================

    2️⃣ Arrays.equals(arr1, arr2)
    ✅ Compares two arrays for equality.
    ✅ Returns true if both arrays are same in size and elements (order matters).
    ❌ For deep/nested arrays use Arrays.deepEquals()

    Example:
        int[] a = {1, 2};
        int[] b = {1, 2};
        Arrays.equals(a, b);        // ✅ true
        Arrays.equals(a, new int[]{1, 3}); // ❌ false
    ======================================================================================

    3️⃣ Arrays.compare(arr1, arr2)
    ✅ Lexicographically compares two arrays.
    ✅ Returns:
        - Negative if arr1 < arr2
        - Zero if arr1 == arr2
        - Positive if arr1 > arr2
    ✅ Think of it as: "dictionary" or "natural" order comparison.

    Example:
        int[] a = {1, 2};
        int[] b = {1, 3};
        Arrays.compare(a, b); // -1 → because 2 < 3
    ======================================================================================

    4️⃣ Arrays.mismatch(arr1, arr2)
    ✅ Returns the index at which the two arrays differ.
    ✅ Returns -1 if arrays are identical.

    Example:
        int[] a = {1, 2, 3};
        int[] b = {1, 5, 3};
        Arrays.mismatch(a, b); // 1 → first mismatch at index 1

        int[] c = {1, 2, 3};
        Arrays.mismatch(a, c); // -1 → means both are equal
    ======================================================================================

    5️⃣ Arrays.spliterator(array)
    ✅ Returns a Spliterator over the elements of the array.
    ✅ Useful in parallel stream processing.
    ✅ Can be passed to StreamSupport.stream()

    Example:
        String[] fruits = {"apple", "banana"};
        Spliterator<String> sp = Arrays.spliterator(fruits);

        StreamSupport.stream(sp, false).forEach(System.out::println);
        // apple
        // banana
    ======================================================================================
*/

}
