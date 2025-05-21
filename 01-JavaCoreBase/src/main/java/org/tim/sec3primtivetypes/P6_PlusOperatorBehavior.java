package org.tim.sec3primtivetypes;

public class P6_PlusOperatorBehavior {

     /*
     🔹 + Operator in Java (Overloaded behavior):
     --------------------------------------------

     ✅ The `+` operator behaves differently based on the data types involved:

     ➤ 1. Arithmetic Addition:
        - If both operands are numeric (int, float, char, etc.), `+` performs **addition**.

        Example:
          int a = 10;
          int b = 20;
          System.out.println(a + b); // Output: 30

        💡 With `char`:
        - A `char` has an underlying Unicode integer value, so adding two chars results in an **int** (Unicode values are added).

        Example:
          char x = 'A'; // Unicode = 65
          char y = 'B'; // Unicode = 66
          System.out.println(x + y); // Output: 131

        💡 Behavior:
        - `char + char` → int result (numeric addition of Unicode values)
        - `char + int` → int result
        - `char + float` → float result

     ➤ 2. String Concatenation:
        - If **any operand is a String**, the `+` operator performs **concatenation**.

        Example:
          String s = "Age: ";
          int age = 30;
          System.out.println(s + age); // Output: Age: 30

        💡 With `char` and `String`:
        - If a `char` is added to a String, it gets concatenated (converted to string first).

        Example:
          char c = 'A';
          String name = "Char is: ";
          System.out.println(name + c); // Output: Char is: A

        - Order matters:
          System.out.println('A' + 10 + "Z");
          → 'A' = 65, 65 + 10 = 75, 75 + "Z" = "75Z"

          System.out.println("Z" + 'A' + 10);
          → "Z" + 'A' = "ZA", "ZA" + 10 = "ZA10"

     ✅ Summary:

     | Operand1 | Operand2 | Result                  |
     |----------|----------|--------------------------|
     | char     | char     | int (sum of Unicode)     |
     | char     | int      | int                      |
     | char     | String   | String (concatenation)   |
     | String   | int      | String                   |
     | String   | String   | String                   |

     ----------------------------------------------------------

     🧠 Behind the scenes:
     - When using `+` with a `String`, Java internally calls `StringBuilder.append(...)` to efficiently concatenate.

     ----------------------------------------------------------
    */

    public static void main(String[] args) {
        // Example 1: char + char → int
        char c1 = 'A';
        char c2 = 'B';
        System.out.println(c1 + c2); // Output: 131

        // Example 2: String + char → String
        String str = "Char: ";
        System.out.println(str + c1); // Output: Char: A

        // Example 3: Mixed expression
        System.out.println("Result: " + c1 + 10); // Output: Result: A10
        System.out.println(c1 + 10 + " is value"); // Output: 75 is value (65 + 10)
    }
}
