package org.iostreams.durgamadanpractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P7_ReadFileWithScannerClss {

    public static void main(String[] args) {

        // Read data from file
        String dirPath = System.getProperty("user.dir") + "/src/main/java/org/iostreams";
        File file = new File(dirPath, "inforeader.txt");

        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();

        /**
         * Output
         * I am the best.
         * Your are also best , but less than me.
         */

    }
}
