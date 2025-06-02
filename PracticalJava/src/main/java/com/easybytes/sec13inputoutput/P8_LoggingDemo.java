package com.easybytes.sec13inputoutput;

import java.util.logging.Level;
import java.util.logging.Logger;

public class P8_LoggingDemo {

    private static Logger logger = Logger.getLogger(P8_LoggingDemo.class.getName());

    public static void main(String[] args) {

        /*
        If u enable WARNING level i.e. logger.setLevel(Level.WARNING);
        Then u can see WARNING and SEVERE logs

        IF u enable INFO level then u can info, warning, severe all logs
        will be printed in console.

        This is how we can enable or disable logs without deleting logs from code and
        This is how we can ignore using System.out.println

         */

        // setting level of Logger
        logger.setLevel(Level.INFO);

        logger.info("This is info level logging");
        logger.warning("This is waring level logging");
        logger.severe("This is severe level logging");

        /**
         * output - since INFO level is set so INFO , WARNING and SEVERE will be printed
         * INFO: This is info level logging
         * Mar 27, 2025 9:16:46 AM com.easybytes.sec13inputoutput.P8_LoggingDemo main
         * WARNING: This is waring level logging
         * Mar 27, 2025 9:16:46 AM com.easybytes.sec13inputoutput.P8_LoggingDemo main
         * SEVERE: This is severe level logging
         */

        /**
         * Loggers level -
         * java.util.logging.Level Class mein predefined levels hain (low to high):
         * FINEST: Sabse chhoti details (deep debugging).
         * FINER: Thodi zyada detail (debugging).
         * FINE: Basic debug info.
         * INFO: Normal app flow (jaise "shuru hua").
         * WARNING: Potential problem (jaise "balance kam hai").
         * SEVERE: Critical error (jaise "crash ho gaya").
         * OFF: Logging bandh karne ke liye.
         *
         * if   logger.setLevel(Level.FINE); then FINE, INFO, WARNING, SEVERE will be printed
         * logic is below ones will be enabled and above ones will be excluded
         */

    }
}
