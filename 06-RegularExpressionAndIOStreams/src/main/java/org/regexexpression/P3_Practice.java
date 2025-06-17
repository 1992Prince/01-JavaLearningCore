package org.regexexpression;

public class P3_Practice {

    /**
     * 🔹 Anchors: ^ aur $
     * | Symbol | Meaning                        | Example | Match                  |
     * | ------ | ------------------------------ | ------- | ---------------------- |
     * | `^`    | Line **starts with** something | `^a`    | "apple" ✅, "mapple" ❌  |
     * | `$`    | Line **ends with** something   | `b$`    | "club" ✅, "blubbery" ❌ |
     *
     * "apple".matches("^a.*")     // true
     * "club".matches(".*b$")      // true
     *
     * 🔹 Dot .
     * | Symbol | Meaning                                 | Example | Match                         |
     * | ------ | --------------------------------------- | ------- | ----------------------------- |
     * | `.`    | **Any single character** except newline | `a.b`   | "acb", "a1b", "a b" ✅, "ab" ❌ |
     *
     * "axb".matches("a.b")    // true
     * "ab".matches("a.b")     // false
     *
     *
     *
     * 🔹 \d aur \D (digit / non-digit)
     * | Symbol | Meaning             | Example         | Match |
     * | ------ | ------------------- | --------------- | ----- |
     * | `\d`   | Any **digit** (0-9) | `\d+` → "123" ✅ |       |
     * | `\D`   | Any **non-digit**   | `\D+` → "abc" ✅ |       |
     *
     * "123".matches("\\d+")   // true
     * "abc".matches("\\D+")   // true
     * "1a".matches("\\d+")    // false
     *
     * 🔹 \s aur \S (whitespace / non-whitespace)
     *
     * | Symbol | Meaning                          | Example            | Match |
     * | ------ | -------------------------------- | ------------------ | ----- |
     * | `\s`   | Whitespace (space, tab, newline) | `"a\sb"` → "a b" ✅ |       |
     * | `\S`   | Non-whitespace                   | `"a\Sb"` → "a1b" ✅ |       |
     *
     * "a b".matches("a\\sb")   // true
     * "a_b".matches("a\\Sb")   // true
     *
     * 🔹 Character Sets: [abc], [^abc], [a-zA-Z]
     * | Pattern    | Meaning                                   | Match Examples  |
     * | ---------- | ----------------------------------------- | --------------- |
     * | `[abc]`    | a **single character**: a or b or c       | "a", "b", "c" ✅ |
     * | `[^abc]`   | **Not** a or b or c                       | "d", "x", "1" ✅ |
     * | `[a-zA-Z]` | Any uppercase or lowercase English letter | "A", "z" ✅      |
     *
     * "a".matches("[abc]")       // true
     * "x".matches("[^abc]")      // true
     * "F".matches("[a-zA-Z]")    // true
     *
     * 🔹 \w (word character) – Word banane wale characters
     * ✅ Meaning:
     * \w ka matlab hota hai:
     * Any character from [a-z], [A-Z], [0-9], or underscore _
     *
     * Yeh sabhi word characters kehlate hain, jo usually ek "shabd" banane ke liye kaam aate hain.
     * 🔸 Examples (Matched by \w):
     *
     * | Input | Match? | Reason               |
     * | ----- | ------ | -------------------- |
     * | `a`   | ✅ Yes  | Alphabet             |
     * | `Z`   | ✅ Yes  | Capital letter       |
     * | `5`   | ✅ Yes  | Digit                |
     * | `_`   | ✅ Yes  | Underscore           |
     * | `#`   | ❌ No   | Not a word character |
     * | `@`   | ❌ No   | Not a word character |
     *
     * System.out.println("a".matches("\\w"));  // true
     * System.out.println("7".matches("\\w"));  // true
     * System.out.println("_".matches("\\w"));  // true
     * System.out.println("#".matches("\\w"));  // false
     *
     * 🔹 \W (non-word character) – Word ke alawa sab
     *
     * ✅ Meaning:
     * \W ka matlab hota hai:
     * Anything that is NOT a word character → i.e. not [a-zA-Z0-9_]
     *
     * 🔸 Examples (Matched by \W):
     * | Input | Match? | Reason           |
     * | ----- | ------ | ---------------- |
     * | `@`   | ✅ Yes  | Not a word char  |
     * | `!`   | ✅ Yes  | Special symbol   |
     * | `#`   | ✅ Yes  | Special symbol   |
     * | `a`   | ❌ No   | It's a word char |
     * | `3`   | ❌ No   | It's a digit     |
     *
     * System.out.println("#".matches("\\W"));  // true
     * System.out.println("A".matches("\\W"));  // false
     * System.out.println("5".matches("\\W"));  // false
     *
     * 📌 Real Life Example: Word Validation
     * String username = "user_123";
     * System.out.println(username.matches("\\w+"));  // true
     *
     * ✅ Example: Validate mobile number
     * String mobile = "9876543210";
     * System.out.println(mobile.matches("\\d{10}"));  // true
     *
     * {10} specifies no of digits must be available
     *
     * ✅ Example: Starts with capital and has lowercase
     * String name = "Rahul";
     * System.out.println(name.matches("^[A-Z][a-z]+$"));  // true
     *
     * ✅ Pattern: ^[A-Z][a-z]+$
     * ⚙️ Purpose:
     * Yeh pattern check karta hai ki:
     *
     * Poora string sirf ek naam jaisa ho, jo
     *      Capital letter se start ho
     *      Baaki sab small letters ho
     *      Aur koi extra character ya number na ho
     *
     *  🧠 Breakdown (Hinglish mein):
     *  | Part     | Meaning                                                         |
     * | -------- | --------------------------------------------------------------- |
     * | `^`      | **Start of string** se match karna start karo                   |
     * | `[A-Z]`  | Pehla character hona chahiye **capital letter** (A to Z)        |
     * | `[a-z]+` | Uske baad **ek ya zyada** small letters hone chahiye            |
     * | `$`      | **End of string** yahi hona chahiye (aur kuch bhi nahi allowed) |
     */
}
