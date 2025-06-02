package com.easybytes.sec13inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P4_ReadMultipleLinesWithBFR {

    public static void main(String[] args) throws IOException {

        String filepath = "D:/Eclipse_Workpace/PracticalJava/src/main/resources/filedata/input1.txt";
        FileReader fileReader = new FileReader(filepath);
        BufferedReader reader = new BufferedReader(fileReader);

        String line;

        /*
        We need to give condition that when readLine() reached end of file then come out from loop
        So if readLine() comes to end of file then reader.readLine() will return null

        so till time reader.readLine() doesn't returns null, continue reading line from file
         */
        while((line = reader.readLine()) != null){
            System.out.println("Line - " + line);
        }

        reader.close();




    }
}
