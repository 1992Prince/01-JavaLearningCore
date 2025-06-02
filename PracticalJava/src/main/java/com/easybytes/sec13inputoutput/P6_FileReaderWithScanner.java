package com.easybytes.sec13inputoutput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class P6_FileReaderWithScanner {

    public static void main(String[] args) throws IOException {

        /*
        In Java, the Scanner class can be used to read the contents of a file.
        Below code creates a File object from the specified file path and
        then passes this File object to the Scanner class.
        This is a common way to initialize a Scanner to read from a file.

        String filepath holds the path to the file
        File file = new File(filepath); creates a File object that represents the file at the given path.
         */

        /*
        Here we are going to read content from file
        so we will create obj of  FileReader and not InputStreamReader
         */
        String filepath = "D:/Eclipse_Workpace/PracticalJava/src/main/resources/filedata/input1.txt";
        File file = new File(filepath);

        /*
        Scanner initialization
        Scanner scanner = new Scanner(file); initializes a Scanner object to read from the File object.
         */
        Scanner scanner = new Scanner(file);

        /*
        The File object is used to encapsulate the file path and to provide methods to interact with the file.
         */

        String line;
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();

        /*
        Can you directly pass the file path to the Scanner class?

        Yes, you can directly pass the file path as a string to the Scanner class to read the file content.
         The Scanner class has a constructor that accepts a string representing the file path.
         Here’s how you can do it
         String filepath = "D:/Eclipse_Workpace/PracticalJava/src/main/resources/filedata/input1.txt";
         Scanner scanner = new Scanner(new File(filepath));

         Alternatively, Java 11 introduced a new constructor for Scanner that directly accepts a Path object:

         import java.nio.file.Path;
         import java.nio.file.Paths;
         import java.util.Scanner;

         String filepath = "D:/Eclipse_Workpace/PracticalJava/src/main/resources/filedata/input1.txt";
         Path path = Paths.get(filepath);
         Scanner scanner = new Scanner(path);

         Both approaches achieve the same result: they initialize a Scanner object that can
         read the contents of the file specified by the path.


         */


    }
}
