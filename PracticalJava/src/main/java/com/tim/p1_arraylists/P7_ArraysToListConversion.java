package com.tim.p1_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P7_ArraysToListConversion {

    public static void main(String[] args) {

        /**
         1️⃣ Using Arrays.asList() – Fixed-size List
         Agar tum array ko List me convert karna chahte ho aur size change nahi karna (add/remove nahi karna), to Arrays.asList() best hai.
         */

        String[] array = {"Apple", "Banana", "Cherry"};

        // Convert Array to Fixed-size List
        List<String> list = Arrays.asList(array);

        System.out.println(list); // [Apple, Banana, Cherry]

        list.set(1, "Mango"); // ✅ Allowed (Modify)
        System.out.println(list); // [Apple, Mango, Cherry]

        System.out.println();

        /**
         * 2️⃣ Using new ArrayList<>(Arrays.asList()) – Fully Modifiable List
         * Agar tum fully modifiable list chahte ho (jisme add/remove bhi kar sako), to ye best practice hai.
         */

        String[] array2 = {"Apple", "Banana", "Cherry"};

        // Convert to Fully Modifiable List
        List<String> list2 = new ArrayList<>(Arrays.asList(array2));

        list2.add("Orange"); // ✅ Allowed
        list2.remove("Banana"); // ✅ Allowed

        System.out.println(list2); // [Apple, Cherry, Orange]

        System.out.println();

        /**
         * 3️⃣ Using List.of() – Immutable List (Java 9+)
         * Agar tumhe sirf read-only list chahiye (jo kabhi modify na ho), to List.of() best hai.
         */

        String[] array3 = {"Apple", "Banana", "Cherry"};

        // Convert to Immutable List
        List<String> list3 = List.of(array3);

        System.out.println(list3); // [Apple, Banana, Cherry]

        list3.add("Orange"); // ❌ UnsupportedOperationException
    }
}
