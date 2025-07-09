package org.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P7_CollectionsSortMethod {

    public static void main(String[] args) {

        /**
         * ✅ Collections.sort() in Java
         * 🔹 Purpose:
         * Used to sort elements in a List in natural order (or using a custom Comparator).
         *
         * 🔹 Syntax:
         * 1. Natural order sort - Collections.sort(list);
         * 2. Custom order sort with Comparator - Collections.sort(list, comparator);
         */

        // ✅ Example 1: Sort Strings Alphabetically
        List<String> names = new ArrayList<>(List.of("Zara", "Ankit", "Brijesh"));
        Collections.sort(names);
        System.out.println(names); // [Ankit, Brijesh, Zara]

        System.out.println();

        // ✅ Example 2: Sort Integers
        List<Integer> nums = new ArrayList<>(List.of(5, 2, 8, 1));
        Collections.sort(nums);
        System.out.println(nums); // [1, 2, 5, 8]

        System.out.println();

        // ✅ Example 3: Sort in Reverse Order
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums); // [8, 5, 2, 1]

        System.out.println();

        // ✅ Example 4: Sort Strings by Length
        List<String> names2 = new ArrayList<>(List.of("Ram", "Krishna", "A", "Shyam"));
        Collections.sort(names2, Comparator.comparingInt(String::length));
        System.out.println(names2); // [A, Ram, Shyam, Krishna]

        /**
         * 🔁 Difference: Collections.sort() vs List.sort()
         * | Feature                 | `Collections.sort()`        | `List.sort()`              |
         * | ----------------------- | --------------------------- | -------------------------- |
         * | Belongs to              | `Collections` utility class | `List` interface (Java 8+) |
         * | Supports lambda?        | ✅ Yes                       | ✅ Yes                      |
         * | Modifies original list? | ✅ Yes                       | ✅ Yes                      |
         * | Return type             | `void`                      | `void`                     |
         * | Use with all Lists      | ✅ Yes                       | ✅ Yes                      |
         * | Prefer (modern Java)    | ❌ Slightly older style      | ✅ More modern & cleaner    |
         *
         * Dono — Collections.sort() aur ArrayList.sort() — sirf aur sirf List type objects (like ArrayList, LinkedList, Vector, etc.) ke liye hi banaye gaye hain.
         * Directly arrays, Set, Map, etc. ke liye yeh use nahi hote.
         */



    }
}
