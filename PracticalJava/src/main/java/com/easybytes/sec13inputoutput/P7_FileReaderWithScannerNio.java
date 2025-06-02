package com.easybytes.sec13inputoutput;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class P7_FileReaderWithScannerNio {

    /*
    Learn Nio package
     */

    public static void main(String[] args) throws IOException {


        String filepath = "D:/Eclipse_Workpace/PracticalJava/src/main/resources/filedata/input1.txt";
        Path path = Paths.get(filepath);
        Scanner scanner = new Scanner(path);

        String line;
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();

    }
}
