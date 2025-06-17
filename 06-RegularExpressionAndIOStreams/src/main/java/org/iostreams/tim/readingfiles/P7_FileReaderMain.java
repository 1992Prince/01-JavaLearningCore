package org.iostreams.tim.readingfiles;

import java.io.FileReader;
import java.io.IOException;

public class P7_FileReaderMain {

    /**
     * Demonstrates reading a file using FileReader.
     * This method reads characters one by one (inefficient for large files).
     */

    public static void main(String[] args) {

        // inforeader.txt is present in current package i.e. readingfiles - src\main\java\org\iostreams\tim\readingfiles\inforeader.txt
        try(FileReader reader = new FileReader("src/main/java/org/iostreams/tim/readingfiles/inforeader.txt")){

            int data;
            while((data = reader.read()) != -1){
                System.out.println((char)data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Output
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * 7
         * 8
         * 9
         */

        /**
         *
         * ✅ What’s happening step-by-step:
         *
         * 1) int character;
         *      This declares a variable character of type int.
         *      Even though we are reading characters, .read() returns int, not char, so we can check for -1 (end of file).
         *
         * 2) reader.read()
         *      This reads 1 character at a time from the file.
         *      Internally, it returns the Unicode value (as an int) of the next character.
         *      If the end of the file is reached, it returns -1.
         *
         *3) (character = reader.read()) != -1
         *      This is an assignment + condition in one step.
         *      It reads one character, stores it in character, and checks:
         *          👉 If it's not -1 (meaning not end of file), keep looping.
         *
         * 4) System.out.print((char) character);
         *      The integer character is typecast to a char (i.e. actual letter/number).
         *      It prints the character without newline.
         *      Example: if character = 49, then (char)49 is '1'
         *
         * ❌ Why FileReader is inefficient?
         * | Problem                          | Description                                               |
         * | -------------------------------- | --------------------------------------------------------- |
         * | ❗ Character-by-character reading | Reads one char (2 bytes) at a time. Slow for large files. |
         * | ❗ No internal buffer             | Every `.read()` hits the file system.                     |
         * | ✅ BufferedReader recommended     | Uses internal buffer, reads chunks of data = much faster. |
         *
         * // Efficiently reads the file line by line using BufferedReader.
         * // Avoids character-by-character reading for better performance.
         */
    }
}
