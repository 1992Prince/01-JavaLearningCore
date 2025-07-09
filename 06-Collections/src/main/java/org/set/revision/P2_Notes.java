package org.set.revision;

public class P2_Notes {

    /*
===========================================================================================
👉 Q1. What is initial capacity and load factor of HashSet constructor?

🔹 Interview Explanation:
- When we create a HashSet like: `HashSet<String> set = new HashSet<>();`
- Internally, it uses a HashMap to store elements.
- Default initial capacity is **16** (i.e., 16 buckets to begin with).
- Default load factor is **0.75**, which defines when the HashSet should resize.

🔹 Meaning:
  - Threshold = capacity × loadFactor = 16 × 0.75 = 12
  - HashSet resizes when the number of elements **exceeds 12**, i.e., **on adding the 13th element**.

✅ Correct wording: "Resizing happens when size > threshold, not when it equals threshold."

🔹 Default Constructor:
    HashSet<String> set = new HashSet<>();
    // Internally creates: new HashMap<>(16, 0.75f);
===========================================================================================
*/

    /*
    ===========================================================================================
    👉 Q2. Explain Capacity vs Size

    🔹 Capacity:
        - Refers to how many total **buckets (slots)** are available in the internal HashMap.
        - Not directly visible or controllable from HashSet.

    🔹 Size:
        - The actual number of elements currently stored.

    🔹 Example:
        HashSet<String> set = new HashSet<>();
        set.add("A"); set.add("B");

        // Size = 2
        // Capacity = internal, starts at 16 by default
    ===========================================================================================
    */

    /*
===========================================================================================
👉 Q3. When does HashSet increase its size?

🔹 Explanation:
- HashSet increases its capacity (resizes) when:
      size > (capacity × loadFactor)

- In default configuration:
    capacity = 16
    loadFactor = 0.75
    threshold = 16 × 0.75 = 12

✅ Resize occurs when you try to add the 13th element.
   (i.e., size becomes 13 > threshold)

🔹 Interview Tip:
- Be clear: "Resize doesn't happen at 12. It happens **after 12**, on insertion of 13th element."
- Resizing is expensive as it rehashes all existing elements to new buckets.
===========================================================================================
*/

      /*
    ===========================================================================================
    👉 Q4. Why doesn't Set have methods like get(), indexOf()?

    🔹 Explanation:
        - Set doesn’t guarantee order (unless it's a LinkedHashSet or TreeSet)
        - Since there's no order or index, `get()` or `indexOf()` don’t make sense
        - Purpose of Set is to store **unique values**, not positional access.
        - And HashSet stores elements based on hash code of elements

    🔹 Example:
        HashSet<String> set = new HashSet<>();
        // set.get(0); ❌ Compile Error
    ===========================================================================================
    */

    /*
    ===========================================================================================
    👉 Q5. Can we retrieve elements from HashSet using get()? If not, how?

    🔹 Answer:
        - ❌ No, HashSet doesn’t support get().
        - ✅ Use iterator or enhanced for loop

    🔹 Example:
        for (String val : set) {
            System.out.println(val);
        }

        OR

        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    ===========================================================================================
    */

     /*
    ===========================================================================================
    👉 Q6. What is return type of add() method in HashSet? What if we add duplicate?

    🔹 Answer:
        - `add()` returns a **boolean**.
        - Returns `true` if element was added, `false` if it was already present.

    🔹 Example:
        HashSet<String> set = new HashSet<>();
        set.add("A");  // true
        set.add("A");  // false
    ===========================================================================================
    */

     /*
    ===========================================================================================
    👉 Q7. HashSet is best for which operation and why?

    🔹 Answer:
        - Best for: **Checking existence**, uniqueness, insert/delete.
        - Because it offers **O(1)** average time for:
            - `add()`
            - `remove()`
            - `contains()`

    🔹 Example Use Cases:
        - Removing duplicates
        - Finding unique items
        - Fast membership check
    ===========================================================================================
    */

