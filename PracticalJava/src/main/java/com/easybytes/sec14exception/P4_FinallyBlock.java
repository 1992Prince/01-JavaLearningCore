package com.easybytes.sec14exception;

import java.util.Objects;
import java.util.Scanner;

public class P4_FinallyBlock {

    /*
    In programming , after using files, or resources etc, u want to
    release resources,
    or u want to close some files,
    or u want to perform some clean up activites
    or closing db connections etc.
    All these scenarios can be included in finally block

    In below code if we keep scanner.close inside try block and some exception thrown by
    try block code then scanner.close() will not be executed
    And so scanner resource will be openend after program is terminated due to exception
    So we kept scanner.close() inside finally block.
     */

    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter number pls - ");
            int num = scanner.nextInt();
            System.out.println(num);
        }catch (Exception ex){
            System.out.println("Some Exception occured");
        }finally {
            if (Objects.nonNull(scanner)){
                scanner.close();
            }

            /*
            if (scanner != null){
            scanner.close
            }
             */
        }

    }
}
