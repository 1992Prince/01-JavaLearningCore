package com.easybytes.sec13inputoutput.notes;

public class P1_SystemAndPrintStreamCls {
    /**
     * 📘 Notes on System.out.println() in Java
     * 🔹 Purpose:
     *      Used to display output to the console from a Java program.
     *
     * Common methods used:
     *      System.out.print()
     *      System.out.println()
     *      System.out.printf()
     *
     * 🔹 Difference Between print(), println(), and printf():
     * System.out.print() - Prints data without moving to a new line.
     *                      Cursor stays on the same line after output.
     *
     * System.out.println() - Prints data and moves the cursor to the next line.
     *
     * System.out.printf() - Supports formatted output using placeholders (like %s, %d, etc.).
     *                       Replaces placeholders with actual variable values.
     *
     * 🔹 Behind the Scenes of System.out.println()[or What is out and where these methods println(), print() or printf() are present]:
     *    System is a final class in java.lang package.
     *    Automatically imported — no need to add import statements.
     *    Inside System class, there is a static final variable called out.
     *    out is an instance of PrintStream class (from java.io package). PrintStream class is present in java.io package.
     *    It have lots of methods like  println(), print() or printf() etc to print data on console or outside.
     *
     *    PrintStream class provides utility methods like: print(), println(), printf() — used to print output to console.
     *
     *    When we write System.out.println("Hello");:
     *    System → Java class
     *    out → static variable of type PrintStream
     *    println() → method of PrintStream class [its a instance methods and not static]
     *
     * Java internally creates an object of PrintStream and connects it to the console output stream. So with out static variable, we are
     * able to access PrintStream class methods.
     * This setup is ready even before your program runs, so: You don’t need to create a PrintStream object manually.
     * It Saves time and resources.
     *
     * 🔹 Interview Tip:
     * ❓ Q: "To which class does the println() method belong?"
     * ✅ A: PrintStream class (NOT System class).
     *
     * ❓ Q: "Where is the object of PrintStream created?"
     * ✅ A: Behind the scenes by the JVM, using System.out.
     *
     * 🧠 Why Java Does This?
     * To avoid creating a new PrintStream object and setting up console connection every time manually.
     * Makes output handling simple and efficient.
     *
     *
     * 🔸 What is PrintStream?
     * PrintStream is a subclass of OutputStream, used to write (print) data to an output destination, like the console.
     * It is what System.out is.
     *
     *
     * ✅ Purpose of PrintStream:
     * Sends formatted output (text or binary) to the console, file, etc.
     * Provides print() and println() methods to easily output data.
     * It doesn't throw IOException — it handles errors internally
     *
     * 🧠 Common Methods in PrintStream:
     * print(String s)      // Prints string
     * println(int x)       // Prints and adds a newline
     * write(byte[] b)      // Writes byte array
     * flush(), close()     // For stream handling
     *
     * ✅ Is OutputStream an abstract class?
     * Yes, OutputStream is an abstract class in Java.
     * It is part of the java.io package and is the superclass for all byte output streams.
     *
     * 📁 Location: java.io.OutputStream
     *
     * It provides the basic structure to write bytes to a destination like files, memory, or network sockets.
     * Subclasses implement how exactly the writing is done.
     *
     * 📤 Common Subclasses of OutputStream
     * | Class                   | Description                                             |
     * | ----------------------- | ------------------------------------------------------- |
     * | `FileOutputStream`      | Writes bytes to a file                                  |
     * | `ByteArrayOutputStream` | Writes to a byte array in memory                        |
     * | `BufferedOutputStream`  | Buffers output for performance                          |
     * | `ObjectOutputStream`    | Serializes objects to a stream                          |
     * | `DataOutputStream`      | Writes Java primitives                                  |
     * | `PrintStream`           | Writes formatted representations (used by `System.out`) |
     * | `PipedOutputStream`     | Used for inter-thread communication                     |
     */
}
