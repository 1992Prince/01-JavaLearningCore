package com.nio.fileclass;

import java.io.File;
import java.io.FileNotFoundException;

public class L1_FileClssExample {

    public static void main(String[] args) throws FileNotFoundException {

        for(File f: File.listRoots()){
            System.out.println(f);
        }

        /**
         * Output
         * C:\
         * D:\
         */
    }
}
