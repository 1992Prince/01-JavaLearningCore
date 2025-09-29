package org.coding.stackqueue;

import java.util.Stack;

public class P5_ValidParentheses {

    public static boolean isValid(String s) {

        char[] charArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < charArr.length; i++) {
            if ("([{".contains(String.valueOf(charArr[i]))) {
                stack.push(charArr[i]);
            } else {
                if (")}]".contains(String.valueOf(charArr[i]))) {
                    char ele = stack.pop();
                    if (ele == '(' && charArr[i] == ')' ||
                            ele == '[' && charArr[i] == ']' ||
                            ele == '{' && charArr[i] == '}') {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean isValid2(String s) {

        char[] charArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < charArr.length; i++) {
            if ("([{".contains(String.valueOf(charArr[i]))) {
                stack.push(charArr[i]);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                if (")}]".contains(String.valueOf(charArr[i]))) {
                    char ele = stack.pop();
                    char oppositeEle = validCharReturn(ele);
                    if(charArr[i] != oppositeEle) {
                        return false;
                    }
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static char validCharReturn(char c) {
        if (c == '(') {
            return ')';
        } else if (c == '[') {
            return ']';
        } else if (c == '{') {
            return '}';
        }

        return 'p';
    }

    public static void main(String[] args) {

        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("([)]"));

        System.out.println();

        System.out.println(isValid2("()"));
        System.out.println(isValid2("()[]{}"));
        System.out.println(isValid2("(]"));
        System.out.println(isValid2("([])"));
        System.out.println(isValid2("([)]"));

        // EDGE CASE
        System.out.println(isValid2("]"));


    }
}
