package com.easybytes.sec13inputoutput.notes;

public class P3_IOHierarchy {

    /**
     * 📦 Java I/O Class Hierarchy
     * 1. 🔢 Byte-Based I/O (for binary data like images, PDFs, videos) [for bytes bases input output operations, we can use below classes]
     * These classes work with raw bytes and are useful for non-text data.
     *
     * java.io
     * ├── InputStream      (abstract)
     * │   ├── FileInputStream
     * │   ├── ByteArrayInputStream
     * │   ├── BufferedInputStream
     * │   └── ObjectInputStream
     * │
     * └── OutputStream     (abstract)
     *     ├── FileOutputStream
     *     ├── ByteArrayOutputStream
     *     ├── BufferedOutputStream
     *     └── ObjectOutputStream
     *
     *     🧠 Use cases:
     * Reading/writing binary files like .jpg, .pdf, .mp3
     * Transmitting data over network sockets (TCP/UDP)
     *
     * 2. 🔤 Character-Based I/O (for text data like .txt, .csv) [for character, txt bases input output operations we can use below classes]
     * These classes work with characters (Unicode) and are suited for text processing.
     *
     * java.io
     * ├── Reader            (abstract)
     * │   ├── FileReader
     * │   ├── InputStreamReader
     * │   ├── BufferedReader
     * │   └── CharArrayReader
     * │
     * └── Writer            (abstract)
     *     ├── FileWriter
     *     ├── OutputStreamWriter
     *     ├── BufferedWriter
     *     └── CharArrayWriter
     *
     *     🧠 Use cases:
     *
     * Reading/writing plain text files (like .txt, .csv, .xml)
     * Reading from console input, or writing to console/output file in readable format
     *
     *
     * 🔄 Conversion Bridge in Java I/O
     * 📌 Problem:
     * Java mein InputStream and OutputStream sirf bytes (0s and 1s) ke saath kaam karte hain.
     * Lekin real-world mein hum aksar text (characters) ke saath kaam karte hain, jaise:
     * "Hello"
     * "123"
     * "₹$%&@"
     *
     * Toh humein ek bridge chahiye jo:
     * Bytes ko characters mein convert kare jab hum read karein
     * Characters ko bytes mein convert kare jab hum write karein
     *
     * 💡 Solution: Java ne 2 Bridge Classes diye hain
     * | Use Case                       | Bridge Class         | Converts                |
     * | ------------------------------ | -------------------- | ----------------------- |
     * | 🔽 Reading: bytes ➡ characters | `InputStreamReader`  | `InputStream → Reader`  |
     * | 🔼 Writing: characters ➡ bytes | `OutputStreamWriter` | `Writer → OutputStream` |
     *
     * 🔁 Real-life Analogy
     *
     * Socho tumhare paas ek file hai jisme Hindi characters hain (जैसे "नमस्ते").
     * File system ise bytes mein store karta hai.
     * Tumhare program ko ise characters ke form mein chahiye.
     *
     * ➡ Toh InputStreamReader help karega:
     *
     * InputStream is = new FileInputStream("file.txt");
     * Reader reader = new InputStreamReader(is); // Yahan pe conversion ho raha hai
     *
     * 🔁 Similarly, jab tum characters likhna chahte ho file mein:
     *
     * Writer writer = new OutputStreamWriter(new FileOutputStream("file.txt"));
     * writer.write("नमस्ते"); // Characters ko bytes mein convert karke likhega
     *
     * 🔧 Diagram
     * Reading:
     * [ File (bytes) ] → FileInputStream → InputStreamReader → [ Java (characters) ]
     *
     * Writing:
     * [ Java (characters) ] → OutputStreamWriter → FileOutputStream → [ File (bytes) ]
     *
     * ✅ Summary
     * | Bridge Class       | Purpose                     | When to Use                |
     * | ------------------ | --------------------------- | -------------------------- |
     * | InputStreamReader  | Convert bytes to characters | Read text from byte stream |
     * | OutputStreamWriter | Convert characters to bytes | Write text to byte stream  |
     */
}
