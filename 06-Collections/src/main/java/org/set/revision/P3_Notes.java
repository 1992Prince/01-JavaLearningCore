package org.set.revision;

public class P3_Notes {

    /*
===========================================================================================
👉 Q. What is Hashing Concept? How do we get hashCode of an object in Java?

🔹 1️⃣ What is Hashing?

- Hashing is a technique that converts an object into a fixed-size integer (called hash code).
- This hash code is used to **store** and **locate** objects quickly [inside buckets] in data structures
  like HashSet or HashMap.
- A hash function takes an input and returns an integer — which determines the bucket index.

  Once u get hashcode then it will be used to find bucket to store object. and later to locate this bucket to look for object.

🔹 Why is Hashing used?
✅ Fast lookup, insertion, deletion (avg. O(1))
✅ Used in Set, Map, Hashtable, etc.

-------------------------------------------------------------------------------------------

🔹 2️⃣ How to get hashCode in Java?

- Every class in Java inherits `hashCode()` method from `Object` class.
String str = "Java";
int hash = str.hashCode();   // returns some integer hash like 2301506
System.out.println(hash);    // Output: 2301506

In Java, hashing is implemented using hashCode() method.
For custom classes, overriding both equals() and hashCode() is mandatory to maintain correct behavior
in HashSet or HashMap.
*/

/*
===========================================================================================
👉 Q. How does HashSet work internally?

When we create obj of HashSet, behind the scene internal hashmap is created.
public HashSet() {
  map = new HashMap<>();
}

HashSet elements are stored as keys of HashMap and so uniqueness of elements is maintained in HashSet.
Since keys in HashMap are uniqueness and can't be duplicated.
Also in HashMap, we can add one null key and so we are able to add one null element in HashSet also.
For each element HashSet add method add value as PRESENT in HASHAMP as constant.

public boolean add(E e){
 return map.put(e, PRESENT) == null;
}

more elaborative below

1️⃣ When we create a HashSet object:
    HashSet<String> set = new HashSet<>();
    Internally, this creates a HashMap instance like:
    public HashSet() {
        map = new HashMap<>();
    }
2️⃣ How elements are stored:
    - HashSet elements are stored as **keys** in the internal HashMap.
    - A dummy constant object named PRESENT is used as the **value**.

    private static final Object PRESENT = new Object();
    - For every call to add(), the element is inserted into the map:
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

3️⃣ How uniqueness is maintained:
    - HashMap does not allow duplicate keys.
    - So when you try to add a duplicate element to HashSet:
        → hashCode() is used to find the bucket
        → equals() is used to check if an element already exists
    - If the element already exists, it is NOT added again.

4️⃣ Null handling:
    - HashMap allows one null key.
    - Therefore, HashSet allows **one null element**.

===========================================================================================
👉 Q. How does HashSet maintain uniqueness?

- HashSet stores elements as keys in a HashMap.
- HashMap keys must be unique, so:
    → Duplicate elements are not inserted.
    → hashCode() is used to calculate the bucket.
    → equals() is used to check actual equality in case of collision.

===========================================================================================
👉 Q. How does the add() method in HashSet work?
- The add() method internally calls map.put(key, PRESENT).
Example:
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }
- If the element does not exist:
    → It is added as a new key → map.put() returns null → add() returns true

- If the element already exists:
    → map.put() returns existing value → add() returns false

===========================================================================================
*/
    /*
===========================================================================================
👉 Q. How are elements added in HashSet? (Step-by-step internal process)

🧠 HashSet is backed by a HashMap, so adding elements follows the same process as inserting keys in HashMap.
Here's how the process works:

1️⃣ HashSet uses HashMap internally:
    HashSet<String> set = new HashSet<>();
    Internally creates:
    HashMap<String, Object> map = new HashMap<>();
    For each element `e`, when we call:
    set.add(e)
    Internally:
    map.put(e, PRESENT); // where PRESENT is a constant dummy value

-------------------------------------------------------------------------------------------
2️⃣ Steps followed during `add()`:

🔹 Step 1: `hashCode()` is called on the element to compute the hash.
🔹 Step 2: HashMap uses this hash to calculate bucket index (0–15 for default 16 capacity):
        int index = (n - 1) & hash;

🔹 Step 3: The bucket (array index) is checked:
   - If it's **empty** → element is added directly.
   - If **not empty** → collision occurred → next step:

🔹 Step 4: In case of collision:
   - HashMap compares existing keys in the bucket using `equals()`.
   - If `equals()` returns true → element is duplicate → not added → `add()` returns false.
   - If `equals()` returns false → element is added to the bucket:

     ✅ Before Java 8: as a node in a **LinkedList**
     ✅ From Java 8+: if collisions exceed threshold (>=8 nodes), it's converted to a **Balanced Tree (Red-Black Tree)** for better performance.

🔹 Step 5: `add()` method returns:
   - `true` if element is newly added
   - `false` if it's already present (duplicate)

-------------------------------------------------------------------------------------------
3️⃣ Summary (interview-style):

✔ HashSet stores elements as **keys** in an internal HashMap
✔ `hashCode()` decides the bucket
✔ `equals()` checks for actual content equality
✔ Collisions are handled using LinkedList or Tree
✔ Duplicate entries are not added because HashMap keys are unique

===========================================================================================
*/

