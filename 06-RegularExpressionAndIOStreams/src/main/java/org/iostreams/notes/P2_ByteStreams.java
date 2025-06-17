package org.iostreams.notes;

public class P2_ByteStreams {
    /*
     * 📚 Java InputStream and OutputStream Notes
     *
     * ▶ In this video, we learned about:
     *      - InputStream class
     *      - OutputStream class
     *    These are the **base classes** for Byte Streams in Java.
     *    Both are abstract classes and present in java.io package.
     *    In System class present in java.lang package, we have public static final in = variable wch is of type InputStream [  public static final InputStream in = null;]
     *
     * ─────────────────────────────────────────
     * 🔸 INPUTSTREAM CLASS (java.io.InputStream)
     * ─────────────────────────────────────────
     * ➤ This class is used to read **byte data** from a resource.
     * ➤ Data may come from files, network, memory, etc.
     *
     * Common Methods:
     * ---------------
     * • int read()
     *      - Reads a single byte.
     *      - Returns the byte as an int (0–255) or -1 if end of stream (EOF)[or if data is over and still we are reading data then it will return -1].
     *
     * etc. methods
     *
     *
     * ─────────────────────────────────────────
     * 🔸 OUTPUTSTREAM CLASS (java.io.OutputStream)
     * ─────────────────────────────────────────
     * ➤ This class is used to **write bytes** from a program to a resource.
     * ➤ Resources can be files, console (System.out), network, etc.
     *
     * Common Methods:
     * ---------------
     * • void write(int b)
     *      - Writes one byte.
     *
     * •etc.
     *
     * ─────────────────────────────────────────
     * 🔸 Summary of Key Points
     * ─────────────────────────────────────────
     * • InputStream: use for reading byte data.[abstract clss]
     * • OutputStream: use for writing byte data.[abstract clss]
     * • Important InputStream methods: read(), available(), close()
     * • Important OutputStream methods: write(), flush(), close()
     *
     * ➤ Subclasses like FileInputStream, BufferedInputStream, etc., extend these base classes.
     *    Once you understand these methods, using subclasses becomes easy.
     *
     */

}
