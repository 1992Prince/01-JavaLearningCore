package com.nio;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

/*
For this program, we need to make sure that moved_test1.txt file should be present in given location
 */
public class P4_DeleteFileExample {

    public static void main(String[] args) {
        // Define the path of the file to be deleted
        Path filePath = Paths.get("src/test/java/com/nio/resources/moved_test1.txt");

        try {
            // Delete the specified file
            Files.delete(filePath);

            // Display success message
            System.out.println(String.format("File '%s' deleted successfully!", filePath.getFileName()));
        } catch (NoSuchFileException e) {
            // Handle case where the file does not exist
            System.out.println(String.format("Error: File '%s' does not exist. Cannot delete.", filePath.getFileName()));
        } catch (IOException e) {
            // Handle other IO exceptions, like permission issues
            System.out.println(String.format("Error: Unable to delete file. Details: %s", e.getMessage()));
            e.printStackTrace();
        }
    }
}
