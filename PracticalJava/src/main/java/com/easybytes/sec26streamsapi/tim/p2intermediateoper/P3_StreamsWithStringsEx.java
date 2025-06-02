package com.easybytes.sec26streamsapi.tim.p2intermediateoper;

import java.util.List;
import java.util.stream.Collectors;

public class P3_StreamsWithStringsEx {

    public static void main(String[] args) {

        /**
         * 🔤 String + Character Class Practice — with Streams 🔥
         * Let’s do it with some practice problems using Character methods like:
         *
         * Character.isDigit()
         * Character.isAlphabetic()
         * Character.isUpperCase()
         * Character.isLowerCase()
         * Character.isWhitespace()
         */

        //🔸 Problem 1: Count digits in a string
        String input = "ab12cd9e3";

        long count = input.chars()  // IntStream of ASCII values
                .filter(Character::isDigit)
                .count();

        System.out.println("Digit count: " + count); // Output: 4

        System.out.println();

        // 🔸 Problem 2: Extract only alphabets from a string
        String input2 = "abc123@#DEF";

        String alphabets = input2.chars()
                .filter(Character::isAlphabetic)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(alphabets); // Output: abcDEF

        System.out.println();

        // 🔸 Problem 3: Find how many uppercase characters in a string
        String input3 = "HeLLo123";

        long upperCount = input3.chars()
                .filter(Character::isUpperCase)
                .count();

        System.out.println("Uppercase letters: " + upperCount); // Output: 3

        System.out.println();

        // 🔸 Problem 4: Get List of lowercase letters
        String input4 = "HeyThere123";

        List<Character> lowercaseList = input4.chars()
                .filter(Character::isLowerCase)
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        System.out.println(lowercaseList); // Output: [e, y, h, e, r, e]


        System.out.println();

        // 🔸 Problem 5: Extract all whitespace characters
        String input5 = "Java   Stream API \nIs Great";

        List<Character> whitespaces = input5.chars()
                .filter(Character::isWhitespace)
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        System.out.println(whitespaces); // Output: [ ,  ,  ,  , \n]

        /**
         * Practice questions
         * ✅ Quick Practice Ideas:
         *
         * ✅ Count vowels in a string
         * ✅ Find frequency of each character using Collectors.groupingBy
         * ✅ Convert digits to integers and sum them
         * ✅ Capitalize only first letter of each word
         * ✅ Replace all digits with *
         */



    }
}
