package org.tim.sec3primtivetypes;

public class P7_IncrementDecrementOperators {

     /*
    🔹 Java Increment, Decrement & Compound Assignment Operators
    ------------------------------------------------------------

    ✅ 1. ++ (Increment) and -- (Decrement) Operators

    ➤ Prefix form (++a / --a):
       - Increments or decrements the value, then **uses** the updated value.

    ➤ Postfix form (a++ / a--):
       - **Uses** the current value, then increments or decrements it.

    🔸 Example:
        int a = 5;
        System.out.println(++a); // Output: 6 → first increment then print
        System.out.println(a++); // Output: 6 → print then increment (a becomes 7)
        System.out.println(a);   // Output: 7

    ------------------------------------------------------------

    ✅ 2. Compound Assignment Operators

    ➤ These combine arithmetic with assignment. They’re just shorthand:

        a += b;  →  a = a + b;
        a -= b;  →  a = a - b;
        a *= b;  →  a = a * b;
        a /= b;  →  a = a / b;
        a %= b;  →  a = a % b;

    🔸 Example:
        int x = 10;
        x += 5;  // x = 15
        x -= 3;  // x = 12
        x *= 2;  // x = 24
        x /= 6;  // x = 4
        x %= 3;  // x = 1

    ✅ These are often used in loops, counters, and math logic.

    ------------------------------------------------------------

    ✅ Prefix vs Postfix (Deep Dive)

    🔸 Postfix (a++, a--):
        - Step 1: Use current value.
        - Step 2: Then update it.

        Example:
        int a = 5;
        int b = a++;   // b = 5, a = 6

    🔸 Prefix (++a, --a):
        - Step 1: Update value.
        - Step 2: Use updated value.

        Example:
        int a = 5;
        int b = ++a;   // a = 6, b = 6

    ✅ Use cases:
    - Postfix: Use value before change (e.g. inside array index: arr[i++])
    - Prefix: Use updated value immediately (e.g. for fast increment in loops)

    */

    public static void main(String[] args) {

        // Increment and Decrement
        int a = 10;

        System.out.println("a = " + a);     // 10
        System.out.println("a++ = " + a++); // 10 → uses then increments
        System.out.println("a = " + a);     // 11
        System.out.println("++a = " + ++a); // 12 → increments then uses

        System.out.println("a-- = " + a--); // 12 → uses then decrements
        System.out.println("a = " + a);     // 11
        System.out.println("--a = " + --a); // 10 → decrements then uses

        // Compound assignments
        int x = 8;
        x += 4;  // x = x + 4 → 12
        x *= 2;  // x = x * 2 → 24
        x -= 10; // x = x - 10 → 14
        x /= 2;  // x = x / 2 → 7
        x %= 5;  // x = x % 5 → 2

        System.out.println("Final value of x = " + x);

        // Postfix vs Prefix example
        int m = 5;
        int n = m++; // n = 5, m = 6
        System.out.println("Postfix: m = " + m + ", n = " + n);

        int p = 5;
        int q = ++p; // p = 6, q = 6
        System.out.println("Prefix: p = " + p + ", q = " + q);
    }
}
