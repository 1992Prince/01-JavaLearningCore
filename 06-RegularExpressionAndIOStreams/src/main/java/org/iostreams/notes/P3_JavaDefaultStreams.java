package org.iostreams.notes;

public class P3_JavaDefaultStreams {


    /**
     * 🔰 Java ke Default (Standard) Streams – JVM Banata Hai
     * 🔹 Kya hota hai? - Java ne by default teen standard stream objects diye hain:
     *
     * | Variable Name | Type          | Purpose                     | Created By |
     * | ------------- | ------------- | --------------------------- | ---------- |
     * | `System.in`   | `InputStream` | Input from keyboard (stdin) | JVM        |
     * | `System.out`  | `PrintStream` | Normal output (stdout)      | JVM        |
     * | `System.err`  | `PrintStream` | Error output (stderr)       | JVM        |
     *
     * 💡 Important:
     * Ye sab System class ke public static final fields hain. Tum create nahi karte, JVM automatically create kar deti hai jab program start hota hai.
     * System class is present in java.lang package
     *
     *  public static final PrintStream out = null;
     *  public static final PrintStream err = null;
     *  public static final InputStream in = null;
     *
     *  🧠 System Class: Language Level Pe
     * System class is in java.lang package → so no need to import.
     *
     * Inside it:
     * public final class System {
     *     public static final InputStream in;
     *     public static final PrintStream out;
     *     public static final PrintStream err;
     * }
     *
     * ➡️ Iska matlab:
     *
     * System.in → already ek InputStream ka object hai (keyboard se data read karne ke liye).
     * System.out and System.err → PrintStream ke object hain (console pe print karne ke liye).
     *
     * 🎯 Example: Keyboard Input using System.in
     * public class Demo {
     *     public static void main(String[] args) throws Exception {
     *         System.out.println("Enter a character: ");
     *         int ch = System.in.read(); // reads one byte from keyboard and read method is present in InputStream clss
     *         System.out.println("You entered: " + ch);
     *     }
     * }
     *
     * 📌 Output Explanation:
     *
     * Suppose you type A, output will be: You entered: 65
     * Kyunki System.in.read() ek byte (int) read karta hai, jo ASCII value return karta hai.
     *
     * ❌ Problem: Humko to "A" chahiye tha, 65 nahi!
     *
     *
     * 🔰 Java I/O System – 2 Types of Streams
     * Java me data handle karne ke liye do tarah ke stream classes diye gaye hain, based on data type:
     * | Stream Type              | For Which Data?                     | Superclasses                   |
     * | ------------------------ | ----------------------------------- | ------------------------------ |
     * | 🔹 **Byte Streams**      | Binary data (images, videos, files) | `InputStream` & `OutputStream` |
     * | 🔸 **Character Streams** | Text data (characters, strings)     | `Reader` & `Writer`            |
     *
     * ✅ Superclass Hierarchy:
     * | Byte Stream                        | Character Stream                  |
     * | ---------------------------------- | --------------------------------- |
     * | `InputStream` → for reading bytes  | `Reader` → for reading characters |
     * | `OutputStream` → for writing bytes | `Writer` → for writing characters |
     *
     * FileInputStream and FileOutputStream are child classes of InputStream and OutStream.
     * InputStream and OutputStream are abstract classes.
     *
     * FileReader is subclass of Reader class and FileWrite is sublcass of Writer class.
     *
     * 🧠 Ab Samjh – System.in Kya Hota Hai?
     * System.in is of type InputStream → so it reads bytes
     * But text input (String, char, etc.) byte me nahi, character me chahiye hota hai
     *
     * ---------------------------------------------------------------------------------------------------------
     *Now don't go in deep of it and start Durga notes and read about File, FileReader and FileWriter class
     *
     * Pehle File class k baare me padh and then practice its questions given in durga pdf
     * With File we will only check file exists, dir exists etc etc but no reading or writing in file
     * From reading or taking input from keyboard we can use Scanner class wch is present in java.util package.
     *
     *
     * Once u go through File, FileReader and FileWriter , u will come to know about FileReader and FileWriter
     * are not good way for reading and writing data into files.
     *
     * So Java has given BufferedReader/BufferedWriter and Scanner class. [from here start reading from madam pdf]
     *
     * ------------------------------------------------------------------------------------------------------
     *
     * Ab tu atkega If we are using BufferedReader then Y we are using InputStreamReader with in madan example
     * Remember below we are taking input from keyboard
     *
     * 🔹 1️⃣ BufferedReader me InputStreamReader Kyun Use Karte Hai?
     * e.g. BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     *
     * 🤔 Reasoning:
     * System.in ➡️ is a byte stream (it's an object of InputStream).
     * BufferedReader ➡️ expects a Reader (i.e., a character stream).
     * So we need a bridge: 👉 InputStreamReader converts InputStream (bytes) → Reader (chars).
     *
     * Hence:
     * System.in → InputStreamReader → BufferedReader
     *        (bytes)         (chars)         (buffered chars)
     *
     * So in madan docs u can read
     *
     * -    Reading input data from keyboard using BufferedReader
     * -    Reading file data using BufferedReader
     *
     * then
     *
     * same above operations with Scanner class in java.util package
     *
     * then
     *
     * BufferedReader vs Scanner and at the end we will learn actual hand-son of reading, writing , deleting
     *
     * from java.nio from Tim Baluchka lol!!!!
     *
     * And finally we are here bro.
     *
     */
}
