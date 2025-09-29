package org.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P5_ArrayToList {

    /**
     * ====================================================================================================
     * 🔰 Arrays vs Array in Java
     * ----------------------------------------------------------------------------------------------------
     * 1️⃣ Array:
     * - It's a basic built-in data structure.
     * - Used to store fixed-size sequential elements of same data type.
     * - Example:
     * int[] arr = new int[5];
     * <p>
     * 2️⃣ Arrays (java.util.Arrays):
     * - It's a utility class in java.util package.
     * - Provides static helper methods to work with arrays (e.g., sort, fill, copyOf, binarySearch, etc.)
     * - Example:
     * Arrays.sort(arr);
     * ====================================================================================================
     * ====================================================================================================
     * 🔰 Converting Arrays
     * <p>
     * 1️⃣ Arrays.toString()
     * - Converts array to a readable string format.
     * - Only works properly with 1D arrays.
     * - Example:
     * int[] arr = {1, 2, 3};
     * System.out.println(Arrays.toString(arr));  // [1, 2, 3]
     */

    /*
====================================================================================================
🔰 Arrays.asList() — What it does? [Converting array to list, Creating a List from an Array]

🟡 It converts an **array to a List**, BUT:

   🔹 The returned List is of **fixed size**.
   🔹 You CANNOT add or remove elements from it.
   🔹 It is backed by the original array — means **changes reflect both ways**.
   🔹 You can't add or remove any new element to list else u will get UnsupportedOperationException
   🔹 You can modify existing element like set() etc And changes will be reflected to array also
   🔹 And if u make any changes to array then changes will be reflected to list also
   🔹 List is backed by array, and array size we can't change later and so same is happening with list

----------------------------------------------------------------------------------------------------
✅ Example 1: Arrays.asList() usage

    String[] arr = {"apple", "banana", "cherry"};
    List<String> list = Arrays.asList(arr);

    list.set(0, "grape");  // ✅ Allowed — modifying existing element
    System.out.println(Arrays.toString(arr)); // Output: [grape, banana, cherry]

    list.add("mango");     // ❌ Throws UnsupportedOperationException
    list.remove("banana"); // ❌ Throws UnsupportedOperationException

----------------------------------------------------------------------------------------------------
✅ Why does it throw Exception on add/remove?

    Because the list is backed by the original array.
    Arrays are fixed-size → so List returned by asList is also fixed-size.

====================================================================================================
*/
    public static void main(String[] args) {

        // ✅ Case 1: Arrays.asList(arr)

        // 🔰 Creating an array
        String[] arr = {"apple", "banana", "cherry"};

        /*
        ===========================================================================================
        🔹 Convert array to list using Arrays.asList()
           → This creates a fixed-size list backed by the original array
        ===========================================================================================
        */
        List<String> list = Arrays.asList(arr);

        System.out.println("List backed by array - " + list);  // [apple, banana, cherry]
        System.out.println();


        /*
        ===========================================================================================
        🔹 Modifying list using set()
           → Allowed ✅
           → Modifications reflect in original array also because list is backed by array
        ===========================================================================================
        */
        list.set(1, "BANANA");
        System.out.println("Modified List backed by array - " + list);          // [apple, BANANA, cherry]
        System.out.println("Modified array (affected) - " + Arrays.toString(arr)); // [apple, BANANA, cherry]
        System.out.println();


        /*
        ===========================================================================================
        🔴 Trying to add/remove elements from this list
           ❌ Will throw UnsupportedOperationException
           → Because it is a fixed-size list
        ===========================================================================================
        */
        try {
            list.add("Promogranate");
        } catch (Exception e) {
            System.out.println("Error while adding: " + e);  // java.lang.UnsupportedOperationException
        }

        System.out.println();
        System.out.println("Jai Shree Ram!!!");



        /**
         * ✅ Case 2: Arrays.asList("Apple", "Boy", "Cat")
         * List<String> list = Arrays.asList("Apple", "Boy", "Cat");
         *
         * 🔹 Behavior:
         * This uses varargs (String... a) under the hood.
         * It's like passing: new String[]{"Apple", "Boy", "Cat"}.
         * Internally, still behaves like a fixed-size list backed by an array.
         * So again:
         * ✅ set() works
         * ❌ add() or remove() throws UnsupportedOperationException
         * No external reference to the array though.
         *
         * 🧠 Common Facts (Interview Notes):
         * | Feature                      | `Arrays.asList(arr)` | `Arrays.asList("A", "B", "C")`     |
         * | ---------------------------- | -------------------- | ---------------------------------- |
         * | Input                        | Array reference      | Varargs (creates array internally) |
         * | List type                    | Fixed-size           | Fixed-size                         |
         * | Backed by                    | Original array       | Internal array                     |
         * | `set()`                      | ✅ Works              | ✅ Works                            |
         * | `add()/remove()`             | ❌ Throws Exception   | ❌ Throws Exception                 |
         * | Reflected in original array? | ✅ Yes                | ❌ No (no external array)           |
         */




    /*


====================================================================================================
🔰 Modifiable List from Array in Java

⚠️ If you want a truly **modifiable List**, always wrap `Arrays.asList()` inside a new `ArrayList`.

✅ Example:
    String[] arr = {"dog", "cat"};
    List<String> list = new ArrayList<>(Arrays.asList(arr));

    list.add("rabbit");     // ✅ Works fine
    list.remove("cat");     // ✅ Allowed
    System.out.println(list); // Output: [dog, rabbit]

🧠 Explanation:
1️⃣ `Arrays.asList(arr)` creates a fixed-size list backed by the original array.
2️⃣ `new ArrayList<>(...)` creates a new, fully independent and modifiable list.
3️⃣ Now:
    - Changes to `list` (add/remove) do **not** affect `arr`.
    - Changes to `arr` do **not** affect `list`.

✅ Best Practice:
    - Use this pattern when you need a flexible, dynamic list from an array.
====================================================================================================

🗣 Q: How to create a modifiable list from an array?

“Wrap Arrays.asList(array) inside new ArrayList<>(...).
This gives a fully independent and modifiable list, unlike the fixed-size list from asList() alone.”
*/

        System.out.println();
        System.out.println("--------- List creation from Arrays of diff types ---------");

        // List of Integer
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList1 = Arrays.asList(intArray);
        List<Integer> intList2 = new ArrayList<>(Arrays.asList(intArray));
        System.out.println("intList1 is non-modifiable but intList2 is modifiable");
        System.out.println(intList1 + " " + intList2); // [1, 2, 3, 4, 5] [1, 2, 3, 4, 5]
        System.out.println();

        // List of Double
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        List<Double> doubleList = Arrays.asList(doubleArray);
        List<Double> doubleList2 = new ArrayList<>(Arrays.asList(doubleArray));
        System.out.println(doubleList + " " + doubleList2); // [1.1, 2.2, 3.3, 4.4] [1.1, 2.2, 3.3, 4.4]
        System.out.println();

        // List of Character
        Character[] charArray = {'A', 'B', 'C', 'D'};
        List<Character> charList = Arrays.asList(charArray);
        List<Character> charList2 = new ArrayList<>(Arrays.asList(charArray));
        System.out.println(charList + " " + charList2); // [A, B, C, D] [A, B, C, D]
        System.out.println();
    }
}
