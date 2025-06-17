package org.iostreams.notes;

public class P1_IOStreamsConcept {

    /**
     * GFG def-
     * Java I/O (Input and Output) is used to process the input and produce the output.
     * Java uses the concept of a stream to make I/O operations fast.
     * The java.io package contains all the classes required for input and output operations.
     * We can perform file handling in Java by Java I/O API.
     */

    /**
     * 🧠 Java IO – Running Notes (Point-Wise Summary) [From Abdul Bari videos]
     *
     * ✅ Introduction to Java IO (Input/Output) [java.io package]
     *
     * Java IO stands for Input and Output operations.
     * Helps a Java program interact with external resources (like file, network, keyboard).
     * Important for data transfer between program ↔ external world.
     *
     *
     * 🖥️ Memory Structure & Program Context
     *
     * Main memory is divided into:
     *
     * 1) Method Area – where code (classes/methods) resides.
     * 2) Stack – holds local and reference variables.
     * 3) Heap – stores objects (like arrays, instances).
     *
     * For any Java program,method area and stack area is context of programe. I.e. thats its own region/its own program territory.
     * Everything inside it is part of programe.
     * Program context = Method Area + Stack.
     *
     * External resources (outside program): Monitor, Keyboard, Files, Network, Heap (in some cases) = Resources
     *
     * 🔄 Why IO?
     *
     * Programs exchange data with resources:
     * Example: Keyboard → Input, Monitor → Output
     * File and network can be both input & output sources.
     *
     * 🌊 What is a Stream?
     * Stream = Flow of data between program and resource[here resource can be external txt file or monitor, keyboard , cpu etc.].
     *
     * Direction:
     * Resource → Program (Input)
     * Program → Resource (Output)
     *
     * Example: Keyboard ke cable se character flow = stream of bytes/chars.
     *
     * 🚰 Why the word “Stream”?
     *
     * Like water pipe → continuous flow.
     * Data is also sent/received byte-by-byte or char-by-char.
     *
     * 📥📤 Types of Data Transfer
     *
     * Input: Data comes into program (e.g., Keyboard, File Read).
     * Output: Data goes out from program (e.g., Display, File Write).
     *
     * 🪣 What is a Buffer?
     *
     * Suppose my program is sending data to outside resource with greater speed but outside resource can recieve data in less speed only.
     * So some data can be lost. [Like if I throwing balls in a bucket full of water. Bucket of water can receive balls in less speed else
     * balls will fall down and so I need to throw balls in less speed. If I throw ball in higher speed then bucket will loose the balls]
     *
     * And so if our program is sending data in higher speed and outside resource or remote machine can accepts only data in less speed then most of
     * data will be lost.
     * So there is speed mismatch between input and output resources.
     *
     * So to handle this a buffer memory is created where sender sends data and data gets stored.
     * So Java program sends its data into buffer memory and complete its work. Now slowly outside program / device will be reading the data from
     * buffer memory.
     *
     * So buffer is a memory object which is used for holding the data for sometime to bring in the compatibility between the devices.
     *
     * Buffer = Temporary memory used between slow and fast devices.
     *
     * Handles speed mismatch between sender and receiver.
     *
     * Analogy:
     *
     * Video buffering → wait until data fills buffer, then play.
     *
     * Bucket for bathing → fill before using.
     *
     * Used in streaming data from file/network to avoid loss or delay.
     *
     *
     * 📦 How Data Flows (Byte-by-Byte)
     *
     * Data (e.g., string "John", number 126) is not sent as a whole.
     * Sent one byte at a time (J, O, H, N) or (1, 2, 6).
     * Even if you send a full object, it is broken into bytes first.
     *
     * 📚 Java Stream Classes
     *
     * Java provides pre-built classes for stream handling.
     * Learning Java IO = Learning & using these stream classes
     *
     *
     * ⚖️ Types of Stream Classes
     *
     * 1)  Byte Stream Classes
     *      Used for handling binary data
     * 	    Input: InputStream
     * 	    Output: OutputStream
     *
     * 2) Character Stream Classes
     *      Used for text data (Unicode, characters)
     * 	    Input: Reader
     * 	    Output: Writer
     */

    /**
     * 🔷 Pehle yeh samajh:
     *      Java me Stream ka matlab hota hai:
     *      ➡️ Data ka flow (byte-by-byte ya character-by-character)
     *      Ye flow ho sakta hai:
     *          Input (andar aana) – e.g. Keyboard se program me data
     *          Output (bahar bhejna) – e.g. Program se screen/file me data
     *
     * 🔵 Java Provides Two Main Types of Stream Classes:
     *
     * 1️⃣ Byte Stream Classes
     *      ➡️ Binary data ke liye hoti hai (images, audio, files, etc.)
     *      ➡️ Data handle hota hai byte (8 bits = 1 byte) ke roop me
     *
     *      📥 Input: InputStream
     *      e.g. FileInputStream, BufferedInputStream, DataInputStream
     *
     *      📤 Output: OutputStream
     *      e.g. FileOutputStream, BufferedOutputStream, DataOutputStream
     *
     * 🧠 Use when you're working with non-text data like PDFs, images, zip files, etc.
     *
     * 2️⃣ Character Stream Classes
     *      ➡️ Text data ke liye hoti hai (txt, CSV, XML, etc.)
     *      ➡️ Data handle hota hai characters (2 bytes each) ke roop me
     *
     *      📥 Input: Reader
     *      e.g. FileReader, BufferedReader, InputStreamReader
     *
     *      📤 Output: Writer
     *      e.g. FileWriter, BufferedWriter, OutputStreamWriter
     *
     * 🧠 Use when you're working with textual data – like reading/writing lines of text.
     *
     * 🤔 Why 2 Types? Why Not Just One?
     * Java me characters (like 'A', 'ह') are 2 bytes – because Java uses Unicode.
     * Aur binary data (like image, file) is handled in raw byte form (1 byte).
     * Isi wajah se Java ne alag-alag classes banayi:
     *      InputStream/OutputStream = bytes
     *      Reader/Writer = characters
     */

    /**
     * Summary -
     *
     * 📦 Java IO – Key Points Summary
     * Java IO = Input/Output for external resource interaction (java.io package).
     * IO deals with streams: continuous flow of data between program ↔ resource.
     *
     * Data transfer is always:
     *      Input: Resource → Program
     *      Output: Program → Resource
     *
     * Java has two main stream types[Java broadly provides classes for two types of streams]:
     *      Byte Stream (binary data)
     *      Character Stream (text data)
     *
     * 🔵 Byte Stream Classes
     * For binary data
     * Input: InputStream → e.g. FileInputStream, BufferedInputStream
     * Output: OutputStream → e.g. FileOutputStream, DataOutputStream
     * Works with 1 byte (8 bits)
     *
     * 🔤 Character Stream Classes
     * For textual (Unicode) data
     * Input: Reader → e.g. FileReader, BufferedReader
     * Output: Writer → e.g. FileWriter, BufferedWriter
     * Works with 2 bytes (16-bit characters)
     *
     * 🔁 Conversion Bridge Classes
     * InputStreamReader → converts byte stream to char stream (Input)
     * OutputStreamWriter → converts char stream to byte stream (Output)
     */
}
