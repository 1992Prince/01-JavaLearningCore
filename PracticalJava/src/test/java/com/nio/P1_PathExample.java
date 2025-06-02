package com.nio;

import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P1_PathExample {

    public static void main(String[] args) {

        // File path as a string - below we have given relative path for pathString
        String pathString = "src/test/java/com/nio/resources/test1.txt";

        // File path as a string - below we have given absolute path for pathString2
        String pathString2 = "D:\\Eclipse_Workpace\\PracticalJava\\src\\test\\java\\com\\nio\\resources\\test1.txt";


        try {
            // Create a Path instance using Paths.get()
            Path path = Paths.get(pathString);

            // Use formatted strings to display Path components
            System.out.println(String.format("Path: %s", path));  // Path: src\test\java\com\nio\resources\test1.txt
            System.out.println(String.format("Absolute Path: %s", path.toAbsolutePath())); // Absolute Path: D:\Eclipse_Workpace\PracticalJava\src\test\java\com\nio\resources\test1.txt
            System.out.println(String.format("File Name: %s", path.getFileName())); // File Name: test1.tx
            System.out.println(String.format("Parent Directory: %s", path.getParent())); // Parent Directory: src\test\java\com\nio\resources
            System.out.println(String.format("Root Directory: %s", path.getRoot())); // Root Directory: null
        } catch (InvalidPathException e) {
            // Handle InvalidPathException for invalid paths
            System.out.println("Error: Invalid path provided. Details: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();

        try {
            // Create a Path instance using Paths.get()
            Path path2 = Paths.get(pathString2);

            // Use formatted strings to display Path components
            System.out.println(String.format("Path: %s", path2));  // D:\Eclipse_Workpace\PracticalJava\src\test\java\com\nio\resources\test1.txt
            System.out.println(String.format("Absolute Path: %s", path2.toAbsolutePath()));
            // Absolute Path: D:\Eclipse_Workpace\PracticalJava\src\test\java\com\nio\resources\test1.txt
            System.out.println(String.format("File Name: %s", path2.getFileName())); // File Name: test1.tx
            System.out.println(String.format("Parent Directory: %s", path2.getParent()));
            // Parent Directory: D:\Eclipse_Workpace\PracticalJava\src\test\java\com\nio\resources
            System.out.println(String.format("Root Directory: %s", path2.getRoot())); // Root Directory: D:\
        } catch (InvalidPathException e) {
            // Handle InvalidPathException for invalid paths
            System.out.println("Error: Invalid path provided. Details: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
