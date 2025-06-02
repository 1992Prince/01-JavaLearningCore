package com.nio;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class P3_WriteFileExample {

    public static void main(String[] args) {
        // Define the file path and content
        Path filePath = Paths.get("src/test/java/com/nio/resources/output.txt");
        String content = "Hello, this is a sample content written to the file using JDK 17 features.";

        try {
            // Write content to the file using Files.writeString()
            Files.writeString(filePath, content);

            // Display success message using formatted string
            System.out.println(String.format("File '%s' written successfully!", filePath.getFileName()));
        } catch (IOException e) {
            // Handle exceptions related to file I/O
            System.out.println(String.format("Error: Unable to write to file. Details: %s", e.getMessage()));
            e.printStackTrace();
        }
    }
}
