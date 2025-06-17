package org.regexexpression.durga;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1_Demo {

    /**
     * 🔍 Conceptual Breakdown:
     * 📌 Q: Kya Matcher string me character-by-character check karta hai?
     * Yes, exactly! Matcher internally goes character by character (index-wise) from left to right.
     * It tries to match the pattern "ab" at every index i of the input string.
     *
     */
    public static void main(String[] args) {

        /**
         * below I am searching pattern "ab" in matcher string abbbabbab
         * find method wll search pattern "ab" at each index of matcher string abbbabbab
         */
        int count=0;
        Pattern p=Pattern.compile("ab");
        Matcher m=p.matcher("abbbabbab");

        while(m.find()){
            count++;
            System.out.println(m.start()+" -- " + m.end()+" -- " + m.group());
        }

        System.out.println("No of Occurences are - " + count);

        /**
         * Output
         * 0 -- 2 -- ab
         * 4 -- 6 -- ab
         * 7 -- 9 -- ab
         * No of Occurences are - 3
         */

        System.out.println();
        System.out.println();

        count=0;
        p=Pattern.compile("ba");
        m=p.matcher("abbbabbab");

        while(m.find()){
            count++;
            System.out.println(m.start()+" -- " + m.end()+" -- " + m.group());
        }

        System.out.println("No of Occurences are - " + count);

        /**
         * 3 -- 5 -- ba
         * 6 -- 8 -- ba
         * No of Occurences are - 2
         */

        System.out.println();
        System.out.println();

        count=0;
        p=Pattern.compile("bbb");
        m=p.matcher("abbbabbab");

        while(m.find()){
            count++;
            System.out.println(m.start()+" -- " + m.end()+" -- " + m.group());
        }

        System.out.println("No of Occurences are - " + count);

        /**
         * 1 -- 4 -- bbb
         * No of Occurences are - 1
         */

        System.out.println();
        System.out.println();

        count=0;
        p=Pattern.compile("bbbb");
        m=p.matcher("abbbabbab");

        while(m.find()){
            count++;
            System.out.println(m.start()+" -- " + m.end()+" -- " + m.group());
        }

        System.out.println("No of Occurences are - " + count);
        // No of Occurences are - 0


    }
}
