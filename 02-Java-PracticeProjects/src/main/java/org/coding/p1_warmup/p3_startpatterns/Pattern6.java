package org.coding.p1_warmup.p3_startpatterns;

public class Pattern6 {

    public static void main(String[] args) {

        int rows = 5; // rows

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();  // for coming to next line

        }

        /**
         *      * * * * *
         *      * * * *
         *      * * *
         *      * *
         *      *
         */
    }
}
