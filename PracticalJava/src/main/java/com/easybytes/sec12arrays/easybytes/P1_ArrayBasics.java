package com.easybytes.sec12arrays.easybytes;

public class P1_ArrayBasics {

    public static void main(String[] args) {

        // ✅ Method 1: Declare array reference first, allocate memory later
        int[] arr1;
        arr1 = new int[3]; // array of size 3 created in heap, default values [0, 0, 0]

        // ✅ Setting values using index
        arr1[0] = 123;
        arr1[1] = 456;
        arr1[2] = 789;

        // ✅ Method 2: Declare + allocate + initialize in one line using array literal
        int[] arr2 = {10, 20, 30};

        // ✅ Method 3: Declare + allocate + initialize using new keyword with values
        int[] arr3 = new int[] {5, 15, 25};

        // ✅ Method 4: Declare and initialize 2D array (fixed size)
        int[][] matrix = new int[2][2];

        /**
         * 🧠 Memory & Concept Notes
         * // All array objects → created in HEAP memory
         * // Array reference variables (like arr1, arr2...) → stored in STACK
         *
         * // Default values in arrays (for primitive types):
         * // int -> 0, boolean -> false, double -> 0.0, Object/String -> null
         *
         * // Access or assign via index: arr[0] = value;
         */

        // ❌ Example of ArrayIndexOutOfBoundsException
        try {
            int outOfBounds = arr1[3]; // only valid indices: 0,1,2
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠️ Exception: " + e); // ⚠️ Exception: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        }

        /**
         * Exception Notes
         * // ❌ ArrayIndexOutOfBoundsException:
         * // Thrown when accessing an index that doesn't exist in the array.
         *
         * // Example:
         * // int[] a = new int[3]; // indices = 0,1,2
         * // a[3] = 5; // ❌ causes ArrayIndexOutOfBoundsException
         */

        System.out.println("-".repeat(50));
        System.out.println("-".repeat(50));
        System.out.println();

        int[] numbers = {10, 20, 30, 40, 50};

        // ✅ Using traditional for loop
        System.out.println("➡️ Iterating using traditional for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        /**
         * ➡️ Iterating using traditional for loop:
         * Index 0: 10
         * Index 1: 20
         * Index 2: 30
         * Index 3: 40
         * Index 4: 50
         */

        // ✅ Using enhanced for-each loop
        System.out.println("\n➡️ Iterating using for-each loop:");
        for (int num : numbers) {
            System.out.println("Value: " + num);
        }

        /**
         * ➡️ Iterating using for-each loop:
         * Value: 10
         * Value: 20
         * Value: 30
         * Value: 40
         * Value: 50
         */

        // ✅ Array length property
        System.out.println("\n✅ Array length: " + numbers.length); // ✅ Array length: 5

        // ❌ Trying to change array size - Not allowed
        // numbers.length = 10; // ❌ Compilation Error - length is final
        // numbers[5] = 60;     // ❌ Runtime Error - ArrayIndexOutOfBounds

        // ✅ Confirming array size is fixed
        System.out.println("\n⚠️ Array size is fixed. You cannot resize it once created.");
        // ⚠️ Array size is fixed. You cannot resize it once created.

        /**
         * ✔ numbers.length -> gives number of elements in array.
         * ✔ Traditional for loop is useful when you need index (i).
         * ✔ For-each loop is cleaner when you only care about values.
         *
         * ❌ Array size cannot be changed once initialized.
         *    You can modify elements, but not add/remove size.
         *
         * ✔ If you need dynamic resizing, use ArrayList instead.
         */

    }
}
