package org.set;

import java.util.TreeSet;

public class P3_ComparableDemo {

    public static void main(String[] args) {

        System.out.println("A".compareTo("B")); // -1
        System.out.println("Z".compareTo("K")); // 15
        System.out.println("A".compareTo("A")); // 0
        // System.out.println("A".compareTo(null)); // NPE

        /**
         * Above, we are using String objects, and the String class implements the Comparable interface.
         * That's why we can access the compareTo() method with String objects.
         *
         * But with StringBuffer objects, we cannot use compareTo(), because StringBuffer does not
         * implement the Comparable interface.
         *
         * Note: String and all Wrapper classes (like Integer, Double, etc.) implement the Comparable interface.
         */

        /**
         * What is relation b/w Comparable interface and TreeSet class?
         * ✅ TreeSet automatically sorts the elements
         * To sort elements, TreeSet needs to know how to compare them.
         * By default, TreeSet relies on the compareTo() method of the Comparable interface.
         */

        System.out.println();

        /**
         * ✅ 1. TreeSet with String or Wrapper classes
         * These classes already implement Comparable, so TreeSet can sort them automatically.
         * These will be sorted in natural sorting order
         * Natural sorting order for integers are ascending
         * Natural sorting order for strings are a,b,c.... [lexicographically]
         */

        //🔹 Example: TreeSet with String
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");

        System.out.println(set); // [Apple, Banana, Mango] (sorted lexicographically)

        // 🔹 Example: TreeSet with Integer (Wrapper class)

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(10);
        set2.add(5);
        set2.add(20);

        System.out.println(set2); // [5, 10, 20]

        // 🟢 Note: No error because String, Integer already implement Comparable.

        /**
         * ✅ 2. TreeSet with Custom Class implementing Comparable interface
         * If you're adding custom objects,
         * TreeSet needs to know how to sort. So the class must implement Comparable and override compareTo().
         * Bcoz TreeSet internally uses compareTo() methods to sort elements.
         * Custom class issi compareTo method ko override karegi ki kiss order me class objects TreeSet me store hone chaiye.
         * Aur yeh uss custom class ka default sorting order hoga.
         *
         * Check P4_Student class implementation example
         */

    }
}
