package com.easybytes.sec26streamsapi.tim.p2intermediateoper;

import java.util.stream.IntStream;

public class P2_StringCharsMethod {

    public static void main(String[] args) {

        String input = "a1b2";
        IntStream intStrm = input.chars();
        System.out.println("intStrn - " + intStrm); // intStrn - java.util.stream.IntPipeline$Head@6f496d9f
        /**
         * To iska matlab hai:
         * "Mujhe is string ke har character ka number (ASCII code) chahiye"
         *
         * String input = "a1b2";, Yani characters hain: - 'a', '1', 'b', '2'
         *
         * Ab input.chars() karega: - [97, 49, 98, 50]
         * Yeh numbers hain ASCII values:
         *
         * 'a' = 97
         * '1' = 49
         * 'b' = 98
         * '2' = 50
         *
         * Toh chars() ka simple kaam:
         * "String ke har character ko ek number me badal dena"
         * Aur woh number ka stream (line) bana dena – jise hum loop ya filter me use kar sakte hain.
         */

    }
}
