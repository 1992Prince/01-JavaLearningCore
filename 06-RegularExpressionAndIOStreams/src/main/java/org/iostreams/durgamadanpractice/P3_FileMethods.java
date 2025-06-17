package org.iostreams.durgamadanpractice;

import java.io.File;
import java.util.Arrays;

// This Java class demonstrates the use of isFile() and isDirectory() methods from the File class.
//
// However, both methods return false because neither "abc.txt" (a file) nor "abc" (a directory)
// actually exist in the root directory of the Maven project at the time this program is run.
//
// Key Points:
// 1. File f = new File("abc.txt") only creates a File object in memory.
//    It does NOT create the actual file on disk.
//
// 2. f.isFile() checks if the file "abc.txt" exists and is a regular file.
//    Since the file doesn't exist yet, it returns false.
//
// 3. Similarly, File f = new File("abc") again just creates a reference to a File object.
//    If the "abc" directory is not already present in the root, f.isDirectory() also returns false.
//
// Summary:
// ➤ You're getting false for both because neither the file nor the directory actually exists on disk.
public class P3_FileMethods {

    public static void main(String[] args) {

        File f = new File("abc.txt");
        boolean isFileBool = f.isFile();
        System.out.println("isFileBool- " + isFileBool);

        f = new File("abc");
        boolean isDirBool = f.isDirectory();
        System.out.println("isDirBool- " + isDirBool);

        f = new File("pom.xml");
        boolean ispomBool = f.isFile();
        System.out.println("ispomBool- " + ispomBool);

        /**
         * isFileBool- false
         * isDirBool- false
         * ispomBool- true
         */

        System.out.println();

        // This code demonstrates how to list the immediate contents (files and directories)
        // of a directory using File.list() in Java.
        // Note - list method will list immediate files or folder names but not nested ones

        String dirPath = System.getProperty("user.dir")+"/src/main/java/org/iostreams";
        f = new File(dirPath);
        String[] dirnames = f.list();
        System.out.println(Arrays.toString(dirnames)); // [inforeader.txt, notes, practice]

        dirPath = System.getProperty("user.dir")+"/src/main/java/org/iostreams/practice";
        f = new File(dirPath);
        String[] filesnames = f.list();
        System.out.println(Arrays.toString(filesnames)); // [P1_FileDemo.java, P2_DirDemo.java, P3_FileMethods.java]

    }
}
