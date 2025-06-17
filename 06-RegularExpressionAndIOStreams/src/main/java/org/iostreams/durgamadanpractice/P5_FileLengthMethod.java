package org.iostreams.durgamadanpractice;

import java.io.File;

public class P5_FileLengthMethod {

    public static void main(String[] args) {

        String dirPath = System.getProperty("user.dir")+"/src/main/java/org/iostreams";
        File f = new File(dirPath, "inforeader.txt");
        long len = f.length();
        System.out.println("Length is - " +len);
    }
}
