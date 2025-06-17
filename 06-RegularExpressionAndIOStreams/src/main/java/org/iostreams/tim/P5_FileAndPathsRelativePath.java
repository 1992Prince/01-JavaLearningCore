package org.iostreams.tim;

public class P5_FileAndPathsRelativePath {
    /*
    ✅ File vs Paths - Relative Path Behavior in Java

    ➤ java.io.File:
       - When you create a File object using: new File("abc.txt")
       - It treats the path as relative to the current working directory.
       - Usually, the current working directory is the root of your project (when run from IDE or terminal).
       - Example:
         File f = new File("abc.txt");
         System.out.println(f.getAbsolutePath());  // will resolve path from project root

    ➤ java.nio.file.Paths:
       - Similar to File, Paths.get("abc.txt") also resolves path relative to the current working directory.
       - It internally uses the default FileSystem to resolve the path.
       - Example:
         Path p = Paths.get("abc.txt");
         System.out.println(p.toAbsolutePath());  // same as above, gives full path from project root

    ➤ Conclusion:
       Both File and Paths treat relative paths as relative to the current working directory
       (i.e., usually the root of your Maven/Java project).

       | Class  | Package          | Relative To |
       |--------|------------------|-------------|
       | File   | java.io          | Project root (working dir) |
       | Paths  | java.nio.file    | Project root (working dir) |

    ➤ Tip:
       To avoid confusion, always convert to absolute path:
       - File f = new File("abc.txt").getAbsoluteFile();
       - Path p = Paths.get("abc.txt").toAbsolutePath();
*/

}
