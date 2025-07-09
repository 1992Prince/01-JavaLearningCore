package org.set;

import java.util.TreeSet;

public class P2_TreeSet {

    public static void main(String[] args) {

        /**
         * 🔹 TreeSet Overview:
         * - TreeSet stores elements in **sorted (ascending) order**.
         * - It does NOT allow:
         *     - null elements (from Java 1.7 onwards)
         *     - heterogeneous elements
         *
         * - Internally, TreeSet uses a Red-Black Tree (Self-balancing Binary Search Tree).
         * - Implements the `SortedSet` and `NavigableSet` interfaces.
         */

        /**
         * ❌ Adding `null` in TreeSet:
         * - TreeSet needs to compare elements for ordering.
         * - Comparing `null` with any other object throws `NullPointerException`.
         *
         * ✅ Null is allowed only if:
         * - TreeSet is empty AND null is the first element added
         * - This worked only in Java 6 and earlier
         * - In Java 7+ → always throws NPE
         *
         * ✅ Tip: If you need to store `null`, prefer `HashSet` (it allows 1 null).
         */

        TreeSet<String> set1 = new TreeSet<>();
        // set1.add(null); // ❌ NullPointerException
        set1.add("A");
        set1.add("Z");
        set1.add("P");
        set1.add("B");

        System.out.println("✅ TreeSet<String>: " + set1); // [A, B, P, Z]

        System.out.println();

        TreeSet<Integer> set2 = new TreeSet<>();
        // set2.add(null); // ❌ NullPointerException
        set2.add(100);
        set2.add(98);
        set2.add(50);
        set2.add(1);

        System.out.println("✅ TreeSet<Integer>: " + set2); // [1, 50, 98, 100]

        System.out.println();

        /**
         * ❗ Even if TreeSet is empty, adding null will throw NPE (Java 7+)
         */
        TreeSet<Object> set3 = new TreeSet<>();
        try {
            set3.add(null); // ❌ NullPointerException
        } catch (NullPointerException e) {
            System.out.println("❗ Can't add null to TreeSet: " + e);
        }

        System.out.println();

        /**
         * ❌ Can We Add Heterogeneous Elements in TreeSet?
         * No. It throws ClassCastException.
         * All elements must be **homogeneous** and **mutually comparable**.
         *
         * Example:
         * set.add("A");
         * set.add(10); // ❌ ClassCastException: String cannot be compared to Integer
         */

        TreeSet<Object> set4 = new TreeSet<>();
        try {
            set4.add("A");
            set4.add(10); // ❌ ClassCastException
        } catch (ClassCastException e) {
            System.out.println("❗ Can't add heterogeneous elements to TreeSet: " + e);
        }

        /**
         * 📌 Summary:
         * -------------------------------
         * ✅ Maintains sorted order (natural)
         * ✅ No duplicates
         * ❌ No nulls (Java 7+)
         * ❌ No heterogeneous objects
         * ✅ Backed by Red-Black Tree
         */

        /**
         * 📌 Tip for Interviews:
         * TreeSet ensures elements are always in sorted order.
         * If you try to add null or incompatible types, you’ll get runtime exceptions.
         *
         * 👉 Use TreeSet when:
         * - You want automatic sorting
         * - You only deal with comparable elements
         * - You don't need to store null
         */
    }
}
