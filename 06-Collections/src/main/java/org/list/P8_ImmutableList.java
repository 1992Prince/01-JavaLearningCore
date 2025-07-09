package org.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P8_ImmutableList {

    public static void main(String[] args) {

        /**
         *
         * ✅ Creating Immutable List in Java 8
         * 🔹 1. Using Collections.unmodifiableList()
         */

        List<String> modifiable = new ArrayList<>();
        modifiable.add("A");
        modifiable.add("B");

        List<String> immutable = Collections.unmodifiableList(modifiable);
        // ⚠️ Warning: If you modify modifiable, the changes reflect in immutable too — it’s a shallow wrapper.
        // ❌ below will throw UnsupportedOperationException:
        // immutable.add("C"); // ❌
        // immutable.set(0, "Z"); // ❌

        System.out.println();

        /**
         * ✅ Immutable List in Java 9+
         * Java 9 introduced factory methods in List interface itself
         * 🔹 1. Using List.of(...)
         *
         * Properties
         * - Immutable
         * - Fixed-size
         * - No nulls allowed (NullPointerException if you try)
         * - ❌ These will throw UnsupportedOperationException:
         * immutable2.add("X"); // ❌
         * immutable2.remove("A"); // ❌
         */

        List<String> immutable2 = List.of("A", "B", "C");

        // ❌ Nulls not allowed:
        // List<String> list = List.of("A", null); // ❌ Throws NullPointerException

        System.out.println();

        /**
         * ✅ Convert List.of() to Modifiable List
         *
         * also u can do
         * List<String> modifiableList = new ArrayList<>(List.of("A", "B", "C"));
         */
        List<String> immutableList = List.of("A", "B", "C");
        // ✅ Create modifiable list from it
        List<String> modifiableList = new ArrayList<>(immutableList);
        // Now you can modify it
        modifiableList.add("D");
        modifiableList.remove("B");
        modifiableList.set(0, "Z");

        System.out.println(modifiableList); // [Z, C, D]

        System.out.println();
        System.out.println("------------✅ 1. Arrays.asList() – Java SE 5+----------");
        System.out.println();

        List<String> list = Arrays.asList("a", "b", "c");

        /**
         * 🔎 Features:
         * Returns a fixed-size list backed by the original array.
         * You can update elements, but can’t add/remove.
         * Allows null values.
         * List is mutable, but size is fixed.
         */
        // ❗ Modifying Example:
        list.set(0, "x");       // ✅ allowed
        // list.add("d");          // ❌ throws UnsupportedOperationException
        // list.remove(1);         // ❌ same error





    }
}
