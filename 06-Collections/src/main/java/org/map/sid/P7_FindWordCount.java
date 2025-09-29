package org.map.sid;

import java.util.HashMap;
import java.util.Map;

public class P7_FindWordCount {

    /**
     * Write a Java program that counts the occurrences of each word in a given sentence using a HashMap.
     * "java is fun and java is powerful"
     */
    public static void main(String[] args) {

        String sentence = "java is fun and java is powerful";
        String[] words = sentence.split(" ");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Print the word count
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /**
         * java -> 2
         * powerful -> 1
         * and -> 1
         * is -> 2
         * fun -> 1
         */

    }
}
