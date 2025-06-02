package com.nio;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class P5_SafeDeleteFileExample {

    public static void main(String[] args) {
        // Define the path of the file to be deleted
        Path filePath = Paths.get("src/test/java/com/nio/resources/copy_of_test1.txt");

        try {
            // Delete the file only if it exists
            boolean isDeleted = Files.deleteIfExists(filePath);

            // Display appropriate message
            if (isDeleted) {
                System.out.println(String.format("File '%s' deleted successfully!", filePath.getFileName()));
            } else {
                System.out.println(String.format("File '%s' does not exist.", filePath.getFileName()));
            }
        } catch (IOException e) {
            // Handle other IO exceptions, like permission issues
            System.out.println(String.format("Error: Unable to delete file. Details: %s", e.getMessage()));
            e.printStackTrace();
        }
    }
}
