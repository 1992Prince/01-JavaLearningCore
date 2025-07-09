package org.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P6_ALSortMethodDemo {

    public static void main(String[] args) {

        /**
         * ✅ ArrayList.sort() Method
         * 🔹 Purpose:
         *  Sorts the list in-place (modifies original list) using a Comparator you provide
         *
         *  🔹 Syntax: - list.sort(Comparator);
         *  ⚠️ This method does NOT return a new list — it modifies the existing one.
         *
         * 🧠 How it's different from Collections.sort()?
         * | Method               | Belongs to          | Mutates original? | Supports lambdas? |
         * | -------------------- | ------------------- | ----------------- | ----------------- |
         * | `ArrayList.sort()`   | `List` interface    | ✅ Yes             | ✅ Yes             |
         * | `Collections.sort()` | `Collections` class | ✅ Yes             | ✅ Yes             |
         *
         * Both work the same for most use cases, but list.sort() is cleaner and direct.
         *
         */

        // ✅ 1. Sort Strings Alphabetically
        List<String> names = new ArrayList<>(List.of("Zara", "Amit", "Brijesh"));
        names.sort(Comparator.naturalOrder());
        System.out.println(names); // [Amit, Brijesh, Zara]

        System.out.println();

        // ✅ 2. Sort Strings in Reverse
        names.sort(Comparator.reverseOrder());
        System.out.println(names); // [Zara, Brijesh, Amit]

        System.out.println();

        //✅ 3. Sort Integers Ascending
        List<Integer> nums = new ArrayList<>(List.of(5, 1, 10, 3));
        nums.sort(Comparator.naturalOrder());
        System.out.println(nums); // [1, 3, 5, 10]

        System.out.println();

        // ✅ 4. Sort Integers Descending
        nums.sort(Comparator.reverseOrder());
        System.out.println(nums); // [10, 5, 3, 1]

        System.out.println();

        // ✅ 5. Sort by String Length - It sorts the list by string length in ascending order.
        //
        List<String> names2 = new ArrayList<>(List.of("Ram", "Shyam", "A", "Krishna"));
        names2.sort(Comparator.comparingInt(String::length));
        System.out.println(names2); // [A, Ram, Shyam, Krishna]

        /**
         * This is a factory method that returns a comparator which compares integer values derived from each element.
         * You pass it a function: String::length
         * This is a method reference, equivalent to: s -> s.length()
         * So Comparator.comparingInt(String::length) returns a comparator that compares strings by their length.
         *
         * 🔁 If you want Descending Order (badi se chhoti length):
         * Just chain .reversed() at the end like this:
         * names2.sort(Comparator.comparingInt(String::length).reversed());
         */

        System.out.println();
        System.out.println("-------Sorting by String Length in Descending Order----------");
        System.out.println();

        List<String> names3 = new ArrayList<>(List.of("Ram", "Shyam", "A", "Krishna"));

        // 🔁 Sort by string length in DESCENDING order
        names3.sort(Comparator.comparingInt(String::length).reversed());

        System.out.println(names3);  // Output: [Krishna, Shyam, Ram, A]

        System.out.println();

        /**
         * ✅ 6. Custom Object Sort
         * class Person {
         *     String name;
         *     int age;
         *     Person(String name, int age) {
         *         this.name = name;
         *         this.age = age;
         *     }
         *     public String toString() {
         *         return name + " - " + age;
         *     }
         * }
         *
         *  🔸 Sort by age
         *
         *  List<Person> people = new ArrayList<>();
         * people.add(new Person("Amit", 30));
         * people.add(new Person("Brijesh", 25));
         * people.add(new Person("Chetan", 40));
         *
         * people.sort(Comparator.comparingInt(p -> p.age));
         * System.out.println(people); // Brijesh - 25, Amit - 30, Chetan - 40
         *
         * 🔸 Sort by name reverse
         * people.sort((p1, p2) -> p2.name.compareTo(p1.name));
         *
         * ❗ Warning: Null Values
         * If your list has null, use a null-safe comparator:
         * list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
         *
         */





    }
}
