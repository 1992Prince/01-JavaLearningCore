package org.arrays;

public class P1_Basics {

    /*
============================================================================================
🎯 Arrays in Java – Interview Notes and Concepts
============================================================================================

1️⃣ Array Declaration in Java:

// Syntax:
datatype[] arrayName;      // Recommended style
datatype arrayName[];      // Also valid

Example:
int[] arr;                 // Declaration only
String[] names;

2️⃣ Array Initialization (separate step):

arr = new int[5];          // Initializing with size 5 (default values = 0)
names = new String[3];     // default values = null

3️⃣ Declaration and Initialization in one line:

int[] arr = new int[5];                  // Default values
String[] fruits = {"Apple", "Banana"};   // Direct value assignment
char[] vowels = {'a', 'e', 'i', 'o', 'u'};

--------------------------------------------------------------------------------------------

4️⃣ Arrays of Object class (works for any type):
Array in java can only store homogeneous data type elements but if u are creating array if Object class type
then u can store any data type values in it.

Object[] items = new Object[3];
items[0] = "Java";
items[1] = 42;
items[2] = true;

✅ Useful when storing mixed types or unknown types.

--------------------------------------------------------------------------------------------

5️⃣ Is Array Primitive or Reference Type?

- Array is a **reference type** in Java.
- It is **stored in heap memory**.
- Array variable (reference) is stored in **stack**, actual object is on **heap**.
- It is a direct subclass of `Object`.

--------------------------------------------------------------------------------------------

6️⃣ Array Limitations:

❌ Fixed size – can’t grow/shrink dynamically (unlike ArrayList).
❌ Can hold only homogeneous data (unless using Object array).
❌ No built-in methods (like add, remove, etc.).

✅ Use collections (ArrayList) for dynamic behavior.

--------------------------------------------------------------------------------------------

7️⃣ Declaring Array with Size and Storing Elements:

int[] nums = new int[4];  // Size = 4

nums[0] = 10;
nums[1] = 20;
nums[2] = 30;
nums[3] = 40;

System.out.println(nums.length);  // Output: 4

--------------------------------------------------------------------------------------------

8️⃣ Accessing Array Elements:

🔸 Using for loop:
for (int i = 0; i < nums.length; i++) {
    System.out.println(nums[i]);
}

🔸 Using for-each loop:
for (int n : nums) {
    System.out.println(n);
}

--------------------------------------------------------------------------------------------

9️⃣ Array of Custom/Customized Class:

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

Student[] students = new Student[3];

students[0] = new Student(101, "Aman");
students[1] = new Student(102, "Ravi");
students[2] = new Student(103, "Kiran");

for (Student s : students) {
    System.out.println(s.id + " - " + s.name);
}

--------------------------------------------------------------------------------------------

🧠 Interview Tip:
- Interviewer might ask difference between array and ArrayList.
- They may also test fixed-size limitation and memory storage questions.

============================================================================================
*/

    /*
--------------------------------------------------------------------------------------------
🧩 Default Values in Array (when created with size):

When you create an array with a fixed size, and don't assign values manually,
Java automatically fills it with **default values** based on the data type.

🔸 For Primitive Types:
    - int, short, byte, long → 0
    - float, double          → 0.0
    - char                   → '\u0000' (null character)
    - boolean                → false

🔸 For Reference/Object Types:
    - String, custom classes, etc. → null

✅ Example:

int[] nums = new int[3];           // {0, 0, 0}
boolean[] flags = new boolean[2]; // {false, false}
String[] names = new String[2];   // {null, null}
Student[] students = new Student[2]; // {null, null}

for (String name : names) {
    System.out.println(name);  // prints null
}

for (int n : nums) {
    System.out.println(n);     // prints 0
}
--------------------------------------------------------------------------------------------
*/


}