     /*
    ===========================================================================================
    👉 Q8. Can we add two null values into HashSet?

    🔹 Answer:
        - ❌ No. Only one `null` is allowed in a HashSet.
        - Because it's backed by HashMap, which only allows one `null` key.

    🔹 Example:
        HashSet<String> set = new HashSet<>();
        set.add(null);
        set.add(null);  // Ignored
    ===========================================================================================
    */

     /*
    ===========================================================================================
    👉 Q9. Are HashSet methods synchronized? How to make it thread-safe?

    🔹 Answer:
        - ❌ No, HashSet is **not synchronized**.
        - ✅ Use `Collections.synchronizedSet()` to make it thread-safe.

    🔹 Example:
        Set<String> syncSet = Collections.synchronizedSet(new HashSet<>());

    🔹 Advanced:
        - For better concurrent performance, use `ConcurrentHashMap.newKeySet()` in Java 8+.
    ===========================================================================================
    */

    /*
===========================================================================================
👉 Q10. Why are duplicates not allowed in Set?

🔹 Interview Explanation:
- The main purpose of a `Set` in Java is to store **unique elements**.
- That’s why Java's Set interface does **not allow duplicates**.

🔹 Internally:
- In `HashSet`, it uses a `HashMap` where values[HashSet elements] are stored as map keys.
- Map keys are unique — so `HashSet` also stores only unique values.

🔹 Example:
    HashSet<String> set = new HashSet<>();
    set.add("Java");    // returns true
    set.add("Java");    // returns false (not added again)

✅ In interview, say:
> "Set is designed for uniqueness. HashSet uses a HashMap where keys are unique, so duplicates are naturally disallowed."
===========================================================================================
*/


/*
===========================================================================================
👉 Q11. What is LinkedHashSet and when should we use it instead of HashSet?

🔹 Interview Explanation:
- `LinkedHashSet` is a subclass of `HashSet` that maintains **insertion order**.
- Internally, it uses a doubly-linked list to remember the order in which elements were inserted.

🔹 Use LinkedHashSet when:
  ✅ You want uniqueness like HashSet
  ✅ AND want to maintain insertion order

🔹 HashSet vs LinkedHashSet:
  - HashSet: No order guarantee
  - LinkedHashSet: Maintains insertion order

🔹 Example:
    LinkedHashSet<String> set = new LinkedHashSet<>();
    set.add("A");
    set.add("C");
    set.add("B");
    // Output: A, C, B

✅ Interview line:
> "If order matters along with uniqueness, use LinkedHashSet over HashSet."
===========================================================================================
*/


/*
===========================================================================================
👉 Q12. What is the difference between Set, HashSet, LinkedHashSet, and TreeSet?

HashSet, LinkedHashSet and TreeSet are classes and implementations of Set interface.

| Feature / Property                      | `HashSet`                              | `LinkedHashSet`                           | `TreeSet`                                         |
| --------------------------------------- | -------------------------------------- | ----------------------------------------- | ------------------------------------------------- |
| **Underlying Data Structure**           | Hash Table                             | Hash Table + Doubly Linked List           | Red-Black Tree (Self-balancing BST)               |
| **Order of Elements**                   | ❌ Not maintained                       | ✅ Maintains insertion order               | ✅ Maintains **sorted order** (natural/comparator) |
| **Null Elements**                       | ✅ Allows **one** null element          | ✅ Allows **one** null element             | ❌ Throws `NullPointerException` (from JDK 1.7+)   |
| **Heterogeneous Elements**              | ✅ Allowed                              | ✅ Allowed                                 | ❌ ❌ Not allowed (throws `ClassCastException`)     |
| **Performance (add, remove, contains)** | ⚡ Fastest — O(1) average               | ⚡ Slightly slower (due to linked list)    | 🐢 Slower — O(log n)                              |
| **Sorting**                             | ❌ Not sorted                           | ❌ Not sorted                              | ✅ Automatically sorted                            |
| **Duplicates**                          | ❌ Not allowed                          | ❌ Not allowed                             | ❌ Not allowed                                     |
| **When to Use?**                        | When you want fast lookup & uniqueness | When insertion order matters + uniqueness | When you need sorted unique elements              |

===========================================================================================
*/

}
