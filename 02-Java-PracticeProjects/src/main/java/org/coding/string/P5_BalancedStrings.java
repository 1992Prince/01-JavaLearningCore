package org.coding.string;

public class P5_BalancedStrings {

    /*
    ✅ 🪜 Step-by-Step Approach (in Easy Words)
    🔹 Step 1: Initialize two variables:
    track = to track balance between L and R (like a scale)

    count = how many balanced substrings found

    🔹 Step 2: Loop through the string one character at a time:
    If you see 'R', do track++ (push scale to right)

    If you see 'L', do track-- (push scale to left)

    🔹 Step 3: When the scale is balanced (track == 0)—
    ➡️ It means equal number of L and R seen
    ➡️ So we found one balanced substring → count++

    🧠 Why This Works?
    You’re treating 'R' as +1 and 'L' as -1
    So whenever total becomes 0, it means equal number of L and R occurred → that’s a balanced substring ✅
     */
    public static int balancedStringSplit(String s) {

        int count = 0;
        int track = 0;
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'R') {
                track++;
            } else {
                track--;
            }

            if (track == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
        System.out.println(balancedStringSplit("LLLLRRRR"));

    }
}
