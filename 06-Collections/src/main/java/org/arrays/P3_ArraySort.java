package org.arrays;

import java.util.Arrays;

public class P3_ArraySort {

    /*
============================================================================================
🔢 Sorting Arrays in Java – Complete Notes (Interview Friendly)
============================================================================================

📌 1️⃣ Sorting Array in Increasing Order (Primitives):

import java.util.Arrays;

int[] nums = {5, 2, 9, 1};
Arrays.sort(nums);  // Default sort is ascending

System.out.println(Arrays.toString(nums)); // [1, 2, 5, 9]

--------------------------------------------------------------------------------------------

📌 2️⃣ Sorting Array in Decreasing Order (Primitives - by boxing to Integer):

Integer[] nums = {5, 2, 9, 1};

Arrays.sort(nums, (a, b) -> b - a);  // Descending using Comparator

System.out.println(Arrays.toString(nums)); // [9, 5, 2, 1]

--------------------------------------------------------------------------------------------

📌 3️⃣ Sorting a Character Array:

char[] chars = {'z', 'b', 'a', 'c'};
Arrays.sort(chars); // Sorts alphabetically: [a, b, c, z]

System.out.println(Arrays.toString(chars));  // [a, b, c, z]

--------------------------------------------------------------------------------------------

📌 4️⃣ Sorting an Object Array (e.g., String[]):

String[] names = {"Ram", "Shyam", "Aman"};
Arrays.sort(names);  // Lexicographical order

System.out.println(Arrays.toString(names)); // [Aman, Ram, Shyam]

--------------------------------------------------------------------------------------------

📌 5️⃣ Sorting an Array of Custom Objects (like Student by age):

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

Student[] students = {
    new Student("Ram", 25),
    new Student("Aman", 20),
    new Student("Sita", 22)
};

// Sort by age (ascending)
Arrays.sort(students, (s1, s2) -> s1.age - s2.age);

for (Student s : students) {
    System.out.println(s.name + " - " + s.age);
}

--------------------------------------------------------------------------------------------

📌 6️⃣ Arrays.parallelSort() vs Arrays.sort()

- Arrays.parallelSort() uses multithreading (ForkJoinPool) to speed up sorting of large arrays.
- For small arrays, Arrays.sort() is preferred (less overhead).
- Available since Java 8.

Example:

int[] nums = {10, 2, 4, 1, 5};
Arrays.parallelSort(nums);

System.out.println(Arrays.toString(nums)); // Sorted output

--------------------------------------------------------------------------------------------

🧠 Interview Tip:
- sort() uses Dual-Pivot QuickSort for primitives.
- For Object arrays, TimSort is used.
- For descending order with primitives → use boxed Integer[] and Comparator.

============================================================================================
*/

    public static void main(String[] args) {

        int[] nums = {5, 2, 9, 1};
        Arrays.sort(nums);  // Default sort is ascending

        System.out.println(Arrays.toString(nums)); // [1, 2, 5, 9]
        System.out.println();

        Integer[] nums2 = {5, 2, 9, 1};

        Arrays.sort(nums2, (a, b) -> b - a);  // Descending using Comparator

        System.out.println(Arrays.toString(nums2)); // [9, 5, 2, 1]
        System.out.println();

        char[] chars = {'z', 'b', 'a', 'c'};
        Arrays.sort(chars); // Sorts alphabetically: [a, b, c, z]

        System.out.println(Arrays.toString(chars));  // [a, b, c, z]
        System.out.println();

        String[] names = {"Ram", "Shyam", "Aman"};
        Arrays.sort(names);  // Lexicographical order

        System.out.println(Arrays.toString(names)); // [Aman, Ram, Shyam]

        /*
--------------------------------------------------------------------------------------------
🎯 Sorting int[] in Descending Order – Interview Style

int[] nums = {5, 2, 9, 1};

// Step 1: Convert int[] to Integer[] (boxing)
Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);

// Step 2: Sort using custom comparator for descending order
Arrays.sort(boxed, (a, b) -> b - a);  // Descending

System.out.println(Arrays.toString(boxed));  // Output: [9, 5, 2, 1]
--------------------------------------------------------------------------------------------
*/

        /**
         * ✅ For Primitives (like int[], double[], char[]):
         * You can only use Arrays.sort(array) → which sorts in ascending order only.
         * ❌ You cannot pass a Comparator with primitive arrays.
         * int[] nums = {3, 1, 4};
         * Arrays.sort(nums); // ✅ ascending only
         * // ❌ Arrays.sort(nums, comparator) --> Not allowed
         *
         * ✅ For Wrapper Types and Objects (like Integer[], String[], or custom classes):
         * You can use: Arrays.sort(array, comparator);
         * ✅ You can define custom sorting logic → like descending order, sorting by name, age, etc.
         * Integer[] nums = {3, 1, 4};
         * Arrays.sort(nums, (a, b) -> b - a); // Descending
         *
         * 🔍 Summary Table:
         * | Type             | Sorting Allowed        | Comparator Support | Order                |
         * | ---------------- | ---------------------- | ------------------ | -------------------- |
         * | `int[]`          | ✅ Yes (ascending only) | ❌ No               | Asc                  |
         * | `Integer[]`      | ✅ Yes                  | ✅ Yes              | Asc/Desc/custom      |
         * | `String[]`       | ✅ Yes                  | ✅ Yes              | Lexicographic/custom |
         * | Custom Object\[] | ✅ Yes                  | ✅ Yes              | Natural or Custom    |
         *
         *
         * ❓ Can we reverse an array using Arrays utility methods?
         * 🛑 No, there is no direct method in java.util.Arrays like Arrays.reverse() to reverse an array.
         *
         * ✅ So how do we reverse an array?
         * 1. Using a loop (for primitives and objects):
         *
         * 🎯 Reverse an int[] array manually using loop
         *
         * int[] arr = {10, 20, 30, 40, 50};
         * int n = arr.length;
         *
         * for (int i = 0; i < n / 2; i++) {
         *     int temp = arr[i];
         *     arr[i] = arr[n - i - 1];
         *     arr[n - i - 1] = temp;
         * }
         *
         * // Output: [50, 40, 30, 20, 10]
         * System.out.println(Arrays.toString(arr));
         */
    }
}
