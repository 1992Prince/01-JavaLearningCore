package org.tim.sec3primtivetypes;

public class P8_IncrementDecrementInterviewExamples {

    /*
    🔹 Interview-Level Practice Examples: ++ and --
    -----------------------------------------------

    ✅ Example 1: Mixing ++ and --
    -------------------------------
    int a = 5;
    int b = a++ + ++a;

    ➤ Step-by-step:
        a++ → use 5, then a = 6
        ++a → a becomes 7, use 7
        b = 5 + 7 = 12

        Final values:
        a = 7
        b = 12

    ✅ Example 2: Using in the same expression
    ------------------------------------------
    int a = 1;
    int b = a++ + a++ + ++a;

    ➤ Step-by-step:
        a++ → use 1, then a = 2
        a++ → use 2, then a = 3
        ++a → a = 4, use 4

        b = 1 + 2 + 4 = 7
        Final a = 4

    ✅ Example 3: Inside Print Statements
    --------------------------------------
    int x = 10;
    System.out.println(x++);  // 10
    System.out.println(++x);  // 12
    System.out.println(x--);  // 12
    System.out.println(--x);  // 10

    ✅ Example 4: Assignment inside expressions
    -------------------------------------------
    int a = 3;
    int b = ++a + a++ + a;

    ➤ Step-by-step:
        ++a → a = 4 → use 4
        a++ → use 4 → a = 5
        a   → use 5

        b = 4 + 4 + 5 = 13
        Final a = 5

    ✅ Example 5: Tricky decrement
    -------------------------------
    int x = 5;
    int y = x-- - --x;

    ➤ Step-by-step:
        x-- → use 5 → x = 4
        --x → x = 3 → use 3
        y = 5 - 3 = 2

        Final x = 3, y = 2

    ✅ Example 6: Mixing both in complex form
    ------------------------------------------
    int a = 5;
    int result = a++ + a++ + --a + a-- + ++a;

    ➤ Step-by-step:
        a++ → use 5 → a = 6
        a++ → use 6 → a = 7
        --a → a = 6 → use 6
        a-- → use 6 → a = 5
        ++a → a = 6 → use 6

        result = 5 + 6 + 6 + 6 + 6 = 29
        Final a = 6

    ✅ Example 7: Inside loop control
    ----------------------------------
    int i = 0;
    while (i++ < 3) {
        System.out.println("i = " + i);
    }

    ➤ Output:
        i = 1
        i = 2
        i = 3

        Final i = 4

    ✅ Example 8: Pre/Post difference in loops
    -------------------------------------------
    int i = 0;
    while (++i < 3) {
        System.out.println("i = " + i);
    }

    ➤ Output:
        i = 1
        i = 2

        Final i = 3

    */

    public static void main(String[] args) {

        // Try out some tricky ones:
        int a = 1;
        int b = a++ + ++a;
        System.out.println("a = " + a + ", b = " + b); // a = 3, b = 1 + 3 = 4

        int x = 3;
        int y = ++x + x++ + x;
        System.out.println("x = " + x + ", y = " + y); // x = 5, y = 4 + 4 + 5 = 13

        int i = 0;
        while (i++ < 3) {
            System.out.println("While loop with i++ → i = " + i);
        }

        int j = 0;
        while (++j < 3) {
            System.out.println("While loop with ++j → j = " + j);
        }
    }
}
