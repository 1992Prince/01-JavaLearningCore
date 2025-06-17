package org.iostreams.tim;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P2_PathInterfaceNIO2 {

    /*
🔹 NOTES: What We Learned from This Code 🔹

1️⃣ Using java.nio.file Package:
   - We are using `Path` and `Paths` classes from the java.nio.file package.
   - These are part of Java NIO (New IO), introduced in Java 7 for better file and path handling.

2️⃣ Creating a Path Object:
   - `Path path = Paths.get("files/file1.txt");`
   - This creates a path relative to the project root folder (just like the File class).
   - No need to specify full drive paths.

3️⃣ Checking File Existence:
   - `Files.exists(path)` checks if the file physically exists at the given path.
   - Returns true if the file exists, false otherwise.

✅ Benefits Over File Class:
   - `Files` and `Path` give better control, more utility methods, and are more modern.
   - Methods like `Files.exists`, `Files.readAllLines`, etc. make file handling more powerful and readable.

✅ Conclusion:
   - Use `Path` and `Files` when working with file systems in modern Java.
   - Code is cleaner, more flexible, and NIO.2 offers better error handling and cross-platform support.

*/


    public static void main(String[] args) {

        Path path = Paths.get("files/file1.txt");
        if(Files.exists(path)){
            System.out.println("files/file1.txt -> exists"); // files/file1.txt -> exists
        }
    }
}
