package org.iostreams.tim.readingfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P7_BufferedReaderMain {

    /**
     * Efficiently reads the file line by line using BufferedReader.
     * Uses Java 8 Stream API to simplify reading and printing.
     */
    public static void main(String[] args) {

        // Path to the input file (relative to project root)
        String filePath = "src/main/java/org/iostreams/tim/readingfiles/inforeader.txt";

        // Try-with-resources: auto-closes BufferedReader and FileReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            // Java 8 style: streams all lines and prints each
            reader.lines().forEach(System.out::println);

            // Alternative: traditional while-loop
            /*
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            */

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * Output - 123456789
 */
