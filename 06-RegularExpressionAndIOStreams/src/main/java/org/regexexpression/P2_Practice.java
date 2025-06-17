package org.regexexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2_Practice {

    public static void main(String[] args) {

        /**
         * ✅ a*b ka matlab kya hota hai?
         * a* ka matlab:
         * "a" character **0 ya usse zyada baar ho sakta hai (matlab optional bhi hai, aur repeat bhi ho sakta hai)
         *
         * b ka matlab:
         * "b" character exactly ek baar hona chahiye
         *
         * 👉 So overall:
         * Match karo aise string ko jisme a 0 ya more times aaye, aur uske turant baad ek b ho.
         *
         * 📌 Match hone waale examples (a*b):
         * | Input    | Matches? | Reason                        |
         * | -------- | -------- | ----------------------------- |
         * | `b`      | ✅ Yes    | `a*` = 0 times, `b` = present |
         * | `ab`     | ✅ Yes    | `a*` = 1 time, `b` = present  |
         * | `aaab`   | ✅ Yes    | `a*` = 3 times, `b` = present |
         * | `aaaaab` | ✅ Yes    | `a*` = 5 times, `b` = present |
         *
         * ❌ Match nahi hone waale examples:
         * | Input | Matches? | Reason                                     |
         * | ----- | -------- | ------------------------------------------ |
         * | `a`   | ❌ No     | `b` missing                                |
         * | `aa`  | ❌ No     | `b` missing                                |
         * | `abc` | ❌ No     | `b` is there, but extra chars after `b`    |
         * | `ba`  | ❌ No     | `a` after `b`, not allowed in this pattern |
         *
         *
         * 💡 Summary of * (asterisk/star):
         * * ka matlab hota hai:
         *
         * "Previous character ya group 0 ya zyada baar aa sakta hai"
         *
         * ✅ Examples:
         * | Regex    | Matches Examples          |
         * | -------- | ------------------------- |
         * | `a*`     | "", "a", "aa", "aaaa"     |
         * | `ab*`    | "a", "ab", "abb", "abbbb" |
         * | `ba*`    | "b", "ba", "baa", "baaaa" |
         * | `[0-9]*` | "", "1", "123", "99999"   |
         *
         *
         *
         * 👀 Use * with Groups:
         * String str = "abab";
         * System.out.println(str.matches("(ab)*")); // true
         * Here (ab)* means "ab can repeat 0 or more times"
         *
         * ✅ Matches: "", "ab", "abab", "ababab"
         *
         * 🧪 Try this in Java Code
         * public class RegexStarDemo {
         *     public static void main(String[] args) {
         *         String[] tests = {"b", "ab", "aab", "aaaaab", "a", "ba"};
         *         for (String test : tests) {
         *             System.out.println(test + " => " + test.matches("a*b"));
         *         }
         *     }
         * }
         */
        Pattern pattern = Pattern.compile("a+b");
        Matcher matcher = pattern.matcher("b");
        System.out.println(matcher.matches());

        /**
         * ✅ Breakdown of a+b
         * a+ ka matlab kya hai?
         * a+ → “ek ya zyada baar a hona chahiye”
         * b → ek baar b hona chahiye aur a+ ke turant baad aana chahiye
         *
         * ⚡ So a+b ka matlab:
         * Ek ya zyada a hone chahiye, aur fir ek single b hona chahiye
         *
         * 🔍 Let's See Match Examples
         * | Input    | Match? | Reason                               |
         * | -------- | ------ | ------------------------------------ |
         * | `ab`     | ✅ Yes  | 1 `a`, followed by `b`               |
         * | `aaab`   | ✅ Yes  | 3 `a`s, followed by `b`              |
         * | `aaaaab` | ✅ Yes  | 5 `a`s, then `b`                     |
         * | `b`      | ❌ No   | `a+` expects **at least one `a`**    |
         * | `a`      | ❌ No   | `b` missing                          |
         * | `aabx`   | ❌ No   | Extra character after `b`            |
         * | `ba`     | ❌ No   | `a` comes **after** `b`, wrong order |
         *
         *
         * 👨‍💻 Java Example Using Pattern.compile("a+b")
         *
         * import java.util.regex.*;
         *
         * public class RegexPlusDemo {
         *     public static void main(String[] args) {
         *         Pattern pattern = Pattern.compile("a+b");
         *
         *         String[] tests = {"ab", "aab", "aaaaab", "b", "a", "ba"};
         *         for (String test : tests) {
         *             Matcher matcher = pattern.matcher(test);
         *             System.out.println(test + " => " + matcher.matches());
         *         }
         *     }
         * }
         * 🟢 Output:
         * ab => true
         * aab => true
         * aaaaab => true
         * b => false
         * a => false
         * ba => false
         *
         * 🆚 a*b vs a+b — Kya Difference Hai?
         * | Regex | Meaning                                 | a kitni baar aayega? | b compulsory? |
         * | ----- | --------------------------------------- | -------------------- | ------------- |
         * | `a*b` | **0 ya zyada `a`**, uske baad **1 `b`** | 0, 1, 2, ...         | ✅ Yes         |
         * | `a+b` | **1 ya zyada `a`**, uske baad **1 `b`** | 1, 2, 3, ...         | ✅ Yes         |
         */


    }
}
