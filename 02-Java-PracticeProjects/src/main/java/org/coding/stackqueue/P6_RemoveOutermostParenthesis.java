package org.coding.stackqueue;

import java.util.Stack;

public class P6_RemoveOutermostParenthesis {

    /**
     *
     * ✅ Brute-Force Approach: Step-by-Step Explanation
     * 1️⃣ Convert input string to char array
     * 2️⃣ Create stack to track open brackets and
     *    track variable will store the starting index of current primitive
     *    and result variable will store the resultnant string
     * 3️⃣ Iterate through the character array using for loop
     * 4️⃣ Push if opening bracket '('
     * 5️⃣ Pop if closing bracket ')'
     * 6️⃣ When stack becomes empty
     *      That means one primitive string is completed from track to i
     *      Remove its first and last character (outermost parentheses)
     *      Append middle part to result
     * 7️⃣ Return the final result
     *
     * 💡 Time Complexity:
     * O(n²) worst case due to result += ... inside loop (string concatenation)
     * Can be improved using StringBuilder
     *
     */
    public static String removeOuterParentheses(String s) {

        char[] charArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        String result = "";
        int track = 0;

        for(int i=0;i<charArr.length;i++){
            if(charArr[i] == '('){
                stack.push(charArr[i]);
            }else if(charArr[i] == ')'){
                stack.pop();

                if(stack.isEmpty()){
                    for(int j = track+1;j<i;j++){
                        result += String.valueOf(charArr[j]);
                    }
                    track = i + 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(removeOuterParentheses("()()"));
        System.out.println(removeOuterParentheses("()"));
        System.out.println("(()) - " + removeOuterParentheses("(())"));
        System.out.println("(()())(()) - " + removeOuterParentheses("(()())(())"));
        System.out.println("(()(())) - " + removeOuterParentheses("(()(()))"));
        System.out.println("(((((()))))) - " + removeOuterParentheses("(((((())))))"));
        System.out.println("(()())()(()) - " + removeOuterParentheses("(()())()(())"));
        System.out.println(" - " + removeOuterParentheses(""));

    }
}
