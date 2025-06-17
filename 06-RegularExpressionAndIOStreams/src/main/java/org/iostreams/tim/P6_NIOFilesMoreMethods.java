package org.iostreams.tim;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class P6_NIOFilesMoreMethods {

    /**
     * Lets study Files more methods i.e. list and print current working directories all files and folders together and seprately
     * @param args
     */
    public static void main(String[] args) {

        Path path = Path.of(""); // this denotes path of current working directory
        // printing full absolute path of cwd
        System.out.println("cwd = " + path.toAbsolutePath());
        // cwd = D:\Eclipse_Workpace\Intellije_workspace\01-JavaLearningCore\06-RegularExpressionAndIOStreams

        System.out.println();

        // listing all directories and files in given path

        try {
            Stream<Path> paths = Files.list(path);
            paths.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /**
         * .gitignore
         * .idea
         * files
         * pathFile.txt
         * pom.xml
         * root.txt
         * src
         * target
         * timdemo.txt
         */

        System.out.println();
        // print only directories
        System.out.println("Printing only directories");
        try {
            Stream<Path> paths2 = Files.list(path);
            paths2.filter(pth -> Files.isDirectory(pth)).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /**
         * Printing only directories
         * .idea
         * files
         * src
         * target
         */

        System.out.println();
        // lets print only files now

        System.out.println("Printing only files");
        try {
            Stream<Path> paths3 = Files.list(path);
            paths3.filter(pth -> Files.isRegularFile(pth)).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /**
         * Printing only files
         * .gitignore
         * pathFile.txt
         * pom.xml
         * root.txt
         * timdemo.txt
         */

    }
}
