package com.easybytes.sec13inputoutput;

import java.util.logging.Level;
import java.util.logging.Logger;

public class P8_LoggingSetLevelSEVEREDemo {

    private static Logger logger = Logger.getLogger(P8_LoggingSetLevelSEVEREDemo.class.getName());

    public static void main(String[] args) {


        // setting level of Logger
        logger.setLevel(Level.SEVERE);

        logger.info("This is info level logging");
        logger.warning("This is waring level logging");
        logger.severe("This is severe level logging");

        /**
         * Mar 27, 2025 9:20:49 AM com.easybytes.sec13inputoutput.P8_LoggingSetLevelSEVEREDemo main
         * SEVERE: This is severe level logging
         */


    }
}
