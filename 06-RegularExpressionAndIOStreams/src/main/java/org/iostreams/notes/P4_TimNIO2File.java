package org.iostreams.notes;

public class P4_TimNIO2File {

    /**
     * 📦 IO Ecosystem in Java (Simplified):
     * | IO Type         | Version   | Key Feature                                                          |
     * | --------------- | --------- | -------------------------------------------------------------------- |
     * | `java.io`       | Core Java | Original IO API (blocking, stream-based)                             |
     * | `java.nio`      | Java 1.4  | Non-blocking IO (channels & buffers)                                 |
     * | `java.nio.file` | Java 1.7  | NIO.2 with modern, OS-level file handling (Paths, Files, FileSystem) |
     *
     * While java.io is still used (and you’ll see it in legacy code), NIO.2 is more modern and powerful,
     * with better performance and support for functional programming.
     */

    /**
     * ==============================================
     *
     * Text File Reading
     *
     * 1) with nio we can use Files.readAllLines to read data from file and also write data into file i.e. text file
     *
     * 2) in io package we can use FileReader or BufferedReader - > for efficient purpose use BufferedReader and
     *    FileReader vs BufferedReader and Y we should use BufferedReader
     *
     *    ✅ For reading small to medium text files: use Files.readAllLines(Paths.get("file.txt"));
     *
     *    ✅ For reading large files efficiently: use BufferedReader reader = Files.newBufferedReader(Paths.get("file.txt"));
     *
     *
     * Text File Writing
     *
     * 1) with nio package again with Files class we can write data into file
     *
     * 2) java io package gives FileWriter class and BufferedWriter for writing data into text files
     *
     * and read interview questions from udemy java interview questions and https://javaconceptoftheday.com/byte-stream-vs-character-stream-in-java/
     */
}
