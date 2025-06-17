package org.iostreams.durgamadanpractice;

import java.io.File;
import java.io.IOException;

// This Java file is part of a Maven project.
// File f = new File("root.txt"); and jvm will create File object for file exists at root level i.e. parallel to pom
// if your file exits in some foler then give the path of that folder like - File f2 = new File("files/file1.txt");

// Note: At the time of the first run, the file "root.txt" does NOT exist
// in the **root directory of the Maven project** (i.e., same level as pom.xml).
// So, initially `f.exists()` will return false.

// After `createNewFile()` is called, the file will be created at the root level,
// and `f.exists()` will return true.

// On the **second run**, since the file now already exists,
// both the `f.exists()` calls will return true.
public class P1_FileDemo {

    public static void main(String[] args) {

        File f = new File("root.txt");
        System.out.println(f.exists());
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(f.exists());

        // to create file in practice package
        f = new File(System.getProperty("user.dir")+"/src/main/java/org/iostreams/durgamadanpractice","practice.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(f.exists());

        System.out.println();
        System.out.println();
        // suppose any folder is there at root level and we have file inside it, to check it if file exists
        File f2 = new File("files/file1.txt");
        System.out.println(f.exists()); // true
    }
}

