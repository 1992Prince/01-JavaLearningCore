package com.easybytes.sec13inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P4_FileReaderWithBFR {

    public static void main(String[] args) throws IOException {

        /*
        Here we are going to read content from file
        so we will create obj of  FileReader and not InputStreamReader
         */
        String filepath = "D:/Eclipse_Workpace/PracticalJava/src/main/resources/filedata/input1.txt";
        FileReader fileReader = new FileReader(filepath);
        BufferedReader reader = new BufferedReader(fileReader);

        // below will read only first line of text file
        String line = reader.readLine();

        System.out.println("Line - " + line);

        reader.close();


    }
}
