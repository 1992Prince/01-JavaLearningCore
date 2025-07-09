package org.set.revision;

public class P4_Notes {

/*
===========================================================================================
👉 Comparable vs Comparator in Java

🔹 1. Package:
   - Comparable is present in **java.lang** package.
   - Comparator is present in **java.util** package.

🔹 2. Purpose:
   - Comparable is used for **default (natural) sorting order**.
   - Comparator is used for **customized sorting order**.

🔹 3. Method to override:
   - Comparable: override `compareTo(Object o)` method.
   - Comparator: override `compare(Object o1, Object o2)` method.

🔹 4. Who implements it?
   - Comparable: the class that needs sorting must **implement Comparable**.
   - Comparator: you can **write a separate class** or **use lambda/anonymous class** to implement Comparator.

🔹 5. Where used in TreeSet?
   - Comparable: TreeSet uses it **if no Comparator is passed**.
   - Comparator: pass as argument in **TreeSet constructor** for custom sorting.

🔹 6. Example of natural sorting:
   - String, Integer, Double, StringBuffer etc. **already implement Comparable**.
   - So TreeSet can directly sort them in **ascending order / lexicographic**.

🔹 7. For custom class sorting:
   - If using Comparable:
     - Custom class like Student must implement Comparable and override compareTo().
   - If using Comparator:
     - You can create multiple Comparator implementations for sorting by name, id, age, etc.

🔹 8. Custom order for built-in classes:
   - If you want **descending order of Integer**, or **reverse alphabetical for String**, use Comparator.

     ➤ Example:
       `TreeSet<Integer> set = new TreeSet<>((a, b) -> b.compareTo(a)); // Descending order`

🔹 9. Duplicates in TreeSet:
   - In both Comparable and Comparator, if `compareTo()` or `compare()` returns 0 → element is treated as duplicate and won’t be added.

===========================================================================================
*/

    /*
===========================================================================================
🎯 Interview Answer: Difference between Comparable and Comparator in Java

1️⃣ Comparable:
   - It is in **java.lang** package.
   - Used for **natural sorting order** (e.g., alphabetically, numerically ascending).
   - We must **override compareTo(Object o)** method.
   - The class itself must **implement Comparable interface**.
   - TreeSet or Collections.sort() uses it when **no Comparator is provided**.

   ➤ Example:
     class Student implements Comparable<Student> {
         public int compareTo(Student s) {
             return this.id - s.id; // ascending by ID
         }
     }

2️⃣ Comparator:
   - It is in **java.util** package.
   - Used for **customized sorting order** (e.g., descending, sort by name, age).
   - We must **override compare(Object o1, Object o2)** method.
   - Comparator can be passed as a separate object or lambda to TreeSet / sort method.
   - Allows **multiple sorting logics** without changing the actual class.

   ➤ Example:
     class NameComparator implements Comparator<Student> {
         public int compare(Student s1, Student s2) {
             return s1.name.compareTo(s2.name); // sort by name
         }
     }

     TreeSet<Student> set = new TreeSet<>(new NameComparator());

3️⃣ Key Differences:

| Comparable                            | Comparator                                |
|--------------------------------------|-------------------------------------------|
| Natural sorting (only one way)       | Custom sorting (can define many ways)     |
| Part of java.lang package            | Part of java.util package                 |
| compareTo(Object o) method           | compare(Object o1, Object o2) method     |
| Class must implement it              | Can be a separate class                   |
| Changes required in original class   | No need to change original class          |
| Used implicitly by TreeSet/Collections.sort | Used explicitly by passing Comparator |

===========================================================================================
*/

    /*
===========================================================================================
👉 Q2. How TreeSet uses Comparable internally?

🔹 TreeSet needs elements to be **comparable** so that it can sort them.
🔹 If no Comparator is provided, TreeSet uses the element’s **compareTo()** method of Comparable interface.

🛑 If elements don’t implement Comparable and no Comparator imp passed as arg then → throws ClassCastException

✅ Example:
   TreeSet<String> set = new TreeSet<>();
   // String implements Comparable → no issue.

   TreeSet<MyClass> set = new TreeSet<>();
   // MyClass must implement Comparable or pass a Comparator in constructor.

===========================================================================================
*/

    /*
===========================================================================================
👉 Q3. How to sort TreeSet with Comparator?

🔹 Use TreeSet constructor that accepts a Comparator:

✅ Example:

    TreeSet<Employee> set = new TreeSet<>(new SalaryComparator());

    class SalaryComparator implements Comparator<Employee> {
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e1.salary, e2.salary);
        }
    }

✔ This lets TreeSet sort `Employee` objects by salary instead of default order.
===========================================================================================
*/

    /*
===========================================================================================
👉 Q4. Can we insert heterogeneous elements in TreeSet?

❌ No. TreeSet requires elements to be mutually comparable.[U can't compare Alphabets with Integers]

🔸 Example:
    TreeSet<Object> set = new TreeSet<>();
    set.add("abc");
    set.add(123);

🚫 This throws: `java.lang.ClassCastException`

✅ Reason: "abc".compareTo(123) is invalid.

===========================================================================================
*/

    /*
===========================================================================================
👉 Q5. Can we store custom objects in TreeSet?

✅ Yes, but we must:
   - Either implement Comparable in the custom class
   - Or provide Comparator to TreeSet constructor

❌ Without either, TreeSet can’t compare and throws ClassCastException.
-------------------------------------------------------------------------------------------
🔸 Example 1: Using Comparable:

    class Student implements Comparable<Student> {
        int id;
        public int compareTo(Student s) {
            return this.id - s.id;
        }
    }

🔸 Example 2: Using Comparator:

    class StudentNameComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    }

a custom class does not need to implement Comparable if you're providing a Comparator to the TreeSet constructor.
TreeSet needs a way to sort and maintain order, and it will use Comparator.compare() instead of compareTo()."
===========================================================================================
*/

    /**
     * ✅ Bonus Coding Task Suggestion (ask interviewer or practice):
     * "Write a TreeSet of Employee objects and sort them by:
     * Salary (using Comparator)
     * Name (using Comparator)
     * ID (using Comparable)"
     */


}
