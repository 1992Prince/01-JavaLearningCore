package org.iostreams.tim;

import java.io.File;
import java.io.IOException;

/*
🔹 STEPS PERFORMED IN THIS PROGRAM 🔹

1️⃣ Entry Point:
   - `main()` method calls `useFile("timdemo.txt")` to work with the file.

2️⃣ Creating File Object:
   - `File file = new File(fileName);`
   - Represents a file named `timdemo.txt` in the current working directory (project root).

3️⃣ Checking File Existence:
   - `file.exists()` checks whether the file physically exists.

4️⃣ If File Exists:
   - Prints a message that file exists.
   - Deletes the file using `file.delete()`.
   - Updates `fileExists` flag accordingly.

5️⃣ If File Does NOT Exist (either initially or after deletion):
   - Creates a new file using `file.createNewFile();`
   - Prints confirmation.
   - Checks if the file is writable using `file.canWrite()`.
   - If writable, prints a placeholder message: "Would write to file here".

✅ Purpose:
   - Demonstrates how to:
     • Check if a file exists
     • Delete it if it does
     • Create a new one if it doesn't
     • Check write permissions before performing I/O operations

📌 Notes:
   - Uses standard `java.io.File` class for file handling.
   - Throws a runtime exception if file creation fails.
   - All operations are done relative to the project directory.

*/

public class P3_FileClassUtility {

    public static void main(String[] args) {

        useFile("timdemo.txt");
    }

    private static void useFile(String fileName){

        File file = new File(fileName);
        boolean fileExists = file.exists();

        System.out.printf("File %s %s%n", fileName, fileExists? "exists" : "does not exists");

        // if file exists then delete it
        if(fileExists){
            System.out.println("Deleting file : " + fileName);
            fileExists = !file.delete();
        }

        // check if file doesn't exists then create new file
        if(!fileExists){
            try {
                file.createNewFile();
                System.out.println("Created File : " + fileName);
                if(file.canWrite()){
                    System.out.println("Would write to file here");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