    /*

1️⃣ What is a collision?

- A **collision** occurs when two different objects have the same `hashCode()` value.
- In a HashMap (used by HashSet), this means both keys will be placed in the **same bucket index**.
Example:
    obj1.hashCode() == obj2.hashCode()
But:
    !obj1.equals(obj2)


👉 Q. How are collisions resolved in HashSet (internally using HashMap)?

When we add elements in a HashSet:

1️⃣ HashSet internally stores elements as **keys** in a HashMap.

2️⃣ For each element:
    - HashMap calculates the **hashCode** to determine which bucket to use.
    - If the bucket is empty → element is inserted directly.
    - If the bucket is already occupied → **collision happens**.

3️⃣ Collision Handling Process:

🔸 Step 1: Existing keys in that bucket are compared using `equals()`.

    - If any existing key returns `true` from `equals()`:
        → The element is considered a **duplicate**.
        → It is **not added**, and `add()` returns `false`.

    - If no match is found (`equals()` returns `false` for all):
        → The new element is added to the same bucket.

🔸 Step 2: How multiple elements are stored in one bucket?

✅ **Before Java 8**:
   - Colliding elements are stored using a **Singly Linked List** in the same bucket.
   - Each node holds one key (i.e., HashSet element).

✅ **Java 8 and after**:
   - If a single bucket contains more than **8 elements**, and total HashMap size > 64:
       → The bucket is converted from a LinkedList to a **Balanced Tree (Red-Black Tree)**.
   - This improves performance from O(n) to **O(log n)** for lookups.

4️⃣ Real Case Example (interview bolne ke liye):

> "Sir, if two elements have the same hashCode but are not equal by content, then they are stored in the same bucket using a LinkedList. After Java 8, if too many elements collide, that list is converted to a Tree for faster access."

5️⃣ Summary:

✔ Collisions happen when multiple elements hash to the same bucket
✔ equals() checks for actual duplicates
✔ LinkedList used before Java 8
✔ Tree (Red-Black Tree) used after Java 8 if collisions are high
✔ Still maintains uniqueness by ensuring keys are not equal
*/

    /*
===========================================================================================
👉 Q1. HashSet vs ArrayList: Which one is better for lookups?

🔹 What is lookup?
   - "Lookup" means searching whether a particular element is present in a collection.
   - Example: `collection.contains("item");`

🔹 Comparison:

📌 HashSet:
   - Uses hashing → average time complexity: **O(1)**
   - Internally backed by HashMap
   - Fastest for lookup operations

📌 ArrayList:
   - Uses linear search (traverses all elements)
   - Time complexity: **O(n)** in worst case
   - Slower for large data

✅ Conclusion:
   - For **fast search/lookup**, HashSet is much better than ArrayList.
   - But HashSet doesn't maintain order.

-------------------------------------------------------------------------------------------
*/

    /*
===========================================================================================
👉 Q2. Why heterogeneous elements are not allowed in TreeSet?

🔹 TreeSet stores elements in **sorted order** using natural ordering (Comparable)
   OR custom Comparator (if provided).

🔹 To compare elements, TreeSet uses:
    element1.compareTo(element2)

❌ If we add heterogeneous types (e.g., String and Integer), they are **not mutually comparable**.
   → It will throw `ClassCastException` at runtime.

✅ Interview Tip:
   - Say: "TreeSet must compare elements to maintain sort order.
           So all elements must be mutually comparable (same type or with common Comparator)."

-------------------------------------------------------------------------------------------
*/

    /*
===========================================================================================
👉 Q3. Can we add 2 Customer objects with same data into HashSet?

🔹 If `hashCode()` and `equals()` are not overridden → YES, both objects will be added.
   - Because default `equals()` compares memory address (==).

🔹 If `hashCode()` and `equals()` are properly overridden → NO, only one will be added.
   - Because HashSet treats them as duplicate.

✅ Interview Tip:
   - In custom classes like Customer, always override both `equals()` and `hashCode()` to
     ensure uniqueness is based on **content**, not object reference.

-------------------------------------------------------------------------------------------
*/


}
