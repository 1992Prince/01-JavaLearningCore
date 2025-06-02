package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class P2_ReadFileExample {

    public static void main(String[] args) {
        // Define the file path to read from - below relative path is given
        String filePathString = "src/test/java/com/nio/resources/test1.txt";
        Path filePath = Paths.get(filePathString);

        // Using try-catch to handle any potential IO exceptions
        try {
            // Read the content of the file into a String
            String content = Files.readString(filePath);
            List<String> contentList = Files.readAllLines(filePath);

            // Print the content using formatted strings
            System.out.println(String.format("Content of '%s':\n%s", filePath.getFileName(), content));
            System.out.println();
            System.out.println();
            System.out.println(String.format("contentList content is %s", contentList));
        } catch (IOException e) {
            // Handle IOException if the file cannot be read (e.g., it doesn't exist)
            System.out.println("Error: Unable to read the file. Details: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
