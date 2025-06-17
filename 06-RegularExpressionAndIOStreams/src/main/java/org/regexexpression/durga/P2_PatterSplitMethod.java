package org.regexexpression.durga;

import java.util.regex.Pattern;

public class P2_PatterSplitMethod {

    public static void main(String[] args) {

        /**
         * | What you write in Java | What Regex engine sees |
         * | ---------------------- | ---------------------- |
         * | `"\\s"` (Java string)  | `\s` (Regex pattern)   |
         *
         * 💡 Analogy:
         * \\ → Java converts this to single \
         *
         * \\s → Java gives \s to the Regex engine
         *
         * \\d, \\w, \\s, etc. — sab ke saath same rule lagta hai in Java, because of double escaping.
         */

        // splitting via spaces
        String str = "Durga Software Solutions";
        Pattern p = Pattern.compile("\\s");
        String[] strArr = p.split(str);
        for(String st: strArr){
            System.out.println(st);
        }

        /**
         * Durga
         * Software
         * Solutions
         */

        System.out.println();

        // splittig with dot and   🔹 \\. — Matches only a literal dot (.)
        // It does not match any other special character.
        /**
         * 🧠 Reasoning:
         * . in regex means "any character"
         * But when you write "\\." in Java:
         * \\ → becomes \ (Java escaping)
         * \. → becomes literal dot in regex
         */
        str = "www.google.com";
        p = Pattern.compile("\\.");
        strArr = p.split(str);
        for(String st: strArr){
            System.out.println(st);
        }
        /**
         * www
         * google
         * com
         */

        /**
         * 🔹 In Regular Expressions (Regex):
         * | Pattern | Meaning                                                                 |
         * | ------- | ----------------------------------------------------------------------- |
         * | `.`     | Matches **any character** (except newline `\n`)                         |
         * | `\.`    | Matches **literal dot** `.` only                                        |
         * | `\$`    | Matches **literal dollar** `$` only                                     |
         * | `\%`    | Matches **literal percent** `%` only *(even though `%` is not special)* |
         */

    }
}
