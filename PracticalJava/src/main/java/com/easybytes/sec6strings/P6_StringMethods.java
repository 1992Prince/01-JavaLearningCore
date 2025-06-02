package com.easybytes.sec6strings;

import java.util.Arrays;

public class P6_StringMethods {

    public static void main(String[] args) {

        // 🔍 Searching for a value in String

        // Method: int indexOf(String str) → returns index of first occurrence or -1
        String searchText = "Learn Java with OpenAI Java Guide";
        System.out.println("indexOf 'Java': " + searchText.indexOf("Java")); // 6
        System.out.println("indexOf 'Guide': " + searchText.indexOf("Guide")); // 31
        System.out.println("indexOf 'Python': " + searchText.indexOf("Python")); // -1

        //The lastIndexOf() method is used to find the last occurrence of a character or substring in a string.
        // int lastIndexOf(int ch) and int lastIndexOf(int ch, int fromIndex)
        String text = "Hello, world! Welcome to the world!";

        // lastIndexOf(char)
        System.out.println("Last index of 'o': " + text.lastIndexOf('o'));  // Last index of 'o': 30

        // lastIndexOf(char, fromIndex)
        System.out.println("Last index of 'o' before position 10: " + text.lastIndexOf('o', 10));  // Last index of 'o' before position 10: 8

        // lastIndexOf(String)
        System.out.println("Last index of 'world': " + text.lastIndexOf("world"));  // Last index of 'world': 29

        // lastIndexOf(String, fromIndex)
        System.out.println("Last index of 'world' before position 15: " + text.lastIndexOf("world", 15));  // Last index of 'world' before position 15: 7

        // Method: boolean contains(CharSequence s) → true if substring is present
        System.out.println("contains 'OpenAI': " + searchText.contains("OpenAI")); // true
        System.out.println("contains 'ML': " + searchText.contains("ML")); // false

        // Method: boolean startsWith(String prefix)
        System.out.println("startsWith 'Learn': " + searchText.startsWith("Learn")); // true
        System.out.println("startsWith 'Java': " + searchText.startsWith("Java")); // false

        // Method: boolean endsWith(String suffix)
        System.out.println("endsWith 'Guide': " + searchText.endsWith("Guide")); // true
        System.out.println("endsWith 'Java': " + searchText.endsWith("Java")); // false

        // ✂️ Trimming of String

        // Method: String trim() → removes leading & trailing spaces
        String raw = "   Java Trim Example   ";
        System.out.println("Before trim: '" + raw + "'");
        System.out.println("After trim: '" + raw.trim() + "'"); // 'Java Trim Example'

        // ✂️ Substrings

        // Method: String substring(int beginIndex)
        // Method: String substring(int beginIndex, int endIndex)
        String sub = "SubstringExample";
        System.out.println("substring(3): " + sub.substring(3)); // stringExample
        System.out.println("substring(0, 9): " + sub.substring(0, 9)); // Substring , 9 is exclusive
        System.out.println("substring(9, sub.length()): " + sub.substring(9, sub.length())); // Example

        // 🔁 Replacing a part of String

        // Method: String replace(CharSequence old, CharSequence new) → literal replace
        String replaceStr = "abc123abc456abc";
        System.out.println("replace 'abc' with 'X': " + replaceStr.replace("abc", "X")); // X123X456X

        // Method: String replaceAll(String regex, String replacement) → regex support
        System.out.println("replaceAll digits with '#': " + replaceStr.replaceAll("\\d+", "#")); // abc#abc#abc

        // Method: String replaceFirst(String regex, String replacement) → first match only
        System.out.println("replaceFirst 'abc' with 'X': " + replaceStr.replaceFirst("abc", "X")); // X123abc456abc

        // 🔪 Splitting Strings

        // Method: String[] split(String regex)
        String fruits = "apple,banana,grape,kiwi";
        String[] fruitArray = fruits.split(",");
        System.out.println("Fruits: " + Arrays.toString(fruitArray)); // Fruits: [apple, banana, grape, kiwi]
        for (String fruit : fruitArray) {
            System.out.println("Fruit: " + fruit);
        }

        String data = "apple|orange;banana,grapes";

        // Correct usage of split with escaped characters
        String[] tokens = data.split("[|;,]");
        System.out.println("tokens - " + Arrays.toString(tokens)); // tokens - [apple, orange, banana, grapes]


    }
}
