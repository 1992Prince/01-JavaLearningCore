package org.iostreams.tim;

import java.io.File;

public class P1_FileClassMethods {

    /*
🔹 NOTES: What We Learned from This Program 🔹

1️⃣ Getting Project Root Path:
   - File f = new File("");
   - f.getAbsolutePath() returns the current working directory (i.e., project root).
   - Very useful for Maven-based or IntelliJ projects.

2️⃣ File Paths Are Relative to Project Directory:
   - When you write: new File("root.txt"), it checks for root.txt in the project’s root folder.
   - No need to give full OS-level path like D:/... or C:/...

3️⃣ Checking for Files in Subdirectories:
   - new File("files/file1.txt") checks in a folder named 'files' inside the project.
   - You can use "/" to access subfolders. It’s cross-platform (works on Windows, macOS, Linux).

4️⃣ Getting Absolute Path:
   - Even if you give a relative path to File, you can call .getAbsolutePath() to get the full path.
   - Useful for debugging, logs, and understanding actual file location.

✅ Conclusion:
   - File class in Java is powerful and simplifies file handling relative to project root.
   - Avoid hardcoding full paths; instead, rely on project-relative paths for portability.

*/


    public static void main(String[] args) {

        // get current working directory path - here I meant path till this maven project and not inside that
        // we can get it via File class object, just don't pass anything as arguments
        File f = new File("");
        System.out.println("Current project path is - " + f.getAbsolutePath());
        // Current project path is - D:\Eclipse_Workpace\Intellije_workspace\01-JavaLearningCore\06-RegularExpressionAndIOStreams

        System.out.println();

        // check if file exists at root directory of this project
        f = new File("root.txt");
        System.out.println("File exists - " + f.exists()); // File exists - true

        System.out.println();

        // check if file1.txt exists at files folder inside at root level
        f = new File("files/file1.txt");
        System.out.println("File exists - " + f.exists()); // // File exists - true

        /**
         * So we understood , we don't need to give path of our computer drive
         * File class will start taking path from root level of project
         */

        // now get absolute path of file file1.txt
        System.out.println("File1.txt absolute path : " + f.getAbsolutePath());
        // File1.txt absolute path : D:\Eclipse_Workpace\Intellije_workspace\01-JavaLearningCore\06-RegularExpressionAndIOStreams\files\file1.txt

    }
}
