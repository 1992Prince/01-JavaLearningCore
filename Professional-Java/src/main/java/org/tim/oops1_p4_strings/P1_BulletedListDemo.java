package org.tim.oops1_p4_strings;

/**
 * Learning objectives:
 * 1. Different ways to create multiline strings in Java
 * 2. Using escape sequences like \n, \t for formatting
 * 3. Using Unicode characters like \u2022 for bullets
 * 4. Traditional string concatenation with + operator
 * 5. Modern text block syntax with triple quotes """
 *
 * Purpose: Demonstrates how to create formatted bulleted lists in strings
 * using both traditional concatenation and modern text blocks
 */
public class P1_BulletedListDemo {

    public static void main(String[] args) {

        /**
         * If u want to write content in multilines
         * \u2022 is unicode for bullet
         * \t is for tab
         * \n is for new line
         * \t\t is for sub tab
         * In previous jdk
         */

        String builtIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\u2022 Second Point\n" +
                "\t\t\u2022 Sub Point\n";

        System.out.println(builtIt);

        /**
         * Output
         * Print a Bulleted List:
         * 	• First Point
         * 	• Second Point
         * 		• Sub Point
         */

        // using multiline formatted String via triple quotes
        String textBlock = """
                Print a Bulleted List:
                    • First Point
                    • Second Point
                        • Sub Point
                """;
        System.out.println(textBlock);

        /**
         * Print a Bulleted List:
         *     • First Point
         *     • Second Point
         *         • Sub Point
         */
    }
}