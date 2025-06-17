package org.iostreams.durgamadanpractice;

import java.io.File;

// This Java class is part of a Maven project.
//
// At first, there is no directory named "cricket123" in the root of the project
// (i.e., the current working directory, which can be checked using System.getProperty("user.dir")).
//
// So, when you run the program for the first time, the output of f.exists() will be false,
// indicating that the directory "cricket123" does not exist.
//
// Then, the program calls f.mkdir(), which creates a new directory named "cricket123"
// in the root directory of the Maven project.
//
// On the second call to f.exists(), the result will be true because the directory
// has now been created.
//
// If you run this program a second time (after the directory already exists),
// both the first and second calls to f.exists() will return true.
public class P2_DirDemo {

    public static void main(String[] args) {
        File f=new File("cricket123");
        System.out.println(f.exists());//false
        f.mkdir();
        System.out.println(f.exists());//true
    }
}
