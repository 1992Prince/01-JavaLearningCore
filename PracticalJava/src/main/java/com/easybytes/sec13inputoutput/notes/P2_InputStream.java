package com.easybytes.sec13inputoutput.notes;

public class P2_InputStream {
    /*
     * Understanding Input in Java (System.in)
     */

    // After learning how to display output using System.out,
    // now we focus on accepting input from the end user.

    /*
     * System.in - The Opposite of System.out
     * - System.out is used for output, System.in is used for input.
     * - System.in is a public static final InputStream variable in System class.[public static final InputStream in = null; in System class]
     */

    /*
     * What is InputStream? and what is purpose of it?
     * - InputStream is a class in java.io package.
     * - Represents standard input stream (usually the keyboard).
     * - Already open and ready to read data.
     *
     * InputStream is an abstract class in Java, located in the java.io package.
     * It is the superclass for all classes that represent an input stream of bytes.
     *
     * ✅ Purpose of InputStream:
     * The main job of InputStream is to:
     * - Read binary data (bytes) from a source (e.g., keyboard, file, network, etc.)
     * - Provide a standard way for subclasses to implement reading functionality.
     *
     * 🧠 Common Methods in InputStream:
     * int read()         // Reads a single byte and returns its ASCII value
        int read(byte[] b) // Reads bytes into a byte array
        int available()    // Returns an estimate of the number of bytes available
        void close()       // Closes the input stream
     */

    /*
     *        📥 Common Subclasses of InputStream
     *        | Class                  | Description                                       |
     * | ---------------------- | ------------------------------------------------- |
     * | `FileInputStream`      | Reads bytes from a file                           |
     * | `ByteArrayInputStream` | Reads from a byte array in memory                 |
     * | `BufferedInputStream`  | Buffers input for performance                     |
     * | `ObjectInputStream`    | Deserializes objects from a stream                |
     * | `DataInputStream`      | Reads primitive Java data types                   |
     * | `PipedInputStream`     | Used for inter-thread communication               |
     * | `SequenceInputStream`  | Combines multiple InputStreams                    |
     * | `PushbackInputStream`  | Allows you to "unread" bytes (like peeking ahead) |
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
     *
     * 🔄 Relationship: InputStream vs OutputStream
     * | Feature              | `InputStream`                        | `OutputStream`                            |
     * | -------------------- | ------------------------------------ | ----------------------------------------- |
     * | Direction            | Reads data                           | Writes data                               |
     * | Abstract class?      | Yes                                  | Yes                                       |
     * | Handles              | Byte-based input                     | Byte-based output                         |
     * | Common Use           | Reading from file, keyboard, network | Writing to file, console, memory, network |
     * | Buffering Available? | Yes (`BufferedInputStream`)          | Yes (`BufferedOutputStream`)              |
     * | Object Support       | Yes (`ObjectInputStream`)            | Yes (`ObjectOutputStream`)                |
     *
     * 🧠 Key Concepts
     * InputStream and OutputStream deal with binary data (bytes).
     * For character data, Java provides Reader and Writer classes.
     */

    /*
     * Reading Input using System.in.read():
     * - System.in.read() reads a single character.
     * - It returns the ASCII value of the character.
     *
     * Example:
     * int num = System.in.read();
     * System.out.println("User entered: " + num);
     *
     * If user enters '5', output will be 53 (ASCII of '5')
     * If user enters '$', output will be 36 (ASCII of '$')
     */

    /*
     * Limitations of System.in.read():
     * - Accepts only one character at a time.
     * - Returns ASCII code, not actual character or value.
     * - Ignores extra characters.
     * - Not suitable for real-world or multi-character input.
     */

    /*
     * Better Ways to Accept Input in Java
     */

// 1. BufferedReader (java.io)
// - Reads entire lines or strings.
// - Buffered and efficient.
// - Syntax:
//   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//   String input = reader.readLine();

// 2. Scanner (java.util)
// - Introduced in Java 1.5
// - Easy to use for int, float, String, etc.
// - Syntax:
//   Scanner scanner = new Scanner(System.in);
//   int number = scanner.nextInt();
//   String name = scanner.next();

    /*
     * Exception Handling in Input Operations:
     * - System.in.read() throws IOException.
     * - Either use try-catch or declare throws in method.
     * Example:
     * public static void main(String[] args) throws IOException {
     *     int input = System.in.read();
     * }
     */

    /*
     * Packages Recap:
     * - System class --> java.lang pckg
     * - PrintStream, InputStream, BufferedReader --> java.io pckg
     * - Scanner --> java.util pckg
     */

/*
 * Summary Table:

 | Method              | Package       | Reads         | Limitations                    | Suitable for        |
 |---------------------|----------------|---------------|--------------------------------|----------------------|
 | System.in.read()    | java.io        | 1 character    | Returns ASCII, limited input   | Basic demos only     |
 | BufferedReader      | java.io        | Full lines     | Needs exception handling       | Reading lines        |
 | Scanner             | java.util      | Tokens/types   | Simple & flexible              | Real-world input     |
 */

}
