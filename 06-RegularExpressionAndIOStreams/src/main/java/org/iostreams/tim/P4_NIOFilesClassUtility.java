package org.iostreams.tim;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
What we have done in P3 class, we will do same with NIO package
In previous class, we were not able to write or read with File class
but here with Files class in NIO package we can write also and read also
 */
public class P4_NIOFilesClassUtility {

    public static void main(String[] args) {

        useFile("pathFile.txt");
    }

    private static void useFile(String fileName) {

        Path path = Path.of(fileName);
        boolean fileExists = Files.exists(path);

        System.out.printf("File %s %s%n", fileName, fileExists ? "exists" : "does not exists");

        // if file exists then delete it
        if (fileExists) {
            System.out.println("Deleting file : " + fileName);
            try {
                Files.delete(path);
                fileExists = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // check if file doesn't exists then create new file
        if (!fileExists) {
            try {
                Files.createFile(path);
                System.out.println("Created File : " + fileName);
                if (Files.isWritable(path)) {
                    System.out.println("Would write to file here");
                    Files.writeString(path, """
                                                        
                            Here is some data,
                            For my file,
                            just to prove,
                            Using the files class and path are better.!!!
                            """);

                    System.out.println("I can read too   ");
                    Files.readAllLines(path).forEach(System.out::println);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
