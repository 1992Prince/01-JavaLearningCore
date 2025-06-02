package com.easybytes.sec14exception;

import java.util.logging.Logger;

public class P3_MultipleCatchBlocks {

    private static Logger logger = Logger.getLogger(P3_MultipleCatchBlocks.class.getName());

    public static void main(String[] args) {

        /*
        All type of declaration will be kept outside of try block since they
        are not risky and don't throw exception

        While keeping multiple exceptions
        1) Generic exception should be kept at last wch can handle any type of exception. Like
           here Exception catch block is kept at last.
           All other exceptions classes extends this Exception class and we can't keep Exception
           catch block in beginning and child exceptions later
           So child exceptions will come first and then parent exception
           If u keep parent exception i.e. Exception catch block keep first and other exceptions later
           then u will get compilation errors.

           so whenever u want to handle multiple exceptions with diff business logics, Always make sure
           u r mentioning the catch block of specific exceptions on top and towards the end we need to
           keep most Generic exception

           Best practice in project - is always try to handle specific exception and at end
           have Generic exception
         */

        String input = null;
        try {
            input = "Madan";
            input = input.toUpperCase();
            logger.info("My name is - " + input);
            input = input.substring(0, 11);
            logger.info("Substring is - " + input);

        }catch (NullPointerException ex){
            logger.severe("An null pointer exception occurred. Pls check your data");
        }catch (StringIndexOutOfBoundsException ex){
            logger.severe("StringIndexOutOfBoundsException occured. Pls check your String data");
        }catch (Exception ex){
            logger.severe("Exception occured, pls check your programme");
        }

        System.out.println();
        System.out.println("_".repeat(50));
        System.out.println();

        /*
        Below code can throw StringIndexOutOfBoundException and ArrayIndexOutOfException
        These type of exception happens when u try to access index and that index s not available
        So same exception handling logic for these two exceptions make sense and instead of
        repeating 2 catch blocks for each of them we can have single catch block capable of
        handling multiple exceptions.

        And both classes extends IndexOutOfBoundException

        catch (StringIndexOutOfBoundsException ex){
            logger.severe("StringIndexOutOfBoundsException occured. Pls check your String data");
        }catch (ArrayIndexOutOfBoundsException ex){
            logger.severe("ArrayIndexOutOfBoundsException occured. Pls check your String data");
        }

         can be replaced with single catch block with pipe symbol

         catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex){
            logger.severe("IndexOutOfBoundsException occured. Pls check your String data");
        }

        So with pipe symbol we can add any number of exceptions to same catch block by using pipe symbol.
        And for all these exceptions they will have single object reference name i.e. ex

         */

        String input2 = null;
        int[] arr1 = {1,2,3,4,5};
        try {
            input2 = "Madan";
            logger.info("My name is - " + input2);
            input = input.substring(0, 11);
            logger.info("Substring is - " + input);
            logger.info("Array value - " + arr1[9]);

        }catch (NullPointerException ex){
            logger.severe("An null pointer exception occurred. Pls check your data");
        }catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex){
            logger.severe("IndexOutOfBoundsException occured. Pls check your String data");
        }catch (Exception ex){
            logger.severe("Exception occured, pls check your programme");
        }

        System.out.println();
        System.out.println("_".repeat(50));
        System.out.println();
    }
}
