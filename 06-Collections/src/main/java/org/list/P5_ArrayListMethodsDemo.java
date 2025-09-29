package org.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class P5_ArrayListMethodsDemo {

    /**
     * listIterator()
     * retainAll()
     * stream()
     * ArrayList.equals()
     */
    public static void main(String[] args) {

        /**
         * ✅ 1. listIterator() Method
         * 🔹 Purpose
         * listIterator() allows you to iterate both forward and backward over a list.
         * It gives more flexibility than a normal Iterator.
         *
         * syntax - public ListIterator<E> listIterator()
         *
         * 🔹 Use Case
         * Use it when:
         * - You want to traverse a list bidirectionally (forward and backward).
         * - You want to add, remove, or modify elements while iterating.
         */

        List<String> names = new ArrayList<>(List.of("A", "B", "C", "D"));
        ListIterator<String> it = names.listIterator();

        System.out.println("--------Forward Direction Iteration-----------");
        System.out.println("Forward iteration:");


        while (it.hasNext()) {
            System.out.print(it.next() + " "); // A B C D
        }


        System.out.println();
        System.out.println();
        System.out.println("--------Backward Direction Iteration-----------");


        System.out.println("Backward iteration:");
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " "); // D C B A
        }

        System.out.println();
        System.out.println();


        /**
         * 🔧 Common Methods of ListIterator
         * | Method          | Description                        |
         * | --------------- | ---------------------------------- |
         * | `hasNext()`     | Is there a next element?           |
         * | `next()`        | Get the next element               |
         * | `hasPrevious()` | Is there a previous element?       |
         * | `previous()`    | Get the previous element           |
         * | `add(E e)`      | Add an element at current position |
         * | `remove()`      | Remove the last element returned   |
         * | `set(E e)`      | Replace the last element returned  |
         */




        /**
         * ✅ 2. retainAll(Collection<?> c) Method
         * 🔹 Purpose
         * retainAll() removes everything from the current collection except the elements that are also
         * in the specified collection.
         *
         * syntax - public boolean retainAll(Collection<?> c)
         * 🔹 Use Case
         * Use it when:
         * - You want to keep only the common elements between two collections.
         * - It's like doing an intersection.
         */



        System.out.println("--------RetailAll-----------");

        List<String> list1 = new ArrayList<>(List.of("A", "B", "C", "D"));
        List<String> list2 = new ArrayList<>(List.of("B", "C", "X", "Y"));



        /**
         * 🔧 Notes
         * The original list (list1 in this case) gets modified.
         * Elements not present in the second collection are removed.
         * Matalab list1 k saare elements remove karo and jo elements list 2 me present hah list 1 k unko retain karo
         * Returns true if any elements were removed; false if nothing changed.
         */


        System.out.println("Before retainAll method : " + list1); // Before retainAll method : [A, B, C, D]
        list1.retainAll(list2);
        System.out.println("Common elements: " + list1); // Common elements: [B, C]
        System.out.println();




        System.out.println("----------✅ 1. stream()----------------");
        /**
         * 🔹 What it does:
         * stream() turns a collection (like an ArrayList) into a Stream so you can use
         * functional-style operations like filter, map, sorted, collect, etc.
         */
        List<String> names2 = List.of("Arun", "Amit", "Brijesh", "Ankit", "Zara");

        List<String> filtered = names2.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(filtered); // [Arun, Amit, Ankit]
        System.out.println();




        System.out.println("----------✅ ArrayList.equals() Method----------------");
        /**
         *🔹 Purpose:
         * Checks if two lists are equal in both:
         * 1. Size
         * 2. Order of elements
         * 3. Value of elements (using .equals() for each)
         *
         * ⚠️ It does not check reference equality (==), it checks value equality.
         *
         * syntax = boolean isEqual = list1.equals(list2);
         */



        List<String> list3 = new ArrayList<>(List.of("A", "B", "C"));
        List<String> list4 = new ArrayList<>(List.of("A", "B", "C"));

        System.out.println(list3.equals(list4)); // ✅ true
        // ✔️ Same elements, same order, same size — so returns true.



        // 🧪 Example 2: Same elements, different order
        List<String> list5 = new ArrayList<>(List.of("A", "B", "C"));
        List<String> list6 = new ArrayList<>(List.of("C", "B", "A"));

        System.out.println(list5.equals(list6)); // ❌ false
        // ❌ Order is different, so lists are not equal.



        // 🧪 Example 3: Different size
        List<String> list7 = new ArrayList<>(List.of("A", "B"));
        List<String> list8 = new ArrayList<>(List.of("A", "B", "C"));

        System.out.println(list7.equals(list8)); // ❌ false



        /**
         * for comparing ArrayList of custom objects, we need to override equals method of custom class
         * ❗ If you DON’T Override equals() -> (compares object references)
         *
         * class Student {
         *     String name;
         *     Student(String name) {
         *         this.name = name;
         *     }
         *     public boolean equals(Object o) {
         *         if (this == o) return true;
         *         if (!(o instanceof Student)) return false;
         *         return this.name.equals(((Student)o).name);
         *     }
         * }
         *
         * List<Student> list1 = new ArrayList<>();
         * list1.add(new Student("Arun"));
         * list1.add(new Student("Brijesh"));
         *
         * List<Student> list2 = new ArrayList<>();
         * list2.add(new Student("Arun"));
         * list2.add(new Student("Brijesh"));
         *
         * System.out.println(list1.equals(list2)); // ✅ true (if equals() overridden)
         */





    }
}

