package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class P2_ReadFileExampleWithIncorrectFilePath {

    public static void main(String[] args) {
        // Below we are giving incorrect file path
        String filePathString = "src/test/java/com/nidfdo/resources/test1.txt";
        Path filePath = Paths.get(filePathString);

        // till here code will work bcoz Path doesn't check if file is present or not at given loc
        System.out.println("Till here code will work"); // Till here code will work


        try {
            // below line code will break and flow will move to catch block

            String content = Files.readString(filePath);
            System.out.println("This line will not be execute");
            List<String> contentList = Files.readAllLines(filePath);

            // Print the content using formatted strings
            System.out.println(String.format("Content of '%s':\n%s", filePath.getFileName(), content));
            System.out.println();
            System.out.println();
            System.out.println(String.format("contentList content is %s", contentList));
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file. Details: " + e.getMessage());
            e.printStackTrace();
            /**
             * Error: Unable to read the file. Details: src\test\java\com\nidfdo\resources\test1.txt
             * java.nio.file.NoSuchFileException: src\test\java\com\nidfdo\resources\test1.txt
             */
        }

    }
}
