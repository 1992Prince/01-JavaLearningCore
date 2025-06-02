package com.easybytes.sec13inputoutput;

import java.util.logging.Level;
import java.util.logging.Logger;

public class P8_LoggingSetLevelWARNINGDemo {

    private static Logger logger = Logger.getLogger(P8_LoggingSetLevelWARNINGDemo.class.getName());

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
        logger.setLevel(Level.WARNING);

        logger.info("This is info level logging");
        logger.warning("This is waring level logging");
        logger.severe("This is severe level logging");

        /**
         * Mar 27, 2025 9:19:40 AM com.easybytes.sec13inputoutput.P8_LoggingSetLevelWARNINGDemo main
         * WARNING: This is waring level logging
         * Mar 27, 2025 9:19:40 AM com.easybytes.sec13inputoutput.P8_LoggingSetLevelWARNINGDemo main
         * SEVERE: This is severe level logging
         */


    }
}
