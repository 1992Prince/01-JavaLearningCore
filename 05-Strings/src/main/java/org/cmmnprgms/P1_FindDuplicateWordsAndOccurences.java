package org.cmmnprgms;

public class P1_FindDuplicateWordsAndOccurences {

    /**
     * ✅ Problem Statement: Find Duplicate Words and Their Occurrences
     * Write a Java program that takes an input string and prints all the duplicate words along with the number of times they appear in the string.
     *
     * 🔹 Input
     * A single line of text (String) entered by the user.
     *
     * 🔹 Expected Output
     * List of words that appear more than once in the input string.
     * Along with their count of occurrences.
     * Words should be compared in a case-insensitive manner.
     * Ignore punctuation (optional: based on team level).
     *
     * ✏️ Example Input
     * Java is great. Java is powerful. Java is simple and powerful.
     * ✅ Expected Output
     * java: 3
     * is: 3
     * powerful: 2
     *
     * Words like "great" and "simple" appear only once so they should be ignored.
     *
     * 📌 Requirements
     * Use a Map or HashMap to store word frequencies.
     * Handle word splitting by using .split("\\s+") or a regex that removes punctuation too.
     * Output should only include words that appear more than once.
     *
     * 💡 Bonus (Optional)
     * Extend the solution to ignore punctuation using regex.
     * Sort the output alphabetically or by frequency.
     *
     * 🧠 Hints
     * Convert input to lowercase using .toLowerCase().
     * Clean punctuation using .replaceAll("[^a-zA-Z ]", "") (if needed).
     * Iterate using Map.Entry<String, Integer> to print duplicates.
     */
}
