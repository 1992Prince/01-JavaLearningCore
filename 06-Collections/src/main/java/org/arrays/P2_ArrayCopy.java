package org.arrays;

public class P2_ArrayCopy {

    /*
============================================================================================
📌 Copying Arrays in Java – Interview Notes & Examples
============================================================================================

1️⃣ Using a for loop:

int[] original = {10, 20, 30};
int[] copy = new int[original.length];

for (int i = 0; i < original.length; i++) {
    copy[i] = original[i];
}

// ✅ Both arrays are now independent
copy[0] = 99;
System.out.println(original[0]);  // Output: 10 (unchanged)

--------------------------------------------------------------------------------------------

2️⃣ Using Arrays.copyOf()

import java.util.Arrays;

int[] original = {1, 2, 3, 4, 5};
int[] copied = Arrays.copyOf(original, original.length);  // full copy

int[] resized = Arrays.copyOf(original, 7);  // extra slots are filled with default (0)

// ✅ Arrays.copyOf creates a **new array**
System.out.println(Arrays.toString(resized));  // [1, 2, 3, 4, 5, 0, 0]

--------------------------------------------------------------------------------------------

3️⃣ Using Arrays.copyOfRange()

import java.util.Arrays;

int[] original = {10, 20, 30, 40, 50};

int[] rangeCopy = Arrays.copyOfRange(original, 1, 4);  // from index 1 to 3 (exclusive of 4)

// Output: [20, 30, 40]
System.out.println(Arrays.toString(rangeCopy));

--------------------------------------------------------------------------------------------

🧠 Interview Tip:
- Interviewer may ask: "Do Arrays.copyOf() and clone() do deep copy?"
   🔸 They perform **shallow copy** — good enough for primitives.
   🔸 For objects, only references are copied.

============================================================================================
*/

}
