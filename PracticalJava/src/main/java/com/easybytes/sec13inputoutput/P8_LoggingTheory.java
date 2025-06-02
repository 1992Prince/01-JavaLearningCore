package com.easybytes.sec13inputoutput;

import java.util.logging.Level;
import java.util.logging.Logger;

public class P8_LoggingTheory {

    private static Logger logger = Logger.getLogger(P8_LoggingTheory.class.getName());

    public static void main(String[] args) {

        /*
        The line private static Logger logger = Logger.getLogger(P8_LoggingDemo.class.getName());
        is used to create a logger instance in a Java class.

        This logger is used to log messages for the class

        private static:
        private means that the logger can only be accessed within the class it is defined in.
        static means that the logger belongs to the class itself rather than instances of
               the class. This allows all instances of the class to share the same logger.

        Logger logger:

        This declares a variable named logger of type Logger.
        The Logger class is part of the java.util.logging package and is used for logging messages.

        Using a logger is a better practice than using System.out.println for logging because
        it provides more control over how messages are formatted and where they are output
        (e.g., to a file, console, etc.), and it allows different levels of logging
        (e.g., debug, info, warn, error).
         */

        // setting level of Logger
        logger.setLevel(Level.INFO);

        logger.info("This is info level logging");
        logger.warning("This is waring level logging");
        logger.severe("This is severe level logging");

    }
}
