package org.iostreams.durgamadanpractice;

import java.io.File;

public class P4_DirectoriesNames {

    /**
     * Write a program to display only directory names in iostreams package and print absolute path of that directory
     */

    public static void main(String[] args) {
        String dirPath = System.getProperty("user.dir")+"/src/main/java/org/iostreams";
        File f = new File(dirPath);
        String[] names = f.list();

        for(String name: names){
            f = new File(dirPath, name);
            if(f.isDirectory()){
                System.out.println(name+ " - " + f.getAbsolutePath());
            }
        }

        /**
         *Output
         * notes - D:\Eclipse_Workpace\Intellije_workspace\01-JavaLearningCore\06-RegularExpressionAndIOStreams\src\main\java\org\iostreams\notes
         * practice - D:\Eclipse_Workpace\Intellije_workspace\01-JavaLearningCore\06-RegularExpressionAndIOStreams\src\main\java\org\iostreams\practice
         */

        /**
         * Very similar we can check for file name and print it and ignore directories
         */
    }
}
